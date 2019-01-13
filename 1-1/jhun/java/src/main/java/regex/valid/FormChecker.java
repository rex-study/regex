package regex.valid;

import regex.one.CheckType;
import regex.one.CheckTypeOnlyRegex;

public class FormChecker {
    public static Boolean check(CheckType checkType, String str) {
        if(str.length() > checkType.getLimitLength()){
            return false;
        }
        return str.matches(checkType.getRegex());
    }

    static Boolean checkOnlyRegex(CheckTypeOnlyRegex checkType , String str){
        return str.matches(checkType.getRegex());
    }
}
