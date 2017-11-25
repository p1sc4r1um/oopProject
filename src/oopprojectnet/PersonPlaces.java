package oopprojectnet;
import java.util.*;

public class PersonPlaces {
    private Person person;
    private ArrayList<Places> listPlaces;

    /**
     * Constructor to add picked places for each person
     */
    public PersonPlaces(Person person, ArrayList<Places> listPlaces) {
        this.person = person;
        this.listPlaces = listPlaces;
    }

    public Places addPlaces(Places placeToAdd) {
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

    public Places removePlaces(Places placeToRemove) {
        for(Places place : listPlaces) {
            if(place.equals(placeToRemove)) {
                listPlaces.remove(placeToRemove);
                return placeToRemove;
            }
        }
        return null;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public ArrayList<Places> getListPlaces() {
        return listPlaces;
    }

    public void setListPlaces(ArrayList<Places> listPlaces) {
        this.listPlaces = listPlaces;
    }
}