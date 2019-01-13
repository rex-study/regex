package regex.two;

import org.junit.Assert;
import org.junit.Test;
import regex.valid.FormChecker;

import java.util.Arrays;
import java.util.List;

public class SCHEDULETwoCheckTypeTest {

    private final List<String> simpleSCHE = Arrays.asList(
            "1",
            "12,12",
            "12,12,24",
            "1,12,12,24,17,0,23",
            "12,12,0",
            "12,12",
            "12,0,12",
            "0,1,0,12",
            "0,1,24,12",
            "24",
            "17",
            "12,18",
            "0,0"
    );

    private final List<String> badSCHE = Arrays.asList(
        "25",
        "25,12",
        "25,12",
        "123,1232124",
        "123,24,24",
        "1,11,111"

    );


    @Test
    public void isSCHE() throws Exception {

        boolean aaa = simpleSCHE.stream()
                .anyMatch(x -> {
                    if (!FormChecker.check(TwoCheckType.SCHEDULE, x)) {
                        System.out.println(x);
                        return true;
                    }
                    return false;
                });

        Assert.assertFalse(aaa);
    }


    @Test
    public void isNotSCHE() throws Exception {

        boolean aaa = badSCHE.stream()
                .anyMatch(x -> {
                    if (FormChecker.check(TwoCheckType.SCHEDULE, x)) {
                        System.out.println(x);
                        return true;
                    }
                    return false;
                });

        Assert.assertFalse(aaa);
    }
}