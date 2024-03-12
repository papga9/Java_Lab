package Lab04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Classes {

    static List<Student> course = new ArrayList<>();

    public Classes() {
        for (int i = 0; i < 10; i++) {
            course.add(new Student("Nev" + i, "Neptun" + i, i/2));
        }
    }


    public static void main(String[] args) {
        new Classes();

        course.stream()
                .filter(x -> x.getAvg()>3 )
                .sorted(
                        Comparator.comparing(Student::getAvg)
                                .reversed()
                                .thenComparing(Student::getName)
                                .reversed()
                )
                //.forEach((Student x) -> System.out.println(x));
                .findFirst()
                .ifPresent(x -> System.out.println(x.toString()));



        course.stream()
                .filter(x -> x.getName().equals("Name1"))
                .findFirst()
                .ifPresent(x -> System.out.println(x.getAvg()));

        course.stream()
                .filter(x -> x.getName().startsWith("B"))
                .count();

        List<String> change = new ArrayList<>();
        change.add("3,14");
        change.add("1,618");
        change.add("2.718");

        //test commit

        List<Float> floatChage = change.parallelStream()
                .map(x -> x.replace(',', '.'))
                .map(x -> Float.parseFloat(x))
                .toList();

        System.out.println(change);

        /*for (int i = 0; i < course.size(); i++) {
            System.out.println(course.get(i).toString());
        }*/
    }
}
