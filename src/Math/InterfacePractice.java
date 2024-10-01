package Math;

interface Drawable {
    void draw();
}

interface Movable {
    void moveto(int x, int y);
}

class Circle implements Drawable, Movable {
    double pi = 3.14;
    int radius;


    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle has been drawn");
    }

    @Override
    public void moveto(int x, int y) {
        System.out.println("Circle has been moved to " + x + ", " + y);
    }
}

public class InterfacePractice{
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.draw();
        circle.moveto(10, 20);
    }
}