<%-- 
    Document   : employeelist
    Created on : Jun 29, 2021, 9:13:23 AM
    Author     : lephu
--%>

<%@page import="model.Employee"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .left {width:30%; float: left;}
            .right{width:70%; float: left;}
            .current{text-decoration: none; color: red;}
        </style>
        <%
            ArrayList<Employee> emps = (ArrayList<Employee>) request.getAttribute("employees");
        %>    
    </head>
    <body>
        <div>
            <jsp:include page="leftmenu.jsp"></jsp:include>
            <div class="right">
                <%for (Employee e: emps) {%>
                <div>
                    <%=e.getEmployeeid()%>-<%=e.getFirstname()%>-<%=e.getLastname()%>
                </div>
                <%}%>
                
                <jsp:include page="paging.jsp"></jsp:include>
            </div>
        </div>
            
    </body>
</html>
