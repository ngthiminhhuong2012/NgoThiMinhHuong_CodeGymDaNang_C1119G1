var option = prompt("1.Add New Customer\n " +
    "2. Display Information Customer\n" +
    "3.Edit Information Customer \n" +
    "4. Delete Customer \n" +
    "5.Exit");
function displayMainMenu(){
    alert(option);
}
var name = prompt('Enter Customer Name:');
var idCard = prompt('Enter ID Customer');
var birthday = prompt('Enter Birthday Customer');
var email = prompt('Enter Email Customer');
var address = prompt('Enter Address Customer');
var typeOfCustomer = prompt('Enter Type Customer');
var discount = prompt('Enter Discount');
var numberOfCustomer = prompt('Enter Number Of Customer');
var rentDay = prompt('Enter Rent Days');
var typeOfRoom = prompt('Enter Type of Room');
var typeOfSevice = prompt('Enter Type of Sevice' +
    "\n 1. Villa"
    + "\n 2. House"
    + "\n 3. Room");
var arrListCustomer = [];
function addNewCustomer() {
    var customer = new Customer();
    customer.setName(name.value);
    customer.getName();
    customer.setAddress(address.value);
    arrListCustomer.push(customer);
    displayInformationCustomer();
}
return displayMainMenu();

function displayInformationCustomer() {
    var result = "";
    for(var i = 0; i < arrListCustomer.length; i++){
        result += i+1 +"." + arrListCustomer[i]+ "\n";
    }
    return result;
}
function displayCustomer() {
    var option = prompt("1. Customer \n"+"2.Back");
    if(option === "1"){
        alert(displayInformationCustomer());

    }
    else if(option === "2") {
        alert( displayMainMenu());
    }
}
