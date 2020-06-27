/*
 * Created by JFormDesigner on Mon Apr 20 03:03:07 IST 2020
 */

package crictracker;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.GroupLayout;
import java.sql.*;
import javax.swing.border.*;
import java.lang.*;

public class playerinfo extends JFrame {
    String id,team,p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,a,b,c;
    public playerinfo() {
        initComponents();
    }
    
    private void button1ActionPerformed(ActionEvent e) {
        matchBox.removeAllItems();
        
        if (comboBox3.getItemAt(comboBox3.getSelectedIndex())==null){
            dialog3.setVisible(true);
        }
        else{
        
        try{
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","project1","project");
                String sql1 = "select id from player where name='"+comboBox3.getItemAt(comboBox3.getSelectedIndex())+"'";
                PreparedStatement ps1 = con.prepareStatement(sql1);
                ResultSet rs1 = ps1.executeQuery();
                
        
                if(rs1.next()){
                    id =rs1.getString("id");
                    System.out.println(id);
                }
        }
                catch(Exception ex){
                System.out.println(ex);
            }
        try{   
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","project1","project");
                String sql= "insert into score(player_id,match_id,runs,balls,wicket,sixes,boundaries,strike_rate,no_of_overs,runs_conceded,wickets_taken,economy)"+"values(?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement stmt=con.prepareStatement(sql);
                stmt.setString(1,id);
                stmt.setString(2,matchBox.getItemAt(matchBox.getSelectedIndex()));
                stmt.setString(3,textField3.getText());
                stmt.setString(4,textField4.getText());
                stmt.setString(5,comboBox1.getItemAt(comboBox1.getSelectedIndex()));
                stmt.setString(6,spinner1.getValue().toString());
                stmt.setString(7,spinner2.getValue().toString());
                stmt.setString(8,textField10.getText());
                stmt.setString(9,textField7.getText());
                stmt.setString(10,textField8.getText());
                stmt.setString(11,String.valueOf(slider1.getValue()));
                stmt.setString(12,textField10.getText());
                
                ResultSet rs=stmt.executeQuery();
                System.out.println("Hello5");
               if (rs.next()){
                   System.out.println("Done");
               }
               
               }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        dialog1.setVisible(true);}
// TODO add your code here
    }
    
    private void button2ActionPerformed(ActionEvent e) {
        dialog1.dispose();
        dispose();
// TODO add your code here
    }
    
    

