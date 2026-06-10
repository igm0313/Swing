import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.invoke.ConstantBootstraps;

public class Demo extends JFrame implements ActionListener {
    public static int width = 700;
    public static int height = 400;
    public Demo(){
        super();
        setSize(width,height);
        setTitle("Memo");

        Container content = getContentPane();
        content.setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.WHITE);
        buttonPanel.setLayout(new GridLayout(3,1,80,80));

        JButton memo1 = new JButton("Save Memo1");
        JButton memo2 = new JButton("Save Memo2");
        JButton memo3 = new JButton("Save Memo3");

        memo1.addActionListener(this);
        buttonPanel.add(memo1);
        memo2.addActionListener(this);
        buttonPanel.add(memo2);
        memo3.addActionListener(this);
        buttonPanel.add(memo3);

        content.add(buttonPanel,BorderLayout.EAST);

        JPanel textPanel = new JPanel();
        textPanel.setBackground(Color.BLUE);
        content.add(textPanel,BorderLayout.CENTER);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        System.out.print("Click!");
    }

}
