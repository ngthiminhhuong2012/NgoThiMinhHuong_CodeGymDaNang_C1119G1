
function showTableCustomer() {
    var name = document.getElementById('idname');
    var address = document.getElementById("idaddress");
    // var salary = document.getElementById("idsalary");
    // var workday = document.getElementById("idworkday");
     var arrListCustomer = [];
    // var tableCustomer = document.getElementById("tableCustomer");
var customer = new Customer();
customer.setName(name.value);
customer.setAddress(address.value);
arrListCustomer.push(customer);
name.value ="";
address.value="";

show();
}

function show() {
    var drawTable = "<tr><th>Name</th>\n" +
        "<th>Address</th>\n" +
        "</tr>";
    for(var i = 0 ; i < arrListCustomer.length; i++){
        drawTable += "<tr>" +
            "<td>"+ arrListCustomer[i].getName()  + "</td>" +
            "<td>"+ arrListCustomer[i].getAddress() +"</td>" +
            "</tr>"
    }
    alert(drawTable);
    tableCustomer.innerHTML = drawTable;
}
var textContent = document.getElementById("textContent");
var btnShowAndHide = document.getElementById("btnShowAndHide");
textContent.style.visibility = 'hidden';
function test() {
    if(btnShowAndHide.innerText === "Show"){
        textContent.style.visibility = 'visible';
        btnShowAndHide.innerText = "Hide";
    }else{
        textContent.style.visibility = 'hidden';
        btnShowAndHide.innerText = "Show";
    }
}