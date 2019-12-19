function validateTenLopHoc(tenLop) {
    regexp =/^[ACP]+[0-9]{4,}[GHIKLM]+$/;
    if (regexp.test(tenLop)) {
        return true;
    }
    return false;
}