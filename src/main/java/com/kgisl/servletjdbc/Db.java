package com.kgisl.servletjdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

/**
 * Db
 */
public class Db {

    public static void main(String args[])
    {
    try{  
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:9090/sonoo", "root",
                    "root");
        //here sonoo is database name, root is username and password  
        Statement stmt= (Statement) con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from emp");  
        while(rs.next())  
        System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
        con.close();  
        }catch(Exception e)
        { 
            System.out.println(e);
        }  
        }  
        }  
