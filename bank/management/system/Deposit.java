package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Deposit extends JFrame implements ActionListener{

    JTextField text1;
    JButton button1,button2;
    JLabel label1;
    String pin;
    Deposit(String pin){
        this.pin = pin;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel AtmLabel = new JLabel(i3);
        AtmLabel.setBounds(0, 0, 960, 1080);
        add(AtmLabel);

        label1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setBounds(190,350,400,35);
        AtmLabel.add(label1);

        text1 = new JTextField();
        text1.setFont(new Font("Raleway", Font.BOLD, 22));
        text1.setBounds(190,420,320,25);
        AtmLabel.add(text1);

        button1 = new JButton("DEPOSIT");
        button2 = new JButton("BACK");

        button1.setBounds(390,588,150,35);
        AtmLabel.add(button1);
        button2.setBounds(390,633,150,35);
        AtmLabel.add(button2);

        button1.addActionListener(this);
        button2.addActionListener(this);

        setSize(960,1080);
        setUndecorated(true);
        setLocation(500,0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        try{
            String amount = text1.getText();
            Date date = new Date();
            if(ae.getSource()==button1){
                if(text1.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Deposit");
                }else{
                    Conn c1 = new Conn();
                    c1.s.executeUpdate("insert into bank values('"+pin+"', '"+date+"', 'Deposit', '"+amount+"')");
                    JOptionPane.showMessageDialog(null, "Rs. "+amount+" Deposited Successfully");
                    setVisible(false);
                    new Transactions(pin).setVisible(true);
                }
            }else if(ae.getSource()==button2){
                setVisible(false);
                new Transactions(pin).setVisible(true);
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args){

        new Deposit("").setVisible(true);
    }
}