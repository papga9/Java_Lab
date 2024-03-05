package Lab02_03;

import java.util.Map;

public class Course {
    private String name;
    private Map<String, Student> students;

    public String getName() {
        return name;
    }

    public Map<String, Student> getStudents() {
        return students;
    }



    public Course(String name) {
        this.name = name;
    }

    public Course() {

    }
}
