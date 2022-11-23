import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Gui_calculator implements ActionListener
{
    JFrame f;
    JLabel l1,l2,lres;
    JTextField t1,t2,res;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bAdd,bSub,bMul,bDiv,bMod,bClr;

    Gui_calculator()
    {
        f= new JFrame("Calculator");
        t1=new JTextField(20);
        t2=new JTextField(20);
        l1=new JLabel("First Number:");
        l2=new JLabel("Second Number:");
        lres=new JLabel("Result:");
        res=new JTextField(20);
        bAdd=new JButton("+");
        bSub=new JButton("-");
        bMul=new JButton("*");
        bDiv=new JButton("/");
        bMod=new JButton("%");
        bClr=new JButton("CLEAR");
        l1.setBounds(20,20,100,40);
        t1.setBounds(140,20,100,40);
        l2.setBounds(20,80,100,40);
        t2.setBounds(140,80,100,40);
        lres.setBounds(20,140,100,40);
        res.setBounds(140,140,100,40);
        bAdd.setBounds(20,200,100,40);
        bSub.setBounds(140,200,100,40);
        bMul.setBounds(20,260,100,40);
        bDiv.setBounds(140,260,100,40);
        bMod.setBounds(20,320,100,40);
        bClr.setBounds(140,320,100,40);
        f.setLayout(null);
        f.setSize(280,420);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.add(t1);
        f.add(t2);
        f.add(res);
        f.add(l1);
        f.add(l2);
        f.add(lres);
        f.add(bAdd);
        f.add(bSub);
        f.add(bMul);
        f.add(bDiv);
        f.add(bMod);
        f.add(bClr);
        bAdd.addActionListener(this);
        bSub.addActionListener(this);
        bMul.addActionListener(this);
        bMod.addActionListener(this);
        bDiv.addActionListener(this);
        bClr.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        int a,b;
        long result=0;
        a=Integer.parseInt(String.valueOf(t1.getText()));
        b=Integer.parseInt(String.valueOf(t2.getText()));
        if(e.getSource()==bAdd){
            result=a+b;
            res.setText(String.valueOf(result));
        }else if(e.getSource()==bSub){
            result=a-b;
            res.setText(String.valueOf(result));
        }else if(e.getSource()==bMul){
            result=a*b;
        }else if(e.getSource()==bDiv){
            result=a/b;
        }else if(e.getSource()==bMod){
            result=a%b;
        }else if(e.getSource()==bClr){
            result=0;
            t1.setText("0");
            t2.setText("0");
        }
        res.setText(String.valueOf(result));
    }
    public static void main(String[] args)
    {
        Gui_calculator g=new Gui_calculator();
    }
}
