/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;


import Database.Database;
import Models.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author khopi
 */
public class EmployeeController {
    
    Database db;
    Connection con;
    PreparedStatement pst;
    
    public EmployeeController() {
        super();
        db = new Database();
        con = db.getConnection();
    }
    
//    public int createAccount(Employee e) {
//        int res = 0;
//        String sql = "";
//        
//        try {
//            sql = "INSERT INTO employee(`EMP_ID`,`FULL_NAME`,`EMAIL`,`PASSWD`) VALUES(NULL, ?, ?, ?)";
//            pst = con.prepareStatement(sql);
//            
//            pst.setString(1, e.getFull_name());
//            pst.setString(2, e.getEmail());
//            pst.setString(3, e.getPasswd());
//            
//            res = pst.executeUpdate();
//            
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//        
//        return res;
//    }
    
    public boolean checkLogin(Employee e) {
        
        String sql = "";
        ResultSet rs = null;
        
        try {
            sql = "SELECT * FROM employee WHERE FULL_NAME = ? and PASSWD = ?";
            pst = con.prepareStatement(sql);
            
            pst.setString(1, e.getFull_name());
            pst.setString(2, e.getPasswd());
            
            rs = pst.executeQuery();
            
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
            
            
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        return false;
    }
    
    
    
    
    
    
    public int insertWorkedTime(Employee e) {
        
        String sql = "";
        int res = 0;
        
        try {
            sql = "INSERT INTO worked_time(`MONTH_ID`,`WORKED_MONTH`,`WORKED_YEAR`,`WORKED_HOURS`,`FULL_NAME`) VALUES(NULL,?,?,?,?)";
            pst = con.prepareStatement(sql);
            
            pst.setString(1, e.getMonth());
            pst.setString(2, e.getYear());
            pst.setDouble(3, e.getFullyWorkedTime());
            pst.setString(4, e.getFull_name());
            
            
             res = pst.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return res;
    }
    
    
    
    
    
    
    
    
}
