<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h2>We are The Turtle Troopers! to view our team name and pictures visit our <a href="https://jesper3005.github.io/TTTAgenda/">page</a></h2>
        <h3><a href="">Page 1 - Calculator</a></h3>
        <h3>
            <form action="FrontController" method="POST" style="margin-right: 1%">
                <input type="hidden" name="command" value="api">
                <input type="submit" class="btn btn-outline-success" value="Page 2 - Simple Calculator API" />
            </form>
        </h3>
        <h3><a href="">Page 3 - Dynamic UI Manipulation</a></h3>
        <h3><a href="">Page 4 - Dynamic UI manipulation with data obtained via fetch</a></h3>
    </body>
</html>
