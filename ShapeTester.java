package project2;

public class ShapeTester {
    public static void main(String[] args) {
        Shape shape=new Circle();
        shape.calculatePerimiter(5);
        shape.calculateArea(5);

        Shape shape1=new Square();
        shape1.calculatePerimiter(10);
        shape1.calculateArea(15);

        }
    }
