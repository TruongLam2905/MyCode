<%
    int pageIndex = Integer.parseInt(request.getAttribute("current").toString());
    int totalPage = Integer.parseInt(request.getAttribute("total").toString());
    String controller = request.getAttribute("controller").toString();
%>
<div>
    <% if(totalPage > 1){%>
        <%for (int i=1; i<=totalPage; i++){%>
        <a href="<%=controller%>?page=<%=i%>"  
           <%if (i==pageIndex) {%> class="current"<%}%>
           >
                <%=i%>
            </a>
        <%}%>
    <%}%>
</div>
