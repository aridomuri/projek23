/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projek;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class Koneksi {
    private static Connection mysqlkonek;
    public static Connection koneksiDB()throws SQLException{
        if(mysqlkonek==null){
            try{
                String DB = "jdbc:mysql:3306/dbdata";
                String user= "root";
                String pass = "";
                mysqlkonek=(Connection) DriverManager.getConnection(DB,user,pass);
            
            }catch (Exception e){
                
            }
        }return mysqlkonek;
    }
}
