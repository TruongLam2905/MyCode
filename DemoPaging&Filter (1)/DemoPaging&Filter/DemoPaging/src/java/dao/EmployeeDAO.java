/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Employee;

/**
 *
 * @author lephu
 */
public class EmployeeDAO extends DBContext{
    
    public ArrayList<Employee> getAllEmployees(int start, int size) throws SQLException
    {
        ArrayList<Employee> list;        
        String sql = "select EmployeeID, FirstName, LastName\n" +
                    "from Employees\n" +
                    "order by EmployeeID\n" +
                    "offset ? rows\n" +
                    "fetch next  ? rows only";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, start);
        statement.setInt(2, size);
        list = new ArrayList<Employee>();
        ResultSet rs = statement.executeQuery();
        while (rs.next())
        {
            Employee c = new Employee(
                    rs.getInt("EmployeeID"),
                    rs.getString("FirstName"),
                    rs.getString("LastName"));
            list.add(c);
        }       
        return list;
    }
    
    public int getNumberOfEmployee() throws SQLException
    {
        ArrayList<Employee> list;        
        String sql = "select count(*) total from Employees";
        Statement statement = connection.createStatement();
        list = new ArrayList<Employee>();
        ResultSet rs = statement.executeQuery(sql);
        int count = 0;
        while (rs.next())
        {
            count = rs.getInt("total");
        }       
        return count;
    }
}
