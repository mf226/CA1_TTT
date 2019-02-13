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
        
        <script>
            var result = document.getElementById("result");
            var operations = document.getElementById("operations").children;
            var clear = document.getElementById("clear");

            for (var i = 0; i < operations.length; i++) {
                operations[i].addEventListener('click', function (event) {
                    var operation = switcherino(operations[i]);
                    var n1 = document.getElementById("firstNumber").value;
                    var n2 = document.getElementById("secondNumber").value;

                    fetch(`calculatorServlet?operation=${operation}&n1=${n1}&n2=${n2}`)
                            .then(res => res.text())
                            .then(d => {
                                result.innerHTML = d;
                            });
                });
            }

            clear.addEventListener('click', function (event) {
                result.innerHTML = "";
                document.getElementById("firstNumber").value = 0;
                document.getElementById("secondNumber").value = 0;
            });

            function switcherino(operation) {
                switch (operation) {
                    case "*":
                        return "mul";
                    case "/":
                        return "div";
                    case "-":
                        return "sub";
                    case "+":
                        return "add";
                    default:
                        break;
                }
            }
        </script>
    </body>
</html>
