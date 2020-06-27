/*
 * Created by JFormDesigner on Sat Apr 18 04:21:44 IST 2020
 */

package crictracker;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import java.sql.*;

/**
 * @author Ashwin Muthu Kumar S
 */
public class match extends JFrame {
    String id1,id2,mid,tossid,fid,sid,winid,fis,fiw,fio,sis,siw,sio,thing;
    int diff;
    public match() {
        initComponents();
    }

    private void button3ActionPerformed(ActionEvent e) {
        frame1.dispose();
        new match().setVisible(true);
            // TODO add your code here
        
    }

    private void button2ActionPerformed(ActionEvent e) {
        dialog1.dispose();// TODO add your code here
    }
    

    private void button1ActionPerformed(ActionEvent e) {
        
        String a=comboBox1.getItemAt(comboBox1.getSelectedIndex());
        String b=comboBox2.getItemAt(comboBox2.getSelectedIndex());
        if (a==b){
            dialog1.setVisible(true);
        }
        else{
            frame1.setVisible(true);
            try{
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","project1","project");
                
                String sql1 = "select id from team where name='"+a+"'";
                PreparedStatement ps1 = con.prepareStatement(sql1);
                ResultSet rs1 = ps1.executeQuery();
                String sql2= "select id from team where name='"+b+"'";
                PreparedStatement ps2 = con.prepareStatement(sql2);
                ResultSet rs2 = ps2.executeQuery();
                    
                if (rs1.next()){
                    id1=rs1.getString("id");
                    System.out.println(id1);
                    
                }
                if (rs2.next()){
                    id2=rs2.getString("id");
                    System.out.println(id2);
                    
                }
            }
            catch(Exception ex){
                System.out.println(ex);
            }
            try{
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","project1","project");
                String sql1 = "select id from match_ where hometeam_id='"+id1+"'and oppoteam_id='"+id2+"'";
                PreparedStatement ps1 = con.prepareStatement(sql1);
                ResultSet rs1 = ps1.executeQuery();
                String sql2 = "select id from match_ where hometeam_id='"+id2+"'and oppoteam_id='"+id1+"'";
                PreparedStatement ps2 = con.prepareStatement(sql2);
                ResultSet rs2 = ps2.executeQuery();
                
                if(rs1.next()){
                    mid=rs1.getString("id");
                }
                else if(rs2.next()){
                    mid=rs2.getString("id");
                }
                System.out.println(mid);
            }
            catch(Exception ex){
                System.out.println(ex);
            }
            try{
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","project1","project");
                String sql1 = "select tossteam from match_ where id='"+mid+"'";
                PreparedStatement ps1 = con.prepareStatement(sql1);
                ResultSet rs1 = ps1.executeQuery();
                
                String sql2 = "select first_innings_team from match_ where id='"+mid+"'";
                PreparedStatement ps2 = con.prepareStatement(sql2);
                ResultSet rs2 = ps2.executeQuery();
                
                String sql3 = "select second_innings_team from match_ where id='"+mid+"'";
                PreparedStatement ps3 = con.prepareStatement(sql3);
                ResultSet rs3 = ps3.executeQuery();
                
                String sql4 = "select winteam_id from match_ where id='"+mid+"'";
                PreparedStatement ps4 = con.prepareStatement(sql4);
                ResultSet rs4 = ps4.executeQuery();
                
                String sql5 = "select first_innings_score,first_innings_wickets,first_innings_overs,second_innings_score,second_innings_wickets,second_innings_overs from match_ where id='"+mid+"'";
                PreparedStatement ps5 = con.prepareStatement(sql5);
                ResultSet rs5 = ps5.executeQuery();
                
                if(rs1.next()){
                    tossid=rs1.getString("tossteam");
                }
                if(rs2.next()){
                    fid=rs2.getString("first_innings_team");
                }
                if(rs3.next()){
                    sid=rs3.getString("second_innings_team");
                }
                if(rs4.next()){
                    winid=rs4.getString("winteam_id");
                }
                if(rs5.next()){
                    fis=rs5.getString("first_innings_score");
                    fiw=rs5.getString("first_innings_wickets");
                    fio=rs5.getString("first_innings_overs");
                    sis=rs5.getString("second_innings_score");
                    siw=rs5.getString("second_innings_wickets");
                    sio=rs5.getString("second_innings_overs");
                    label8.setText(fis+"-"+fiw+"("+fio+")");
                    label11.setText(sis+"-"+siw+"("+sio+")");
                }
                
                
            }
            catch(Exception ex){
                System.out.println(ex);
            }
            
            try{
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","project1","project");
                String sql1 = "select name from team where id='"+tossid+"'";
                PreparedStatement ps1 = con.prepareStatement(sql1);
                ResultSet rs1 = ps1.executeQuery();
                
                String sql2 = "select name from team where id='"+fid+"'";
                PreparedStatement ps2 = con.prepareStatement(sql2);
                ResultSet rs2 = ps2.executeQuery();
                
                String sql3 = "select name from team where id='"+sid+"'";
                PreparedStatement ps3 = con.prepareStatement(sql3);
                ResultSet rs3 = ps3.executeQuery();
                
                String sql4 = "select name from team where id='"+winid+"'";
                PreparedStatement ps4 = con.prepareStatement(sql4);
                ResultSet rs4 = ps4.executeQuery();
                
                if(rs1.next()){
                    String tossteam=rs1.getString("name");
                    label5.setText(tossteam);
                }
                
                if(rs2.next()){
                    String firstteam=rs2.getString("name");
                    label7.setText(firstteam);
                    chooseColor(firstteam,label7);
                }
                
                if(rs3.next()){
                    String secondteam=rs3.getString("name");
                    label10.setText(secondteam);
                    chooseColor(secondteam,label10);
                }
                
                if(rs4.next()){
                    String winteam=rs4.getString("name");
                    int one,two;
                    if(winteam.equals(label7.getText())){
                        thing="runs";
                        one=Integer.parseInt(fis);
                        two=Integer.parseInt(sis);
                        diff=one-two;
                    }
                    else{
                        thing="wickets";
                        one=Integer.parseInt(siw);
                        two=10;
                        diff=two-one;
                    }
                    label12.setText(winteam+" won the match by "+diff+" "+thing+"...");
                }
            }
            catch(Exception ex){
                System.out.println(ex);
            }
            
            this.setVisible(false);
        }
        
        
    }
    
