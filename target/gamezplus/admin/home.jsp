<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ page isELIgnored="false" %>

            <!DOCTYPE html>
            <html>

            <head>
                <title>Admin:Home</title>
                <%@include file="allCSS.jsp" %>
                    <style type="text/css">
                        a {
                            text-decoration: none;
                            color: black;
                        }

                        a:hover {
                            text-decoration: none;
                            color: black;
                        }
                    </style>
            </head>

            <body>
                <%@include file="navbar.jsp" %>

                    <div class="container">
                        <div class="row p-5">

                            <div class="col-md-3">
                                <a href="add_games.jsp">
                                    <div class="card">
                                        <div class="card-body text-center">
                                            <i class="fas fa-plus-square fa-3x text-primary"></i><br>
                                            <h4>Add Games</h4>
                                            ----------
                                        </div>
                                    </div>
                                </a>
                            </div>

                            <div class="col-md-3">
                                <a href="all_games.jsp">
                                    <div class="card">
                                        <div class="card-body text-center">
                                            <i class="fa-solid fa-compact-disc fa-3x text-danger"></i><br>
                                            <h4>All Games</h4>
                                            ----------
                                        </div>
                                    </div>
                                </a>
                            </div>

                            <div class="col-md-3">
                                <a href="orders.jsp">
                                    <div class="card">
                                        <div class="card-body text-center">
                                            <i class="fa-solid fa-box-open fa-3x text-warning"></i><br>
                                            <h4>Orders</h4>
                                            ----------
                                        </div>
                                    </div>
                                </a>
                            </div>

                            <div class="col-md-3">
                                <a href="../">
                                    <div class="card">
                                        <div class="card-body text-center">
                                            <i class="fa-solid fa-right-from-bracket fa-3x text-primary"></i><br>
                                            <h4>Logout</h4>
                                            ----------
                                        </div>
                                    </div>
                                </a>
                            </div>


                        </div>
                    </div>

            </body>

            </html>