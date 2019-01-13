package regex.two;

import regex.CheckType;

public enum TwoCheckType implements CheckType {

//     - 스케줄
//    우편번호 검색기
//
//        - base64 검사기
//
//    - url syntax 검사기
//
//    한글 검사기



    URL("^(http)s?:\\/\\/(\\w+\\.)?\\w+(\\.[a-zA-Z]{1,3})?\\.[a-zA-Z]{1,3}\\/?(\\w+\\/?)*(\\?(\\w+\\=((\\w+)|([a-zA-Z0-9\\+\\/]+\\=?\\=$))?\\&?)*)?$", 500),
    BASE64("^[a-zA-Z0-9\\+\\/]+\\=?\\=$", 900),
    POST("", 1),
    SCHEDULE("((^2[0-4])|(^1[0-9])|(^[0-9]))(,2[0-4]|,1[0-9]|,[0-9])*", 999),
    KOREAN("", 1);

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
