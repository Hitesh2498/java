import java.util.Scanner;
class A
{
    static
    {
        System.out.println("<-Satej Kalebere->\n");
        System.out.println("This Block Will Execute Even Before Main Function!!");
        getCount();
    }
    static int count=0;
    A()
    {
        count++;
    }
    static void getCount()
    {
        System.out.println("Count: "+count);
    }
}
class Static
{
    public static void main (String[] args)
    {
        A ob1=new A();
        A.getCount();
        A ob2=new A();
        ob1.getCount();
        A ob3=new A();
        A.getCount();
    }
}