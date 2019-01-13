package regex.two;

import org.junit.Assert;
import org.junit.Test;
import regex.valid.FormChecker;

import java.util.Arrays;
import java.util.List;

public class KOREANTwoCheckTypeTest {

    private final List<String> simpleKOREAN = Arrays.asList(
            "하이",
            "하잌",
            "하이ㅋ",
            "하이",
            "ㄱㄱ",
            "하이ㄱ",
            "하이ㅋㅋ",
            "근데요ㅋㅠ",
            "아뇨망했어요ㅠㅋ",
            "싫어요ㅠ",
            "싫어요ㅠㅠ",
            "하요ㅡㅡ",
            "아니요ㅡㅠ",
            "으어ㅡㅠㅠㅠㅠ",
            "하하하ㅋㅋㅋㅋㅋ",
            "하핳ㅎㅋㅋㅋ",
            "ㅠㅠ",
            "ㅎㅎ",
            "ㅡㅡㅋ",
            "ㅡㅡ",
            "ㅡㅜ",
            "후우ㅜ",
            "ㅠ",
            "ㅡ"
    );

    private final List<String> badKOREAN = Arrays.asList(

            "하이ㅣ",
            "하ㅏ이",
            "후ㅜ우",
            "후으ㅏ",
            "하ㅏㅏ",
            "히ㅣㅣ",
            "으헝허엏ㅇ허유ㅠㅠㅠㅠ"
    );


    @Test
    public void isKOREAN() throws Exception {

        boolean aaa = simpleKOREAN.stream()
                .anyMatch(x -> {
                    if (!FormChecker.check(TwoCheckType.KOREAN, x)) {
                        System.out.println(x);
                        return true;
                    }
                    return false;
                });

        Assert.assertFalse(aaa);
    }


    @Test
    public void isNOTKOrean() throws Exception {

        boolean aaa = badKOREAN.stream()
                .anyMatch(x -> {
                    if (FormChecker.check(TwoCheckType.KOREAN, x)) {
                        System.out.println(x);
                        return true;
                    }
                    return false;
                });

        Assert.assertFalse(aaa);
    }
}