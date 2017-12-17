package oopprojectnet;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {
    public static ArrayList<Person> listPeople;
    public static ArrayList<Places> listPlaces;
    public static ArrayList<Event> listEvents;

    /**
     * Constructor to create or update the info of the program, 3 files with info about people, places and events
     */
    public Database() {
        listPeople = new ArrayList<Person>();
        listPlaces = new ArrayList<Places>();
        listEvents = new ArrayList<Event>();
        
    }

    /**
     * Method to update the database when program starts up, receives no argument
     * @throws IOException 
     */
    public static void startDatabase() throws ClassNotFoundException, IOException {
        try{
            readObj("People");
            
        } catch (IOException e) {
            readTxt("People");
        }
        try{
            readObj("Places");
            
        } catch (IOException e) {
            readTxt("Places");
        }
        try{
            readObj("Events");
            
        } catch (IOException e) {
            readTxt("Events");
        }        
    }

    /**
     * Method to read the info receives a parameter with the type of information you want to read
     * @param type the type of the info (events, places, people)
     * @return 1 in success, 0 otherwise
     * @throws IOException
     */
    public static int readTxt(String type) throws IOException {
        String path;
        Student newStudent = null;
        Teacher newTeacher = null;
        Staff newStaff = null;
        Exhibitions newExibition;
        SportsField newSportsField;
        Gardens newGarden;
        Pubs newPub;
        String workingDir = System.getProperty("user.dir") + "\\src\\oopprojectnet\\";
        path = workingDir + type + ".txt";
        BufferedReader br = new BufferedReader(new FileReader(path));
        String strLine;
        String[] parts;
        while ((strLine = br.readLine()) != null) {
            parts = strLine.split(":");
            if (type.toLowerCase().equals("people")) {
                //Jose Campos:Student:Profile:Password:StudentCourse
                //Luis Cordeiro:Teacher:Profile:Password:TeacherType
                //Joao Alberto:Staff:Profile:Password:StaffType
                switch (parts[parts.length-4].toLowerCase()) {
                    case "student":  
                        newStudent = new Student(parts[0], parts[2], parts[3], parts[4]);
                        listPeople.add(newStudent);
                        break;
                    case "teacher":
                        newTeacher = new Teacher(parts[0], parts[2], parts[3], parts[4]);
                        listPeople.add(newTeacher);
                        break;
                    case "staff":
                        newStaff = new Staff(parts[0], parts[2], parts[3], parts[4]);
                        listPeople.add(newStaff);
                        break;
                }
            }
            //Estadio Universitario:SportsField:coords:sport
            //Jardim Botanico:Garden:coords:area
            //Museu Machado de Castro:Exhibition:coords:artisticForm.price
            //Moelas Moelinhas:Pub:coords:capacity.minimumInput
            
            else if (type.toLowerCase().equals("places")) {
                String[] parts2;
                Person a;
                switch (parts[parts.length-3].toLowerCase()) {
                    case "sportsfield":
                        newSportsField = new SportsField(parts[2], parts[0], parts[3]);
                        System.out.println(newSportsField);
                        listPlaces.add(newSportsField);
                        break;
                    case "garden":
                        newGarden = new Gardens(parts[2], parts[0], parts[3]);
                        System.out.println(newGarden);
                        listPlaces.add(newGarden);
                        break;
                    case "exhibition":
                        parts2 = parts[parts.length-1].split(".");
                        newExibition = new Exhibitions(parts[2], parts[0], parts2[0], parts2[1]);
                        System.out.println(newExibition);
                        listPlaces.add(newExibition);
                        break;
                    case "pub":
                        parts2 = parts[3].split(".");
                        newPub = new Pubs(parts[2], parts[0], parts2[0], parts2[1], null);
                        listPlaces.add(newPub);
                        System.out.println(newPub);
                        break;
                }
            }
            else if (type.toLowerCase().equals("events")) {
                int verifica = 0, i;
                Event newE;
                ArrayList<Places> places = new ArrayList();
                //evento1:Moelas Moelinhas,Museu Machado de Castro
                //Joao Alberto:Moelas Moelinhas,Museu Machado de Castro
                //Jose Donato:Museu Machado de Castro
                if(verifica == 0) {
                    String[] parts2 = parts[1].split(",");
                    for(i = 0; i<parts2.length; i++) {
                        if(getPlaceFromName(parts2[i]) != null) {
                            places.add(getPlaceFromName(parts2[i]));
                        }
                    }
                    newE = new Event(parts[0], new ArrayList(), places);
                    Database.listEvents.add(newE);
                    verifica = 1;
                }
                else {
                    places = new ArrayList();
                    String[] parts2 = parts[1].split(",");
                    Person person = getPersonFromName(parts[0]);
                    for(i = 0; i<parts2.length; i++) {
                        if(getPlaceFromName(parts2[i]) != null) {
                            places.add(getPlaceFromName(parts2[i]));
                        }
                    }
                    Database.listEvents.get(0).addPerson(person, places);
                }
            }
        }
        br.close();
        return 1;
    }

    /**
     * Check if person is in database
     * @param PersonToAdd person to check
     * @return true in success, false otherwise
     */
    private static boolean checkPersonDatabase(String PersonToAdd) {
        for(Person p : Database.listPeople) {
            if(p.getName().toLowerCase().equals(PersonToAdd.toLowerCase())) {
                return true;
            }
        }
        
        return false;
    }


    /**
     * Method to read object file and insert in database 
     * @param type the type of the info (events, places, people)
     * @return 1 in success, 0 otherwise
     * @throws IOException 
     */
    public static int readObj(String type) throws IOException, ClassNotFoundException {
        String workingDir = System.getProperty("user.dir") + "\\src\\oopprojectnet\\";
        String path = workingDir + type + ".ser";
        FileInputStream is = new FileInputStream(new File(path));
        ObjectInputStream ois = new ObjectInputStream(is);

        //ou ObjectInputStream iS = new ObjectInputStream(newFileInputStream(path));
        switch(type.toLowerCase()) {
            case "people":
                listPeople = (ArrayList<Person>) ois.readObject();
                break;
            case "places":
                listPlaces = (ArrayList<Places>) ois.readObject();
                break;
            case "events":
                listEvents = (ArrayList<Event>) ois.readObject();
                break;
        }
        return 1;

    }
    /**
     * Method to write objects to file
     * @param type the type of the info (events, places, people)
     * @return 1 in success, 0 otherwise
     * @throws IOException 
     */
    public int writeObj(String type) throws IOException {
        String workingDir = System.getProperty("user.dir") + "\\src\\oopprojectnet\\";
        String path = workingDir + type + ".ser";
        try {
            FileOutputStream os = new FileOutputStream(new File(path));
            ObjectOutputStream oos = new ObjectOutputStream(os);

            //ou ObjectInputStream iS = new ObjectInputStream(newFileInputStream(path));

            switch(type.toLowerCase()) {
                case "people":
                    oos.writeObject(listPeople);
                    break;
                case "places":
                    oos.writeObject(listPlaces);
                    break;
                case "events":
                    oos.writeObject(listEvents);
                    break;
            }
            return 1;
        }
        catch (IOException e) {
            return 0;
        }
    }
    
    
    /**
     * Method to get one person with String name
     * @param name the name of the person
     * @return the person in success, null if doesn't exist
     */
    public static Person getPersonFromName(String name) {
        for(Person current:Database.listPeople) {
            if(name.equals(current.getName())) {
                return current;
            }
        }
        return null;
    }
    
    /**
     * Method to get one place with String name
     * @param name name of the place
     * @return the place in success, null if doesn't exist
     */
    
    public static Places getPlaceFromName(String name) {
    for(Places current:Database.listPlaces) {
        if(name.equals(current.getName())) {
            return current;
        }
    }
    return null;
    }
    
    /**
     * Getters and setters of Database class
     * @return 
     */
    public ArrayList<Person> getListPeople() {
        return listPeople;
    }

    public ArrayList<Places> getListPlaces() {
        return listPlaces;
    }

    public ArrayList<Event> getListEvents() {
        return listEvents;
    }

}