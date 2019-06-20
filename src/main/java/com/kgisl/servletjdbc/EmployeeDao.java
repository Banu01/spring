package com.kgisl.servletjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 * EmployeeDao dao
 */
/**
 * EmployeeDao
 */
public class EmployeeDao {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Employee no");
        int eno= s.nextInt();
        System.out.println("Enter the Employee name");
        String ename=s.next();
        System.out.println("Enter the Employee mobile");
        String emob=s.next();
        System.out.println("Enter the Employee mail");
        String eemail=s.next();
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/newdb","root","");  
              
            PreparedStatement ps=con.prepareStatement(  
            "insert into demo values(?,?,?,?)");  
              
            ps.setInt(1,eno);  
            ps.setString(2,ename);  
            ps.setString(3,emob);  
            ps.setString(4,eemail);  
                      
            int i=ps.executeUpdate();  
            if(i>0) { 
           System. out.print("You are successfully registered...");  
            }
                      
            }
            catch (Exception e2)
             {
                 System.out.println(e2);
                }  
                    
            
            }  
              
            
    }