package Lab06;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private String Neptun;

    public Student(String name, String neptun) {
        this.name = name;
        Neptun = neptun;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Neptun='" + Neptun + '\'' +
                '}';
    }
}
