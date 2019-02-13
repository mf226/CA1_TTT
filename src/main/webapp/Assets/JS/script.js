var display = document.getElementById("display");
var buttons = document.getElementById("buttons").children;
var calculate = buttons[buttons.length - 1];

for (let index = 0; index < buttons.length - 1; index++) {
    buttons[index].addEventListener('click', function (event) { display.innerHTML += buttons[index].innerHTML; });
}

calculate.addEventListener('click', function (event) {
    var formula = display.innerHTML;
    var result;
    try {
        result = eval(formula);
    } catch (error) {
        result = "Error! Press F5 dumbass";
    }
    display.innerHTML = result;
});