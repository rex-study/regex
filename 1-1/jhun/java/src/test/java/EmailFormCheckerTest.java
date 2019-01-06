import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class EmailFormCheckerTest {

    @Test
    public void simpleEmail() throws Exception {
        List<String> emails = Arrays.asList(
                "jhun@jhun.com",
                "jhun2@jhun.co.kr",
                "jhun2@jhun.net");

        Assert.assertFalse(emails.stream().anyMatch(x -> !FormChecker.check(CheckType.EMAIL, x)));
    }
}
