package regex.two;

import org.junit.Assert;
import org.junit.Test;
import regex.valid.FormChecker;

import java.util.Arrays;
import java.util.List;

public class ADDRESSTwoCheckTypeTest {

    private final List<String> simpleADD = Arrays.asList(
            "서울특별시 강남구 999-99번지",
            "서울특별시 강남구 999-99 번지",

            "서울특별시 강남구 테헤란로 7",
            "대한민국동 3단지주공아파트 999동 999호",

            "명보빌라트 403호 505호 501호",

            "JNK디지털타워",

            "4차코오롱원룸 999호"
    );

    private final List<String> badADD = Arrays.asList(
        " 아니이런 주소가 있는가",
        "4차아파트!! 310동",
        "특수! 문자!",
        "대한민국동 3단지주공아파트 999동 999호 999호"
    );


    @Test
    public void isADD() throws Exception {

        boolean aaa = simpleADD.stream()
                .anyMatch(x -> {
                    if(!FormChecker.check(TwoCheckType.ADDRESS, x.toLowerCase())){
                        System.out.println(x);
                        return true;
                    }
                    return false;
                });

        Assert.assertFalse(aaa);
    }


    @Test
    public void isNotADD() throws Exception {

        boolean aaa = badADD.stream()
                .anyMatch(x -> {
                    if(FormChecker.check(TwoCheckType.ADDRESS, x.toLowerCase())){
                        System.out.println(x);
                        return true;
                    }
                    return false;
                });

        Assert.assertFalse(aaa);
    }
}