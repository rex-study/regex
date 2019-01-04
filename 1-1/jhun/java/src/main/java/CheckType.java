public enum CheckType {
//        영어,숫자 , 단 첫번째 글자는 무조건 영어소문자, 길이 10
    ID("^[a-z]\\w*", 10),
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
