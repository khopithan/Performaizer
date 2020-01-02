/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author khopi
 */
public class Employee {
    
    private int emp_id;
    private String full_name;
    private String email;
    private String passwd;
    
    
    private String month;
    private String year;
    private double fullyWorkedTime;
    
    
   

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    
    
    
    
    
    

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getFullyWorkedTime() {
        return fullyWorkedTime;
    }

    public void setFullyWorkedTime(double fullyWorkedTime) {
        this.fullyWorkedTime = fullyWorkedTime;
    }
    
    
    
    
    
    
}
