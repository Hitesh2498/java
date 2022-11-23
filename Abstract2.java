import java.util.Scanner;
class Abstract2{
    public static void main (String[] args)
    {
        System.out.println("Rectangle-");
        Shape s=new Rectangle();
        s.setDim();
        s.area();
        System.out.println("Triangle-");
        s=new Triangle();
        s.setDim();
        s.area();
    }
}
abstract class Shape{
    Scanner sc=new Scanner(System.in);
    double dim1,dim2;
    abstract void area();
    void setDim(){
        System.out.print("Enter Dimension 1: ");
        dim1=sc.nextInt();
        System.out.print("Enter Dimension 2: ");
        dim2=sc.nextInt();    }      }
class Rectangle extends Shape{
    void area(){
        System.out.println("Area="+(dim1*dim2));
    }
}
class Triangle extends Shape{
    void area(){
        System.out.println("Area="+((dim1*dim2)/2));
    }
}
