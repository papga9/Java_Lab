package Lab02_03;

import java.util.ArrayList;
import java.util.List;

public class Lab2 {
    public static void main(String[] args) {
        Student asd = new Student("Papp Gábor", "G7IHX2", 3 );
        List<Student> students = new ArrayList<>();

        students.add(asd);

        for (int i=0; i<10; i++) {
            students.add(new Student());
        }

        for (int i=0; i<10; i++) {
            System.out.println(students.toString());
        }

    }
}
