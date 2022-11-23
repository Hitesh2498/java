import java.util.Scanner;
class StackTest{
    public static void main (String[] args) {
        System.out.println("<-Satej Kalebere->\n");
        int choice;
        Scanner sc=new Scanner(System.in);
        IntegerStack stack=new IntegerStack();
        System.out.println("1.Push\t2.Pop\t3.Display\t4.Exit");
        do{
            System.out.print("Enter Choice: ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    stack.push();
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                default:
                    choice=0;
                    break;   }
        }while(choice!=0);      }     }
interface Stack{
    int size=7;
    void push();
    void pop();
    void display();
    boolean overflow();
    boolean underflow();        }
class IntegerStack implements Stack{
    Scanner sc=new Scanner(System.in);
    int index=-1;
    int[] arr=new int[size];
    public void push(){
        if(overflow())
            System.out.println("Stack is Full!!");
        else{
            System.out.print("Enter Element to Push: ");
            index++;
            arr[index]=sc.nextInt();     }      }
    public void pop(){
        if(underflow())
            System.out.println("Stack is Empty!!");
        else{
            System.out.println("Popped Element: "+arr[index]);
            index--;      }         }
    public boolean overflow(){
        if(index==size-1)
            return true;
        return false;      }
    public boolean underflow(){
        if(index==-1)
            return true;
        return false;      }
    public void display(){
        if(underflow())
            System.out.println("Stack is Empty!!");
        else{
            System.out.println("Stack is->");
            for(int i=index;i>=0;i--){
                System.out.println(arr[i]);
            }
        }
    }
}