    private void comboBox4ActionPerformed(ActionEvent e) {
        // TODO add your code here
        comboBox3.removeAllItems();
        System.out.println(spinner1.getValue().toString());
        
        try{
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","project1","project");
                String sql1 = "select id from team where name='"+comboBox4.getItemAt(comboBox4.getSelectedIndex())+"'";
                PreparedStatement ps1 = con.prepareStatement(sql1);
                ResultSet rs1 = ps1.executeQuery();
                
        
                if(rs1.next()){
                    team =rs1.getString("id");
                    System.out.println(team);
                }
        }
                catch(Exception ex){
                System.out.println(ex);
            }
        
        try{
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","project1","project");
                String sql1="select p01_id,p02_id,p03_id,p04_id,p05_id,p06_id,p07_id,p08_id,p09_id,p10_id,p11_id,p12_id,p13_id,p14_id,p15_id from team where id='"+team+"'";
                PreparedStatement ps1 = con.prepareStatement(sql1);
                ResultSet rs1 = ps1.executeQuery();
                
        
                if(rs1.next()){
                    p1=rs1.getString("p01_id");
                    p2=rs1.getString("p02_id");
                    p3=rs1.getString("p03_id");
                    p4=rs1.getString("p04_id");
                    p5=rs1.getString("p05_id");
                    p6=rs1.getString("p06_id");
                    p7=rs1.getString("p07_id");
                    p8=rs1.getString("p08_id");
                    p9=rs1.getString("p09_id");
                    p10=rs1.getString("p10_id");
                    p11=rs1.getString("p11_id");
                    p12=rs1.getString("p12_id");
                    p13=rs1.getString("p13_id");
                    p14=rs1.getString("p14_id");
                    p15=rs1.getString("p15_id");
                    
                }
        }
                catch(Exception ex){
                System.out.println(ex);
            } 
        
        try{
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","project1","project");
                String sql1="select name from player where id='"+p1+"'";
                String sql2="select name from player where id='"+p2+"'";
                String sql3="select name from player where id='"+p3+"'";
                String sql4="select name from player where id='"+p4+"'";
                String sql5="select name from player where id='"+p5+"'";
                String sql6="select name from player where id='"+p6+"'";
                String sql7="select name from player where id='"+p7+"'";
                String sql8="select name from player where id='"+p8+"'";
                String sql9="select name from player where id='"+p9+"'";
                String sql10="select name from player where id='"+p10+"'";
                String sql11="select name from player where id='"+p11+"'";
                String sql12="select name from player where id='"+p12+"'";
                String sql13="select name from player where id='"+p13+"'";
                String sql14="select name from player where id='"+p14+"'";
                String sql15="select name from player where id='"+p15+"'";
                
                PreparedStatement ps1 = con.prepareStatement(sql1);
                PreparedStatement ps2 = con.prepareStatement(sql2);
                PreparedStatement ps3 = con.prepareStatement(sql3);
                PreparedStatement ps4 = con.prepareStatement(sql4);
                PreparedStatement ps5 = con.prepareStatement(sql5);
                PreparedStatement ps6 = con.prepareStatement(sql6);
                PreparedStatement ps7 = con.prepareStatement(sql7);
                PreparedStatement ps8 = con.prepareStatement(sql8);
                PreparedStatement ps9 = con.prepareStatement(sql9);
                PreparedStatement ps10 = con.prepareStatement(sql10);
                PreparedStatement ps11 = con.prepareStatement(sql11);
                PreparedStatement ps12 = con.prepareStatement(sql12);
                PreparedStatement ps13 = con.prepareStatement(sql13);
                PreparedStatement ps14 = con.prepareStatement(sql14);
                PreparedStatement ps15 = con.prepareStatement(sql15);
                
                ResultSet rs1 = ps1.executeQuery();
                ResultSet rs2 = ps2.executeQuery();
                ResultSet rs3 = ps3.executeQuery();
                ResultSet rs4 = ps4.executeQuery();
                ResultSet rs5 = ps5.executeQuery();
                ResultSet rs6 = ps6.executeQuery();
                ResultSet rs7 = ps7.executeQuery();
                ResultSet rs8 = ps8.executeQuery();
                ResultSet rs9 = ps9.executeQuery();
                ResultSet rs10 = ps10.executeQuery();
                ResultSet rs11 = ps11.executeQuery();
                ResultSet rs12 = ps12.executeQuery();
                ResultSet rs13 = ps13.executeQuery();
                ResultSet rs14 = ps14.executeQuery();
                ResultSet rs15 = ps15.executeQuery();
                
                if(rs1.next()){
                    String n1=rs1.getString("name");
                    comboBox3.addItem(n1);
                }
                if(rs2.next()){
                    String n2=rs2.getString("name");
                    comboBox3.addItem(n2);
                }
                if(rs3.next()){
                    String n3=rs3.getString("name");
                    comboBox3.addItem(n3);
                }
                if(rs4.next()){
                    String n4=rs4.getString("name");
                    comboBox3.addItem(n4);
                }
                if(rs5.next()){
                    String n5=rs5.getString("name");
                    comboBox3.addItem(n5);
                }
                if(rs6.next()){
                    String n6=rs6.getString("name");
                    comboBox3.addItem(n6);
                }
                if(rs7.next()){
                    String n7=rs7.getString("name");
                    comboBox3.addItem(n7);
                }
                if(rs8.next()){
                    String n8=rs8.getString("name");
                    comboBox3.addItem(n8);
                }
                if(rs9.next()){
                    String n9=rs9.getString("name");
                    comboBox3.addItem(n9);
                }
                if(rs10.next()){
                    String n10=rs10.getString("name");
                    comboBox3.addItem(n10);
                }
                if(rs11.next()){
                    String n11=rs11.getString("name");
                    comboBox3.addItem(n11);
                }
                if(rs12.next()){
                    String n12=rs12.getString("name");
                    comboBox3.addItem(n12);
                }
                if(rs13.next()){
                    String n13=rs13.getString("name");
                    comboBox3.addItem(n13);
                }
                if(rs14.next()){
                    String n14=rs14.getString("name");
                    comboBox3.addItem(n14);
                }
                if(rs15.next()){
                    String n15=rs15.getString("name");
                    comboBox3.addItem(n15);
                }
                
        }
                catch(Exception ex){
                System.out.println(ex);
            }    
        
        
                
                
    }

