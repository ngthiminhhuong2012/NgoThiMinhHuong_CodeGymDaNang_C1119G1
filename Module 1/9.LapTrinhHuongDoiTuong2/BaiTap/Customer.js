var Customer = function () {
    this.setName = function (name) {
        this.name = name;
    };
    this.getName = function () {
        return this.name;
    };
    this.setAddress = function (address) {
        this.address = address;
    };
    this.getAddress = function () {
        return this. address;
    };
};
var Employ = function () {
    this.setSalary = function (salary) {
        this.salary = salary;

    };
    this.getSalary = function () {
        return this.salary;
    };
    this.setWorkDay = function (workday) {
        this.workday = workday;
    };
    this.getWorkDay = function () {
        return this.workday;
    };

};