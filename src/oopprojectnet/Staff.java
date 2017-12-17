package oopprojectnet;

/**
 *
 * @author zmcdo
 */
public class Staff extends Person {
    private String employment;

    /**
     *
     */
    public Staff() {
        this.employment = "Full-time";
    }

    /**
     * Class to create a member of the staff, we receives the name, profile, password and the type of employment as parameters
     * @param name of the member of the staff, for example "Dona Antonia"
     * @param profile of the member of staff, it could be ""
     * @param password of the member of staff, for example "12345"
     * @param employment it could be full-time of partial-time
     */
    public Staff(String name, String profile, String password, String employment) {
        super(name,profile, password);
        this.employment = employment;
    }
    
    /**
     * Getters and setters for Staff class (person's subclass)
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
    public String getProfile() {
        return profile;
    }

    /**
     *
     * @param name
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param profile
     */
    @Override
    public void setProfile(String profile) {
        this.profile = profile;
    }

    /**
     *
     * @param password
     */
    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @return
     */
    @Override
    public String getPassword() {
        return password;
    }

    /**
     *
     * @return
     */
    public String getEmployment() {
        return employment;
    }

    /**
     *
     * @param employment
     */
    public void setEmployment(String employment) {
        this.employment = employment;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Staff{" +
                "employment='" + employment + '\'' +
                ", name='" + name + '\'' +
                ", profile='" + profile + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}