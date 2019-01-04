class FormChecker {
    static Boolean check(CheckType checkType, String str) {
        if(str.length() > checkType.getLimitLength()){
            return false;
        }
        String regex = checkType.getRegex();
        return str.matches(regex);
    }
}
