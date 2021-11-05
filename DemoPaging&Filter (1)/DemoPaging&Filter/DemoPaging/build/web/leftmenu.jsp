<%
    String controller = request.getAttribute("controller").toString();
%>
<div class="left">
    <% if (controller.equalsIgnoreCase("EmployeeList")) {%>
        <a href="EmployeeList" class="current">List of employee</a>
        
    <%}else{%>
        <a href="EmployeeList">List of employee</a>
    <%}%>
    <a href="AddEmployee">Add new employee</a>
</div>
