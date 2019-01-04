public enum CheckType {
    ID(""),
    PASSWORD(""),
    EMAIL(""),
    PHONE("");

    CheckType(String regex) {
        this.regex = regex;
    }

    public String getRegex() {
        return regex;
    }

    private String regex;
}
