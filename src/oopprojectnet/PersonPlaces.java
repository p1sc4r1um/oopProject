package oopprojectnet;
import java.io.Serializable;
import java.util.*;

/**
 *
 * @author zmcdo
 */
public class PersonPlaces implements Serializable {
    private Person person;
    private ArrayList<Places> listPlaces;

    /**
     * Constructor to add picked places for each person, receives two parameters
     * @param person the object person you want to add a places' list
     * @param listPlaces the array with picked places by person
     */
    public PersonPlaces(Person person, ArrayList<Places> listPlaces) {
        this.person = person;
        this.listPlaces = listPlaces;
    }
    /**
     * Method to add one place to listPlaces, receives one place as argument
     * @param placeToAdd the place you want to add
     * @return return the place in success, null otherwise
     */
    /*public Places addPlaces(Places placeToAdd) {
        for(Places place : listPlaces) {
            if(place.equals(placeToAdd)) {
                return null;
            }
        }
        if(listPlaces.size() < 6) {
            listPlaces.add(placeToAdd);
            return placeToAdd;
        }
        return null;
    }
    */
    /**
     * Method to remove one place from listPlaces, receives one place as argument
     * @param placeToRemove the place you want to remove
     * @return return the place removed in success, null otherwise
     */
    /*
    public Places removePlaces(Places placeToRemove) {
        for(Places place : listPlaces) {
            if(place.equals(placeToRemove)) {
                listPlaces.remove(placeToRemove);
                return placeToRemove;
            }
        }
        return null;
    }
    */
    
    /**
     * Getters and setters of PersonPlaces class
     * @return 
     */

    public Person getPerson() {
        return person;
    }

    /**
     *
     * @param person
     */
    public void setPerson(Person person) {
        this.person = person;
    }

    /**
     *
     * @return
     */
    public ArrayList<Places> getListPlaces() {
        return listPlaces;
    }

    /**
     *
     * @param listPlaces
     */
    public void setListPlaces(ArrayList<Places> listPlaces) {
        this.listPlaces = listPlaces;
    }
}