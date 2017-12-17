package oopprojectnet;
import java.lang.reflect.Array;
import java.util.*;

public class Event {
    private ArrayList<PersonPlaces> invitedList;
    private ArrayList<Places> placesList;
    private String name;




    /**
     * Constructor to create the invited list for the event, receives one string and two arraylist as arguments
     * @param name the name of event, could be "Festa da Cidade"
     * @param invitedList the people signed up for the event, arraylist 
     * @param placesList the places that event will have
     */
    
    
    public Event(String name, ArrayList<PersonPlaces> invitedList, ArrayList<Places> placesList) {
        this.name = name;
        this.invitedList = invitedList;
        this.placesList = placesList;

    }

    /**
     * Method to add person to the event
     * @param newP the person to add
     * @param wantedPlaces the places the person chose
     * @param password password to register in the event
     * @return the person in success, null otherwise
     */
    
    public PersonPlaces addPerson (Person newP, ArrayList<Places> wantedPlaces) {
        for(Places p:wantedPlaces) {
            if(!this.placesList.contains(p)) {
                wantedPlaces.remove(p);
            }
        }
        PersonPlaces newPerson = new PersonPlaces(newP,wantedPlaces);
        Person g;
        for (PersonPlaces currentPerson : invitedList) {
            if (currentPerson.getPerson().equals(newPerson.getPerson())) {
                return null;
            }
        }
        for(Places currentPlace:wantedPlaces) {
            if(currentPlace.getClass().toString().toLowerCase().equals("class oopprojectnet.pubs")) {
                g = ((Pubs)currentPlace).addPerson(newP);
                if(g == null) {
                    return null;
                }
            }
        }
        invitedList.add(newPerson);
        return newPerson;

    }


    /**
     * Method to remove person from the event
     * @param personToRemove person to remove
     * @return return person in success, null otherwise
     */
    public Person removePerson(Person personToRemove) {
        for (PersonPlaces currentPerson : invitedList) {
            if (currentPerson.getPerson().equals(personToRemove)) {
                invitedList.remove(currentPerson);
                return personToRemove;
            }
        }
        return null;
    }

    
    /**
     * Method to calculate an event receipt, receives no arguments
     * @return the receipt calculated as integer
     */
    
    public int calculateEventReceipt() {
        int receipt = 0;
        for(PersonPlaces currentPerson: invitedList) {
            for(Places currentPlace : currentPerson.getListPlaces()) {
                if(currentPlace.getClass().toString().toLowerCase().equals("class oopprojectnet.exhibitions")) {
                    Exhibitions temp = (Exhibitions) currentPlace;
                    if(currentPerson.getClass().toString().toLowerCase().equals("class oopprojectnet.student")) {
                        receipt += Integer.parseInt(((Exhibitions) currentPlace).getPrice())*.10;
                    }
                    else {
                        receipt += Integer.parseInt(((Exhibitions) currentPlace).getPrice());
                    }
                }
                else if(currentPlace.getClass().toString().toLowerCase().equals("class oopprojectnet.pubs")) {
                    Pubs temp = (Pubs) currentPlace;
                    receipt +=  Integer.parseInt(((Pubs) currentPlace).getMinimumInput());
                }
            }
        }
        return receipt;
    }

    /**
     * Method to count how many people signed in one local, receives a string as argument
     * @param place the name of place you want to count
     * @return the num of people signed in the local (integer)
     */

    public int countLocal(String place) {
        int num = 0;
        for(Places p : placesList) {
            if(p.getName().equals(place)) {
                for(PersonPlaces currentPerson : invitedList) {
                    for(Places currentPlace : currentPerson.getListPlaces()) {
                        if(place.equals(currentPlace.getName())) {
                            num++;
                        }
                    }
                }
            }
        }
        return num;
    }
    
    
    /**
     * Method to calculate specific place receipt, receives a string as argument
     * @param place name of place you want to calculate the receipt
     * @return an integer, the receipt calculated in euros
     */
    public int calculatePlaceReceipt(String place) {
        float receipt=0;
        for(Places p : placesList) {
            if(p.getName().equals(place)) {
                for(PersonPlaces c : invitedList) {
                    for(Places currentPlace : c.getListPlaces()) {
                        if(place.equals(currentPlace.getName())) {
                            if(currentPlace.getClass().toString().toLowerCase().equals("class oopprojectnet.exhibitions")) {
                                if(c.getPerson().getClass().toString().toLowerCase().equals("class oopprojectnet.student")) {
                                    receipt += Integer.parseInt(((Exhibitions) currentPlace).getPrice())*.10;
                                }
                                else {
                                    receipt += Integer.parseInt(((Exhibitions) currentPlace).getPrice());
                                }

                            }
                            else if(currentPlace.getClass().toString().toLowerCase().equals("class oopprojectnet.pubs")) {
                                receipt +=  Integer.parseInt(((Pubs) currentPlace).getMinimumInput());
                            }
                        }
                    }
                }
            }
        }
        int intReceipt = (int) Math.round(receipt);
        return intReceipt;
    }
    
    /**
     * Method to sort places by number of people signed, receives no arguments
     * @return the places array correctly sorted
     */
    public ArrayList<Places> sortByBooked() {
        ArrayList<Places> sortedPlaces = (ArrayList<Places>)placesList.clone();
        Places temp;
        for(int i = 0; i < sortedPlaces.size(); i++) {
            for(int j = 1; j < sortedPlaces.size() - i; j++) {
                if (countLocal(sortedPlaces.get(j-1).getName()) < countLocal(sortedPlaces.get(j).getName())) {
                    temp = sortedPlaces.get(j - 1);
                    sortedPlaces.set(j - 1, sortedPlaces.get(j));
                    sortedPlaces.set(j, temp);
                }
            }
        }
        return sortedPlaces;
    }



    /**
     * Method to print all places that one person can choose in event with number of people signed
     */
    public void printAvailablePlaces() {
        int j = 1;
        for (Places currentPlace : placesList) {
            System.out.println(j + " - " + currentPlace + "[Registed People: "+ countLocal(currentPlace.getName()) +"]");
            j++;
        }
    }
    
    /**
     * Getters and setters of Event
     */
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<PersonPlaces> getInvitedList() {
        return invitedList;
    }

    public ArrayList<Places> getPlacesList() {
        return placesList;
    }

    @Override
    public String toString() {
        return "Event{" + "invitedList=" + invitedList + ", placesList=" + placesList + ", name=" + name + '}';
    }
    
   
}