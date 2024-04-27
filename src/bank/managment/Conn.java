/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.managment;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager; 

/**
 *
 * @author Eera
 */
public class Conn {

    Connection c;
    Statement s;

    public Conn() {
        try {
//            Class.forName(com.mysql.cj.jdbc.Driver);
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagment", "root", "Pi3.14159");
            s = c.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