    public void chooseColor(String name,JLabel ob){
        if (name.equals("Chennai Super Kings")){
            ob.setForeground(Color.YELLOW);
        }
        else if (name.equals("Mumbai Indians")){
            ob.setForeground(Color.blue);
        }
        else if (name.equals("Royal Challengers Bangalore")){
            ob.setForeground(Color.red);
        }
        else{
            ob.setForeground(Color.magenta);
        }
    }

    private void button4ActionPerformed(ActionEvent e) {
        this.setVisible(false);
        new user().setVisible(true);// TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Ashwin Muthu Kumar S
        label1 = new JLabel();
        label2 = new JLabel();
        button1 = new JButton();
        comboBox1 = new JComboBox<>();
        comboBox2 = new JComboBox<>();
        label13 = new JLabel();
        label14 = new JLabel();
        button4 = new JButton();
        label15 = new JLabel();
        dialog1 = new JDialog();
        label3 = new JLabel();
        button2 = new JButton();
        frame1 = new JFrame();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        label10 = new JLabel();
        label11 = new JLabel();
        label12 = new JLabel();
        button3 = new JButton();
        label16 = new JLabel();

        //======== this ========
        setTitle("Match Info");
        setIconImage(new ImageIcon("C:\\Users\\DELL\\Pictures\\versus.png").getImage());
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("Select Team 1");
        label1.setFont(label1.getFont().deriveFont(Font.BOLD|Font.ITALIC));
        contentPane.add(label1);
        label1.setBounds(40, 25, 94, label1.getPreferredSize().height);

        //---- label2 ----
        label2.setText("Select Team 2");
        label2.setFont(label2.getFont().deriveFont(Font.BOLD|Font.ITALIC));
        contentPane.add(label2);
        label2.setBounds(35, 95, 91, label2.getPreferredSize().height);

        //---- button1 ----
        button1.setText("Search");
        button1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(button1);
        button1.setBounds(70, 165, 155, 25);

        //---- comboBox1 ----
        comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
            "Chennai Super Kings",
            "Mumbai Indians",
            "Kolkata Knight Riders",
            "Royal Challengers Bangalore"
        }));
        contentPane.add(comboBox1);
        comboBox1.setBounds(40, 50, 210, 30);

        //---- comboBox2 ----
        comboBox2.setModel(new DefaultComboBoxModel<>(new String[] {
            "Chennai Super Kings",
            "Mumbai Indians",
            "Kolkata Knight Riders",
            "Royal Challengers Bangalore"
        }));
        contentPane.add(comboBox2);
        comboBox2.setBounds(40, 120, 210, 30);
        contentPane.add(label13);
        label13.setBounds(280, 85, 30, 30);
        contentPane.add(label14);
        label14.setBounds(200, 205, 40, 30);

        //---- button4 ----
        button4.setText("Back");
        button4.addActionListener(e -> button4ActionPerformed(e));
        contentPane.add(button4);
        button4.setBounds(120, 195, 85, 25);

        //---- label15 ----
        label15.setIcon(new ImageIcon("C:\\Users\\DELL\\Pictures\\versus.jpg"));
        label15.setEnabled(false);
        contentPane.add(label15);
        label15.setBounds(new Rectangle(new Point(-30, 0), label15.getPreferredSize()));

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
            dialog1.setTitle("Warning!!");
            dialog1.setAlwaysOnTop(true);
            dialog1.setResizable(false);
            Container dialog1ContentPane = dialog1.getContentPane();

            //---- label3 ----
            label3.setText("Don't select the same team on both sides");
            label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 1f));

            //---- button2 ----
            button2.setText("OK");
            button2.addActionListener(e -> button2ActionPerformed(e));

            GroupLayout dialog1ContentPaneLayout = new GroupLayout(dialog1ContentPane);
            dialog1ContentPane.setLayout(dialog1ContentPaneLayout);
            dialog1ContentPaneLayout.setHorizontalGroup(
                dialog1ContentPaneLayout.createParallelGroup()
                    .addGroup(dialog1ContentPaneLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(button2)
                        .addContainerGap(141, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, dialog1ContentPaneLayout.createSequentialGroup()
                        .addContainerGap(34, Short.MAX_VALUE)
                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
            );
            dialog1ContentPaneLayout.setVerticalGroup(
                dialog1ContentPaneLayout.createParallelGroup()
                    .addGroup(dialog1ContentPaneLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button2)
                        .addContainerGap(23, Short.MAX_VALUE))
            );
            dialog1.pack();
            dialog1.setLocationRelativeTo(dialog1.getOwner());
        }

        //======== frame1 ========
        {
            frame1.setTitle("Match Summary");
            frame1.setIconImage(new ImageIcon("C:\\Users\\DELL\\Pictures\\ipl-csk-chennai-super-kings-i-roar-for-dhoni-hd-wallpaper.jpg").getImage());
            Container frame1ContentPane = frame1.getContentPane();
            frame1ContentPane.setLayout(null);

            //---- label4 ----
            label4.setText("Toss");
            label4.setFont(label4.getFont().deriveFont(label4.getFont().getStyle() | Font.BOLD));
            frame1ContentPane.add(label4);
            label4.setBounds(155, 10, 55, 23);

            //---- label5 ----
            label5.setBackground(Color.black);
            frame1ContentPane.add(label5);
            label5.setBounds(215, 11, 203, 23);

            //---- label6 ----
            label6.setText("1st Innings");
            label6.setFont(label6.getFont().deriveFont(label6.getFont().getStyle() | Font.BOLD));
            frame1ContentPane.add(label6);
            label6.setBounds(49, 52, 80, 23);
            frame1ContentPane.add(label7);
            label7.setBounds(49, 86, 256, 23);
            frame1ContentPane.add(label8);
            label8.setBounds(340, 86, 103, 23);

            //---- label9 ----
            label9.setText("2nd Innings");
            label9.setFont(label9.getFont().deriveFont(label9.getFont().getStyle() | Font.BOLD));
            label9.setBackground(new Color(107, 0, 63));
            frame1ContentPane.add(label9);
            label9.setBounds(49, 142, 92, 22);
            frame1ContentPane.add(label10);
            label10.setBounds(49, 175, 257, 23);
            frame1ContentPane.add(label11);
            label11.setBounds(340, 175, 103, 23);

            //---- label12 ----
            label12.setFont(label12.getFont().deriveFont(label12.getFont().getStyle() | Font.BOLD));
            frame1ContentPane.add(label12);
            label12.setBounds(39, 224, 413, 34);

            //---- button3 ----
            button3.setText("Back");
            button3.addActionListener(e -> button3ActionPerformed(e));
            frame1ContentPane.add(button3);
            button3.setBounds(new Rectangle(new Point(215, 265), button3.getPreferredSize()));

            //---- label16 ----
            label16.setIcon(new ImageIcon("C:\\Users\\DELL\\Pictures\\win.jpg"));
            label16.setEnabled(false);
            frame1ContentPane.add(label16);
            label16.setBounds(new Rectangle(new Point(-10, 10), label16.getPreferredSize()));

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < frame1ContentPane.getComponentCount(); i++) {
                    Rectangle bounds = frame1ContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = frame1ContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                frame1ContentPane.setMinimumSize(preferredSize);
                frame1ContentPane.setPreferredSize(preferredSize);
            }
            frame1.pack();
            frame1.setLocationRelativeTo(frame1.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Ashwin Muthu Kumar S
    private JLabel label1;
    private JLabel label2;
    private JButton button1;
    private JComboBox<String> comboBox1;
    private JComboBox<String> comboBox2;
    private JLabel label13;
    private JLabel label14;
    private JButton button4;
    private JLabel label15;
    private JDialog dialog1;
    private JLabel label3;
    private JButton button2;
    private JFrame frame1;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JLabel label11;
    private JLabel label12;
    private JButton button3;
    private JLabel label16;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
