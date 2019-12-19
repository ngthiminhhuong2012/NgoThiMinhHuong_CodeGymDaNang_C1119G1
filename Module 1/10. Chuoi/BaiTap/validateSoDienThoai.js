function validateSoDienThoai(soDienThoai) {
    regexp =/^\([[0-9]{2}\)-\([0]+[0-9]{9,}\)/;
    if (regexp.test(soDienThoai)) {
        return true;
    }
    return false;
}