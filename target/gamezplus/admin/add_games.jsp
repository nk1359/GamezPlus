<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %> 

    <!DOCTYPE html>
    <html>

    <head>
        <title>Add Books</title>
        <%@include file="allCSS.jsp" %>
    </head>

    <body style="background-color: #f0f1f2;">
        <%@include file="navbar.jsp" %>
            <div class="container">
                <div class="row">
                    <div class="col-md-4 offset-md-4">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="text-center">Add Games</h4>
                                <c:if test="${not empty succMsg }">
                                    <p class="text-center text-success">${succMsg }</p>
                                    <c:remove var="succMsg" scope="session"></c:remove>
                                </c:if>

                                <c:if test="${not empty failedMsg }">
                                    <p class="text-center text-danger">${failedMsg }</p>
                                    <c:remove var="failedMsg" scope="session"></c:remove>
                                </c:if>

                                <form action="../add_games" method="post" enctype="multipart/form-data">

                                    <div class="form-group">
                                        <label for="exampleInputEmail1">Game Name*</label>
                                        <input name="gname" type="text" class="form-control" id="exampleInputEmail1"
                                            aria-describedby="emailHelp">
                                    </div>

                                    <div class="form-group">
                                        <label for="exampleInputEmail1">Publisher Name*</label>
                                        <input name="publisher" type="text" class="form-control" id="exampleInputEmail1"
                                            aria-describedby="emailHelp">
                                    </div>

                                    <div class="form-group">
                                        <label for="exampleInputEmail1">Price*</label>
                                        <input name="price" type="number" class="form-control" id="exampleInputEmail1"
                                            aria-describedby="emailHelp">
                                    </div>

                                    <div class="form-group">
                                        <label for="inputState">Game Category*</label>
                                        <select id="inputState" name="categories" class="form-control">
                                            <option selected>--select--</option>
                                            <option value="New">New Game</option>
                                            <option value="New">Used Game</option>
                                        </select>

                                    </div>

                                    <div class="form-group">
                                        <label for="inputState">Game Status*</label>
                                        <select id="inputState" name="status" class="form-control">
                                            <option selected>--select--</option>
                                            <option value="Active">Active</option>
                                            <option value="Inactive">Inactive</option>
                                        </select>
                                    </div>

                                    <div class="form-group">
                                        <label for="exampleFormControlFile1">Upload Photo</label>
                                        <input name="gimg" type="file" class="form-control-file"
                                            id="exampleFormControlFIle1">
                                    </div>

                                    <div class="text-center">
                                        <button type="submit" class="btn btn-primary text-center">Add</button>
                                    </div>
                                    
                                </form>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
    </body>

    </html>