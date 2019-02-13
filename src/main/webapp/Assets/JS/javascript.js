var result = document.getElementById("result");
var clear = document.getElementById("clear");

function operationHandler(event) {
    var opr = event.target.innerHTML;
    alert(opr);
    var operation = switcherino(opr);
    var n1 = document.getElementById("firstNumber").value;
    var n2 = document.getElementById("secondNumber").value;

    fetch(`calculatorServlet?operation=` + operation + `&n1=` + n1 + `&n2=` + n2)
            .then(res => res.text())
            .then(d => {
                result.innerHTML = d;
            });
}

document.getElementById("operations").onclick = operationHandler;

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
            return "add";
    }
}