package Lab02;

public class Rectangle extends Square{

    private double sideB;

    public Rectangle() {
    }

    public Rectangle(double sideB) {
        super(sideB);
        this.sideB = sideB;
    }

    public Rectangle(double side, double sideB) {
        super(side);
        this.sideB = sideB;
    }

    public double getSideB() {
        return sideB;
    }

    @Override
    public double getCircumference() {
        return super.getSide()*2 + getSideB()*2;
    }

    @Override
    public double getArea() {
        return super.getSide()*getSideB();
}
