class FormChecker {
    static Boolean check(CheckType checkType, String str) {
        if(str.length() > checkType.getLimitLength()){
            return false;
        }
        return str.matches(checkType.getRegex());
    }

    static Boolean checkOnlyRegex(CheckTypeOnlyRegex checkType , String str){
        return str.matches(checkType.getRegex());
    }
}
