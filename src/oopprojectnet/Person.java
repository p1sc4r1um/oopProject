package oopprojectnet;
import java.io.Serializable;

public class Person implements Serializable {
    protected String name;
    protected String profile; //Culture,sporty,spared,bohemian
    protected String password;
    public Person() {
        this.name = "Josef";
        this.profile = "Sporty";
        this.password = null;
    }
    /**
     * Class to create a member of DEI, receives the name, profile
     * @param name of the person, for example "Prof Luis Cordeiro"
     * @param profile of the person, it could be ""
     */
    public Person(String name, String profile, String password) {
        this.name = name;
        this.profile = profile;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}