// Opgave 3
// A)
var boys = ["Peter", "lars", "Ole"];
var girls = ["Janne", "hanne", "Sanne"];
//var lists = document.getElementsByClassName("lists");
var boysList = document.getElementById("boys");
var girlsList = document.getElementById("girls");
var allList = document.getElementById("all");
var toggleAllSort = true;
generateLists();

function convertToHTML(string) {
    return "<li>" + string + "</li>";
}

function generateLists() {
    boysList.innerHTML = generateList(boys);
    girlsList.innerHTML = generateList(girls);
    allList.innerHTML = generateList(boys.concat(girls));
}

function generateList(stringArray) {
    var html = "";
    for (let index = 0; index < stringArray.length; index++) {
        html += convertToHTML(stringArray[index]);
    }
    return html;
}

function addBoy() {
    var name = document.getElementById("newboy").value;
    boys.push(name);
    generateLists();
}

function addGirl() {
    var name = document.getElementById("newgirl").value;
    girls.push(name);
    generateLists();
}

function removeBoy() {
    if (document.getElementById("first").checked) {
        boys.shift();
    }
    else if (document.getElementById("last").checked) {
        boys.pop();
    }
    else {
        alert("Pick first or last");
    }
    generateLists();
}

function removeGirl() {
    if (document.getElementById("first").checked) {
        girls.shift();
    }
    else if (document.getElementById("last").checked) {
        girls.pop();
    }
    else {
        alert("Pick first or last");
    }
    generateLists();
}

function reverseAll() {
    var concatList = boys.concat(girls);
    allList.innerHTML = generateList(concatList.reverse());
}

function sortAll() {
    var concatList = smartSort(boys.concat(girls));
    if (!toggleAllSort) {
        concatList = concatList.reverse();
    }
    allList.innerHTML = generateList(concatList);
    toggleAllSort = !toggleAllSort;
}

function smartSort(array) {
    var uppercase = array.map(x => x[0].toUpperCase() + x.substring(1));
    uppercase.sort();
    return uppercase;
}