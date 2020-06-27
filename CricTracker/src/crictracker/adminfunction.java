/*
 * Created by JFormDesigner on Fri Apr 17 23:43:18 IST 2020
 */

package crictracker;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

public class adminfunction extends JFrame {
    public adminfunction() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        new matchinfo().setVisible(true);
        dispose();
    }

    private void button2ActionPerformed(ActionEvent e) {
        new playerinfo().setVisible(true);
        dispose();// TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Ashwin Muthu Kumar S
        button1 = new JButton();
        label2 = new JLabel();
        button2 = new JButton();
        label3 = new JLabel();

        //======== this ========
        setTitle("Admin");
        setResizable(false);
        setIconImage(new ImageIcon("C:\\Users\\DELL\\Pictures\\admin.png").getImage());
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- button1 ----
        button1.setText("Match Info");
        button1.setBorder(new BevelBorder(BevelBorder.RAISED, Color.cyan, Color.red, Color.pink, Color.yellow));
        button1.setFont(button1.getFont().deriveFont(button1.getFont().getStyle() | Font.BOLD, button1.getFont().getSize() + 2f));
        button1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(button1);
        button1.setBounds(75, 170, 126, 45);

        //---- label2 ----
        label2.setText(" ADD");
        label2.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
        label2.setBorder(new EtchedBorder(Color.red, Color.gray));
        label2.setForeground(Color.white);
        contentPane.add(label2);
        label2.setBounds(215, 85, 65, 45);

        //---- button2 ----
        button2.setText("Player Info");
        button2.setBorder(new BevelBorder(BevelBorder.RAISED, Color.cyan, Color.red, Color.pink, Color.yellow));
        button2.setFont(button2.getFont().deriveFont(button2.getFont().getStyle() | Font.BOLD, button2.getFont().getSize() + 2f));
        button2.addActionListener(e -> button2ActionPerformed(e));
        contentPane.add(button2);
        button2.setBounds(295, 170, 126, 45);

        //---- label3 ----
        label3.setIcon(new ImageIcon("C:\\Users\\DELL\\Pictures\\cric bg1.png"));
        contentPane.add(label3);
        label3.setBounds(new Rectangle(new Point(0, 0), label3.getPreferredSize()));

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
    private JButton button1;
    private JLabel label2;
    private JButton button2;
    private JLabel label3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
