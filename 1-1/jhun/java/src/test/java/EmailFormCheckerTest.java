import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

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

    @Test
    public void badEmail() throws Exception {
        List<String> emails = Arrays.asList(
                "",
                "j hun2@jhun.COM",
                "jhu n2@j hun.org",
                "jhun2@jhu n.ss.rr",
                "jh!un2@jhun.go.kr",
                "jh-un2@jhun.go.kr",
                "jhun2@jhun.go.kr2",
                "jhun2@jhun.go2.kr",
                "jㄱhun2@jhun.go.kr",
                "호우@jhun.go.kr",
                "asd@가.가.com",
                "asd@가.com",
                "asd@com",
                "!jhun2@jhun.net");

        Assert.assertFalse(emails.stream().anyMatch(x -> FormChecker.check(CheckType.EMAIL, x)));
    }

    @Test
    public void limitedLength() throws Exception {

        String idLength44 = IntStream.rangeClosed(1, 44).boxed().map(x -> "a").reduce("", (x1, x2) -> x1 + x2);
        String emailLength50 = idLength44 + "@a.com";
        Assert.assertEquals(50, emailLength50.length());
        String emailLength51 = idLength44 + "@ab.com";
        Assert.assertEquals(51, emailLength51.length());

        Assert.assertFalse(FormChecker.check(CheckType.EMAIL, emailLength51));
        Assert.assertTrue(FormChecker.check(CheckType.EMAIL, emailLength50));

    }
}
