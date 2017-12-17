package oopprojectnet;

/**
 *
 * @author zmcdo
 */
public class Student extends Person {
    private String studentCourse;

    /**
     *
     */
    public Student() {
        this.studentCourse = "LEI";
    }
    /**
     * Class to create a member of the student, we receives the name, profile, password and the type of employment as parameters
     * @param name of the student, for example "José Martinho"
     * @param profile of the student, it could be "Sporty"
     * @param password of the student, for example, "12345"
     * @param studentCourse course of the student, for example "LEI"
     */
    public Student(String name, String profile, String password, String studentCourse) {
        super(name,profile, password);
        this.studentCourse = studentCourse;
    }

    /**
     *
     * @return
     */
    public String getStudentCourse() {
        return studentCourse;
    }
    
    /**
     * Getters and setters for Student class (person's subclass)
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
     * @return
     */
    @Override
    public String getPassword() {
        return password;
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
     * @param studentCourse
     */
    public void setStudentCourse(String studentCourse) {
        this.studentCourse = studentCourse;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Student{" +
                "studentCourse='" + studentCourse + '\'' +
                ", name='" + name + '\'' +
                ", profile='" + profile + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}