public class FormChecker {
    public static Boolean check(CheckType checkType, String str) {
        String regex = checkType.getRegex();
        return str.matches(regex);
    }
}
