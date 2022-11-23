import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class checkbox extends JFrame implements ItemListener
{
    JCheckBox c1,c2;
    JTextArea area;
    Container c;
    checkbox()
    {
        c=getContentPane();
        c.setLayout(null);

        c1=new JCheckBox("Bold");
        c1.addItemListener(this);
        c1.setBounds(100,70,100,30);
        c.add(c1);

        c2=new JCheckBox("ITALIC");
        c2.addItemListener(this);
        c2.setBounds(200,70,100,30);
        c.add(c2);

        area=new JTextArea(5,10);
        area.setBounds(100,120,200,50);
        c.add(area);

    }
    public void itemStateChanged(ItemEvent ie)
    {
        if(c1.isSelected())
        {
            Font f=new Font("arial",Font.BOLD,18);
            area.setFont(f);
        }
        else if(c2.isSelected())
        {
            Font f=new Font("arial",Font.ITALIC,18);
            area.setFont(f);
        }
        else
        {
            Font f=new Font("arial",0,18);
            area.setFont(f);
        }
    }
    public static void main(String args[])
    {
        checkbox c=new checkbox();

        c.setTitle("CheckBox");
        c.setSize(500,500);
        c.setVisible(true);
    }
}