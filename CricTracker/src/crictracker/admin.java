/*
 * Created by JFormDesigner on Fri Apr 17 21:37:08 IST 2020
 */

package crictracker;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class admin extends JFrame {
    public admin() {
        initComponents();
        setSize(400,400);
                        button1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					try{
                                            
                                            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","project1","project");
                                            String sql="select * from admin_ where name='"+textField1.getText()+"' and pwd='"+passwordField1.getText()+"'";
                                            PreparedStatement ps=conn.prepareStatement(sql);
                                            ResultSet rs=ps.executeQuery();
                                            if(rs.next()){
                                                dialog2.setVisible(true);
                                            }
                                            else
                                            {
                                                 label1.setText("Admin name or Password is incorrect!!!");
                                                 dialog1.setVisible(true);
                                            }
                                        }catch(Exception e){System.out.println(e);}
                                        
                                        
				}
			});
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button2ActionPerformed(ActionEvent e) {
        textField1.setText(null);
        passwordField1.setText(null);
        dialog1.dispose();
        // TODO add your code here
    }

    private void button3ActionPerformed(ActionEvent e) {
        // TODO add your code here
        new adminfunction().setVisible(true);
        dialog2.dispose();
        dispose();
    }

    private void button4ActionPerformed(ActionEvent e) {
        dispose();// TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Ashwin Muthu Kumar S
        button1 = new JButton();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        textField1 = new JTextField();
        label6 = new JLabel();
        passwordField1 = new JPasswordField();
        label1 = new JLabel();
        button4 = new JButton();
        label2 = new JLabel();
        dialog1 = new JDialog();
        label8 = new JLabel();
        button2 = new JButton();
        dialog2 = new JDialog();
        label9 = new JLabel();
        button3 = new JButton();
        label7 = new JLabel();

        //======== this ========
        setTitle("Admin Login");
        setResizable(false);
        setAlwaysOnTop(true);
        setMinimumSize(new Dimension(400, 400));
        setIconImage(new ImageIcon("C:\\Users\\DELL\\Pictures\\admin.png").getImage());
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- button1 ----
        button1.setText("LOGIN");
        button1.setName("b1");
        button1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(button1);
        button1.setBounds(208, 245, 76, 35);

        //---- label3 ----
        label3.setText("LOGIN PAGE");
        label3.setFont(new Font("Tahoma", Font.BOLD, 24));
        label3.setName("l1");
        contentPane.add(label3);
        label3.setBounds(new Rectangle(new Point(71, 24), label3.getPreferredSize()));

        //---- label4 ----
        label4.setText("Admin Name");
        label4.setName("l2");
        label4.setLabelFor(textField1);
        label4.setFont(label4.getFont().deriveFont(Font.BOLD, label4.getFont().getSize() + 1f));
        contentPane.add(label4);
        label4.setBounds(70, 95, 105, label4.getPreferredSize().height);

        //---- label5 ----
        label5.setName("err");
        label5.setForeground(Color.red);
        contentPane.add(label5);
        label5.setBounds(71, 65, label5.getPreferredSize().width, 0);

        //---- textField1 ----
        textField1.setName("t1");
        contentPane.add(textField1);
        textField1.setBounds(70, 120, 213, 28);

        //---- label6 ----
        label6.setText("Password");
        label6.setName("l3");
        label6.setLabelFor(passwordField1);
        label6.setFont(label6.getFont().deriveFont(Font.BOLD, label6.getFont().getSize() + 1f));
        contentPane.add(label6);
        label6.setBounds(71, 161, 84, label6.getPreferredSize().height);

        //---- passwordField1 ----
        passwordField1.setName("t2");
        contentPane.add(passwordField1);
        passwordField1.setBounds(71, 186, 213, 28);

        //---- label1 ----
        label1.setForeground(Color.red);
        contentPane.add(label1);
        label1.setBounds(70, 60, 325, 25);

        //---- button4 ----
        button4.setText("Cancel");
        button4.addActionListener(e -> button4ActionPerformed(e));
        contentPane.add(button4);
        button4.setBounds(145, 295, 90, 30);

        //---- label2 ----
        label2.setIcon(new ImageIcon("C:\\Users\\DELL\\Pictures\\cric.png"));
        contentPane.add(label2);
        label2.setBounds(new Rectangle(new Point(5, 10), label2.getPreferredSize()));

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

        //======== dialog1 ========
        {
            dialog1.setTitle("Warning!");
            dialog1.setResizable(false);
            dialog1.setType(Window.Type.POPUP);
            dialog1.setFocusTraversalPolicyProvider(true);
            dialog1.setAlwaysOnTop(true);
            Container dialog1ContentPane = dialog1.getContentPane();

            //---- label8 ----
            label8.setText("Failed to login!!!");
            label8.setName("l2");
            label8.setLabelFor(textField1);
            label8.setFont(label8.getFont().deriveFont(Font.PLAIN, label8.getFont().getSize() + 1f));

            //---- button2 ----
            button2.setText("OK");
            button2.addActionListener(e -> button2ActionPerformed(e));

            GroupLayout dialog1ContentPaneLayout = new GroupLayout(dialog1ContentPane);
            dialog1ContentPane.setLayout(dialog1ContentPaneLayout);
            dialog1ContentPaneLayout.setHorizontalGroup(
                dialog1ContentPaneLayout.createParallelGroup()
                    .addGroup(dialog1ContentPaneLayout.createSequentialGroup()
                        .addGroup(dialog1ContentPaneLayout.createParallelGroup()
                            .addGroup(dialog1ContentPaneLayout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(label8, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
                            .addGroup(dialog1ContentPaneLayout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(button2)))
                        .addContainerGap(77, Short.MAX_VALUE))
            );
            dialog1ContentPaneLayout.setVerticalGroup(
                dialog1ContentPaneLayout.createParallelGroup()
                    .addGroup(dialog1ContentPaneLayout.createSequentialGroup()
                        .addContainerGap(23, Short.MAX_VALUE)
                        .addComponent(label8)
                        .addGap(11, 11, 11)
                        .addComponent(button2)
                        .addContainerGap())
            );
            dialog1.pack();
            dialog1.setLocationRelativeTo(dialog1.getOwner());
        }

        //======== dialog2 ========
        {
            dialog2.setTitle("Login Successful");
            dialog2.setResizable(false);
            dialog2.setType(Window.Type.POPUP);
            dialog2.setFocusTraversalPolicyProvider(true);
            dialog2.setAlwaysOnTop(true);
            Container dialog2ContentPane = dialog2.getContentPane();

            //---- label9 ----
            label9.setText("Successfully logged in...");
            label9.setName("l2");
            label9.setLabelFor(textField1);
            label9.setFont(label9.getFont().deriveFont(Font.PLAIN, label9.getFont().getSize() + 1f));

            //---- button3 ----
            button3.setText("OK");
            button3.addActionListener(e -> button3ActionPerformed(e));

            GroupLayout dialog2ContentPaneLayout = new GroupLayout(dialog2ContentPane);
            dialog2ContentPane.setLayout(dialog2ContentPaneLayout);
            dialog2ContentPaneLayout.setHorizontalGroup(
                dialog2ContentPaneLayout.createParallelGroup()
                    .addGroup(dialog2ContentPaneLayout.createSequentialGroup()
                        .addGroup(dialog2ContentPaneLayout.createParallelGroup()
                            .addGroup(dialog2ContentPaneLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(label9, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE))
                            .addGroup(dialog2ContentPaneLayout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(button3))
                            .addGroup(dialog2ContentPaneLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(label7, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(20, Short.MAX_VALUE))
            );
            dialog2ContentPaneLayout.setVerticalGroup(
                dialog2ContentPaneLayout.createParallelGroup()
                    .addGroup(dialog2ContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label9, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button3)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label7, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
            );
            dialog2.pack();
            dialog2.setLocationRelativeTo(dialog2.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    
    public static void main(String[] args) {
       admin login=new admin();
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Ashwin Muthu Kumar S
    private JButton button1;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JTextField textField1;
    private JLabel label6;
    private JPasswordField passwordField1;
    private JLabel label1;
    private JButton button4;
    private JLabel label2;
    private JDialog dialog1;
    private JLabel label8;
    private JButton button2;
    private JDialog dialog2;
    private JLabel label9;
    private JButton button3;
    private JLabel label7;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
