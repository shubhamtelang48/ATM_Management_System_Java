package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class SignupTwo extends JFrame implements ActionListener{

    JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13;
    JButton button1;
    JRadioButton rBotton1,rBotton2,rBotton3,rBotton4;
    JTextField text7,text8,t3;
    JComboBox cBox1,cBox2,cBox3,cBox4,cBox5;
    String formno;
    SignupTwo(String formno){
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(150, 0, 100, 100);
        add(l14);


        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        label1 = new JLabel("Page 2: Additonal Details");
        label1.setFont(new Font("Raleway", Font.BOLD, 22));
        label1.setBounds(280,30,600,40);
        add(label1);

        label2 = new JLabel("Religion:");
        label2.setFont(new Font("Raleway", Font.BOLD, 18));
        label2.setBounds(100,120,100,30);
        add(label2);

        String religion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        cBox1 = new JComboBox(religion);
        cBox1.setBackground(Color.WHITE);
        cBox1.setFont(new Font("Raleway", Font.BOLD, 14));
        cBox1.setBounds(350,120,320,30);
        add(cBox1);

        label3 = new JLabel("Category:");
        label3.setFont(new Font("Raleway", Font.BOLD, 18));
        label3.setBounds(100,170,100,30);
        add(label3);

        String category[] = {"General","OBC","SC","ST","Other"};
        cBox2 = new JComboBox(category);
        cBox2.setBackground(Color.WHITE);
        cBox2.setFont(new Font("Raleway", Font.BOLD, 14));
        cBox2.setBounds(350,170,320,30);
        add(cBox2);

        label4 = new JLabel("Income:");
        label4.setFont(new Font("Raleway", Font.BOLD, 18));
        label4.setBounds(100,220,100,30);
        add(label4);

        String income[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        cBox3 = new JComboBox(income);
        cBox3.setBackground(Color.WHITE);
        cBox3.setFont(new Font("Raleway", Font.BOLD, 14));
        cBox3.setBounds(350,220,320,30);
        add(cBox3);

        label5 = new JLabel("Educational");
        label5.setFont(new Font("Raleway", Font.BOLD, 18));
        label5.setBounds(100,270,150,30);
        add(label5);
        String education[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        cBox4 = new JComboBox(education);
        cBox4.setBackground(Color.WHITE);
        cBox4.setFont(new Font("Raleway", Font.BOLD, 14));
        cBox4.setBounds(350,270,320,30);
        add(cBox4);

        label11 = new JLabel("Qualification:");
        label11.setFont(new Font("Raleway", Font.BOLD, 18));
        label11.setBounds(100,290,150,30);
        add(label11);

        label6 = new JLabel("Occupation:");
        label6.setFont(new Font("Raleway", Font.BOLD, 18));
        label6.setBounds(100,340,150,30);
        add(label6);
        String occupation[] = {"Salaried","Self-Employmed","Business","Student","Retired","Others"};
        cBox5 = new JComboBox(occupation);
        cBox5.setBackground(Color.WHITE);
        cBox5.setFont(new Font("Raleway", Font.BOLD, 14));
        cBox5.setBounds(350,340,320,30);
        add(cBox5);

        label7 = new JLabel("PAN Number:");
        label7.setFont(new Font("Raleway", Font.BOLD, 18));
        label7.setBounds(100,390,150,30);
        add(label7);
        text7 = new JTextField();
        text7.setFont(new Font("Raleway", Font.BOLD, 14));
        text7.setBounds(350,390,320,30);
        add(text7);

        label8 = new JLabel("Aadhar Number:");
        label8.setFont(new Font("Raleway", Font.BOLD, 18));
        label8.setBounds(100,440,180,30);
        add(label8);
        text8 = new JTextField();
        text8.setFont(new Font("Raleway", Font.BOLD, 14));
        text8.setBounds(350,440,320,30);
        add(text8);

        label9 = new JLabel("Senior Citizen:");
        label9.setFont(new Font("Raleway", Font.BOLD, 18));
        label9.setBounds(100,490,150,30);
        add(label9);

        rBotton1 = new JRadioButton("Yes");
        rBotton1.setFont(new Font("Raleway", Font.BOLD, 14));
        rBotton1.setBackground(Color.WHITE);
        rBotton1.setBounds(350,490,100,30);
        add(rBotton1);

        rBotton2 = new JRadioButton("No");
        rBotton2.setFont(new Font("Raleway", Font.BOLD, 14));
        rBotton2.setBackground(Color.WHITE);
        rBotton2.setBounds(460,490,100,30);
        add(rBotton2);

        label10 = new JLabel("Existing Account:");
        label10.setFont(new Font("Raleway", Font.BOLD, 18));
        label10.setBounds(100,540,180,30);
        add(label10);

        rBotton3 = new JRadioButton("Yes");
        rBotton3.setFont(new Font("Raleway", Font.BOLD, 14));
        rBotton3.setBackground(Color.WHITE);
        rBotton3.setBounds(350,540,100,30);
        add(rBotton3);

        rBotton4 = new JRadioButton("No");
        rBotton4.setFont(new Font("Raleway", Font.BOLD, 14));
        rBotton4.setBackground(Color.WHITE);
        rBotton4.setBounds(460,540,100,30);
        add(rBotton4);

        label12 = new JLabel("Form No:");
        label12.setFont(new Font("Raleway", Font.BOLD, 13));
        label12.setBounds(700,10,60,30);
        add(label12);

        label13 = new JLabel(formno);
        label13.setFont(new Font("Raleway", Font.BOLD, 13));
        label13.setBounds(760,10,60,30);
        add(label13);

        button1 = new JButton("Next");
        button1.setFont(new Font("Raleway", Font.BOLD, 14));
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.WHITE);

        button1.setBounds(570,640,100,30);
        add(button1);
        button1.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        setSize(850,750);
        setLocation(300,20);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        String religion = (String)cBox1.getSelectedItem();
        String category = (String)cBox2.getSelectedItem();
        String income = (String)cBox3.getSelectedItem();
        String education = (String)cBox4.getSelectedItem();
        String occupation = (String)cBox5.getSelectedItem();

        String pan = text7.getText();
        String aadhar = text8.getText();

        String scitizen = "";
        if(rBotton1.isSelected()){
            scitizen = "Yes";
        }
        else if(rBotton2.isSelected()){
            scitizen = "No";
        }

        String eaccount = "";
        if(rBotton3.isSelected()){
            eaccount = "Yes";
        }else if(rBotton4.isSelected()){
            eaccount = "No";
        }

        try{
            if(text7.getText().equals("") || text8.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }else{
                Conn c1 = new Conn();
                String q1 = "insert into signup2 values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eaccount+"')";
                c1.s.executeUpdate(q1);

                new SignupThree(formno).setVisible(true);
                setVisible(false);
            }



        }catch(Exception ex){
            ex.printStackTrace();
        }


    }


    public static void main(String[] args){
        new SignupTwo("").setVisible(true);
    }
}
