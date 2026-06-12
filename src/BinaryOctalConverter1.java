import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BinaryOctalConverter1 extends JFrame implements ActionListener {
    public static int width = 600;
    public static int height = 300;
    String str;
    
    public BinaryOctalConverter1(){
        super();
        setSize(width,height);
        setTitle("Binary/Octal converter");

        Container content = getContentPane();
        content.setLayout(new BorderLayout());
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3,1,20,50));

        JButton button1 = new JButton("Convert to binary");
        JButton button2 = new JButton("Convert to Octal");
        JButton button3 = new JButton("Clear");

        JTextField theText;
        theText = new JTextField(44);

        button1.addActionListener(this);
        buttonPanel.add(button1);
        button2.addActionListener(this);
        buttonPanel.add(button2);
        button3.addActionListener(this);
        buttonPanel.add(button3);

        topPanel.add(theText,BorderLayout.WEST);
        topPanel.add(buttonPanel,BorderLayout.CENTER);
        content.add(topPanel,BorderLayout.NORTH);

    }

    @Override
    public void actionPerformed(ActionEvent e){
    }
}