/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


var userID = document.getElementById("userID");
const urlSingle = "https://jsonplaceholder.typicode.com/users/";
const urlAll = "https://jsonplaceholder.typicode.com/users";
//JSON.stringify(data)
function getUser() {
    fetch(urlSingle + userID.value)
            .then(res => res.json())
            .then(data => {
                var all = "<p>" + "Name: " + data.name + "</p>";
                all += "<p>" + "Phone: " + data.phone + "</p>";
                document.getElementById("singleUser").innerHTML = all;
            });


}

function getAllUsers() {
    fetch(urlAll)
            .then(res => res.json())
            .then(data => {
                var users = "";
                users += "<table>";
                users += "<tr>";
                users += "<th>Name</th>";
                users += "<th>Phone</th>";
                users += "</tr>";
                data.forEach(function (key) {
                    users += "<tr>";
                    users += "<td>" + key.name + "</td>";
                    users += "<td>" + key.phone + "</td>";
                    users += "</tr>";
                });
                users += "</table>";
                document.getElementById("allUsers").innerHTML = users;

            });
}