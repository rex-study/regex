package regex.two;

import regex.CheckType;

public enum TwoCheckType implements CheckType {

    GET_URL("", 1);

    private String regex;
    private Integer limitLength;

    TwoCheckType(String regex, Integer length) {
        this.regex = regex;
        this.limitLength = length;
    }

    @Override
    public String getRegex() {
        return regex;
    }

    @Override
    public Integer getLimitLength() {
        return limitLength;
    }
}
