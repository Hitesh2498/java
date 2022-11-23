import java.util.Scanner;
class Hierarchical
{
    public static void main (String[] args)
    {
        System.out.println("<-Satej Kalebere->\n");
        System.out.println("Addition:");
        Add a=new Add();
        a.setData();
        a.addition();
        System.out.println("Subtraction:");
        Subtract s=new Subtract();
        s.setData();
        s.subtraction();
        System.out.println("Multiplication:");
        Multiply m=new Multiply();
        m.setData();
        m.multiplication();
        System.out.println("Division:");
        Divide d=new Divide();
        d.setData();
        d.division();
    }
}
class Base
{
    Scanner sc=new Scanner(System.in);
    int a,b;
    void setData()
    {
        System.out.print("Enter 1st Number: ");
        a=sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        b=sc.nextInt();
    }
}
class Add extends Base
{
    void addition()
    {
        System.out.println("Addition="+(a+b));
    }
}
class Subtract extends Base
{
    void subtraction()
    {
        System.out.println("Subtraction="+(a-b));
    }
}
class Multiply extends Base
{
    void multiplication()
    {
        System.out.println("Multiplication="+(a*b));
    }
}
class Divide extends Base
{
    void division()
    {
        System.out.println("Division="+(a/b)+"\tRemainder= "+(a%b));
    }
}