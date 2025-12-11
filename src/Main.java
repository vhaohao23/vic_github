import javax.swing.*;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JFrame fr=new JFrame("Hello World");
        fr.setSize(600,600);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLocationRelativeTo(null);
        fr.setLayout(new BorderLayout());
        JLabel lbl=new JLabel("Hello, Danh hamma!");
        JLabel lbl1=new JLabel("Hello, Danh");
        lbl1.setFont(new Font("Times New Roman", Font.PLAIN, 40));

        lbl.setFont(new Font("Arial",Font.BOLD,40));

        fr.add(lbl,BorderLayout.CENTER);
    }
}