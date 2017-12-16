package oopprojectnet;
import java.util.*;

public class Pubs extends Places {
    private String capacity, minimumInput;
    private ArrayList<Person> guestList; //% of capacity
    private ArrayList<Person> customersList;

    public Pubs() {
        this.name = "Moelas";
        this.coords = "40.209188, -8.427604";
        capacity = "99999";
        minimumInput = "1"; // in €
        guestList = new ArrayList<>();
        customersList = new ArrayList<>();

    }

    /**
     * Class to create a pub which is a place that receives 4 strings as parameters
     * @param coords GPS coordinates of the specific exhibition, for example "40.208995, -8.425555"
     * @param name Pub's name, for example "Moelas"
     * @param capacity Pub's maximum capacity, for example "50 people" [must be an integer]
     * @param minimumInput Price that you have to consume to enter in the pub [must be an integer]
     * @param guestList
     * @param customersList
     */
    public Pubs(String coords,String name, String capacity, String minimumInput, ArrayList<Person> guestList, ArrayList<Person> customersList) {
        super(coords, name);
        this.capacity = capacity;
        this.minimumInput = minimumInput;
        this.guestList = guestList;
        this.customersList = customersList;
    }

    /**
     * Method to add people to the guest list and customersList, in case of the limit is reached or person is actually in guest list the person isn't added to the guest list
     *
     * @param personToAdd the person you want to add to guest list
     * @return the person in success and null otherwise
     */

    public Person addPersonGuestList (Person personToAdd) {
        if(this.customersList.size() < Integer.parseInt(this.capacity)) {
            customersList.add(personToAdd);
        }
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
     * Method to remove one person from the list
     * @param personToRemove the person you want to remove from list and if he/she is in guest list add another to the guest list
     * @return the person in success, null otherwise
     */
    public Person removePerson (Person personToRemove) {
        int check = 0;
        for(Person person : guestList) {
            if(person.equals(personToRemove)) {
                guestList.remove(personToRemove);
                for(Person a:customersList) {
                    if(!guestList.contains(a) && a.profile.toLowerCase().equals("bohemian") && !a.equals(personToRemove)) {
                        check = 1;
                        guestList.add(a);
                        break;
                    }
                }
                if(check == 0) {
                    for(Person a:customersList) {
                        if(!guestList.contains(a) && !a.equals(personToRemove)) {
                            guestList.add(a); 
                            break;
                        }
                    }
                }
            }
        }
        for(Person person : customersList) {
            if(person.equals(personToRemove)) {
                customersList.remove(personToRemove);
                return personToRemove;
            }
        }
        return null;
    }
    
    
    
    /**
     * Method to search one person to remove from guest list if neccessary, receives nothing
     * @return the person's index in success, -1 otherwise
     */

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
            if(i.getClass().toString().equals("class oopprojectnet.Student")) {
                Student j = (Student) i;
                s = s + "-> " + i.getName() + ", " + i.getProfile() + ", " + j.getStudentCourse() + "\n";
            }
            else {
                s = s + "-> " + i.getName() + ", " + i.getProfile() + "\n";
            }
        }
        return s;
    }
    /**
     * Method to calculate the guestList in one Pub, receives no argument
     * @return an array of Strings containing the name of each person in guest list
     */
    
    public String[] showGuestList() {
        ArrayList<String> guestListPrint = new ArrayList<>();
        for(Person p : customersList) {
            if((guestListPrint.size() < (int) (0.5 * Integer.parseInt(this.capacity))) && p.getProfile().toLowerCase().equals("bohemian")) {
                guestListPrint.add(p.getName());
            }
        }
        int i = 0;
        while(guestListPrint.size() < (int) (0.5 * Integer.parseInt(this.capacity))) {
            if(!guestListPrint.contains(customersList.get(i).getName())) {
                guestListPrint.add(customersList.get(i++).getName());
            }
        }
        String[] temp = new String[guestListPrint.size()];
        temp = guestListPrint.toArray(temp);
        return temp;
    }
   
    
    /**
     * Getters and setters for Pubs class (places' subclass)
     */
    
    @Override
    public String getCoords() {
        return coords;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getCapacity() {
        return capacity;
    }
    @Override
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
    @Override
    public String getMinimumInput() {
        return minimumInput;
    }
    @Override
    public void setMinimumInput(String minimumInput) {
        this.minimumInput = minimumInput;
    }

    public ArrayList<Person> getGuestList() {
        return guestList;
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