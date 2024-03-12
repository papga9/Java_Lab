package Lab04;

public class Student {

    private String name, neptun;
    private int avg;


    public Student(String name, String neptun, int avg) {
        this.name = name;
        this.neptun = neptun;
        this.avg = avg;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNeptun() {
        return neptun;
    }

    public void setNeptun(String neptun) {
        this.neptun = neptun;
    }

    public int getAvg() {
        return avg;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", neptun='" + neptun + '\'' +
                ", avg=" + avg +
                '}';
    }

}
