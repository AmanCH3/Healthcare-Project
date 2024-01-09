/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author Dell
 */
public class SQLConnection implements databaseConnection{

    @Override
    public Connection openConnection() {
         try{
            String username = "root";
            String password = "@#Sunshine111";
            String database = "healthproject"; // database name
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection;
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/" + database, username, password);
    
            if(connection == null){
                System.out.println("database connection fail");
            }
                else{
                System.out.print("Database conecction success");
            }
               return connection; 
            }catch (Exception e){
                System.out.println(e);
                return null;
            }
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void closeConnection(Connection conn) {
        try{
            if(conn != null && !conn.isClosed()){
                conn.close();
                System.out.print("Connection close");
            }
        
        }catch (Exception e){
            System.out.println(e);
        
     //   throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ResultSet runQuery(Connection conn, String query) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int executeUpdate(Connection conn, String query) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
