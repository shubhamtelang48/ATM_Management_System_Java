package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener{

    JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12;
    JRadioButton rBotton1,rBotton2,rBotton3,rBotton4;
    JButton button1,button2;
    JCheckBox cBox1,cBox2,cBox3,cBox4,cBox5,cBox6,cBox7;
    String formno;
    SignupThree(String formno){
        this.formno = formno;
        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(150, 0, 100, 100);
        add(l14);

        label1 = new JLabel("Page 3: Account Details");
        label1.setFont(new Font("Raleway", Font.BOLD, 22));
        label1.setBounds(280,40,400,40);
        add(label1);

        label2 = new JLabel("Account Type:");
        label2.setFont(new Font("Raleway", Font.BOLD, 18));
        label2.setBounds(100,110,200,30);
        add(label2);

        rBotton1 = new JRadioButton("Saving Account");
        rBotton1.setFont(new Font("Raleway", Font.BOLD, 16));
        rBotton1.setBackground(Color.WHITE);
        rBotton1.setBounds(100,150,150,30);
        add(rBotton1);
        rBotton2 = new JRadioButton("Fixed Deposit Account");
        rBotton2.setFont(new Font("Raleway", Font.BOLD, 16));
        rBotton2.setBackground(Color.WHITE);
        rBotton2.setBounds(350,150,300,30);
        add(rBotton2);

        rBotton3 = new JRadioButton("Current Account");
        rBotton3.setFont(new Font("Raleway", Font.BOLD, 16));
        rBotton3.setBackground(Color.WHITE);
        rBotton3.setBounds(100,190,250,30);
        add(rBotton3);

        rBotton4 = new JRadioButton("Recurring Deposit Account");
        rBotton4.setFont(new Font("Raleway", Font.BOLD, 16));
        rBotton4.setBackground(Color.WHITE);
        rBotton4.setBounds(350,190,250,30);
        add(rBotton4);

        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(rBotton1);
        groupgender.add(rBotton2);
        groupgender.add(rBotton3);
        groupgender.add(rBotton4);


        label3 = new JLabel("Card Number:");
        label3.setFont(new Font("Raleway", Font.BOLD, 18));
        label3.setBounds(100,240,200,30);
        add(label3);

        label4 = new JLabel("XXXX-XXXX-XXXX-4184");
        label4.setFont(new Font("Raleway", Font.BOLD, 18));
        label4.setBounds(330,240,250,30);
        add(label4);

        label5 = new JLabel("(Your 16-digit Card number)");
        label5.setFont(new Font("Raleway", Font.BOLD, 12));
        label5.setBounds(100,270,200,20);
        add(label5);

        label6 = new JLabel("It would appear on ATM Card/Cheque Book and Statements");
        label6.setFont(new Font("Raleway", Font.BOLD, 12));
        label6.setBounds(330,270,500,20);
        add(label6);

        label7 = new JLabel("PIN:");
        label7.setFont(new Font("Raleway", Font.BOLD, 18));
        label7.setBounds(100,300,200,30);
        add(label7);

        label8 = new JLabel("XXXX");
        label8.setFont(new Font("Raleway", Font.BOLD, 18));
        label8.setBounds(330,300,200,30);
        add(label8);

        label9 = new JLabel("(4-digit password)");
        label9.setFont(new Font("Raleway", Font.BOLD, 12));
        label9.setBounds(100,330,200,20);
        add(label9);

        label10 = new JLabel("Services Required:");
        label10.setFont(new Font("Raleway", Font.BOLD, 18));
        label10.setBounds(100,370,200,30);
        add(label10);

        label11 = new JLabel("Form No:");
        label11.setFont(new Font("Raleway", Font.BOLD, 14));
        label11.setBounds(700,10,70,30);
        add(label11);

        label12 = new JLabel(formno);
        label12.setFont(new Font("Raleway", Font.BOLD, 14));
        label12.setBounds(770,10,40,30);
        add(label12);

        button1 = new JButton("Submit");
        button1.setFont(new Font("Raleway", Font.BOLD, 14));
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.WHITE);
        button1.setBounds(250,620,100,30);
        add(button1);

        button2 = new JButton("Cancel");
        button2.setFont(new Font("Raleway", Font.BOLD, 14));
        button2.setBackground(Color.BLACK);
        button2.setForeground(Color.WHITE);
        button2.setBounds(420,620,100,30);
        add(button2);

        button1.addActionListener(this);
        button2.addActionListener(this);


        cBox1 = new JCheckBox("ATM CARD");
        cBox1.setBackground(Color.WHITE);
        cBox1.setFont(new Font("Raleway", Font.BOLD, 16));
        cBox1.setBounds(100,420,200,30);
        add(cBox1);

        cBox2 = new JCheckBox("Internet Banking");
        cBox2.setBackground(Color.WHITE);
        cBox2.setFont(new Font("Raleway", Font.BOLD, 16));
        cBox2.setBounds(350,420,200,30);
        add(cBox2);

        cBox3 = new JCheckBox("Mobile Banking");
        cBox3.setBackground(Color.WHITE);
        cBox3.setFont(new Font("Raleway", Font.BOLD, 16));
        cBox3.setBounds(100,460,200,30);
        add(cBox3);

        cBox4 = new JCheckBox("EMAIL Alerts");
        cBox4.setBackground(Color.WHITE);
        cBox4.setFont(new Font("Raleway", Font.BOLD, 16));
        cBox4.setBounds(350,460,200,30);
        add(cBox4);

        cBox5 = new JCheckBox("Cheque Book");
        cBox5.setBackground(Color.WHITE);
        cBox5.setFont(new Font("Raleway", Font.BOLD, 16));
        cBox5.setBounds(100,500,200,30);
        add(cBox5);

        cBox6 = new JCheckBox("E-Statement");
        cBox6.setBackground(Color.WHITE);
        cBox6.setFont(new Font("Raleway", Font.BOLD, 16));
        cBox6.setBounds(350,500,200,30);
        add(cBox6);

        cBox7 = new JCheckBox("I hereby declares that the above entered details correct to th best of my knowledge.",true);
        cBox7.setBackground(Color.WHITE);
        cBox7.setFont(new Font("Raleway", Font.BOLD, 12));
        cBox7.setBounds(100,580,600,20);
        add(cBox7);
        getContentPane().setBackground(Color.WHITE);

        setSize(850,900);
        setLocation(300,10);
        setVisible(true);



    }

    public void actionPerformed(ActionEvent ae){
        String atype = null;
        if(rBotton1.isSelected()){
            atype = "Saving Account";
        }
        else if(rBotton2.isSelected()){
            atype = "Fixed Deposit Account";
        }
        else if(rBotton3.isSelected()){
            atype = "Current Account";
        }else if(rBotton4.isSelected()){
            atype = "Recurring Deposit Account";
        }

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 5040936000000000L;
        String cardno = "" + Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);

        String facility = "";
        if(cBox1.isSelected()){
            facility = facility + " ATM Card";
        }
        if(cBox2.isSelected()){
            facility = facility + " Internet Banking";
        }
        if(cBox3.isSelected()){
            facility = facility + " Mobile Banking";
        }
        if(cBox4.isSelected()){
            facility = facility + " EMAIL Alerts";
        }
        if(cBox5.isSelected()){
            facility = facility + " Cheque Book";
        }
        if(cBox6.isSelected()){
            facility = facility + " E-Statement";
        }

        try{
            if(ae.getSource()==button1){

                if(atype.equals("")){
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                }else{
                    Conn c1 = new Conn();
                    String q1 = "insert into signupthree values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+facility+"')";
                    String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    c1.s.executeUpdate(q1);
                    c1.s.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardno + "\n Pin:"+ pin);

                    //new Deposit(pin).setVisible(true);
                   // setVisible(false);
                }

            }else if(ae.getSource()==button2){
                System.exit(0);
            }

        }catch(Exception ex){
            ex.printStackTrace();
        }

    }

    public static void main(String[] args){

        new SignupThree("").setVisible(true);
    }

}
