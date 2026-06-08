import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.lang.invoke.ConstantBootstraps;

public class Demo extends JFrame {
    public static int width = 300;
    public static int height = 200;
    public Demo(){
        super();
        setSize(width,height);

        Container content = getContentPane();
        content.setLayout(new BorderLayout());
        JButton b = new JButton("CLICK");

        JLabel MyLabel1 = new JLabel("Don't click that button!");
        JLabel MyLabel2 = new JLabel("Don't click that button22!");
        JLabel MyLabel3 = new JLabel("Don't click that button333!");
        content.add(MyLabel1,BorderLayout.SOUTH);
        content.add(MyLabel2,BorderLayout.NORTH);
        content.add(b,BorderLayout.CENTER);
    }
}
