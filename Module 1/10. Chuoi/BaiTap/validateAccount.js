function validateAccount(account) {
    regexp =/^[_a-z0-9]{6,}$/;
    if (regexp.test(account)) {
        return true;
    }
    return false;

}