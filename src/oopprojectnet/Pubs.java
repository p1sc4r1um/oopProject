package oopprojectnet;
import java.util.*;

public class Pubs extends Places {
    private String capacity, minimumInput;
    private ArrayList<Person> guestList; //% of capacity

    public Pubs() {
        this.name = "Moelas";
        this.coords = "40.209188, -8.427604";
        capacity = "99999";
        minimumInput = "1"; // in €
        guestList = new ArrayList<Person>();
    }

    /**
     * Class to create a pub which is a place that receives 4 strings as parameters
     * @param coords GPS coordinates of the specific exhibition, for example "40.208995, -8.425555"
     * @param name Pub's name, for example "Moelas"
     * @param capacity Pub's maximum capacity, for example "50 people"
     * @param minimumInput Price that you have to consume to enter in the pub
     */
    public Pubs(String coords,String name, String capacity, String minimumInput, ArrayList<Person> guestList) {
        super(coords, name);
        this.capacity = capacity;
        this.minimumInput = minimumInput;
        this.guestList = guestList;
    }

    /**
     * Method to add people to the guest list, in case of the limit is reached or person is actually in guest list the person isn't added to the guest list
     *
     * @param personToAdd the person you want to add to guest list
     * @return the person in success and null otherwise
     */

    public Person addPersonGuestList (Person personToAdd) {
        int limit = (int) (0.5 * Integer.parseInt(this.capacity));
        for(Person person : guestList) {
            if(person.equals(personToAdd)) {
                return null;
            }
        }
        if(guestList.size() < limit) {
            guestList.add(personToAdd);
            return personToAdd;
        }
        else if (guestList.size() == limit && personToAdd.getProfile().toLowerCase().equals("bohemian") && checkPersonToRemove() != -1) {
            guestList.set(checkPersonToRemove(), personToAdd);
            return personToAdd;
        }
        return null;
    }

    /**
     * Method to remove people from the guest list
     * @param personToRemove the person you want to remove from guest list
     * @return the person in success, null otherwise
     */
    public Person removePersonGuestList (Person personToRemove) {
        for(Person person : guestList) {
            if(person.equals(personToRemove)) {
                guestList.remove(personToRemove);
                return personToRemove;
            }
        }
        return null;
    }

    private int checkPersonToRemove() {
        for(int i = guestList.size()-1; i>=0; i--) {
            if (!guestList.get(i).getProfile().toLowerCase().equals("bohemian")) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Method to print the guest list sorted by date of apply and bohemian people have priority
     * @return string to print
     */

    public String printGuestList() {
        String s = "";
        for (Person i : guestList) {
            if(i.getClass().toString().equals("class com.company.Student")) {
                Student j = (Student) i;
                s = s + "-> " + i.getName() + ", " + i.getProfile() + ", " + j.getStudentCourse() + "\n";
            }
            else {
                s = s + "-> " + i.getName() + ", " + i.getProfile() + "\n";
            }
        }
        return s;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getMinimumInput() {
        return minimumInput;
    }

    public void setMinimumInput(String minimumInput) {
        this.minimumInput = minimumInput;
    }


    @Override
    public String toString() {
        return "Pubs{" +
                "capacity='" + capacity + '\'' +
                ", minimumInput='" + minimumInput + '\'' +
                ", guestList:\n" + printGuestList() +
                ", coords='" + coords + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}