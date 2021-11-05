/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author lephu
 */
public class Employee {
    private int employeeid;
    private String firstname;
    private String lastname;
    private String title;
    private String titleOfCourtesy;
    private Date dob;
    private int reportto;

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleOfCourtesy() {
        return titleOfCourtesy;
    }

    public void setTitleOfCourtesy(String titleOfCourtesy) {
        this.titleOfCourtesy = titleOfCourtesy;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getReportto() {
        return reportto;
    }

    public void setReportto(int reportto) {
        this.reportto = reportto;
    }

    public Employee(int employeeid, String firstname, String lastname, String title, String titleOfCourtesy, Date dob, int reportto) {
        this.employeeid = employeeid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.title = title;
        this.titleOfCourtesy = titleOfCourtesy;
        this.dob = dob;
        this.reportto = reportto;
    }

    public Employee(int employeeid, String firstname, String lastname) {
        this.employeeid = employeeid;
        this.firstname = firstname;
        this.lastname = lastname;
    }
    
    
}
