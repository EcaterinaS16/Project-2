package project2;

public interface Shape {
    /*
    Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
     Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. Test your code.
     */
   public void calculateArea(int num);
   public void calculatePerimiter(int num);


}
class Circle implements Shape{


    @Override
    public void calculateArea(int radius) {
        System.out.println("Area of the Circle is "+Math.PI*radius*radius);
    }

    @Override
    public void calculatePerimiter(int radius) {
        System.out.println("perimeter  of the circle is "+2*Math.PI*radius);
    }
}

class Square implements Shape{


    @Override
    public void calculateArea(int length) {

        System.out.println("The square area is "+length*length);
                    }


    @Override
    public void calculatePerimiter(int length) {
        System.out.println("The square perimeter is "+length*4);
    }
}
