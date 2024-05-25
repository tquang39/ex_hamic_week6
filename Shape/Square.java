package Shape;

public class Square extends Rectangle {
    public Square() {

    }

    public Square(double width, double length) {
        super(width, length);
    }

    public Square(double width, double length, String color, boolean filled) {
        super(width, length, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    public void setWidth(double side) {
        super.setWidth(side);
    }

    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + ",width=" + getWidth() + ",length=" + getLength() + "]";
    }
}
