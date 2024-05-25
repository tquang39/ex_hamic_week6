package Movable;

public class MovablePoint implements Movable {
    private int x;
    private int y;
    private final int xSpeed;
    private final int ySpeed;

    public MovablePoint(int ySpeed, int x, int y, int xSpeed) {
        this.ySpeed = ySpeed;
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ") speed=(" + xSpeed + "," + ySpeed + ")";
    }

    @Override
    public void moveUp() {
        y -= ySpeed;
    }

    @Override
    public void moverDown() {
        y += ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }
}
