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












public class GUI {
    public static void PAGE() {
        JFrame frame = new JFrame("Tabs with Buttons");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());

        // Create the table for the Woods tab
        String[] columnNames = {"List", "Wood Number Code", "Wood Type", "Wood Weight (Kg)", "Wood Space (M^2)", "Wood Value ($/Kg)"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        panel1.add(scrollPane, BorderLayout.CENTER);

        JPanel buttons1 = new JPanel();
        buttons1.setLayout(new GridLayout(1, 5));
        JButton addWoodButton = new JButton("Add Wood");
        addWoodButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog addWoodDialog = new JDialog(frame, "Add Wood", true);
                addWoodDialog.setLayout(new GridLayout(5, 2));
                addWoodDialog.add(new JLabel("Wood Type:"));
                JTextField woodTypeField = new JTextField();
                addWoodDialog.add(woodTypeField);
                addWoodDialog.add(new JLabel("Wood Weight (Kg):"));
                JTextField woodWeightField = new JTextField();
                addWoodDialog.add(woodWeightField);
                addWoodDialog.add(new JLabel("Wood Space (M^2):"));
                JTextField woodSpaceField = new JTextField();
                addWoodDialog.add(woodSpaceField);
                addWoodDialog.add(new JLabel("Wood Value ($/Kg):"));
                JTextField woodValueField = new JTextField();
                addWoodDialog.add(woodValueField);
                JButton addWoodConfirmButton = new JButton("Add");
                addWoodConfirmButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String woodType = woodTypeField.getText();
                        double woodWeight = Double.parseDouble(woodWeightField.getText());
                        double woodSpace = Double.parseDouble(woodSpaceField.getText());
                        double woodValue = Double.parseDouble(woodValueField.getText());
                        //MethodFiles.addWood(woodType, woodWeight, woodSpace, woodValue);
                        model.addRow(new Object[] {model.getRowCount() + 1, "Wood " + (model.getRowCount() + 1), woodType, woodWeight, woodSpace, woodValue});
                        addWoodDialog.dispose();
                    }
                });
                addWoodDialog.add(addWoodConfirmButton);
                addWoodDialog.pack();
                addWoodDialog.setVisible(true);
            }
        });
        buttons1.add(addWoodButton);
        panel1.add(buttons1, BorderLayout.SOUTH);
        tabbedPane.addTab("Woods", panel1);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new BorderLayout());

        // Create the table for the Metals tab
        String[] columnNames2 = {"List", "Metal Number Code", "Metal Type", "Metal Weight (Kg)", "Metal Space (M^2)", " Metal Value ($/Kg)"};
        DefaultTableModel model2 = new DefaultTableModel(columnNames2, 0);
        JTable table2 = new JTable(model2);
        JScrollPane scrollPane2 = new JScrollPane(table2);
        panel2.add(scrollPane2, BorderLayout.CENTER);

        JPanel buttons2 = new JPanel();
        buttons2.setLayout(new GridLayout(1, 5));
        JButton addMetalButton = new JButton("Add Metal");
        addMetalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog addMetalDialog = new JDialog(frame, "Add Metal", true);
                addMetalDialog.setLayout(new GridLayout(5, 2));
                addMetalDialog.add(new JLabel("Metal Type:"));
                JTextField metalTypeField = new JTextField();
                addMetalDialog.add(metalTypeField);
                addMetalDialog.add(new JLabel("Metal Weight (Kg):"));
                JTextField metalWeightField = new JTextField();
                addMetalDialog.add(metalWeightField);
                addMetalDialog.add(new JLabel("Metal Space (M^2):"));
                JTextField metalSpaceField = new JTextField();
                addMetalDialog.add(metalSpaceField);
                addMetalDialog.add(new JLabel("Metal Value ($/Kg):"));
                JTextField metalValueField = new JTextField();
                addMetalDialog.add(metalValueField);
                JButton addMetalConfirmButton = new JButton("Add");
                addMetalConfirmButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String metalType = metalTypeField.getText();
                        double metalWeight = Double.parseDouble(metalWeightField.getText());
                        double metalSpace = Double.parseDouble(metalSpaceField.getText());
                        double metalValue = Double.parseDouble(metalValueField.getText());
                        //Method.addMetal(metalType, metalWeight, metalSpace, metalValue);
                        model2.addRow(new Object[] {model2.getRowCount() + 1, "Metal " + (model2.getRowCount() + 1), metalType, metalWeight, metalSpace, metalValue});
                        addMetalDialog.dispose();
                    }
                });
                addMetalDialog.add(addMetalConfirmButton);
                addMetalDialog.pack();
                addMetalDialog.setVisible(true);
            }
        });
        buttons2.add(addMetalButton);
        panel2.add(buttons2, BorderLayout.SOUTH);
        tabbedPane.addTab("Metals", panel2);

        frame.add(tabbedPane, BorderLayout.CENTER);
        frame.setVisible(true);

}


}