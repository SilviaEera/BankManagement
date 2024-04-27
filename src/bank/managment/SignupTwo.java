/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.managment;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.awt.event.ActionListener;

/**
 *
 * @author Eera
 */

public class SignupTwo extends JFrame implements ActionListener {
//    long randFormNum;

    JTextField edufld, incomefld, occupationfld, agefld, contactfld, nationalityfld;
    JButton nxt;
    JComboBox religionfld, accountfld, bloodgrpfld, qualificationfld;
    JRadioButton unMarried, married, yes, no;
    JDateChooser dateChooser;
    String formNum;

    SignupTwo(String formNum) {
        this.formNum = formNum;
        System.out.println(formNum);
        //additional details
        JLabel additionalDetails = new JLabel("Page 2 : Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 30));
        additionalDetails.setBounds(240, 40, 700, 40);
        add(additionalDetails);

        JTextPane textPane = new JTextPane();
        textPane.setContentType("text/html");
        textPane.setText("<html><hr size=2></html>");
        textPane.setBounds(60, 90, 700, 40);
        add(textPane);

        //religion
        JLabel religion = new JLabel("RELIGION: ");
        religion.setFont(new Font("Raleway", Font.BOLD, 16));
        religion.setBounds(40, 160, 250, 40);
        add(religion);
        
        String relArr[] = {"Muslim", "Hinduism", "Christianity", "Buddhism", "Other"};
        religionfld = new JComboBox(relArr);
        religionfld.setBackground(Color.white);

        religionfld.setBounds(230, 160, 500, 30);
        add(religionfld);
        
        
        JLabel edu = new JLabel("EDUCATION: ");
        edu.setFont(new Font("Raleway", Font.BOLD, 16));
        edu.setBounds(40, 210, 250, 40);
        add(edu);

        edufld = new JTextField();
        edufld.setBounds(230, 210, 500, 30);
        add(edufld);

        edufld.setBorder(BorderFactory.createCompoundBorder(
                edufld.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        //income
        JLabel qualification = new JLabel("QUALIFICATION: ");
        qualification.setFont(new Font("Raleway", Font.BOLD, 16));
        qualification.setBounds(40, 260, 250, 40);
        add(qualification);

        String qualificArr[] = {"None", "SSC", "HSC", "BSc", "MS", "PHD"};
        qualificationfld = new JComboBox(qualificArr);
        qualificationfld.setBackground(Color.white);
        qualificationfld.setBounds(230, 260, 500, 30);
        add(qualificationfld);


        //date of birth
        JLabel occupation = new JLabel("OCCUPATION: ");
        occupation.setFont(new Font("Raleway", Font.BOLD, 16));
        occupation.setBounds(40, 300, 250, 40);
        add(occupation);

        occupationfld = new JTextField();
        occupationfld.setBounds(230, 300, 500, 30);
        add(occupationfld);
        occupationfld.setBorder(BorderFactory.createCompoundBorder(
                occupationfld.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        //gender
        JLabel existingAcc = new JLabel("EXISTING ACCOUNT: ");
        existingAcc.setFont(new Font("Raleway", Font.BOLD, 16));
        existingAcc.setBounds(40, 340, 250, 40);
        add(existingAcc);

        yes = new JRadioButton("YES");
        yes.setBackground(Color.white);
        yes.setFont(new Font("raleway", Font.BOLD, 16));
        yes.setBounds(230, 340, 100, 40);
        add(yes);

        no = new JRadioButton("NO");
        no.setBackground(Color.white);
        no.setFont(new Font("raleway", Font.BOLD, 16));
        no.setBounds(450, 340, 100, 40);
        add(no);

        ButtonGroup existAccGroup = new ButtonGroup();
        existAccGroup.add(yes);
        existAccGroup.add(no);

        //email
        JLabel income = new JLabel("INCOME: ");
        income .setFont(new Font("Raleway", Font.BOLD, 16));
        income .setBounds(40, 380, 250, 40);
        add(income );

        incomefld = new JTextField();
        incomefld.setBounds(230, 380, 500, 30);
        add(incomefld);

        incomefld.setBorder(BorderFactory.createCompoundBorder(
                incomefld.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        //Marital Status
        JLabel age = new JLabel("AGE: ");
        age.setFont(new Font("Raleway", Font.BOLD, 16));
        age.setBounds(40, 420, 250, 40);
        add(age);

        agefld = new JTextField();
        agefld.setBounds(230, 420, 500, 30);
        add(agefld);

        agefld.setBorder(BorderFactory.createCompoundBorder(
                agefld.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        // account type
        JLabel account = new JLabel("ACCOUNT TYPE: ");
        account.setFont(new Font("Raleway", Font.BOLD, 16));
        account.setBounds(40, 460, 250, 40);
        add(account);
        
        String accTypeArr[] = {"Savings Account", "Salary Account", "Current Account", "Fixed Deposite Account"};
        accountfld = new JComboBox(accTypeArr);
        accountfld.setBackground(Color.white);
        accountfld.setBounds(230, 460, 500, 30);
        add(accountfld);
        
        //nationality
        JLabel nationality = new JLabel("NATIONALITY: ");
        nationality.setFont(new Font("Raleway", Font.BOLD, 16));
        nationality.setBounds(40, 500, 250, 40);
        add(nationality);

        nationalityfld = new JTextField();
        nationalityfld.setBounds(230, 500, 500, 30);
        add(nationalityfld);

        
        nationalityfld.setBorder(BorderFactory.createCompoundBorder(
                nationalityfld.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        //state
        JLabel bloodgrp = new JLabel("BLOOD GROUP: ");
        bloodgrp.setFont(new Font("Raleway", Font.BOLD, 16));
        bloodgrp.setBounds(40, 540, 250, 30);
        add(bloodgrp);
        
//        String [] = {};
        String bloodgrpArr[] = {"O+", "O-","A+", "A-", "B+", "B-" , "AB+", "AB-",};
        bloodgrpfld = new JComboBox(bloodgrpArr);
        bloodgrpfld.setBounds(230, 540, 500, 30);
        bloodgrpfld.setBackground(Color.white);
        add(bloodgrpfld);


        //pin 
        JLabel contact = new JLabel("CONTACT: ");
        contact.setFont(new Font("Raleway", Font.BOLD, 16));
        contact.setBounds(40, 580, 250, 30);
        add(contact);

        contactfld = new JTextField();
        contactfld.setBounds(230, 580, 500, 30);
        add(contactfld);

        contactfld.setBorder(BorderFactory.createCompoundBorder(
                contactfld.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        //button for next page
        nxt = new JButton("NEXT");
        nxt.setBackground(Color.black);
        nxt.setForeground(Color.white);
        nxt.addActionListener(this);
        nxt.setFont(new Font("Raleway", Font.BOLD, 16));
        nxt.setBounds(330, 630, 300, 50);
        add(nxt);

        setLayout(null);
        setTitle("New Account Application Form Page 2");
        setSize(850, 800);
        setLocation(550, 70);

        //setting BG color
        getContentPane().setBackground(Color.white);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String formNo = ""+ formNum;
        String religion = String.valueOf(religionfld.getSelectedItem());
        String education = edufld.getText();
        String income = incomefld.getText();
        String qualification = String.valueOf(qualificationfld.getSelectedItem());
        String occupation = occupationfld.getText();
        String age = agefld.getText();
        String contact = contactfld.getText();
        String acc = String.valueOf(accountfld.getSelectedItem());
        String bloodGrp = String.valueOf(bloodgrpfld.getSelectedItem());
        String nationality = nationalityfld.getText();
        String accHave = null;
        if (yes.isSelected()) {
            accHave = "Yes";
        } else if (no.isSelected()) {
            accHave = "No";
        }

        try {
            if (religion.equals("")) {
                JOptionPane.showMessageDialog(null, "Please Enter Religion.");
            } else if(accHave.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter if you have an exusting account or not");
            } else if (education.equals("")) {
                JOptionPane.showMessageDialog(null, "Please Enter education.");
            } else if(acc.equals("")){
             JOptionPane.showMessageDialog(null, "Select Account Type");
            } else if (qualification.equals("")) {
                JOptionPane.showMessageDialog(null, "Please Enter qualification ");
            } else if (occupation.equals("")) {
                JOptionPane.showMessageDialog(null, "Please Enter occupation.");
            } else if (age.equals("")) {
                JOptionPane.showMessageDialog(null, "Please Enter age.");
            } else if (bloodGrp.equals("")) {
                JOptionPane.showMessageDialog(null, "Please Enter Blood Group.");
            } else if (nationality.equals("")) {
                JOptionPane.showMessageDialog(null, "Please Enter nationality.");
            } else if(contact.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter contact.");
            }
            else {
                Conn c = new Conn();
                String query = "insert into signuptwo2 Values('"+formNo+"', '" +religion+ "' , '" + education+ "', '" + income + "', '" + occupation + "', '" + age + "', '" + qualification + "','" + acc + "' , '" + bloodGrp + "', '" + nationality + "','"+contact+"' , '" + accHave + "')";
                c.s.executeUpdate(query);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        new SignupTwo("");
    }

}
