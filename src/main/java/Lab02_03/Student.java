package Lab02_03;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Student implements Serializable {
    private String name, neptun;
    private float avg;
    private List<Student> students = new ArrayList<>();

    public Student(String name, String neptun, float avg) {
        this.name = name;
        this.neptun = neptun;
        this.avg = avg;
    }

    public Student() {
        this.name = getAlphaNumericString(10);
        this.neptun = getAlphaNumericString(6);
        this.avg = (float) (Math.random()*5);
    }

    public float getAvg() {
        return avg;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", neptun='" + neptun + '\'' +
                ", avg=" + avg;
    }

    static String getAlphaNumericString(int n)
    {

        // choose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int)(AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Student pulya = new Student();
        System.out.println(pulya.toString());
    }
}
