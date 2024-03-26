package Lab06;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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

        try (ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(Paths.get("kurzusok.dat")))

        ) {
            out.writeObject(classes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (ObjectInputStream in = new ObjectInputStream(Files.newInputStream(Paths.get("kurzusok.dat")))) {
            Map<String, List<Student>> o = (Map<String, List<Student>>) in.readObject();
            System.out.println(o);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        /// nem szép kiírás
        new Gson().toJson(classes);

        ///szép kiírás
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        System.out.println(gson.toJson(classes));

        try (BufferedReader in = Files.newBufferedReader(Paths.get("gsontest.json"))) {
            Type typeToRead = new TypeToken<HashMap<String, ArrayList<Student>>>(){}.getType();
            Map<String, List<Student>> o2 = new Gson().fromJson(in, typeToRead);
            System.out.println("===" + o2);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
