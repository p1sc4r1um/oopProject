package oopprojectnet;
public class Staff extends Person {
    private String employment;
    public Staff() {
        this.employment = "Full-time";
    }

    /**
     * Class to create a member of the staff, we receives the name, profile and the type of employment as parameters
     * @param name of the member of the staff, for example "Dona Joca"
     * @param profile of the member of staff, it could be ""
     * @param employment it could be full-time of partial-time
     */
    public Staff(String name, String profile, String password, String employment) {
        super(name,profile, password);
        this.employment = employment;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getProfile() {
        return profile;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setProfile(String profile) {
        this.profile = profile;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public String getEmployment() {
        return employment;
    }

    public void setEmployment(String employment) {
        this.employment = employment;
    }

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