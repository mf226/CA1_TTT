<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculator</title>
    </head>
    <body>
        <h1>Hello Nerdz!</h1>
        <input type="number" id="firstNumber">
        <br>
        <input type="number" id="secondNumber">
        <br>
        <div id="operations">
            <button>+</button>
            <button>-</button>
            <button>*</button>
            <button>/</button>
        </div>
        <br>
        <button id="clear">Clear</button>
        <p id="result"></p>
        <script src="javascript.js" type="text/javascript"></script>
    </body>
</html>
