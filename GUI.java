import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.*;



public class GUI {
    public static void PAGE() {


        JFrame frame = new JFrame("Tabs with Buttons");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JTabbedPane tabbedPane = new JTabbedPane();
        
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());
        JPanel buttons1 = new JPanel();
        buttons1.setLayout(new GridLayout(1, 5));
        buttons1.add(new JButton("Add Wood"));
        buttons1.add(new JButton("Remove Wood"));
        buttons1.add(new JButton("Sort By Weight"));
        buttons1.add(new JButton("Sort By Space"));
        buttons1.add(new JButton("Sort by Value"));
        panel1.add(buttons1, BorderLayout.SOUTH);
        tabbedPane.addTab("Woods", panel1);
        
        JPanel panel2 = new JPanel();
        panel2.setLayout(new BorderLayout());
        JPanel buttons2 = new JPanel();
        buttons2.setLayout(new GridLayout(1, 5));
        buttons2.add(new JButton("Add Metals"));
        buttons2.add(new JButton("Remove Metals"));
        buttons2.add(new JButton("Sort By Weight"));
        buttons2.add(new JButton("Sort By Space"));
        buttons2.add(new JButton("Sort by Value"));
        panel2.add(buttons2, BorderLayout.SOUTH);
        tabbedPane.addTab("Metals", panel2);
        
        frame.add(tabbedPane);
        frame.setVisible(true);
  
    }



    

}

