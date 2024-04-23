<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

    <!DOCTYPE html>
    <html>

    <head>
        <title>Ebook: Register</title>
        <%@include file="all_component/allCSS.jsp"%>
    </head>

    <body style="background-color: #f0f1f2;">
        <%@include file="all_component/navbar.jsp"%>
        <div class="container">
            <div class="row mt-2">
                <div class="col-md-4 offset-md-4">
                    <div class="card">
                        <div class="card-body">
                            <h4 class="text-center">Registration Page</h4>

                            <c:if test="${not empty succMsg}">
                              <p class ="text-center text-success">${succMsg }</p>
                              <c:remove var="succMsg" scope="session"></c:remove>
                            </c:if>

                            <c:if test="${not empty failedMsg}">
                              <p class = "text-center text-danger">${failedMsg }</p>
                              <c:remove var="failedMsg" scope="session"></c:remove>
                            </c:if>

                            <form action="register" method="post">
                                <div class="form-group">
                                    <label for="exampleInputName1">Name*</label>
                                    <input type="text" class="form-control" id="exampleInputName1" placeholder="Enter full name" required="required" name="fname">
                                  </div>
                                <div class="form-group">
                                  <label for="exampleInputEmail1">Email address*</label>
                                  <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email" required="required" name="email">
                                  <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputPhone1">Phone number*</label>
                                    <input type="number" class="form-control" id="exampleInputName1" placeholder="Enter phone number" required="required" name="phno">
                                  </div>
                                <div class="form-group">
                                  <label for="exampleInputPassword1">Password*</label>
                                  <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Enter password" required="required" name="password">
                                </div>
                                <div class="form-check">
                                  <input type="checkbox" class="form-check-input" id="exampleCheck1" name="check">
                                  <label class="form-check-label" for="exampleCheck1">Agree to Terms and Conditions</label>
                                </div>
                                <div class="text-center mt-2">
                                <button type="submit" class="btn btn-primary">Register</button>
                                </div>
                              </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <%@include file="all_component/footer.jsp"%>
    </body>

    </html>