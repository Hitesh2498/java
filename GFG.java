import java.io.*;
class GFG extends Thread {
    public void run()
    {
        System.out.print("helloo.");
    }
    public static void main(String[] args)
    {
        GFG g = new GFG(); // creating thread
        g.start(); // starting thread
    }
}
