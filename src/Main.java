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

        JLabel lbl=new JLabel("Hello, World!");
        lbl.setFont(new Font("Arial",Font.BOLD,40));
        fr.setLayout(new BorderLayout());
        fr.add(lbl,BorderLayout.CENTER);
    }
}