package oopprojectnet;
public class Student extends Person {
    private String studentCourse;
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

    public String getStudentCourse() {
        return studentCourse;
    }
    
    /**
     * Getters and setters for Student class
     */

    @Override
    public String getName() {
        return name;
    }

    @Override

    public String getProfile() {
        return profile;
    }

    @Override
    public String getPassword() {
        return password;
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

    

    public void setStudentCourse(String studentCourse) {
        this.studentCourse = studentCourse;
    }

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