    private void matchBoxActionPerformed(ActionEvent e) {
        // TODO add your code here
    }
    
    public static boolean isNumeric(String strNum){
            if (strNum == null) {
                return false;
            }
            try {
            int d = Integer.parseInt(strNum);
            }
            catch(NumberFormatException nfe){
            return false;
            }
            return true;
        }
    
    

    private void button3ActionPerformed(ActionEvent e) {
        // TODO add your code here
        
        
        int sc,ball,ov,r;
        
        if(isNumeric(textField3.getText()) || isNumeric(textField4.getText()) || isNumeric(textField7.getText()) || isNumeric(textField8.getText())){
            sc=Integer.parseInt(textField3.getText());
            ball=Integer.parseInt(textField4.getText());
            ov=Integer.parseInt(textField7.getText());
            r=Integer.parseInt(textField8.getText());
            if(sc<0 || ball<0 || ov<0 || r<0){
                dialog2.setVisible(true);
            }
        }else{
            dialog2.setVisible(true);
        }
        
        float overs=Float.parseFloat(textField7.getText());
        float runs=Float.parseFloat(textField8.getText());
        if(overs==0){
            overs=1;
        }
        float eco=runs/overs;
        textField1.setText(String.format("%.2f%n", eco));
        
        float score=Float.parseFloat(textField3.getText());
        float balls=Float.parseFloat(textField4.getText());
        if(balls==0){
            balls=1;
        }
        float sr=100*(score/balls);
        textField2.setText(String.format("%.2f%n", sr));

        System.out.println(String.valueOf(slider1.getValue()));
        
    }

    private void button4ActionPerformed(ActionEvent e) {
        // TODO add your code here
        dialog2.dispose();
        textField3.setText("0");
        textField4.setText("0");
        textField7.setText("0");
        textField8.setText("0");
    }

    private void button5ActionPerformed(ActionEvent e) {
        // TODO add your code here
        dialog3.dispose();
        
    }

    private void button6ActionPerformed(ActionEvent e) {
        new matchinfo().setVisible(true);
        dispose();// TODO add your code here
    }
    
    


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Ashwin Muthu Kumar S
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        label10 = new JLabel();
        button1 = new JButton();
        textField3 = new JTextField();
        textField4 = new JTextField();
        comboBox1 = new JComboBox<>();
        textField7 = new JTextField();
        textField8 = new JTextField();
        textField10 = new JTextField();
        matchBox = new JComboBox<>();
        comboBox3 = new JComboBox();
        label12 = new JLabel();
        comboBox4 = new JComboBox<>();
        spinner1 = new JSpinner();
        spinner2 = new JSpinner();
        label13 = new JLabel();
        textField1 = new JTextField();
        label14 = new JLabel();
        textField2 = new JTextField();
        button3 = new JButton();
        slider1 = new JSlider();
        label15 = new JLabel();
        label18 = new JLabel();
        label19 = new JLabel();
        label20 = new JLabel();
        label21 = new JLabel();
        label22 = new JLabel();
        label23 = new JLabel();
        label24 = new JLabel();
        label25 = new JLabel();
        label26 = new JLabel();
        button6 = new JButton();
        label16 = new JLabel();
        dialog1 = new JDialog();
        label11 = new JLabel();
        button2 = new JButton();
        dialog2 = new JDialog();
        label27 = new JLabel();
        button4 = new JButton();
        label28 = new JLabel();
        dialog3 = new JDialog();
        label29 = new JLabel();
        button5 = new JButton();

