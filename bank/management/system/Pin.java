package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Pin extends JFrame implements ActionListener{

    JPasswordField text2,text3;
    JButton button1,button2;
    JLabel label1,label2,label3;
    String pin;
    Pin(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Atmlabel = new JLabel(i3);
        Atmlabel.setBounds(0, 0, 960, 1080);
        add(Atmlabel);

        label1 = new JLabel("CHANGE YOUR PIN");
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setForeground(Color.WHITE);
        label1.setBounds(280,330,800,35);
        Atmlabel.add(label1);

        label2 = new JLabel("New PIN:");
        label2.setFont(new Font("System", Font.BOLD, 16));
        label2.setForeground(Color.WHITE);
        label2.setBounds(180,390,150,35);
        Atmlabel.add(label2);

        text2 = new JPasswordField();
        text2.setFont(new Font("Raleway", Font.BOLD, 25));
        text2.setBounds(350,390,180,25);
        Atmlabel.add(text2);

        label3 = new JLabel("Re-Enter New PIN:");
        label3.setFont(new Font("System", Font.BOLD, 16));
        label3.setForeground(Color.WHITE);
        label3.setBounds(180,440,200,35);
        Atmlabel.add(label3);

        text3 = new JPasswordField();
        text3.setFont(new Font("Raleway", Font.BOLD, 25));
        text3.setBounds(350,440,180,25);
        Atmlabel.add(text3);






        button1 = new JButton("CHANGE");
        button1.setBounds(390,588,150,35);
        Atmlabel.add(button1);

        button2 = new JButton("BACK");
        button2.setBounds(390,633,150,35);
        Atmlabel.add(button2);


        button1.addActionListener(this);
        button2.addActionListener(this);

        setLayout(null);

        setSize(960,1080);
        setLocation(500,0);
        setUndecorated(true);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        try{
            String npin = text2.getText();
            String rpin = text3.getText();

            if(!npin.equals(rpin)){
                JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                return;
            }

            if(ae.getSource()==button1){
                if (text2.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Enter New PIN");
                }
                if (text3.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Re-Enter new PIN");
                }

                Conn c1 = new Conn();
                String q1 = "update bank set pin = '"+rpin+"' where pin = '"+pin+"' ";
                String q2 = "update login set pin = '"+rpin+"' where pin = '"+pin+"' ";
                String q3 = "update signupthree set pin = '"+rpin+"' where pin = '"+pin+"' ";

                c1.s.executeUpdate(q1);
                c1.s.executeUpdate(q2);
                c1.s.executeUpdate(q3);

                JOptionPane.showMessageDialog(null, "PIN changed successfully");
                setVisible(false);
                new Transactions(rpin).setVisible(true);

            }else if(ae.getSource()==button2){
                new Transactions(pin).setVisible(true);
                setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        new Pin("").setVisible(true);
    }
}
