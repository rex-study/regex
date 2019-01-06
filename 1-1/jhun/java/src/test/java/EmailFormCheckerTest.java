import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class EmailFormCheckerTest {

    @Test
    public void simpleEmail() throws Exception {
        List<String> emails = Arrays.asList(
                "jhun@jhun.com",
                "jhun_jhun@jhun.com",
                "jhun_2jhun@jhun.com",
                "2jhun_2jhun@jhun.com",
                "jhun_2jhun@jhun.com",
                "jhun2@jhun.co.kr",
                "jhun2@jhun.COM",
                "jhun2@jhun.org",
                "jhun2@jhun.ss.rr",
                "jhun2@jhun.go.kr",
                "jhun2@jhun2.go.kr",
                "jhun2@jhu2_2.go.kr",
                "jhun2@jhu2_com.go.kr",
                "jhun2@jhun.net");

        Assert.assertFalse(emails.stream().anyMatch(x -> !FormChecker.check(CheckType.EMAIL, x)));
    }
}
