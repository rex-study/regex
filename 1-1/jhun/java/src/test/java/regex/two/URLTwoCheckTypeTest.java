package regex.two;

import org.junit.Assert;
import org.junit.Test;
import regex.valid.FormChecker;

import java.util.Arrays;
import java.util.List;

public class URLTwoCheckTypeTest {

    private final List<String> simpleUrl = Arrays.asList(
            "http://www.naver.com",
            "HTTP://www.naver.com",
            "https://www.naver.com",
            "http://some.some.co.kr",
            "https://some.some.co.ar",
            "https://www.na123ver.com/",
            "https://www.naver.com/qwqwe/",
            "https://www.nav123er.com/qwqwe",
            "https://w12ww.naver.com/qwqwe?id=hqweloqwe",
            "https://cafe24.naver.com/qwqwe/?id=hqweloqwe",
            "https://www.naver.com/qwqwe/?id=hqweloqwe123123",
            "https://asdsad.na123ver.com/qwqw_qwee/?id=hqweloqwe123123",
            "https://asdsad.na123ver.com/qwqw_qwee/?id=hqweloqwe123123&password=qweqweqwe&user_name=",
            "https://asdsad.na123ver.com/qwqw_qwee/?id=hqweloqwe123123&password=qweqweqwe&user_name=asdasd",
            "https://asdsad.na123ver.com/qwqw_qwee/?id=hqweloqwe123123&password=7JyI44S3cXdlcUFEUVdFd2VsO3Rna213bGVnbDtkcmJuO3JuWzsncm4uL3JmLm0vJ3J0eQ0K44WC44WI44S344WC44WK44S344WC44S344WI44WKWw==",
            "https://asdsad.na123ver.com/qwqw_qwee/?id=hqweloqwe123123&password=7JyI7Jy87ZW=7ZWY7Z6a6rCA44Wj44WI66C144WI44S5IUAjISMhQCMrDQor44WC44WI44S3cXdlcUFEUVdFd2VsO3Rna213bGVnbDtkcmJuO3JuWzsncm4uL3JmLm0vJ3J0eQ0K44WC44WI44S344WC44WK44S344WC44S344WI44WKWw=="
    );

    private final List<String> badUrl = Arrays.asList(
            "https://asdsad.na123ver.com/qwqw_qwee/?id= hqweloqwe123123 & password=qweqweqwe & user_name=asdasd",
            "ftp://qweqwe.qweqwecom.com/",
            "ftp://qweqwe.qweqwecom.com",
            "http:/qweqw.com",
            "http://qweqw.c!.qwe!",
            "http://qweqw.c.qwe!",
            "www.naver.com"
    );


    @Test
    public void isURL() throws Exception {

        boolean aaa = simpleUrl.stream()
                .anyMatch(x -> {
                    if(!FormChecker.check(TwoCheckType.URL, x.toLowerCase())){
                        System.out.println(x);
                        return true;
                    }
                    return false;
                });

        Assert.assertFalse(aaa);
    }


    @Test
    public void isNotURL() throws Exception {

        boolean aaa = badUrl.stream()
                .anyMatch(x -> {
                    if(FormChecker.check(TwoCheckType.URL, x.toLowerCase())){
                        System.out.println(x);
                        return true;
                    }
                    return false;
                });

        Assert.assertFalse(aaa);
    }
}