import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class BorderLayoutDemo implements ActionListener{
    JFrame f;
    JPanel panel1,panel2;
    JLabel l1,l2;
    JTextField jt1,jt2;
    JButton b1,b2,b3;
    BorderLayoutDemo(){
        f = new JFrame();
        panel1 = new JPanel();
        panel1.setBounds(20,20,100,100);
        f.add(panel1,BorderLayout.NORTH);
        panel2 = new JPanel();
        panel2.setBounds(20,20,100,100);
        f.add(panel2,BorderLayout.SOUTH);
        l1=new JLabel();
        l1.setText("Enter the Number : ");
        jt1 = new JTextField();
        jt1.setPreferredSize(new Dimension(200,30));
        l2=new JLabel();
        l2.setText("Result : ");
        jt2 = new JTextField();
        jt2.setPreferredSize(new Dimension(200,30));
        b1 = new JButton("Hex");
        b1.addActionListener(this);
        b1.setPreferredSize(new Dimension(115,10));
        b2 = new JButton("Binary");
        b2.addActionListener(this);
        b2.setPreferredSize(new Dimension(115,10));
        b3 = new JButton("Octal");
        b3.addActionListener(this);
        b3.setPreferredSize(new Dimension(115,10));
        panel1.add(l1);
        panel1.add(jt1);
        panel2.add(l2);
        panel2.add(jt2);
        f.add(b1, BorderLayout.EAST);
        f.add(b2, BorderLayout.WEST);
        f.add(b3, BorderLayout.CENTER);
        f.setSize(400,200);
        f.setVisible(true);      }
    public void actionPerformed(ActionEvent e){
        int n=Integer.parseInt(jt1.getText());
        if(e.getSource()==b3){
            int octalNumber = 0, i = 1;
            while (n != 0){
                octalNumber += (n % 8) * i;
                n /= 8;
                i *= 10;     }
            jt2.setText(String.valueOf(octalNumber));     }
        if(e.getSource()==b2){
            int binary = 0, remainder, product = 1;
            while (n != 0){
                remainder = n % 2;
                binary = binary + (remainder * product);
                n = n / 2;
                product *= 10;     }
            jt2.setText(String.valueOf(binary));     }
        if(e.getSource()==b1){
            int rem;
            String str="";
            char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
            while(n>0){
                rem=n%16;
                str=hex[rem]+str;
                n=n/16;   }
            jt2.setText(String.valueOf(str));      }     }
    public static void main(String[] args){
        new BorderLayoutDemo();
    }
}
