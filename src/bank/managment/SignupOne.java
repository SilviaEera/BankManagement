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

 
public class SignupOne extends JFrame implements ActionListener{
    long randFormNum;
    JTextField namefld, fatherNamefld, motherNamefld,emailfld, pinfld,addressfld, statefld, cityfld;
    JButton nxt;
    JRadioButton unMarried, married, others, female, male;
    JDateChooser dateChooser;

    SignupOne() {
        
        
        //generating unique form number 
        
//        UUID uniformNum = UUID.randomUUID();
//        System.err.println(uniformNum);

        Random uniFormNum = new Random();
       
        randFormNum = Math.abs(uniFormNum.nextLong() % 9000L) + 1000L;
        JLabel applicationNum = new JLabel("APPLICATION FORM NUMBER. " + randFormNum);
        applicationNum.setFont(new Font("Raleway", Font.BOLD, 30));
        applicationNum.setBounds(140, 40, 700, 40);
        add(applicationNum);
        
        
        //applicants details
        JLabel applicantdetailFld = new JLabel("APPLICANTS DETAILS");
        applicantdetailFld.setFont(new Font("Raleway", Font.BOLD, 20));
        applicantdetailFld.setBounds(300, 90, 700, 40);
        add(applicantdetailFld);
        
        
        JTextPane textPane = new JTextPane();
        textPane.setContentType("text/html");
        textPane.setText("<html><hr size=2></html>");
        textPane.setBounds(60, 120, 700, 40);
        add(textPane);
        
        
        //applicants name
        JLabel name = new JLabel("NAME: ");
        name.setFont(new Font("Raleway", Font.BOLD, 16));
        name.setBounds(40, 160, 250, 40);
        add(name);
        
       namefld = new JTextField();
        namefld.setBounds(230, 160, 500, 30 );
        add(namefld);
        
        namefld.setBorder(BorderFactory.createCompoundBorder(
        namefld.getBorder(), 
        BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        
        //fathers name
        JLabel fatherName = new JLabel("FATHER'S NAME: ");
        fatherName.setFont(new Font("Raleway", Font.BOLD, 16));
        fatherName.setBounds(40, 210, 250, 40);
        add(fatherName);
        
        fatherNamefld = new JTextField();
        fatherNamefld.setBounds(230, 210, 500, 30 );
        add(fatherNamefld);
        
        fatherNamefld.setBorder(BorderFactory.createCompoundBorder(
        fatherNamefld.getBorder(), 
        BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        
        //mothers name
        JLabel motherName = new JLabel("MOTHER'S NAME: ");
        motherName.setFont(new Font("Raleway", Font.BOLD, 16));
        motherName.setBounds(40, 260, 250, 40);
        add(motherName);
        
        motherNamefld = new JTextField();
        motherNamefld.setBounds(230, 260, 500, 30 );
        add(motherNamefld);
        
        motherNamefld.setBorder(BorderFactory.createCompoundBorder(
        motherNamefld.getBorder(), 
        BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        
        //date of birth
        JLabel dateOfBirth = new JLabel("DATE OF BIRTH: ");
        dateOfBirth.setFont(new Font("Raleway", Font.BOLD, 16));
        dateOfBirth.setBounds(40, 300, 250, 40);
        add(dateOfBirth);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(230, 300, 495, 40);
        add(dateChooser);
        
        dateChooser.setBorder(BorderFactory.createCompoundBorder(
        dateChooser.getBorder(), 
        BorderFactory.createEmptyBorder()));
        
        //gender
        JLabel gender = new JLabel("GENDER: ");
        gender.setFont(new Font("Raleway", Font.BOLD, 16));
        gender.setBounds(40, 340, 250, 40);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBackground(Color.white);
        male.setFont(new Font("raleway", Font.BOLD, 16));
        male.setBounds(230, 340, 100, 40);
        add(male);
        
        
        female = new JRadioButton("Female");
        female.setBackground(Color.white);
        female.setFont(new Font("raleway", Font.BOLD, 16));
        female.setBounds(350, 340, 100, 40);
        add(female);
        
        others = new JRadioButton("Others");
        others.setBackground(Color.white);
        others.setFont(new Font("raleway", Font.BOLD, 16));
        others.setBounds(500, 340, 100, 40);
        add(others);
        
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(others);
        
        //email
        JLabel email = new JLabel("EMAIL ADDRESS: ");
        email.setFont(new Font("Raleway", Font.BOLD, 16));
        email.setBounds(40, 380, 250, 40);
        add(email);
        
        emailfld = new JTextField();
        emailfld.setBounds(230, 380, 500, 30 );
        add(emailfld);
        
        emailfld.setBorder(BorderFactory.createCompoundBorder(
        emailfld.getBorder(), 
        BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        
        //Marital Status
        JLabel maritalStatus = new JLabel("MARITAL STATUS: ");
        maritalStatus.setFont(new Font("Raleway", Font.BOLD, 16));
        maritalStatus.setBounds(40, 420, 250, 40);
        add(maritalStatus);
        
        
        married = new JRadioButton("Married");
        married.setBackground(Color.white);
        married.setFont(new Font("raleway", Font.BOLD, 16));
        married.setBounds(230, 420, 250, 40);
        add(married);
        
        
        unMarried = new JRadioButton("Unmarried");
        unMarried.setBackground(Color.white);
        unMarried.setFont(new Font("raleway", Font.BOLD, 16));
        unMarried.setBounds(500, 420, 250, 40);
        add(unMarried);
        
        ButtonGroup marriageGroup = new ButtonGroup();
        marriageGroup .add(married);
        marriageGroup .add(unMarried);
        
        
        //address
        JLabel address = new JLabel("ADDRESS: ");
        address.setFont(new Font("Raleway", Font.BOLD, 16));
        address.setBounds(40, 460, 250, 40);
        add(address);
        
          addressfld = new JTextField();
        addressfld.setBounds(230, 460, 500, 30 );
        add(addressfld);
        
        addressfld.setBorder(BorderFactory.createCompoundBorder(
        addressfld.getBorder(), 
        BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        
        //city
        JLabel city = new JLabel("CITY: ");
        city.setFont(new Font("Raleway", Font.BOLD, 16));
        city.setBounds(40, 500, 250, 40);
        add(city);
        
         cityfld = new JTextField();
        cityfld.setBounds(230, 500, 500, 30 );
        add(cityfld);
        
        cityfld.setBorder(BorderFactory.createCompoundBorder(
        cityfld.getBorder(), 
        BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        
        //state
        JLabel state = new JLabel("STATE: ");
        state.setFont(new Font("Raleway", Font.BOLD, 16));
        state.setBounds(40, 540, 250, 30);
        add(state);
        
       statefld = new JTextField();
        statefld.setBounds(230, 540, 500, 30 );
        add(statefld);
        
        statefld.setBorder(BorderFactory.createCompoundBorder(
        statefld.getBorder(), 
        BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        
        //pin 
        JLabel pin = new JLabel("PIN CODE: ");
        pin.setFont(new Font("Raleway", Font.BOLD, 16));
        pin.setBounds(40, 580, 250, 30);
        add(pin);
        
        pinfld = new JTextField();
        pinfld.setBounds(230, 580, 500, 30);
        add(pinfld);
        
        pinfld.setBorder(BorderFactory.createCompoundBorder(
        pinfld.getBorder(), 
        BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        
        
        //button for next page
        
        nxt = new JButton("NEXT");
        nxt.setBackground(Color.black);
        nxt.setForeground(Color.white);
        nxt.addActionListener(this);
        nxt.setFont(new Font("Raleway",Font.BOLD, 16));
        nxt.setBounds(330, 630, 300, 50);
        add(nxt);
        
        
        
        setLayout(null);
                setTitle("New Account Application Form Page 1");
        setSize(850, 800);
        setLocation(550, 70);
        
        //setting BG color
        getContentPane().setBackground(Color.white);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        String formNum = ""+randFormNum;
        String name = namefld.getText(); //getText() used to get the value from the textfields
        String fatherName = fatherNamefld.getText();
        String motherName = motherNamefld.getText();
        String email = emailfld.getText();
        String pin = pinfld.getText();
        String address = addressfld.getText();
        String state = statefld.getText();
        String city = cityfld.getText();
        String dateOfBirth = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        } else if(female.isSelected()){
            gender = "Female";
        } else if(others.isSelected()){
            gender = "Others";
        }
        
        String maritalStat = null;
        if(married.isSelected()){
            maritalStat = "Married";
        } else if(unMarried.isSelected()){
            maritalStat = "Unmarried";
        }
        
        try {
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter Name.");
            }
            
           else if(fatherName.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter Father's Name.");
            }
            
            else if(motherName.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter Mother's Name.");
            }
            
            else if(email.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter email ");
            }
             
            else  if(pin.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter pin.");
            } 
              else if(address.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter address.");
            }
               
             else if(state.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter State Name.");
            }
              
              else if(city.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter City Name.");
            }
               
               else if(dateOfBirth.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter Date Of Birth.");
            } else{
                   Conn c = new Conn();
                   String query = "insert into signup Values('"+formNum+"' , '"+name+"' , '"+fatherName+"', '"+motherName+"', '"+email+"', '"+address+"', '"+pin+"', '"+state+"', '"+city+"', '"+dateOfBirth+"', '"+gender+"', '"+maritalStat+"')";
                   c.s.executeUpdate(query);
               }
            
        } catch ( Exception e){
            System.out.println(e);
        }
        
    }
    
    public static void main(String[] args) {
        new SignupOne();
    }

    
}

        
