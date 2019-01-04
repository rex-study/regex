public enum CheckType {
    ID("", 10),
    PASSWORD("", 10),
    EMAIL("", 10),
    PHONE("", 10);

    CheckType(String regex, Integer length) {
        this.regex = regex;
        this.limitLength = length;
    }

    public String getRegex() {
        return regex;
    }

    private String regex;
    private Integer limitLength;

    public Integer getLimitLength() {
        return limitLength;
    }
}
