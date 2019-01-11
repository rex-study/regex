import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PasswordFormCheckerTest {

    @Test
    public void simplePassword() throws Exception {

        List<String> pass = Arrays.asList(
                "qwe@",
                "qwe@!",
                "qwe!",
                "!qwe!",
                "1!qwe!",
                "qwe!@#",
                "qwe!@#$",
                "qw123e!@#$",
                "qP123e!@#$",
                "qwe$",
                "qwe123"
        );

        Assert.assertFalse(pass.stream().anyMatch(x -> !FormChecker.check(CheckType.PASSWORD, x)));
    }

    @Test
    public void badPassword() throws Exception {
        List<String> pass = Arrays.asList(
                "asdasdasdasdasdas",
                "asdasdasdasdasda123123s",
                "ㄱ23s",
                "sasd&23s",
                "asdasd^",
                "*",
                " ",
                "",
                "asdasd*",
                "asda sd*",
                "asda-d*",
                "asda-d",
                "asda(",
                "asda)",
                "asda_sd*"
        );
        Assert.assertFalse(pass.stream().anyMatch(x -> FormChecker.check(CheckType.PASSWORD, x)));
    }
}
