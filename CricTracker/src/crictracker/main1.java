package crictracker;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

public class main1 extends JFrame {
    
    public main1() {
        initComponents();
    }

    private void menuItem1ActionPerformed(ActionEvent e) {
        new admin().setVisible(true);
    }

    private void menuItem2ActionPerformed(ActionEvent e) {
        new user().setVisible(true);
    }

    private void button1ActionPerformed(ActionEvent e) {
        new admin().setVisible(true);// TODO add your code here
    }

    private void button2ActionPerformed(ActionEvent e) {
        new user().setVisible(true);// TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Ashwin Muthu Kumar S
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        menuItem1 = new JMenuItem();
        menuItem2 = new JMenuItem();
        label1 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        label6 = new JLabel();

        //======== this ========
        setTitle("CricTracker");
        setIconImage(new ImageIcon("C:\\Users\\DELL\\Pictures\\rainac.jpg").getImage());
        setFont(new Font(Font.DIALOG, Font.PLAIN, 12));
        setBackground(new Color(255, 153, 153));
        setMinimumSize(new Dimension(16, 39));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== menuBar1 ========
        {

            //======== menu1 ========
            {
                menu1.setText("Enter As");
                menu1.setBackground(new Color(255, 51, 51));

                //---- menuItem1 ----
                menuItem1.setText("Admin");
                menuItem1.setBackground(new Color(255, 153, 153));
                menuItem1.addActionListener(e -> menuItem1ActionPerformed(e));
                menu1.add(menuItem1);

                //---- menuItem2 ----
                menuItem2.setText("User");
                menuItem2.setBackground(new Color(255, 153, 153));
                menuItem2.addActionListener(e -> menuItem2ActionPerformed(e));
                menu1.add(menuItem2);
            }
            menuBar1.add(menu1);
        }
        setJMenuBar(menuBar1);

        //---- label1 ----
        label1.setIcon(new ImageIcon("C:\\Users\\DELL\\Pictures\\crictitle.jpg"));
        contentPane.add(label1);
        label1.setBounds(65, 0, 500, 135);

        //---- label4 ----
        label4.setText("Cricket for all");
        label4.setFont(new Font("Segoe Marker", Font.PLAIN, 35));
        contentPane.add(label4);
        label4.setBounds(25, 160, 305, 90);

        //---- label5 ----
        label5.setText("All for Cricket");
        label5.setFont(new Font("Segoe Marker", Font.PLAIN, 35));
        contentPane.add(label5);
        label5.setBounds(420, 445, 195, 90);

        //---- button1 ----
        button1.setText("ADMIN");
        button1.setBackground(new Color(153, 255, 204));
        button1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(button1);
        button1.setBounds(95, 145, 155, 40);

        //---- button2 ----
        button2.setText("USER");
        button2.setBackground(new Color(153, 255, 204));
        button2.addActionListener(e -> button2ActionPerformed(e));
        contentPane.add(button2);
        button2.setBounds(375, 145, 155, 40);

        //---- label6 ----
        label6.setIcon(new ImageIcon("C:\\Users\\DELL\\Pictures\\cricket.jpg"));
        contentPane.add(label6);
        label6.setBounds(10, 135, 600, 400);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Ashwin Muthu Kumar S
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenuItem menuItem1;
    private JMenuItem menuItem2;
    private JLabel label1;
    private JLabel label4;
    private JLabel label5;
    private JButton button1;
    private JButton button2;
    private JLabel label6;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
