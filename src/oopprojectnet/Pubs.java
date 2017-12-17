package oopprojectnet;
import java.util.*;

/**
 *
 * @author zmcdo
 */
public class Pubs extends Places {
    private String capacity, minimumInput;
    private ArrayList<Person> customersList;

    /**
     *
     */
    public Pubs() {
        this.name = "Moelas";
        this.coords = "40.209188, -8.427604";
        capacity = "99999";
        minimumInput = "1"; // in €
        customersList = new ArrayList<>();

    }

    /**
     * Class to create a pub which is a place that receives 4 strings as parameters
     * @param coords GPS coordinates of the specific exhibition, for example "40.208995, -8.425555"
     * @param name Pub's name, for example "Moelas"
     * @param capacity Pub's maximum capacity, for example "50 people" [must be an integer]
     * @param minimumInput Price that you have to consume to enter in the pub [must be an integer]
     * @param customersList
     */
    public Pubs(String coords,String name, String capacity, String minimumInput, ArrayList<Person> customersList) {
        super(coords, name);
        this.capacity = capacity;
        this.minimumInput = minimumInput;
        this.customersList = customersList;
    }

    /**
     * Method to add people to the customersList, in case of the limit is reached
     *
     * @param personToAdd the person you want to add to guest list
     * @return the person in success and null otherwise
     */

    public Person addPerson (Person personToAdd) {
        if(this.customersList.size() < Integer.parseInt(this.capacity)) {
            customersList.add(personToAdd);
            return personToAdd;
        }
        return null;
    }

    /**
     * Method to remove one person from the list
     * @param personToRemove the person you want to remove from list
     * @return the person in success, null otherwise
     */
    public Person removePerson (Person personToRemove) {
        for(Person person : customersList) {
            if(person.equals(personToRemove)) {
                customersList.remove(personToRemove);
                return personToRemove;
            }
        }
        return null;
    }
    
    
    /**
     * Method to calculate the guestList in one Pub, receives no argument
     * @return an array of Strings containing the name of each person in guest list
     */
    
    public String[] showGuestList() {
        ArrayList<String> guestListPrint = new ArrayList<>();
        for(Person p : customersList) {
            if((guestListPrint.size() < (int) (0.5 * Integer.parseInt(this.capacity))) && p.getProfile().toLowerCase().equals("bohemian")) {
                 if(p.getClass().toString().toLowerCase().equals("class oopprojectnet.student")) {
                     guestListPrint.add(p.getName()+","+p.getProfile()+","+((Student)p).getStudentCourse());
                 }
                 else {
                     guestListPrint.add(p.getName()+","+p.getProfile());
                 }
            }
        }
        for(Person p : customersList) {
            if(guestListPrint.size() < (int) (0.5 * Integer.parseInt(this.capacity)) && !p.getProfile().toLowerCase().equals("bohemian")) {
                 if(p.getClass().toString().toLowerCase().equals("class oopprojectnet.student")) {
                     guestListPrint.add(p.getName()+","+p.getProfile()+","+((Student)p).getStudentCourse());
                 }
                 else {
                     guestListPrint.add(p.getName()+","+p.getProfile());
                 }
            }
        }
       
        String[] temp = new String[guestListPrint.size()];
        temp = guestListPrint.toArray(temp);
        return temp;
    }
   
    
    /**
     * Getters and setters for Pubs class (places' subclass)
     * @return 
     */
    
    @Override
    public String getCoords() {
        return coords;
    }

    /**
     *
     * @return
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    @Override
    public String getCapacity() {
        return capacity;
    }

    /**
     *
     * @param capacity
     */
    @Override
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    /**
     *
     * @return
     */
    @Override
    public String getMinimumInput() {
        return minimumInput;
    }

    /**
     *
     * @param minimumInput
     */
    @Override
    public void setMinimumInput(String minimumInput) {
        this.minimumInput = minimumInput;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Pubs{" +
                "capacity='" + capacity + '\'' +
                ", minimumInput='" + minimumInput + '\'' +
                ", coords='" + coords + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}