/*
 * Created by JFormDesigner on Sat Apr 18 04:20:57 IST 2020
 */

package crictracker;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;
import java.sql.*;

public class matchinfo extends JFrame {
    String id1,id2,team1,team2,toss,win,first,second;
    public matchinfo() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        
        if((textField4.getText()==null) || (textField6.getText()==null) || (textField8.getText()==null) || (textField10.getText()==null)){
            dialog2.setVisible(true);
        }
        else{
        try{   
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","project1","project");
                String sql1="update match_ set tossteam='"+toss+"'where id='"+comboBox1.getItemAt(comboBox1.getSelectedIndex())+"'";
                String sql2="update match_ set first_innings_team='"+first+"'where id='"+comboBox1.getItemAt(comboBox1.getSelectedIndex())+"'";
                String sql3="update match_ set first_innings_score='"+textField4.getText()+"'where id='"+comboBox1.getItemAt(comboBox1.getSelectedIndex())+"'";
                String sql4="update match_ set first_innings_wickets='"+spinner1.getValue().toString()+"'where id='"+comboBox1.getItemAt(comboBox1.getSelectedIndex())+"'";
                String sql5="update match_ set first_innings_overs='"+textField6.getText()+"'where id='"+comboBox1.getItemAt(comboBox1.getSelectedIndex())+"'";
                String sql6="update match_ set second_innings_team='"+second+"'where id='"+comboBox1.getItemAt(comboBox1.getSelectedIndex())+"'";
                String sql7="update match_ set second_innings_score='"+textField8.getText()+"'where id='"+comboBox1.getItemAt(comboBox1.getSelectedIndex())+"'";
                String sql8="update match_ set second_innings_wickets='"+spinner2.getValue().toString()+"'where id='"+comboBox1.getItemAt(comboBox1.getSelectedIndex())+"'";
                String sql9="update match_ set second_innings_overs='"+textField10.getText()+"'where id='"+comboBox1.getItemAt(comboBox1.getSelectedIndex())+"'";
                String sql10="update match_ set winteam_id='"+win+"'where id='"+comboBox1.getItemAt(comboBox1.getSelectedIndex())+"'";
               
                PreparedStatement stmt1=con.prepareStatement(sql1);
                PreparedStatement stmt2=con.prepareStatement(sql2);
                PreparedStatement stmt3=con.prepareStatement(sql3);
                PreparedStatement stmt4=con.prepareStatement(sql4);
                PreparedStatement stmt5=con.prepareStatement(sql5);
                PreparedStatement stmt6=con.prepareStatement(sql6);
                PreparedStatement stmt7=con.prepareStatement(sql7);
                PreparedStatement stmt8=con.prepareStatement(sql8);
                PreparedStatement stmt9=con.prepareStatement(sql9);
                PreparedStatement stmt10=con.prepareStatement(sql10);
                
                stmt1.executeUpdate();
                stmt2.executeUpdate();
                stmt3.executeUpdate();
                stmt4.executeUpdate();
                stmt5.executeUpdate();
                stmt6.executeUpdate();
                stmt7.executeUpdate();
                stmt8.executeUpdate();
                stmt9.executeUpdate();
                stmt10.executeUpdate();
                dialog1.setVisible(true);                       

        }catch(Exception ex){
                System.out.println(ex);}
        
        try{   
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","project1","project");
                String sql1="select id from team where name='"+comboBox2.getItemAt(comboBox2.getSelectedIndex())+"'";
                String sql2="select id from team where name='"+comboBox3.getItemAt(comboBox3.getSelectedIndex())+"'";
                String sql3="select id from team where name='"+comboBox4.getItemAt(comboBox4.getSelectedIndex())+"'";
                String sql4="select id from team where name='"+comboBox5.getItemAt(comboBox5.getSelectedIndex())+"'";
                
                PreparedStatement stmt1=con.prepareStatement(sql1);
                PreparedStatement stmt2=con.prepareStatement(sql2);
                PreparedStatement stmt3=con.prepareStatement(sql3);
                PreparedStatement stmt4=con.prepareStatement(sql4);
                
                ResultSet rs1=stmt1.executeQuery();
                ResultSet rs2=stmt2.executeQuery();
                ResultSet rs3=stmt3.executeQuery();
                ResultSet rs4=stmt4.executeQuery();
                
                if (rs1.next()){
                    toss=rs1.getString("id");
               
                }
                if (rs2.next()){
                    first=rs2.getString("id");
               
                }
                if (rs3.next()){
                    second=rs3.getString("id");
               
                }
                if (rs4.next()){
                    win=rs4.getString("id");
               
                }
        }
        catch(Exception ex){
                System.out.println(ex);}
}
    }

    private void button2ActionPerformed(ActionEvent e) {
       dialog1.dispose();// TODO add your code here
    }

    private void button3ActionPerformed(ActionEvent e) {
        new playerinfo().setVisible(true);
        dispose();
    }

    private void comboBox1ActionPerformed(ActionEvent e) {
        comboBox2.removeAllItems();
        comboBox3.removeAllItems();
        comboBox4.removeAllItems();
        comboBox5.removeAllItems();
        try{   
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","project1","project");
                String sql1="Select hometeam_id,oppoteam_id from match_ where id='"+comboBox1.getItemAt(comboBox1.getSelectedIndex())+"'";
                PreparedStatement stmt1=con.prepareStatement(sql1);
                ResultSet rs1=stmt1.executeQuery();
                
                if(rs1.next()){
                    id1=rs1.getString("hometeam_id");
                    id2=rs1.getString("oppoteam_id");
                }
                
                }catch(Exception ex){
                System.out.println(ex);}
        
        try{   
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","project1","project");
                String sql1="Select name from team where id='"+id1+"'";
                String sql2="Select name from team where id='"+id2+"'";
                PreparedStatement stmt1=con.prepareStatement(sql1);
                PreparedStatement stmt2=con.prepareStatement(sql2);
                ResultSet rs1=stmt1.executeQuery();
                ResultSet rs2=stmt2.executeQuery();
                comboBox4.removeAllItems();
                
                if(rs1.next()){
                    team1=rs1.getString("name");
                    comboBox2.addItem(team1);               
                    comboBox3.addItem(team1);
                    comboBox4.addItem(team1);
                    comboBox5.addItem(team1);
                    
                }
                
                if(rs2.next()){
                    team2=rs2.getString("name");
                    comboBox2.addItem(team2);
                    comboBox3.addItem(team2);
                    comboBox4.addItem(team2);
                    comboBox5.addItem(team2);
                }
                
        }catch(Exception ex){
                System.out.println(ex);}        
    }

    private void comboBox3ActionPerformed(ActionEvent e) {
        // TODO add your code here
        comboBox4.removeAllItems();
        comboBox4.addItem(team1);
        comboBox4.addItem(team2);
        comboBox4.removeItem(comboBox3.getItemAt(comboBox3.getSelectedIndex()));
    }

    private void button4ActionPerformed(ActionEvent e) {
        // TODO add your code here
        dialog2.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Ashwin Muthu Kumar S
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        textField4 = new JTextField();
        label5 = new JLabel();
        label6 = new JLabel();
        textField6 = new JTextField();
        label7 = new JLabel();
        label8 = new JLabel();
        textField8 = new JTextField();
        label9 = new JLabel();
        label10 = new JLabel();
        textField10 = new JTextField();
        button1 = new JButton();
        label11 = new JLabel();
        button3 = new JButton();
        comboBox1 = new JComboBox<>();
        comboBox2 = new JComboBox<>();
        comboBox3 = new JComboBox<>();
        comboBox4 = new JComboBox<>();
        comboBox5 = new JComboBox<>();
        label13 = new JLabel();
        label14 = new JLabel();
        spinner1 = new JSpinner();
        spinner2 = new JSpinner();
        label16 = new JLabel();
        dialog1 = new JDialog();
        label12 = new JLabel();
        button2 = new JButton();
        dialog2 = new JDialog();
        label15 = new JLabel();
        button4 = new JButton();

        //======== this ========
        setTitle("Insert Match Info");
        setIconImage(new ImageIcon("C:\\Users\\DELL\\Pictures\\stroke.jpg").getImage());
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("Match ID");
        contentPane.add(label1);
        label1.setBounds(51, 21, 81, 20);

        //---- label2 ----
        label2.setText("Toss Won By");
        contentPane.add(label2);
        label2.setBounds(50, 60, 82, 20);

        //---- label3 ----
        label3.setText("First Innings played by");
        contentPane.add(label3);
        label3.setBounds(51, 115, 126, 20);

        //---- label4 ----
        label4.setText("First Innings score");
        contentPane.add(label4);
        label4.setBounds(51, 149, 126, 20);
        contentPane.add(textField4);
        textField4.setBounds(220, 149, 240, textField4.getPreferredSize().height);

        //---- label5 ----
        label5.setText("Wickets");
        contentPane.add(label5);
        label5.setBounds(51, 180, 126, 20);

        //---- label6 ----
        label6.setText("Second Innings played by");
        contentPane.add(label6);
        label6.setBounds(45, 275, 160, 20);
        contentPane.add(textField6);
        textField6.setBounds(220, 206, 240, textField6.getPreferredSize().height);

        //---- label7 ----
        label7.setText("Second Innings score");
        contentPane.add(label7);
        label7.setBounds(45, 305, 129, 19);

        //---- label8 ----
        label8.setText("No. of overs");
        contentPane.add(label8);
        label8.setBounds(51, 206, 126, 20);
        contentPane.add(textField8);
        textField8.setBounds(220, 304, 240, textField8.getPreferredSize().height);

        //---- label9 ----
        label9.setText("Wickets");
        contentPane.add(label9);
        label9.setBounds(48, 336, 129, 20);

        //---- label10 ----
        label10.setText("No. of overs");
        contentPane.add(label10);
        label10.setBounds(48, 370, 129, label10.getPreferredSize().height);
        contentPane.add(textField10);
        textField10.setBounds(220, 367, 240, textField10.getPreferredSize().height);

        //---- button1 ----
        button1.setText("ENTER");
        button1.setBackground(new Color(102, 204, 255));
        button1.setBorder(new BevelBorder(BevelBorder.LOWERED));
        button1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(button1);
        button1.setBounds(50, 445, 410, 30);

        //---- label11 ----
        label11.setText("Won Team");
        contentPane.add(label11);
        label11.setBounds(50, 410, 75, 20);

        //---- button3 ----
        button3.setText("Add player info");
        button3.addActionListener(e -> button3ActionPerformed(e));
        contentPane.add(button3);
        button3.setBounds(320, 480, 125, 30);

        //---- comboBox1 ----
        comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
            "M001",
            "M002",
            "M003",
            "M004",
            "M005",
            "M006"
        }));
        comboBox1.addActionListener(e -> comboBox1ActionPerformed(e));
        contentPane.add(comboBox1);
        comboBox1.setBounds(220, 20, 240, comboBox1.getPreferredSize().height);

        //---- comboBox2 ----
        comboBox2.setModel(new DefaultComboBoxModel<>(new String[] {
            "Chennai Super Kings"
        }));
        contentPane.add(comboBox2);
        comboBox2.setBounds(220, 60, 240, comboBox2.getPreferredSize().height);

        //---- comboBox3 ----
        comboBox3.setModel(new DefaultComboBoxModel<>(new String[] {
            "Chennai Super Kings"
        }));
        comboBox3.addActionListener(e -> {
			comboBox3ActionPerformed(e);
			comboBox3ActionPerformed(e);
		});
        contentPane.add(comboBox3);
        comboBox3.setBounds(220, 115, 240, comboBox3.getPreferredSize().height);

        //---- comboBox4 ----
        comboBox4.setModel(new DefaultComboBoxModel<>(new String[] {
            "Mumbai Indians"
        }));
        contentPane.add(comboBox4);
        comboBox4.setBounds(220, 275, 240, comboBox4.getPreferredSize().height);

        //---- comboBox5 ----
        comboBox5.setModel(new DefaultComboBoxModel<>(new String[] {
            "Chennai Super Kings"
        }));
        contentPane.add(comboBox5);
        comboBox5.setBounds(220, 410, 240, comboBox5.getPreferredSize().height);

        //---- label13 ----
        label13.setIcon(null);
        contentPane.add(label13);
        label13.setBounds(475, 195, 50, 30);
        contentPane.add(label14);
        label14.setBounds(200, 515, 20, 15);

        //---- spinner1 ----
        spinner1.setModel(new SpinnerNumberModel(0, 0, 10, 1));
        contentPane.add(spinner1);
        spinner1.setBounds(220, 180, 85, spinner1.getPreferredSize().height);

        //---- spinner2 ----
        spinner2.setModel(new SpinnerNumberModel(0, 0, 10, 1));
        contentPane.add(spinner2);
        spinner2.setBounds(220, 335, 85, 20);

        //---- label16 ----
        label16.setIcon(new ImageIcon("C:\\Users\\DELL\\Pictures\\images (8).jpg"));
        label16.setEnabled(false);
        contentPane.add(label16);
        label16.setBounds(new Rectangle(new Point(10, 0), label16.getPreferredSize()));

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
            dialog1.setTitle("Success");
            dialog1.setAlwaysOnTop(true);
            Container dialog1ContentPane = dialog1.getContentPane();

            //---- label12 ----
            label12.setText("Successfully added match details...");

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
                                .addGap(28, 28, 28)
                                .addComponent(label12, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE))
                            .addGroup(dialog1ContentPaneLayout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(button2)))
                        .addContainerGap(44, Short.MAX_VALUE))
            );
            dialog1ContentPaneLayout.setVerticalGroup(
                dialog1ContentPaneLayout.createParallelGroup()
                    .addGroup(dialog1ContentPaneLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(label12, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button2)
                        .addContainerGap(28, Short.MAX_VALUE))
            );
            dialog1.pack();
            dialog1.setLocationRelativeTo(dialog1.getOwner());
        }

        //======== dialog2 ========
        {
            dialog2.setTitle("Warning!!");
            dialog2.setAlwaysOnTop(true);
            Container dialog2ContentPane = dialog2.getContentPane();
            dialog2ContentPane.setLayout(null);

            //---- label15 ----
            label15.setText("Don't leave any boxes empty...");
            dialog2ContentPane.add(label15);
            label15.setBounds(28, 22, 216, 27);

            //---- button4 ----
            button4.setText("OK");
            button4.addActionListener(e -> button4ActionPerformed(e));
            dialog2ContentPane.add(button4);
            button4.setBounds(new Rectangle(new Point(121, 67), button4.getPreferredSize()));

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < dialog2ContentPane.getComponentCount(); i++) {
                    Rectangle bounds = dialog2ContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = dialog2ContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                dialog2ContentPane.setMinimumSize(preferredSize);
                dialog2ContentPane.setPreferredSize(preferredSize);
            }
            dialog2.pack();
            dialog2.setLocationRelativeTo(dialog2.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Ashwin Muthu Kumar S
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JTextField textField4;
    private JLabel label5;
    private JLabel label6;
    private JTextField textField6;
    private JLabel label7;
    private JLabel label8;
    private JTextField textField8;
    private JLabel label9;
    private JLabel label10;
    private JTextField textField10;
    private JButton button1;
    private JLabel label11;
    private JButton button3;
    private JComboBox<String> comboBox1;
    private JComboBox<String> comboBox2;
    private JComboBox<String> comboBox3;
    private JComboBox<String> comboBox4;
    private JComboBox<String> comboBox5;
    private JLabel label13;
    private JLabel label14;
    private JSpinner spinner1;
    private JSpinner spinner2;
    private JLabel label16;
    private JDialog dialog1;
    private JLabel label12;
    private JButton button2;
    private JDialog dialog2;
    private JLabel label15;
    private JButton button4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
