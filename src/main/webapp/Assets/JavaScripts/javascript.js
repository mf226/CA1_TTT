var result = document.getElementById("result");
var operations = document.getElementById("operations").children;
var clear = document.getElementById("clear");

for (var i = 0; i < operations.length; i++) {
    operations[i].addEventListener('click', function (event) {
        var operation = switcherino(operations[i]);
        var n1 = document.getElementById("firstNumber");
        var n2 = document.getElementById("secondNumber");
        
        fetch(`calculator?operation=${operation}&n1=${n1}&n2=${n2}`).then(res => res.text())
                .then(d => {
                    result.innerHTML = d;
                });
    });
}

clear.addEventListener('click', function (event) {
    result.innerHTML = "";
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