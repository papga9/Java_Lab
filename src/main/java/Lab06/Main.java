package Lab06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    static List<Student> java1 = new ArrayList<>();
    static List<Student> java2 = new ArrayList<>();

    static Map<String, List<Student>> classes = new HashMap<>();

    public static void main(String[] args) {
        java1.add(new Student("Aladár", "abc123"));
        java1.add(new Student("Béla", "abc456"));
        java2.add(new Student("Cecil", "def123"));
        java2.add(new Student("Dénes", "def456"));

        classes.put("Java1", java1);
        classes.put("Java2", java2);
        


    }


}
