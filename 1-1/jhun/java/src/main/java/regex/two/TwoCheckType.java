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
    ADDRESS("^[가-힣0-9a-zA-Z]+((\\s{1,1}[가-힣0-9a-zA-Z]+)?\\s((\\d{1,3}-\\d{1,3}\\s?번지)|([가-힣0-9]+\\s?[가-힣0-9]+)))?", 999),
    SCHEDULE("((^2[0-4])|(^1[0-9])|(^[0-9]))(,2[0-4]|,1[0-9]|,[0-9])*", 999),
    KOREAN("^(([가-힣])+|([ㅡ|ㅜ|ㅠ]{1,2})|([ㄱ-ㅎ]{1,2}))((([ㄱ-ㅎ]{1,2})|([ㅡ|ㅜ|ㅠ]{1,2}))*)", 999);

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
