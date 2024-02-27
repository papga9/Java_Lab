package Lab02;

import java.io.Serializable;

public class Student implements Serializable {
    private String name, neptun;
    private float avg;

    public Student(String name, String neptun, float avg) {
        this.name = name;
        this.neptun = neptun;
        this.avg = avg;
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
}
