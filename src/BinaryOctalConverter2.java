import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BinaryOctalConverter2 extends JFrame implements ActionListener {
    public static int width = 600;
    public static int height = 300;
    String str;
    JTextField theText;
    JTextField result;

    public BinaryOctalConverter2(){
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
        JButton button2 = new JButton("Convert to octal");
        JButton button3 = new JButton("Clear");

        theText = new JTextField(44);

        result = new JTextField();
        result.setBackground(Color.LIGHT_GRAY);

        button1.addActionListener(this);
        buttonPanel.add(button1);
        button2.addActionListener(this);
        buttonPanel.add(button2);
        button3.addActionListener(this);
        buttonPanel.add(button3);

        topPanel.add(theText,BorderLayout.WEST);
        topPanel.add(buttonPanel,BorderLayout.CENTER);
        content.add(topPanel,BorderLayout.NORTH);
        content.add(result,BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().contains("binary")){
            int num;
            num = Integer.parseInt(theText.getText());
            str = Integer.toBinaryString(num);
            str += " Value converted to binary";
            result.setText(str);
        }
        else if(e.getActionCommand().contains("octal")){
            int num;
            num = Integer.parseInt(theText.getText(),2);
            str = Integer.toOctalString(num);
            str += " Value converted to octal";
            result.setText(str);
        }
        else if(e.getActionCommand().contains("Clear")){
            str = "";
            theText.setText(str);
            result.setText(str);
        }
    }
}