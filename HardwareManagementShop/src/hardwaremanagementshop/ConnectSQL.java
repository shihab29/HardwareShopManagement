/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hardwaremanagementshop;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Shatu
 */
public class ConnectSQL {
    public Connection getConnect(){
        Connection conn = null;
        
        try{
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=Youtube;user=Jitu;password=shatu";
            conn = DriverManager.getConnection(connectionURL);
           
        }catch (Exception e){
           
            System.out.println("Error: " + e.toString());
        }
        return conn;
    }
    //Connection Test
    /*public static void main(String[] args){
       ConnectSQL connect = new ConnectSQL();
       System.out.println("Connect" + connect.getConnect());
    }*/
}
