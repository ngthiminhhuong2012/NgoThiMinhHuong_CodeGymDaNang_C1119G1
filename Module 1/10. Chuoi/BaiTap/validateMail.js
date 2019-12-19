function validateMail(email) {
    regexp =/^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\.[A-Za-z0-9]+)$/;
    if (regexp.test(email)) {
        return true;
    }
    return false;
}