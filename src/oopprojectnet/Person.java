package oopprojectnet;
import java.io.Serializable;

/**
 *
 * @author zmcdo
 */
public class Person implements Serializable {

    /**
     *
     */
    protected String name;

    /**
     *
     */
    protected String profile; //Culture,sporty,spared,bohemian

    /**
     *
     */
    protected String password;

    /**
     *
     */
    public Person() {
        this.name = "Josef";
        this.profile = "Sporty";
        this.password = null;
    }
    /**
     * Class to create a member of DEI, receives the name, profile
     * @param name of the person, for example "Prof Luis Cordeiro"
     * @param profile of the person, it could be "Sporty"
     * @param password of the person, it could be "12345"
     */
    public Person(String name, String profile, String password) {
        this.name = name;
        this.profile = profile;
        this.password = password;
    }
    
    /**
     * Getters and setters of Person class
     * @return 
     */

    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getProfile() {
        return profile;
    }

    /**
     *
     * @param profile
     */
    public void setProfile(String profile) {
        this.profile = profile;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", profile=" + profile + ", password=" + password + '}';
    }
    
}