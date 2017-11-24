public class Student extends Person {
    private String studentCourse;
    public Student() {
        this.studentCourse = "LEI";
    }
    /**
     * Class to create a member of the student, we receives the name, profile and the type of employment as parameters
     * @param name of the student, for example "José Henrique"
     * @param profile of the student, it could be ""
     * @param studentCourse course of the student, for example "LEI"
     */
    public Student(String name, String profile, String password, String studentCourse) {
        super(name,profile, password);
        this.studentCourse = studentCourse;
    }

    public String getStudentCourse() {
        return studentCourse;
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