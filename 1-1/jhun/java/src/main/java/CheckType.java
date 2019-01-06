public enum CheckType {
    //  영어,숫자 , 단 첫번째 글자는 무조건 영어소문자, 길이 10
    ID("^[a-z]\\w*", 10),
    // 영어,숫자,특수문자(! @ # $) 길이 10
    PASSWORD("([a-zA-Z0-9]|!|@|#|\\$)+", 10),
    // 영어숫자@영어숫자.영어
    EMAIL("^[a-zA-Z0-9]\\w+@\\w+(\\.[a-zA-Z]{1,2})?\\.[a-zA-Z]{2,3}", 50),
    //  010,011,016,018,019 - 숫자 3~4 - 숫자 3~4
    PHONE("^(010|011|016|018|019)-[0-9]{3,4}-[0-9]{3,4}", 13);

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
