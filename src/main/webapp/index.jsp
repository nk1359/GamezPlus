<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.DB.DBConnect" %>
<%@ page import="java.sql.Connection" %>

<!-- 
    JSP file for displaying the home page of GamezPlus
-->
<!DOCTYPE html>
<html>

<head>
    <title>GamezPlus: Index</title>
    <%@include file="all_component/allCSS.jsp" %>
        <style type="text/css">
            .back-img {
                background: url("img/wallpaper.jpg");
                object-fit: cover;
                background-repeat: no-repeat;
                background-size: cover;
                background-position: center;
                height: 25vh;
            }

            .crd-ho:hover {
                background-color: #f7f7f7;
            }
        </style>
</head>

<body style="background-color: #f7f7f7;">
    <%@include file="all_component/navbar.jsp" %>
        <div class="container-fluid back-img"></div>

        <!-- Start Recent Book -->
        <div class="container">
            <h3 class="text-center">Recent Games</h3>
            <div class="row">
                <div class="col-md-3">
                    <div class="card crd-ho">
                        <div class="card-body text-center">
                            <img alt="" src="GameImg/RedDead.jpg" style="width: 150px; height: 200px;"
                                class="img-thumblin">
                            <p>Introduction To Java Programming</p>
                            <p>K. Somasundaram</p>
                            <p>Category: New</p>
                            <div class="row">
                                <a href="" class="btn btn-danger ml-2"><i class="fa-solid fa-cart-shopping"></i> Add to
                                    Cart</a>
                                <a href="" class="btn btn-success ml-1">View Details</a>
                                <a href="" class="btn btn-danger ml-1">2.99</a>

                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-md-3">
                    <div class="card crd-ho">
                        <div class="card-body text-center">
                            <img alt="" src="GameImg/RedDead.jpg" style="width: 150px; height: 200px;"
                                class="img-thumblin">
                            <p>Red Dead Redemption II</p>
                            <p>Rockstar Games</p>
                            <p>Category: New</p>
                            <div class="row">
                                <a href="" class="btn btn-danger ml-2"><i class="fa-solid fa-cart-shopping"></i> Add to
                                    Cart</a>
                                <a href="" class="btn btn-success ml-1">View Details</a>
                                <a href="" class="btn btn-danger ml-1">2.99</a>

                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-md-3">
                    <div class="card crd-ho">
                        <div class="card-body text-center">
                            <img alt="" src="GameImg/RedDead.jpg" style="width: 150px; height: 200px;"
                                class="img-thumblin">
                            <p>Red Dead Redemption II</p>
                            <p>Rockstar Games</p>
                            <p>Category: New</p>
                            <div class="row">
                                <a href="" class="btn btn-danger ml-2"><i class="fa-solid fa-cart-shopping"></i> Add to
                                    Cart</a>
                                <a href="" class="btn btn-success ml-1">View Details</a>
                                <a href="" class="btn btn-danger ml-1">2.99</a>

                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-md-3">
                    <div class="card crd-ho">
                        <div class="card-body text-center">
                            <img alt="" src="GameImg/RedDead.jpg" style="width: 150px; height: 200px;"
                                class="img-thumblin">
                            <p>Red Dead Redemption II</p>
                            <p>Rockstar Games</p>
                            <p>Category: New</p>
                            <div class="row">
                                <a href="" class="btn btn-danger ml-2"><i class="fa-solid fa-cart-shopping"></i> Add to
                                    Cart</a>
                                <a href="" class="btn btn-success ml-1">View Details</a>
                                <a href="" class="btn btn-danger ml-1">2.99</a>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="text-center mt-1">
            <a href="" class="btn btn-danger btn-small">View All</a>
        </div>
        </div>
        <!-- End Recent Book -->

        <hr>
        <!-- Start New Book -->
        <div class="container">
            <h3 class="text-center">New Games</h3>
            <div class="row">
                <div class="col-md-3">
                    <div class="card crd-ho">
                        <div class="card-body text-center">
                            <img alt="" src="GameImg/RedDead.jpg" style="width: 150px; height: 200px;"
                                class="img-thumblin">
                            <p>Red Dead Redemption II</p>
                            <p>Rockstar Games</p>
                            <p>Category: New</p>
                            <div class="row">
                                <a href="" class="btn btn-danger ml-2"><i class="fa-solid fa-cart-shopping"></i> Add to
                                    Cart</a>
                                <a href="" class="btn btn-success ml-1">View Details</a>
                                <a href="" class="btn btn-danger ml-1">2.99</a>

                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-md-3">
                    <div class="card crd-ho">
                        <div class="card-body text-center">
                            <img alt="" src="GameImg/RedDead.jpg" style="width: 150px; height: 200px;"
                                class="img-thumblin">
                            <p>Red Dead Redemption II</p>
                            <p>Rockstar Games</p>
                            <p>Category: New</p>
                            <div class="row">
                                <a href="" class="btn btn-danger ml-2"><i class="fa-solid fa-cart-shopping"></i> Add to
                                    Cart</a>
                                <a href="" class="btn btn-success ml-1">View Details</a>
                                <a href="" class="btn btn-danger ml-1">2.99</a>

                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-md-3">
                    <div class="card crd-ho">
                        <div class="card-body text-center">
                            <img alt="" src="GameImg/RedDead.jpg" style="width: 150px; height: 200px;"
                                class="img-thumblin">
                            <p>Red Dead Redemption II</p>
                            <p>Rockstar Games</p>
                            <p>Category: New</p>
                            <div class="row">
                                <a href="" class="btn btn-danger ml-2"><i class="fa-solid fa-cart-shopping"></i> Add to
                                    Cart</a>
                                <a href="" class="btn btn-success ml-1">View Details</a>
                                <a href="" class="btn btn-danger ml-1">2.99</a>

                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-md-3">
                    <div class="card crd-ho">
                        <div class="card-body text-center">
                            <img alt="" src="GameImg/RedDead.jpg" style="width: 150px; height: 200px;"
                                class="img-thumblin">
                            <p>Red Dead Redemption II</p>
                            <p>Rockstar Games</p>
                            <p>Category: New</p>
                            <div class="row">
                                <a href="" class="btn btn-danger ml-2"><i class="fa-solid fa-cart-shopping"></i> Add to
                                    Cart</a>
                                <a href="" class="btn btn-success ml-1">View Details</a>
                                <a href="" class="btn btn-danger ml-1">2.99</a>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="text-center mt-1">
            <a href="" class="btn btn-danger btn-small">View All</a>
        </div>
        </div>
        <!-- End New Book -->
        <hr>

        <!-- Start Old Book -->
        <div class="container">
            <h3 class="text-center">Used Games</h3>
            <div class="row">
                <div class="col-md-3">
                    <div class="card crd-ho">
                        <div class="card-body text-center">
                            <img alt="" src="GameImg/RedDead.jpg" style="width: 150px; height: 200px;"
                                class="img-thumblin">
                            <p>Red Dead Redemption II</p>
                            <p>Rockstar Games</p>
                            <p>Category: Used</p>
                            <div class="row">
                                <a href="" class="btn btn-success ml-5">View Details</a>
                                <a href="" class="btn btn-danger ml-1">2.99</a>

                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-md-3">
                    <div class="card crd-ho">
                        <div class="card-body text-center">
                            <img alt="" src="GameImg/RedDead.jpg" style="width: 150px; height: 200px;"
                                class="img-thumblin">
                            <p>Red Dead Redemption II</p>
                            <p>Rockstar Games</p>
                            <p>Category: New</p>
                            <div class="row">
                                <a href="" class="btn btn-success ml-5">View Details</a>
                                <a href="" class="btn btn-danger ml-1">2.99</a>

                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-md-3">
                    <div class="card crd-ho">
                        <div class="card-body text-center">
                            <img alt="" src="GameImg/RedDead.jpg" style="width: 150px; height: 200px;"
                                class="img-thumblin">
                            <p>Red Dead Redemption II</p>
                            <p>Rockstar Games</p>
                            <p>Category: Used</p>
                            <div class="row">
                                <a href="" class="btn btn-success ml-5">View Details</a>
                                <a href="" class="btn btn-danger ml-1">2.99</a>

                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-md-3">
                    <div class="card crd-ho">
                        <div class="card-body text-center">
                            <img alt="" src="GameImg/RedDead.jpg" style="width: 150px; height: 200px;"
                                class="img-thumblin">
                            <p>Red Dead Redemption II</p>
                            <p>Rockstar Games</p>
                            <p>Category: Used</p>
                            <div class="row">
                                <a href="" class="btn btn-success ml-5">View Details</a>
                                <a href="" class="btn btn-danger ml-1">2.99</a>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="text-center mt-1">
                <a href="" class="btn btn-danger btn-small">View All</a>
            </div>
        </div>
        <!-- End Old Book -->
        <%@include file="all_component/footer.jsp" %>
</body>

</html>