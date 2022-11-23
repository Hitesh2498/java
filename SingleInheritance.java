import java.util.Scanner;
class SingleInheritance
{
    public static void main (String[] args)
    {
        System.out.println("<-Satej Kalebere->\n");
        Employee emp1=new Employee();
        emp1.putData();
        emp1.getData();       }      }
class Person     {
    String name;
    long aadharNo;
}
class Employee extends Person
{
    Scanner sc=new Scanner(System.in);
    long salary;
    void putData()
    {
        System.out.print("Enter Name: ");
        name=sc.nextLine();
        System.out.print("Enter AADHAR No.: ");
        aadharNo=sc.nextLong();
        System.out.print("Enter Salary: ");
        salary=sc.nextLong();
    }
    void getData()
    {
        System.out.println("Name-"+name);
        System.out.println("AADHAR No.-"+aadharNo);
        System.out.println("Salary-"+salary);
    }
}
