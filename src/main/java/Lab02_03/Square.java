package Lab02_03;

public class Square implements Shape{

    private double side;

    public Square() {
        this.side = Double.parseDouble(null);
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getCircumference() {
        return side*4;
    }

    @Override
    public double getArea() {
        return side*side;
    }
}
