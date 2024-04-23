<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.DAO.GamesDAOImpl" %>
<%@ page import="com.DB.DBConnect" %>
<%@ page import="com.entity.GameDtls" %>
<%@ page import="java.util.List" %>

<!--
    JSP file for displaying all games in the admin panel.
-->
<!DOCTYPE html>
<html>

<head>
  <title>Admin: All Games</title>
  <%@include file="allCSS.jsp" %>
</head>

<body>
  <%@include file="navbar.jsp" %>
    <h3 class="text-center">Hello Admin</h3>

    <table class="table table-striped">
      <thead class="bg-primary text-white">
        <tr>
          <th scope="col">ID</th>
          <th scope="col">Image</th>
          <th scope="col">Game Name</th>
          <th scope="col">Publisher</th>
          <th scope="col">Price</th>
          <th scope="col">Category</th>
          <th scope="col">Status</th>
          <th scope="col">Action</th>
        </tr>
      </thead>
      <tbody>
        <%
          GamesDAOImpl dao = new GamesDAOImpl(DBConnect.getConn());
          List<GameDtls> list = dao.getAllGames();
          for (GameDtls g : list)
          {
        %>
        <tr>
          <td><%=g.getGameId() %></td>
          <td><img src="../GameImg/<%=g.getPhotoName()%>" style="width: 50px; height: 75px;"></td>
          <td><%=g.getGameName() %></td>
          <td><%=g.getPublisher() %></td>
          <td>$<%=g.getPrice() %></td>
          <td><%=g.getGameCategory() %></td>
          <td><%=g.getStatus() %></td>
          <td><a href="#" class="btn btn-sm btn-primary">Edit</a>
            <a href="#" class="btn btn-sm btn-danger">Delete</a>
          </td>
        </tr>
        <%
          }
        %>
      </tbody>
    </table>

</body>

</html>
