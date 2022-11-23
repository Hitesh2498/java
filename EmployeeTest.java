import java.util.Scanner;
class EmployeeTest{
    public static void main (String[] args)
    {
        System.out.println("<-Satej Kalebere->\n");
        System.out.println("For Employee 1-");
        Employee ep1=new Employee();
        ep1.setFName();
        ep1.setLName();
        ep1.setSalary();
        ep1.getFName();
        ep1.getLName();
        System.out.println("Yearly Salary: "+(ep1.getSalary()*12));
        ep1.sal+=(ep1.sal*0.1);
        System.out.println("After Raise-");
        System.out.println("Yearly Salary: "+(ep1.getSalary()*12));
        System.out.println("\nFor Employee 2-");
        Employee ep2=new Employee();
        ep2.setFName();
        ep2.setLName();
        ep2.setSalary();
        ep2.getFName();
        ep2.getLName();
        System.out.println("Monthly Salary: "+ep2.getSalary());
        System.out.println("Yearly Salary: "+(ep2.getSalary()*12));
        ep2.sal+=(ep2.sal/10);
        System.out.println("After Raise-");
        System.out.println("Monthly Salary: "+ep2.getSalary());
        System.out.println("Yearly Salary: "+(ep2.getSalary()*12));
    }
}
class Employee{
    String fname,lname;
    public double sal;
    Scanner in=new Scanner(System.in);
    Employee()
    {
        fname=null;
        lname=null;
        sal=0.0;
    }
    void setFName()
    {
        System.out.println("Enter First Name: ");
        fname=in.next();
    }
    void setLName(){
        System.out.println("Enter Last Name: ");
        lname=in.next();
    }
    void setSalary(){
        System.out.println("Enter Monthly Salary: ");
        sal=in.nextDouble();
        if(sal<0)
            sal=0;
    }
    void getFName(){
        System.out.println("First Name: "+fname);
    }
    void getLName(){
        System.out.println("Last Name: "+lname);
    }
    double getSalary(){
        return sal;
    }       }