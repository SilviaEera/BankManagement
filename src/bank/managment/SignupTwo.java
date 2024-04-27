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

    JTextField categoryfld, incomefld, qualificationfld, occupationfld, agefld, contactfld, bloodgrpfld, nationalityfld;
    JButton nxt;
    JComboBox religionfld, accountfld;
    JRadioButton unMarried, married, yes, no;
    JDateChooser dateChooser;

    SignupTwo() {
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

//        religionfld = new JTextField();
        religionfld.setBounds(230, 160, 500, 30);
        add(religionfld);

//        religionfld.setBorder(BorderFactory.createCompoundBorder(
//                religionfld.getBorder(),
//                BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        //category
        JLabel category = new JLabel("EDUCATION: ");
        category.setFont(new Font("Raleway", Font.BOLD, 16));
        category.setBounds(40, 210, 250, 40);
        add(category);

        categoryfld = new JTextField();
        categoryfld.setBounds(230, 210, 500, 30);
        add(categoryfld);

        categoryfld.setBorder(BorderFactory.createCompoundBorder(
                categoryfld.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        //income
        JLabel income = new JLabel("QUALIFICATION: ");
        income.setFont(new Font("Raleway", Font.BOLD, 16));
        income.setBounds(40, 260, 250, 40);
        add(income);

        incomefld = new JTextField();
        incomefld.setBounds(230, 260, 500, 30);
        add(incomefld);

        incomefld.setBorder(BorderFactory.createCompoundBorder(
                incomefld.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));

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
        JLabel education = new JLabel("EXISTING ACCOUNT: ");
        education.setFont(new Font("Raleway", Font.BOLD, 16));
        education.setBounds(40, 340, 250, 40);
        add(education);

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
        JLabel qualification = new JLabel("INCOME: ");
        qualification.setFont(new Font("Raleway", Font.BOLD, 16));
        qualification.setBounds(40, 380, 250, 40);
        add(qualification);

        qualificationfld = new JTextField();
        qualificationfld.setBounds(230, 380, 500, 30);
        add(qualificationfld);

        qualificationfld.setBorder(BorderFactory.createCompoundBorder(
                qualificationfld.getBorder(),
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

        //address
        JLabel account = new JLabel("ACCOUNT TYPE: ");
        account.setFont(new Font("Raleway", Font.BOLD, 16));
        account.setBounds(40, 460, 250, 40);
        add(account);
        
        String accTypeArr[] = {"Savings Account", "Salary Account", "Current Account", "Fixed Deposite Account"};
        accountfld = new JComboBox(accTypeArr);
        accountfld.setBackground(Color.white);
        accountfld.setBounds(230, 460, 500, 30);
        add(accountfld);

//        accountfld.setBorder(BorderFactory.createCompoundBorder(
//                accountfld.getBorder(),
//                BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        //city
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

        bloodgrpfld = new JTextField();
        bloodgrpfld.setBounds(230, 540, 500, 30);
        add(bloodgrpfld);

        bloodgrpfld.setBorder(BorderFactory.createCompoundBorder(
                bloodgrpfld.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));

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
//        String formNum = ""+randFormNum;
        String religion = String.valueOf(religionfld.getSelectedItem()); //getText() used to get the value from the textfields
        String category = categoryfld.getText();
        String income = incomefld.getText();
        String qualification = qualificationfld.getText();
        String occupation = occupationfld.getText();
        String age = agefld.getText();
        String contact = contactfld.getText();
        String acc = String.valueOf(accountfld.getSelectedItem());
        String bloodGrp = bloodgrpfld.getText();
        String nationality = nationalityfld.getText();
//        String dateOfBirth = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String accHave = null;
        if (yes.isSelected()) {
            accHave = "Yes";
        } else if (no.isSelected()) {
            accHave = "No";
        }

        try {
            if (religion.equals("")) {
                JOptionPane.showMessageDialog(null, "Please Enter Religion.");
            } else if (category.equals("")) {
                JOptionPane.showMessageDialog(null, "Please Enter Category.");
            } else if (income.equals("")) {
                JOptionPane.showMessageDialog(null, "Please Enter income.");
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
                String query = "insert into signup Values( '" + religion + "' , '" + category + "', '" + income + "', '" + occupation + "', '" + age + "', '" + qualification + "','" + acc + "' , '" + bloodGrp + "', '" + nationality + "','"+contact+"' , '" + accHave + "', '" + contact + "')";
                c.s.executeUpdate(query);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        new SignupTwo();
    }

}
