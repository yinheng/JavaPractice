/**
 * Created @2017/5/13 16:01
 */
public abstract class Shape {

    public static int Pi() {
        return (int) 3.14;
    }

    abstract void draw();
}

class Circle extends Shape {

    @Override
    void draw() {

    }
}

class BigCircle extends Circle {
    @Override
    void draw() {
    }
}

class Test {
    void test() {
        Shape a = new Circle();
        a.draw();

        a = new BigCircle();
        a.draw();

        Shape.Pi();
        Circle.Pi();
        BigCircle.Pi();
    }
}
