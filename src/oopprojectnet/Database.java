package oopprojectnet;

import java.io.*;
import java.util.*;

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


    private String getName(String parts[]) {
        String res = "";
        if(parts[2].toLowerCase().equals("sportsfield") || parts[2].toLowerCase().equals("garden")) {
            for (int i = 0; i < parts.length - 3; i++) {
                res += parts[i] + " ";
            }
        }
        else {
            for (int i = 0; i < parts.length - 4; i++) {
                res += parts[i] + " ";
            }
        }

        return res.substring(0, res.length() - 1);
    }

    /**
     * Method to read the info receives a parameter with the type of information you want to read
     *
     * @param type the type of the info (events, places, people)
     * @return 1 in success, 0 otherwise
     * @throws IOException
     */
    public static Person getPersonFromName(String name) {
        for(Person current:Database.listPeople) {
            if(name.equals(current.getName())) {
                return current;
            }
        }
        return null;
    }


    public int readTxt(String type) throws IOException {
        String path;
        Student newStudent = null;
        Teacher newTeacher = null;
        Staff newStaff = null;
        Exhibitions newExibition;
        SportsField newSportsField;
        Gardens newGarden;
        Pubs newPub;
        path = "/home/jmartinhoj/Documents/lei/poo/project/oopProject/src/com/company/info" + type + ".txt";
        BufferedReader br = new BufferedReader(new FileReader(path));
        String strLine;
        String[] parts;
        while ((strLine = br.readLine()) != null) {
            parts = strLine.split(":");
            if (type.toLowerCase().equals("People")) {
                //Jose:Campos:Student:Profile:Password:StudentCourse
                //Luis:Cordeiro:Teacher:Profile:Password:TeacherType
                switch (parts[2].toLowerCase()) {
                    case "student":
                        newStudent = new Student(getName(parts), parts[parts.length-3], parts[parts.length-2], parts[parts.length-1]);
                        listPeople.add(newStudent);
                        break;
                    case "teacher":
                        newTeacher = new Teacher(getName(parts), parts[parts.length-3], parts[parts.length-2], parts[parts.length-1]);
                        listPeople.add(newTeacher);
                        break;
                    case "staff":
                        newStaff = new Staff(getName(parts), parts[parts.length-3], parts[parts.length-2], parts[parts.length-1]);
                        listPeople.add(newStaff);
                        break;
                }
            }
            else if (type.toLowerCase().equals("Places")) {
                //Jose:Campos:Student:Profile:Password:StudentCourse
                //Luis:Cordeiro:Teacher:Profile:Password:TeacherType
                switch (parts[2].toLowerCase()) {
                    case "sportsfield":
                        newSportsField = new SportsField(parts[parts.length-2], getName(parts), parts[parts.length-1]);
                        System.out.println(newSportsField);
                        listPlaces.add(newSportsField);
                        break;
                    case "garden":
                        newGarden = new Gardens(parts[parts.length-2], getName(parts), parts[parts.length-1]);
                        System.out.println(newGarden);
                        listPlaces.add(newGarden);
                        break;
                    case "exhibition":
                        newExibition = new Exhibitions(parts[parts.length-3], getName(parts), parts[parts.length-2], parts[parts.length-1]);
                        System.out.println(newExibition);
                        listPlaces.add(newExibition);
                        break;
                    /*case "pub":
                        newPub = new Pubs(parts[0] + " " + parts[1], parts[3], parts[4], parts[5]);
                        System.out.println(newStaff);
                        break;*/
                }
            }
            else if (type.toLowerCase().equals("Events")) {

            }
        }
        br.close();
        return 1;
    }




    public int readObj(String type) throws IOException {
        String path = "/home/jmartinhoj/Documents/lei/poo/project/oopProject/src/com/company/info" + type + ".ser";
        try {
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
        catch (IOException e) {
            return 0;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }
    public int writeObj(String type) throws IOException {
        String path = "/home/jmartinhoj/Documents/lei/poo/project/oopProject/src/com/company/info" + type + ".ser";
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