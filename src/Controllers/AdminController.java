/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Database.Database;
import Models.Admin;
import Models.Employee;
import Views.adminView;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
//import net.proteanit.sql.DbUtils;

/**
 *
 * @author khopi
 */
public class AdminController {
    
    
    Database db;
    Connection con;
    PreparedStatement pst;
    
    
    //static ArrayList<String[]> results;
    
    public AdminController() {
        super();
        db = new Database();
        con = db.getConnection();
    }
    
    public int createAccount(Employee e) {
        int res = 0;
        String sql = "";
        
        try {
            sql = "INSERT INTO employee(`EMP_ID`,`FULL_NAME`,`EMAIL`,`PASSWD`) VALUES(NULL, ?, ?, ?)";
            pst = con.prepareStatement(sql);
            
            pst.setString(1, e.getFull_name());
            pst.setString(2, e.getEmail());
            pst.setString(3, e.getPasswd());
            
            res = pst.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return res;
    }
    
    
    public boolean checkLogin(Admin a) {
        
        String sql = "";
        ResultSet rs = null;
        
        try {
            sql = "SELECT * FROM employee WHERE FULL_NAME = ? and PASSWD = ?";
            pst = con.prepareStatement(sql);
            
            pst.setString(1, a.getFull_name());
            pst.setString(2, a.getPasswd());
            
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

    public int addRatings(Admin a) {
       
        int res = 0;
        String sql = "";
        
        try {
            sql = "INSERT INTO monthlyrate(`RATE_ID`,`FULL_NAME`,`MONTH`,`YEAR`,`RATE`) VALUES(NULL, ?, ?, ?,?)";
            pst = con.prepareStatement(sql);
            
            pst.setString(1, a.getRateName());
            pst.setString(2, a.getRateMonth());
            pst.setString(3, a.getRateYear());
            pst.setString(4, Integer.toString(a.getRatings()));
            
            res = pst.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return res;
        
    }
    

    
}
