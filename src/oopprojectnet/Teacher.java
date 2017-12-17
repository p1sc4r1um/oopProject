package oopprojectnet;

/**
 *
 * @author zmcdo
 */
public class Teacher extends Person {
    private String teacherType;

    /**
     *
     */
    public Teacher() {
        this.teacherType = "Full";
    }
    /**
     * Class to create of the teacher, it receives the name, profile, password and the type of the teacher as parameters
     * @param name of the teacher, for example "Prof Luis Cordeiro"
     * @param profile of the teacher, it could be ""
     * @param password teacher's password to access events
     * @param teacherType the type of teacher, for example "full"
     */
    public Teacher(String name, String profile, String password, String teacherType) {
        super(name, profile, password);
        this.teacherType = teacherType;
    }
    
        /**
     * Getters and setters to Teacher class (person's subclass)
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
    public String getTeacherType() {
        return teacherType;
    }

    /**
     *
     * @param teacherType
     */
    public void setTeacherType(String teacherType) {
        this.teacherType = teacherType;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Teacher{" +
                "teacherType='" + teacherType + '\'' +
                ", name='" + name + '\'' +
                ", profile='" + profile + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}