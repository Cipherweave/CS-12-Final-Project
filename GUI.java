import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;














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
        
        // Add table for woods
        String[] columns = {"List", "Wood number code", "Wood Type", "Wood Weight (Kg)", "Wood Space(M^2)", "Wood Value($/Kg)"};
        Object[][] data = {};
        DefaultTableModel model = new DefaultTableModel(data, columns);
        JTable table = new JTable(model);
        panel1.add(new JScrollPane(table), BorderLayout.CENTER);
        
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
        
        // Add table for metals
        String[] metalColumns = {"List", "Metal number code", "Metal Type", "Metal Weight (Kg)", " Metal Space(M^2)", "Metal Value($/Kg)"};
        Object[][] metalData = {};
        DefaultTableModel metalModel = new DefaultTableModel(metalData, metalColumns);
        JTable metalTable = new JTable(metalModel);
        panel2.add(new JScrollPane(metalTable), BorderLayout.CENTER);
        
        tabbedPane.addTab("Metals", panel2);
        
        frame.add(tabbedPane);
        frame.setVisible(true);


  }

 
}