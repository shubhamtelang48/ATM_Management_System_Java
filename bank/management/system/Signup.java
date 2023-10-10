package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;

public class Signup extends JFrame implements ActionListener{

    JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,label15;
    JTextField text3,text4,text7,text9,text10,text11,text12;
    JRadioButton rBotton1,rBotton2,rBotton3,rBotton4,rBotton5;
    JButton button1;
    JDateChooser dateChooser;


    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = "" + Math.abs(first4);

    Signup(){

        setTitle("NEW ACCOUNT APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(20, 0, 100, 100);
        add(l11);

        label1 = new JLabel("APPLICATION FORM NO. "+first);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        setLayout(null);
        label1.setBounds(140,20,600,40);
        add(label1);

        label2 = new JLabel("Page 1: Personal Details");
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        label2.setBounds(290,80,600,30);
        add(label2);

        label3 = new JLabel("Name:");
        label3.setFont(new Font("Raleway", Font.BOLD, 20));
        label3.setBounds(100,140,100,30);
        add(label3);
        text3 = new JTextField();
        text3.setFont(new Font("Raleway", Font.BOLD, 14));
        text3.setBounds(300,140,400,30);
        add(text3);

        label4 = new JLabel("Father's Name:");
        label4.setFont(new Font("Raleway", Font.BOLD, 20));
        label4.setBounds(100,190,200,30);
        add(label4);
        text4 = new JTextField();
        text4.setFont(new Font("Raleway", Font.BOLD, 14));
        text4.setBounds(300,190,400,30);
        add(text4);

        label5 = new JLabel("Date of Birth:");
        label5.setFont(new Font("Raleway", Font.BOLD, 20));
        label5.setBounds(100,240,200,30);
        add(label5);

        dateChooser = new JDateChooser();
        //dateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 240, 200, 30);
        add(dateChooser);

        label6 = new JLabel("Gender:");
        label6.setFont(new Font("Raleway", Font.BOLD, 20));
        label6.setBounds(100,290,200,30);
        add(label6);

        rBotton1 = new JRadioButton("Male");
        rBotton1.setFont(new Font("Raleway", Font.BOLD, 14));
        rBotton1.setBackground(Color.WHITE);
        rBotton1.setBounds(300,290,60,30);
        add(rBotton1);

        rBotton2 = new JRadioButton("Female");
        rBotton2.setFont(new Font("Raleway", Font.BOLD, 14));
        rBotton2.setBackground(Color.WHITE);
        rBotton2.setBounds(450,290,90,30);
        add(rBotton2);

        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(rBotton1);
        groupgender.add(rBotton2);

        label7 = new JLabel("Email Address:");
        label7.setFont(new Font("Raleway", Font.BOLD, 20));
        label7.setBounds(100,340,200,30);
        add(label7);
        text7 = new JTextField();
        text7.setFont(new Font("Raleway", Font.BOLD, 14));
        text7.setBounds(300,340,400,30);
        add(text7);

        label8 = new JLabel("Marital Status:");
        label8.setFont(new Font("Raleway", Font.BOLD, 20));
        label8.setBounds(100,390,200,30);
        add(label8);

        rBotton3 = new JRadioButton("Married");
        rBotton3.setFont(new Font("Raleway", Font.BOLD, 14));
        rBotton3.setBackground(Color.WHITE);
        rBotton3.setBounds(300,390,100,30);
        add(rBotton3);

        rBotton4 = new JRadioButton("Unmarried");
        rBotton4.setFont(new Font("Raleway", Font.BOLD, 14));
        rBotton4.setBackground(Color.WHITE);
        rBotton4.setBounds(450,390,100,30);
        add(rBotton4);

        rBotton5 = new JRadioButton("Other");
        rBotton5.setFont(new Font("Raleway", Font.BOLD, 14));
        rBotton5.setBackground(Color.WHITE);
        rBotton5.setBounds(635,390,100,30);
        add(rBotton5);

        ButtonGroup groupstatus = new ButtonGroup();
        groupstatus.add(rBotton3);
        groupstatus.add(rBotton4);
        groupstatus.add(rBotton5);

        label9 = new JLabel("Address:");
        label9.setFont(new Font("Raleway", Font.BOLD, 20));
        label9.setBounds(100,440,200,30);
        add(label9);
        text9 = new JTextField();
        text9.setFont(new Font("Raleway", Font.BOLD, 14));
        text9.setBounds(300,440,400,30);
        add(text9);

        label10 = new JLabel("City:");
        label10.setFont(new Font("Raleway", Font.BOLD, 20));
        label10.setBounds(100,490,200,30);
        add(label10);
        text10 = new JTextField();
        text10.setFont(new Font("Raleway", Font.BOLD, 14));
        text10.setBounds(300,490,400,30);
        add(text10);

        label11 = new JLabel("Pin Code:");
        label11.setFont(new Font("Raleway", Font.BOLD, 20));
        label11.setBounds(100,540,200,30);
        add(label11);
        text11 = new JTextField();
        text11.setFont(new Font("Raleway", Font.BOLD, 14));
        text11.setBounds(300,540,400,30);
        add(text11);

        label12 = new JLabel("State:");
        label12.setFont(new Font("Raleway", Font.BOLD, 20));
        label12.setBounds(100,590,200,30);
        add(label12);
        text12 = new JTextField();
        text12.setFont(new Font("Raleway", Font.BOLD, 14));
        text12.setBounds(300,590,400,30);
        add(text12);

        label13 = new JLabel("Date");
        label13.setFont(new Font("Raleway", Font.BOLD, 14));


        label14 = new JLabel("Month");
        label14.setFont(new Font("Raleway", Font.BOLD, 14));

        label15 = new JLabel("Year");
        label15.setFont(new Font("Raleway", Font.BOLD, 14));


        button1 = new JButton("Next");
        button1.setFont(new Font("Raleway", Font.BOLD, 14));
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.WHITE);

        button1.setBounds(620,660,80,30);
        add(button1);

        button1.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        setSize(850,800);
        setLocation(300,0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){

        String formno = first;
        String name = text3.getText();
        String fname = text4.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(rBotton1.isSelected()){
            gender = "Male";
        }else if(rBotton2.isSelected()){
            gender = "Female";
        }

        String email = text7.getText();
        String marital = null;
        if(rBotton3.isSelected()){
            marital = "Married";
        }else if(rBotton4.isSelected()){
            marital = "Unmarried";
        }else if(rBotton5.isSelected()){
            marital = "Other";
        }

        String address = text9.getText();
        String city = text10.getText();
        String pincode = text11.getText();
        String state = text12.getText();


        try{

            if(text3.getText().equals("") || text4.getText().equals("") || text7.getText().equals("") ||
                    text9.getText().equals("") || text10.getText().equals("") || text11.getText().equals("") || text12.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }else{
                Conn c1 = new Conn();
                String q1 = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                c1.s.executeUpdate(q1);

                new SignupTwo(first).setVisible(true);
                setVisible(false);
            }

        }catch(Exception e){
            e.printStackTrace();
        }

    }


    public static void main(String[] args){

        new Signup().setVisible(true);
    }
}
