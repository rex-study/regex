package regex.two;

import org.junit.Assert;
import org.junit.Test;
import regex.valid.FormChecker;

import java.util.Arrays;
import java.util.List;

public class BASE64TwoCheckTypeTest {

    private final List<String> simpleBase = Arrays.asList(
    "7Jy87ZWY7Jy87ZWY7Jy87ZWY7Z6a6rCA44Wj44WI66C144WI44S5IUAjISMhQCMrDQor44WC44WI44S3cXdlWw==",
    "7Jy87ZW7ZWY7Z6a6rCA44Wj44WI66C144WI444WI44S344WC44WK44S344WC44S344WI44WKWw=",
    "7Jy87Z/Y7Jy87ZW6C144WI4O3Rna213bGVnbDtkcmJuO3JuWzsncm4uL3JmLm0vJ3J0eQ0K44WC44WI44S344WC44WK44S344WC44S344WI44WKWw="
    );

    private final List<String> badBase = Arrays.asList(
            "www.naver.com",
            "www123qasdqd==!",
            "www123qasdqd=!",
            "www123qasdq   d=!",
            "www123qasdq   d==",
            "www12 /3q asdq   d==",
            "www12 /3q asdq   d=/",
            "7J=y8=7ZW7ZWY7Z6a6rCA44Wj44WI66C144WI444WI44S344WC44WK44S344WC44S344WI44WKWw=",
            "asdasd.adasdasd"

    );


    @Test
    public void isBASE() throws Exception {

        boolean aaa = simpleBase.stream()
                .anyMatch(x -> {
                    if (!FormChecker.check(TwoCheckType.BASE64, x)) {
                        System.out.println(x);
                        return true;
                    }
                    return false;
                });

        Assert.assertFalse(aaa);
    }


    @Test
    public void isBedBASE() throws Exception {

        boolean aaa = badBase.stream()
                .anyMatch(x -> {
                    if (FormChecker.check(TwoCheckType.BASE64, x)) {
                        System.out.println(x);
                        return true;
                    }
                    return false;
                });

        Assert.assertFalse(aaa);
    }
}