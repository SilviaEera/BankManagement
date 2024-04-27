/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.managment;

/**
 *
 * @author Eera
 */

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;
public class Login extends JFrame implements ActionListener{
    
    //globally defining buttons/textFields to use outside constractor 
    JButton signUp, signIn, clear;
    JTextField txtfld;
    JPasswordField passfld;
    //constractor
    Login(){
        
        //page title
        setTitle("Login To LuckyCat Banking System");
        
        //page layout
        setLayout(null);
        
        //icon placemnt
        ImageIcon cat = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png")); 
        JLabel leb1 = new JLabel(cat);
        add(leb1);
        leb1.setBounds(50, 10, 100, 100);
        
        
        
        JLabel txt = new JLabel("Welcome To LBS");
        txt.setFont(new Font("Osward", Font.BOLD, 40));
        txt.setBounds(150, 10, 400, 100);
        add(txt);
        
        //account number field
        JLabel accNo = new JLabel("ACCOUNT NO: ");
        accNo.setFont(new Font("Raleway", Font.BOLD, 18));
        accNo.setBounds(80, 120, 140, 100);
        add(accNo);
        
        txtfld = new JTextField();
        txtfld.setBounds(240, 150, 300, 50);
        txtfld.setFont(new Font("Raleway",Font.BOLD, 20));
        txtfld.setBorder(BorderFactory.createCompoundBorder(
        txtfld.getBorder(), 
        BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        add(txtfld);
        
        //password field
        JLabel pass = new JLabel("ACCOUNT PIN: ");
        pass.setFont(new Font("Raleway", Font.BOLD,18));
        pass.setBounds(80, 200, 140, 100);
        add(pass);
        
        passfld = new JPasswordField();
        passfld.setBounds(240, 230, 300, 50);
        passfld.setFont(new Font("Raleway",Font.BOLD, 20));
        passfld.setEchoChar('*');
        passfld.setBorder(BorderFactory.createCompoundBorder(
        passfld.getBorder(), 
        BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        add(passfld);
        
        //buttons 
         signIn = new JButton("SIGN IN");
        signIn.setBounds(240, 300, 120, 40);
        signIn.setFont(new Font("Raleway",Font.BOLD, 16));
        signIn.setBackground(Color.BLACK);
        signIn.setForeground(Color.WHITE);
        //adding action listener
        signIn.addActionListener(this);
        add(signIn);
        
        clear = new JButton("CLEAR");
        clear.setBounds(420, 300, 120, 40);
        clear.setFont(new Font("Raleway",Font.BOLD, 16));
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        //adding action listener
        clear.addActionListener(this);
        add(clear);
        
         signUp = new JButton("SIGN UP");
         signUp.setFont(new Font("Raleway",Font.BOLD, 16));
        signUp.setBounds(240, 360, 300, 40);
        signUp.setBackground(Color.BLACK);
        signUp.setForeground(Color.WHITE);
        //adding action listener
        signUp.addActionListener(this);
        add(signUp);
        
        
        
        //login window size        
        setSize(700,500);
        setVisible(true);
        
        //setting BG color
        getContentPane().setBackground(Color.white);
        
        //login window location on screen
        setLocation(550,300);
    }
    
    /**
     *
     * @param ae
     */
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== clear){
            txtfld.setText("");
            passfld.setText("");
        } else if(ae.getSource()== signIn){
            
        }else if(ae.getSource()== signUp){
            setVisible(false);
            new SignupOne().setVisible(true);
        }
        
    }
    public static void main(String args[]){
        new Login();
    }
}
