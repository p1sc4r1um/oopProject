package oopprojectnet;
public class Teacher extends Person {
    private String teacherType;
    public Teacher() {
        this.teacherType = "Full";
    }
    /**
     * Class to create of the teacher, we receives the name, profile and the type of the teacher as parameters
     * @param name of the teacher, for example "Prof Luis Cordeiro"
     * @param profile of the teacher, it could be ""
     * @param teacherType the type of teacher, for example "full"
     */
    public Teacher(String name, String profile, String password, String teacherType) {
        super(name, profile, password);
        this.teacherType = teacherType;
    }

    public String getTeacherType() {
        return teacherType;
    }

    public void setTeacherType(String teacherType) {
        this.teacherType = teacherType;
    }

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