/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankingmanagementsystem2;

import java.sql.*;  //1.importinng the packages

public class Conn {
    
    Connection c;   //4.Establishing connection using Connection class object
    Statement s;   //5.Create a statement
    
    public Conn(){
        try{
//            Class.forName(com.mysql.cj.jdbc.Driver);   //2.loading the drivers jdbc(java database connection
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "123456789");   //3.registering the drivers using driver manager
            s = c.createStatement();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
