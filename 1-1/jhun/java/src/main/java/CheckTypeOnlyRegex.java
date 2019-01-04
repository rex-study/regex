public enum CheckTypeOnlyRegex {
    //        영어,숫자 , 단 첫번째 글자는 무조건 영어소문자, 길이 10
    ID(""),
    PASSWORD(""),
    EMAIL(""),
    PHONE("");

    CheckTypeOnlyRegex(String regex) {
        this.regex = regex;
    }

    public String getRegex() {
        return regex;
    }

    private String regex;
}
