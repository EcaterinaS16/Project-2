package project2;

public abstract  class Marks {
    /*
    We have to calculate the average of marks obtained in three subjects by student A and by student B.
     Create class 'Marks' with an abstract method 'getPercentage' that will be returning the average percentage of marks.
      Provide implementation of abstract method in classes 'A' and 'B'. The constructor of student A takes the
      marks in three subjects as its parameters and the marks in four subjects as its parameters for student B.
      Test your code
     */
    double math;
    double chem;
    double bio;
    Marks (double math, double chem, double bio){
        this.math=math;
        this.chem=chem;
        this.bio=bio;
    }
abstract void getPercentage();
}

class A extends Marks{

A(double math, double chem, double bio){
    super(math,chem,bio);
}
void getPercentage(){
    System.out.println("The average is "+(math+chem+bio)/3);
}
}
class B extends Marks{

double phys;
B(double math, double chem, double bio, double phys){
    super(math,chem,bio);
    this.phys=phys;
}

    @Override
    void getPercentage() {
        System.out.println("The average is "+(math+chem+bio+phys)/4);
    }
}
class MarksTester{
    public static void main(String[] args) {
        A a=new A(70.50,80,82.50);
        a.getPercentage();

        B b=new B(70.50,80,82.50,95);
        b.getPercentage();
    }
}