
var Customer = function () {
    this.setName = function (name) {
        this.name = name;
    };
    this.getName = function () {
        return this.name;
    };
    this.setEmail = function (email) {
        this.email = email;
    };
    this.getEmail = function () {
        return this.email;
    };
    this.setIdCard = function (idCard) {
        this.idCard = idCard;
    };
    this.getIdCard = function () {
        return this.idCard;

    };
    this.setAddress = function (address) {
        this.address = address;
    };
    this.getAddress = function () {
        return this.address;
    };
    this.setBirthday = function (birthday) {
        this.birthday = birthday;
    };
    this.getBirthday = function () {
        return this.birthday;
    }
    this.setDiscount = function (discount) {
        this.discount = discount;
    };
    this.getDiscount = function () {
        return this.discount;
    };

};