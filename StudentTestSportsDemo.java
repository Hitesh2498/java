import java.util.Scanner;
class StudentTestSportsDemo{
    public static void main (String[] args) {
        System.out.println("<-Satej Kalebere->\n");
        Result s1=new Result();
        s1.setRollNo();
        s1.setMarks();
        s1.set();
        s1.display();
    }
}
class Student{
    int rollNo;
    Scanner sc=new Scanner(System.in);
    void getRollNo(){
        System.out.println("Roll No: "+rollNo);
    }
    void setRollNo(){
        System.out.print("ENter Roll No.: ");
        rollNo=sc.nextInt();
    }
}
class Test extends Student{
    int sub1,sub2;
    void getMarks(){
        System.out.println("Subject 1 Marks: "+sub1);
        System.out.println("Subject 2 Marks: "+sub2);
    }
    void setMarks(){
        System.out.print("Enter Subject 1 Marks: ");
        sub1=sc.nextInt();
        System.out.print("Enter Subject 2 Marks: ");
        sub2=sc.nextInt();
    }
}
interface Sports{
    void set();
}
class Result extends Test implements Sports{
    int smarks;
    public void set(){
        System.out.print("Enter Sports Marks: ");
        smarks=sc.nextInt();
    }
    void display(){
        getRollNo();
        getMarks();
        System.out.println("Sports Marks: "+smarks);
    }
}
