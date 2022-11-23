import java.io.*;
import java.util.*;
class StudInfoFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            File f = new File("StudentInfo.txt");
            FileOutputStream fout = new FileOutputStream(f);
            DataOutputStream dout = new DataOutputStream(fout);
//name, age, weight, height, city, phone
            System.out.print("Enter Name: ");
            dout.writeUTF(sc.nextLine());
            System.out.print("Enter City: ");
            dout.writeUTF(sc.nextLine());
            System.out.print("Enter Age: ");
            dout.writeInt(sc.nextInt());
            System.out.print("Enter Weight: ");
            dout.writeDouble(sc.nextDouble());
            System.out.print("Enter Height: ");
            dout.writeDouble(sc.nextDouble());
            System.out.print("Enter Phone: ");
            dout.writeLong(sc.nextLong());
            dout.close();
            fout.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            File f = new File("StudentInfo.txt");
            FileInputStream fin = new FileInputStream(f);
            DataInputStream din = new DataInputStream(fin);
            System.out.println("Name: " + din.readUTF());
            System.out.println("City: " + din.readUTF());
            System.out.println("Age: " + din.readInt());
            System.out.println("Weight: " + din.readDouble());
            System.out.println("Height: " + din.readDouble());
            System.out.println("Phone: " + din.readLong());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