        //======== this ========
        setTitle("Insert Player Score");
        setIconImage(new ImageIcon("C:\\Users\\DELL\\Pictures\\images (10).jpg").getImage());
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("Player Name");
        label1.setBackground(Color.white);
        label1.setBorder(new EtchedBorder());
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getStyle() | Font.BOLD));
        contentPane.add(label1);
        label1.setBounds(45, 55, 95, 27);

        //---- label2 ----
        label2.setText("Match ID");
        label2.setBackground(Color.white);
        label2.setBorder(new EtchedBorder());
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getStyle() | Font.BOLD));
        contentPane.add(label2);
        label2.setBounds(44, 90, 96, 20);

        //---- label3 ----
        label3.setText("Runs");
        label3.setBackground(Color.white);
        label3.setBorder(new EtchedBorder());
        label3.setFont(label3.getFont().deriveFont(label3.getFont().getStyle() | Font.BOLD));
        contentPane.add(label3);
        label3.setBounds(44, 120, 96, 20);

        //---- label4 ----
        label4.setText("Balls Faced");
        label4.setBackground(Color.white);
        label4.setBorder(new EtchedBorder());
        label4.setFont(label4.getFont().deriveFont(label4.getFont().getStyle() | Font.BOLD));
        contentPane.add(label4);
        label4.setBounds(44, 151, 96, 20);

        //---- label5 ----
        label5.setText("Out/NotOut");
        label5.setBackground(Color.white);
        label5.setBorder(new EtchedBorder());
        label5.setFont(label5.getFont().deriveFont(label5.getFont().getStyle() | Font.BOLD));
        contentPane.add(label5);
        label5.setBounds(44, 190, 96, 20);

        //---- label6 ----
        label6.setText("Sixes");
        label6.setBackground(Color.white);
        label6.setBorder(new EtchedBorder());
        label6.setFont(label6.getFont().deriveFont(label6.getFont().getStyle() | Font.BOLD));
        contentPane.add(label6);
        label6.setBounds(44, 224, 96, 25);

        //---- label7 ----
        label7.setText("Boundaries");
        label7.setBackground(Color.white);
        label7.setBorder(new EtchedBorder());
        label7.setFont(label7.getFont().deriveFont(label7.getFont().getStyle() | Font.BOLD));
        contentPane.add(label7);
        label7.setBounds(44, 260, 96, 24);

        //---- label8 ----
        label8.setText("Overs Bowled");
        label8.setBackground(Color.white);
        label8.setBorder(new EtchedBorder());
        label8.setFont(label8.getFont().deriveFont(label8.getFont().getStyle() | Font.BOLD));
        contentPane.add(label8);
        label8.setBounds(410, 20, 105, 30);

        //---- label9 ----
        label9.setText("Runs Conceded");
        label9.setBackground(Color.white);
        label9.setBorder(new EtchedBorder());
        label9.setFont(label9.getFont().deriveFont(label9.getFont().getStyle() | Font.BOLD));
        contentPane.add(label9);
        label9.setBounds(410, 55, 100, 25);

        //---- label10 ----
        label10.setText("Wickets Taken");
        label10.setBackground(Color.white);
        label10.setBorder(new EtchedBorder());
        label10.setFont(label10.getFont().deriveFont(label10.getFont().getStyle() | Font.BOLD));
        contentPane.add(label10);
        label10.setBounds(395, 110, 100, 30);

        //---- button1 ----
        button1.setText("Add Data");
        button1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(button1);
        button1.setBounds(405, 270, 225, 50);

        //---- textField3 ----
        textField3.setText("0");
        contentPane.add(textField3);
        textField3.setBounds(152, 118, 110, 25);

        //---- textField4 ----
        textField4.setText("0");
        contentPane.add(textField4);
        textField4.setBounds(152, 149, 110, 25);

        //---- comboBox1 ----
        comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
            "NotOut",
            "Out"
        }));
        contentPane.add(comboBox1);
        comboBox1.setBounds(152, 188, 105, 25);

        //---- textField7 ----
        textField7.setText("0");
        contentPane.add(textField7);
        textField7.setBounds(525, 20, 105, 25);

        //---- textField8 ----
        textField8.setText("0");
        contentPane.add(textField8);
        textField8.setBounds(525, 55, 105, 25);

        //---- textField10 ----
        textField10.setText("0");
        textField10.setBackground(UIManager.getColor("Button.background"));
        textField10.setForeground(UIManager.getColor("Button.background"));
        textField10.setEnabled(false);
        textField10.setEditable(false);
        contentPane.add(textField10);
        textField10.setBounds(495, 285, 25, 20);

        //---- matchBox ----
        matchBox.setModel(new DefaultComboBoxModel<>(new String[] {
            "M001",
            "M002",
            "M003",
            "M004",
            "M005",
            "M006"
        }));
        matchBox.addActionListener(e -> matchBoxActionPerformed(e));
        contentPane.add(matchBox);
        matchBox.setBounds(152, 89, 110, 23);
        contentPane.add(comboBox3);
        comboBox3.setBounds(150, 55, 235, 27);

        //---- label12 ----
        label12.setText("Team");
        label12.setBackground(Color.white);
        label12.setBorder(new EtchedBorder());
        label12.setFont(label12.getFont().deriveFont(label12.getFont().getStyle() | Font.BOLD));
        contentPane.add(label12);
        label12.setBounds(45, 15, 95, 30);

        //---- comboBox4 ----
        comboBox4.setModel(new DefaultComboBoxModel<>(new String[] {
            "Chennai Super Kings",
            "Mumbai Indians",
            "Kolkata Knight Riders",
            "Royal Challengers Bangalore"
        }));
        comboBox4.addActionListener(e -> comboBox4ActionPerformed(e));
        contentPane.add(comboBox4);
        comboBox4.setBounds(150, 15, 235, 30);

        //---- spinner1 ----
        spinner1.setModel(new SpinnerNumberModel(0, 0, null, 1));
        contentPane.add(spinner1);
        spinner1.setBounds(150, 225, 85, 25);

        //---- spinner2 ----
        spinner2.setModel(new SpinnerNumberModel(0, 0, null, 1));
        contentPane.add(spinner2);
        spinner2.setBounds(150, 260, 85, 25);

        //---- label13 ----
        label13.setText("Economy");
        label13.setBackground(Color.white);
        label13.setBorder(new EtchedBorder());
        label13.setFont(label13.getFont().deriveFont(label13.getFont().getStyle() | Font.BOLD));
        contentPane.add(label13);
        label13.setBounds(410, 170, 85, 25);

        //---- textField1 ----
        textField1.setBackground(SystemColor.inactiveCaptionBorder);
        textField1.setFont(textField1.getFont().deriveFont(textField1.getFont().getStyle() | Font.BOLD));
        textField1.setEditable(false);
        contentPane.add(textField1);
        textField1.setBounds(515, 170, 105, 25);

        //---- label14 ----
        label14.setText("Strike Rate");
        label14.setBackground(Color.white);
        label14.setBorder(new EtchedBorder());
        label14.setFont(label14.getFont().deriveFont(label14.getFont().getStyle() | Font.BOLD));
        contentPane.add(label14);
        label14.setBounds(45, 295, 95, 25);

        //---- textField2 ----
        textField2.setBackground(SystemColor.inactiveCaptionBorder);
        textField2.setFont(textField2.getFont().deriveFont(textField2.getFont().getStyle() | Font.BOLD));
        textField2.setEditable(false);
        contentPane.add(textField2);
        textField2.setBounds(150, 295, 90, 25);

        //---- button3 ----
        button3.setText("Done");
        button3.addActionListener(e -> button3ActionPerformed(e));
        contentPane.add(button3);
        button3.setBounds(470, 220, 80, 33);

        //---- slider1 ----
        slider1.setMaximum(10);
        slider1.setMinorTickSpacing(1);
        slider1.setPaintLabels(true);
        slider1.setPaintTicks(true);
        slider1.setSnapToTicks(true);
        slider1.setMajorTickSpacing(1);
        slider1.setValue(5);
        contentPane.add(slider1);
        slider1.setBounds(500, 95, 205, 55);
        contentPane.add(label15);
        label15.setBounds(160, 350, 85, 60);

        //---- label18 ----
        label18.setText("Economy");
        label18.setBackground(Color.white);
        label18.setBorder(new EtchedBorder());
        label18.setFont(label18.getFont().deriveFont(label18.getFont().getStyle() | Font.BOLD));
        contentPane.add(label18);
        label18.setBounds(410, 170, 85, 25);

        //---- label19 ----
        label19.setText("Wickets Taken");
        label19.setBackground(Color.white);
        label19.setBorder(new EtchedBorder());
        label19.setFont(label19.getFont().deriveFont(label19.getFont().getStyle() | Font.BOLD));
        contentPane.add(label19);
        label19.setBounds(395, 110, 100, 30);

        //---- label20 ----
        label20.setText("Runs Conceded");
        label20.setBackground(Color.white);
        label20.setBorder(new EtchedBorder());
        label20.setFont(label20.getFont().deriveFont(label20.getFont().getStyle() | Font.BOLD));
        contentPane.add(label20);
        label20.setBounds(410, 55, 100, 25);

        //---- label21 ----
        label21.setText("Overs Bowled");
        label21.setBackground(Color.white);
        label21.setBorder(new EtchedBorder());
        label21.setFont(label21.getFont().deriveFont(label21.getFont().getStyle() | Font.BOLD));
        contentPane.add(label21);
        label21.setBounds(410, 20, 105, 30);

        //---- label22 ----
        label22.setText("Team");
        label22.setBackground(Color.white);
        label22.setBorder(new EtchedBorder());
        label22.setFont(label22.getFont().deriveFont(label22.getFont().getStyle() | Font.BOLD));
        contentPane.add(label22);
        label22.setBounds(45, 15, 65, 30);

        //---- label23 ----
        label23.setText("Player Name");
        label23.setBackground(Color.white);
        label23.setBorder(new EtchedBorder());
        label23.setFont(label23.getFont().deriveFont(label23.getFont().getStyle() | Font.BOLD));
        contentPane.add(label23);
        label23.setBounds(45, 55, 77, 27);

        //---- label24 ----
        label24.setText("Match ID");
        label24.setBackground(Color.white);
        label24.setBorder(new EtchedBorder());
        label24.setFont(label24.getFont().deriveFont(label24.getFont().getStyle() | Font.BOLD));
        contentPane.add(label24);
        label24.setBounds(45, 90, 65, 20);

        //---- label25 ----
        label25.setText("Runs");
        label25.setBackground(Color.white);
        label25.setBorder(new EtchedBorder());
        label25.setFont(label25.getFont().deriveFont(label25.getFont().getStyle() | Font.BOLD));
        contentPane.add(label25);
        label25.setBounds(45, 120, 45, 20);
        contentPane.add(label26);
        label26.setBounds(680, 0, 35, label26.getPreferredSize().height);

        //---- button6 ----
        button6.setText("Back to Match Info");
        button6.addActionListener(e -> button6ActionPerformed(e));
        contentPane.add(button6);
        button6.setBounds(415, 345, 190, 30);

        //---- label16 ----
        label16.setIcon(new ImageIcon("C:\\Users\\DELL\\Pictures\\team-india.jpg"));
        label16.setBackground(Color.white);
        label16.setBorder(new EtchedBorder());
        label16.setFont(label16.getFont().deriveFont(label16.getFont().getStyle() | Font.BOLD));
        label16.setEnabled(false);
        contentPane.add(label16);
        label16.setBounds(new Rectangle(new Point(5, 0), label16.getPreferredSize()));

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
            dialog1.setTitle("Success!");
            dialog1.setAlwaysOnTop(true);
            Container dialog1ContentPane = dialog1.getContentPane();

            //---- label11 ----
            label11.setText("Inserted Successfully...");

            //---- button2 ----
            button2.setText("OK");
            button2.addActionListener(e -> button2ActionPerformed(e));

            GroupLayout dialog1ContentPaneLayout = new GroupLayout(dialog1ContentPane);
            dialog1ContentPane.setLayout(dialog1ContentPaneLayout);
            dialog1ContentPaneLayout.setHorizontalGroup(
                dialog1ContentPaneLayout.createParallelGroup()
                    .addGroup(dialog1ContentPaneLayout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(dialog1ContentPaneLayout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, dialog1ContentPaneLayout.createSequentialGroup()
                                .addComponent(label11, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
                            .addGroup(GroupLayout.Alignment.TRAILING, dialog1ContentPaneLayout.createSequentialGroup()
                                .addComponent(button2, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115))))
            );
            dialog1ContentPaneLayout.setVerticalGroup(
                dialog1ContentPaneLayout.createParallelGroup()
                    .addGroup(dialog1ContentPaneLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(label11, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            dialog1.pack();
            dialog1.setLocationRelativeTo(dialog1.getOwner());
        }

        //======== dialog2 ========
        {
            dialog2.setTitle("Warning");
            dialog2.setAlwaysOnTop(true);
            Container dialog2ContentPane = dialog2.getContentPane();

            //---- label27 ----
            label27.setText("Invalid values!!!");

            //---- button4 ----
            button4.setText("OK");
            button4.addActionListener(e -> button4ActionPerformed(e));

            //---- label28 ----
            label28.setText("Enter valid integer values...");

            GroupLayout dialog2ContentPaneLayout = new GroupLayout(dialog2ContentPane);
            dialog2ContentPane.setLayout(dialog2ContentPaneLayout);
            dialog2ContentPaneLayout.setHorizontalGroup(
                dialog2ContentPaneLayout.createParallelGroup()
                    .addGroup(dialog2ContentPaneLayout.createSequentialGroup()
                        .addGroup(dialog2ContentPaneLayout.createParallelGroup()
                            .addGroup(dialog2ContentPaneLayout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(label27, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                            .addGroup(dialog2ContentPaneLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(label28, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE))
                            .addGroup(dialog2ContentPaneLayout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(button4, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(52, Short.MAX_VALUE))
            );
            dialog2ContentPaneLayout.setVerticalGroup(
                dialog2ContentPaneLayout.createParallelGroup()
                    .addGroup(dialog2ContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label27, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label28, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button4, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(23, Short.MAX_VALUE))
            );
            dialog2.pack();
            dialog2.setLocationRelativeTo(dialog2.getOwner());
        }

        //======== dialog3 ========
        {
            dialog3.setTitle("Warning");
            dialog3.setAlwaysOnTop(true);
            Container dialog3ContentPane = dialog3.getContentPane();

            //---- label29 ----
            label29.setText("Don't leave the boxes empty...");

            //---- button5 ----
            button5.setText("OK");
            button5.addActionListener(e -> button5ActionPerformed(e));

            GroupLayout dialog3ContentPaneLayout = new GroupLayout(dialog3ContentPane);
            dialog3ContentPane.setLayout(dialog3ContentPaneLayout);
            dialog3ContentPaneLayout.setHorizontalGroup(
                dialog3ContentPaneLayout.createParallelGroup()
                    .addGroup(dialog3ContentPaneLayout.createSequentialGroup()
                        .addContainerGap(31, Short.MAX_VALUE)
                        .addGroup(dialog3ContentPaneLayout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, dialog3ContentPaneLayout.createSequentialGroup()
                                .addComponent(label29, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(GroupLayout.Alignment.TRAILING, dialog3ContentPaneLayout.createSequentialGroup()
                                .addComponent(button5, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115))))
            );
            dialog3ContentPaneLayout.setVerticalGroup(
                dialog3ContentPaneLayout.createParallelGroup()
                    .addGroup(dialog3ContentPaneLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(label29, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button5, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(30, Short.MAX_VALUE))
            );
            dialog3.pack();
            dialog3.setLocationRelativeTo(dialog3.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Ashwin Muthu Kumar S
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JButton button1;
    private JTextField textField3;
    private JTextField textField4;
    private JComboBox<String> comboBox1;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField10;
    private JComboBox<String> matchBox;
    private JComboBox comboBox3;
    private JLabel label12;
    private JComboBox<String> comboBox4;
    private JSpinner spinner1;
    private JSpinner spinner2;
    private JLabel label13;
    private JTextField textField1;
    private JLabel label14;
    private JTextField textField2;
    private JButton button3;
    private JSlider slider1;
    private JLabel label15;
    private JLabel label18;
    private JLabel label19;
    private JLabel label20;
    private JLabel label21;
    private JLabel label22;
    private JLabel label23;
    private JLabel label24;
    private JLabel label25;
    private JLabel label26;
    private JButton button6;
    private JLabel label16;
    private JDialog dialog1;
    private JLabel label11;
    private JButton button2;
    private JDialog dialog2;
    private JLabel label27;
    private JButton button4;
    private JLabel label28;
    private JDialog dialog3;
    private JLabel label29;
    private JButton button5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
