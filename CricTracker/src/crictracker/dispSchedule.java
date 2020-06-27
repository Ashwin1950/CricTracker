/*
 * Created by JFormDesigner on Mon Apr 20 05:03:30 IST 2020
 */

package crictracker;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

/**
 * @author Ashwin Muthu Kumar S
 */
public class dispSchedule extends JFrame {
    public dispSchedule() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        dispose();
        new user().setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Ashwin Muthu Kumar S
        label1 = new JLabel();
        separator1 = new JSeparator();
        separator2 = new JSeparator();
        separator3 = new JSeparator();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        separator4 = new JSeparator();
        separator5 = new JSeparator();
        separator6 = new JSeparator();
        separator7 = new JSeparator();
        list1 = new JList<>();
        list2 = new JList<>();
        list3 = new JList<>();
        list4 = new JList<>();
        button1 = new JButton();

        //======== this ========
        setTitle("Schedule");
        setIconImage(new ImageIcon("C:\\Users\\DELL\\Pictures\\cric schedule.jpg").getImage());
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("IPL 2020 SCHEDULE");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getStyle() | Font.BOLD, label1.getFont().getSize() + 3f));
        contentPane.add(label1);
        label1.setBounds(350, 5, 207, 25);

        //---- separator1 ----
        separator1.setForeground(Color.black);
        separator1.setBackground(Color.black);
        separator1.setBorder(new BevelBorder(BevelBorder.LOWERED));
        contentPane.add(separator1);
        separator1.setBounds(248, 47, 9, 313);

        //---- separator2 ----
        separator2.setBorder(new BevelBorder(BevelBorder.LOWERED));
        separator2.setForeground(Color.black);
        separator2.setBackground(Color.black);
        contentPane.add(separator2);
        separator2.setBounds(445, 50, 9, 305);

        //---- separator3 ----
        separator3.setForeground(Color.black);
        separator3.setBackground(Color.black);
        separator3.setBorder(new BevelBorder(BevelBorder.LOWERED));
        contentPane.add(separator3);
        separator3.setBounds(714, 47, 9, 308);

        //---- label2 ----
        label2.setText("Home Team");
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getStyle() | Font.BOLD));
        contentPane.add(label2);
        label2.setBounds(19, 47, 104, 22);

        //---- label3 ----
        label3.setText("Away Team");
        label3.setFont(label3.getFont().deriveFont(label3.getFont().getStyle() | Font.BOLD));
        contentPane.add(label3);
        label3.setBounds(275, 47, 130, 22);

        //---- label4 ----
        label4.setText("Place");
        label4.setFont(label4.getFont().deriveFont(label4.getFont().getStyle() | Font.BOLD));
        contentPane.add(label4);
        label4.setBounds(563, 47, 93, 22);

        //---- label5 ----
        label5.setText("Date");
        label5.setFont(label5.getFont().deriveFont(label5.getFont().getStyle() | Font.BOLD));
        contentPane.add(label5);
        label5.setBounds(741, 47, 52, 22);

        //---- separator4 ----
        separator4.setForeground(Color.black);
        separator4.setBackground(Color.black);
        separator4.setBorder(new BevelBorder(BevelBorder.LOWERED));
        contentPane.add(separator4);
        separator4.setBounds(0, 75, 250, 10);

        //---- separator5 ----
        separator5.setForeground(Color.black);
        separator5.setBackground(Color.black);
        separator5.setBorder(new BevelBorder(BevelBorder.LOWERED));
        contentPane.add(separator5);
        separator5.setBounds(255, 75, 190, 10);

        //---- separator6 ----
        separator6.setForeground(Color.black);
        separator6.setBackground(Color.black);
        separator6.setBorder(new BevelBorder(BevelBorder.LOWERED));
        contentPane.add(separator6);
        separator6.setBounds(455, 75, 260, 10);

        //---- separator7 ----
        separator7.setForeground(Color.black);
        separator7.setBackground(Color.black);
        separator7.setBorder(new BevelBorder(BevelBorder.LOWERED));
        contentPane.add(separator7);
        separator7.setBounds(720, 75, 85, 10);

        //---- list1 ----
        list1.setModel(new AbstractListModel<String>() {
            String[] values = {
                "Mumbai Indians",
                "Mumbai Indians",
                "Chennai Super Kings",
                "Kolkata Knight Riders",
                "Royal Challengers Bangalore",
                "Royal Challengers Bangalore"
            };
            @Override
            public int getSize() { return values.length; }
            @Override
            public String getElementAt(int i) { return values[i]; }
        });
        contentPane.add(list1);
        list1.setBounds(50, 115, 200, 240);

        //---- list2 ----
        list2.setModel(new AbstractListModel<String>() {
            String[] values = {
                "Chennai Super Kings",
                "Kolkata Knight Riders",
                "Kolkata Knight Riders",
                "Royal Challengers Bangalore",
                "Chennai Super Kings",
                "Mumbai Indians"
            };
            @Override
            public int getSize() { return values.length; }
            @Override
            public String getElementAt(int i) { return values[i]; }
        });
        contentPane.add(list2);
        list2.setBounds(270, 115, 170, 240);

        //---- list3 ----
        list3.setModel(new AbstractListModel<String>() {
            String[] values = {
                "Wankhede Stadium, Mumbai",
                "Wankhede Stadium, Mumbai",
                "M A Chidambaram Stadium, Chennai",
                "Eden Gardens, Kolkata",
                "Chinnaswamy Stadium, Bengaluru",
                "Chinnaswamy Stadium, Bengaluru"
            };
            @Override
            public int getSize() { return values.length; }
            @Override
            public String getElementAt(int i) { return values[i]; }
        });
        contentPane.add(list3);
        list3.setBounds(475, 115, 235, 240);

        //---- list4 ----
        list4.setModel(new AbstractListModel<String>() {
            String[] values = {
                "29/03/2020",
                "28/04/2020",
                "07/05/2020",
                "10/05/2020",
                "14/05/2020",
                "17/05/2020"
            };
            @Override
            public int getSize() { return values.length; }
            @Override
            public String getElementAt(int i) { return values[i]; }
        });
        contentPane.add(list4);
        list4.setBounds(730, 115, 85, 240);

        //---- button1 ----
        button1.setText("Back");
        button1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(button1);
        button1.setBounds(390, 390, 85, 40);

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
    private JLabel label1;
    private JSeparator separator1;
    private JSeparator separator2;
    private JSeparator separator3;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JSeparator separator4;
    private JSeparator separator5;
    private JSeparator separator6;
    private JSeparator separator7;
    private JList<String> list1;
    private JList<String> list2;
    private JList<String> list3;
    private JList<String> list4;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
