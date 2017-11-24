import java.lang.reflect.Array;
import java.util.*;

public class Event {
    private ArrayList<PersonPlaces> invitedList;
    private ArrayList<Places> placesList;


    /**
     * Constructor to create the invited list for the event
     * @param invitedList
     * @param placesList
     */
    public Event(ArrayList<PersonPlaces> invitedList, ArrayList<Places> placesList) {
        this.invitedList = invitedList;
        this.placesList = placesList;

    }

    /**
     public Event(ArrayList<Places> placesList) {
     invitedList = new ArrayList<Person>();
     this.placesList = new places
     }**/
 
   /* public Event()
    {
        invitedList = new ArrayList<PersonPlaces>();
        placesList = new ArrayList<Places>();
 
    }*/


    /**
     * Method to add person to the event
     * @param newP the person to add
     * @param wantedPlaces the places the person chose
     * @param password password to register in the event
     * @return the person in success and null otherwise
     */

    public PersonPlaces addPerson (Person newP, ArrayList<Places> wantedPlaces, String password) {
        newP.setPassword(password);
        PersonPlaces newPerson = new PersonPlaces(newP,wantedPlaces);
        for (PersonPlaces currentPerson : invitedList) {
            if (currentPerson.getPerson().equals(newPerson.getPerson())) {
                return null;
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
    public PersonPlaces removePerson(PersonPlaces personToRemove) {
        for (PersonPlaces currentPerson : invitedList) {
            if (currentPerson.getPerson().equals(personToRemove)) {
                invitedList.remove(personToRemove);
                return personToRemove;
            }
        }
        return null;
    }

    public int calculateReceipt() {
        int receipt = 0;
        for(PersonPlaces currentPerson: invitedList) {
            for(Places currentPlace : currentPerson.getListPlaces()) {
                if(currentPlace.getClass().toString().toLowerCase().equals("class com.company.exhibitions")) {
                    Exhibitions temp = (Exhibitions) currentPlace;
                    if(currentPerson.getClass().toString().toLowerCase().equals("class com.company.student")) {
                        receipt += Integer.parseInt(((Exhibitions) currentPlace).getPrice())*.10;
                    }
                    else {
                        receipt += Integer.parseInt(((Exhibitions) currentPlace).getPrice());
                    }
                }
                else if(currentPlace.getClass().toString().toLowerCase().equals("class com.company.pubs")) {
                    Pubs temp = (Pubs) currentPlace;
                    receipt +=  Integer.parseInt(((Pubs) currentPlace).getMinimumInput());
                }
            }
        }
        return receipt;
    }


    public int countLocal(Places place) {
        int num = 0;
        for(PersonPlaces currentPerson : invitedList) {

            for(Places currentPlace : currentPerson.getListPlaces()) {
                if(place.equals(currentPlace)) {
                    num++;
                }
            }
        }
        return num;
    }
    public ArrayList<Places> sortByBooked() {
        ArrayList<Places> sortedPlaces = (ArrayList<Places>)placesList.clone();
        Places temp;
        for(int i = 0; i < sortedPlaces.size(); i++) {
            for(int j = 1; j < sortedPlaces.size() - i; j++) {
                if (countLocal(sortedPlaces.get(j-1)) < countLocal(sortedPlaces.get(j))) {
                    temp = sortedPlaces.get(j - 1);
                    sortedPlaces.set(j - 1, sortedPlaces.get(j));
                    sortedPlaces.set(j, temp);
                }
            }
        }
        return sortedPlaces;
    }



    /**
     * Method to print all places that one person can choose in event
     */
    public void printAvailablePlaces() {
        int j = 1;
        for (Places currentPlace : placesList) {
            System.out.println(j + " - " + currentPlace + "[Registed People: "+ countLocal(currentPlace) +"]");
            j++;
        }
    }

    public ArrayList<PersonPlaces> getInvitedList() {
        return invitedList;
    }

    public ArrayList<Places> getPlacesList() {
        return placesList;
    }
}