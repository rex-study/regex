import org.junit.Assert;
import org.junit.Test;

public class PhoneFormCheckerTest {

    private final CheckType CHECK_TYPE = CheckType.PHONE;

    @Test
    public void simplePhone() {
        String p = "010-1234-1234";
        String p2 = "010-123-123";
        String p3 = "011-123-123";
        String p4 = "016-123-123";
        String p5 = "018-123-123";
        String p6 = "019-123-123";

        Assert.assertTrue(FormChecker.check(CHECK_TYPE, p));
        Assert.assertTrue(FormChecker.check(CHECK_TYPE, p2));
        Assert.assertTrue(FormChecker.check(CHECK_TYPE, p3));
        Assert.assertTrue(FormChecker.check(CHECK_TYPE, p4));
        Assert.assertTrue(FormChecker.check(CHECK_TYPE, p5));
        Assert.assertTrue(FormChecker.check(CHECK_TYPE, p6));
    }

    @Test
    public void notSupportedAddress() {
        String p = "017-1234-1234";
        String p2 = "012-1234-1234";
        String p3 = "013-1234-1234";

        String p4 = "010-12-1245";
        String p5 = "010-123-12";
        String p6 = "!10-123-123";
        String p7 = "r01-123-123";
        Assert.assertFalse(FormChecker.check(CHECK_TYPE, p));
        Assert.assertFalse(FormChecker.check(CHECK_TYPE, p2));
        Assert.assertFalse(FormChecker.check(CHECK_TYPE, p3));
        Assert.assertFalse(FormChecker.check(CHECK_TYPE, p4));
        Assert.assertFalse(FormChecker.check(CHECK_TYPE, p5));
        Assert.assertFalse(FormChecker.check(CHECK_TYPE, p6));
        Assert.assertFalse(FormChecker.check(CHECK_TYPE, p7));


    }

    @Test
    public void notNumber() {
        String p = "010-a123-1234";
        String p2 = "010-!123-1234";
        String p3 = "010-1123-a234";
        Assert.assertFalse(FormChecker.check(CHECK_TYPE, p));
        Assert.assertFalse(FormChecker.check(CHECK_TYPE, p2));
        Assert.assertFalse(FormChecker.check(CHECK_TYPE, p3));
    }

    @Test
    public void ifNull() {
        String p = "010-123 -1234";
        String p2 = "010-123- 1234";
        String p3 = "010-123-1234 ";
        String p4 = "010-123-1234   ";
        Assert.assertFalse(FormChecker.check(CHECK_TYPE,p));
        Assert.assertFalse(FormChecker.check(CHECK_TYPE,p2));
        Assert.assertFalse(FormChecker.check(CHECK_TYPE,p3));
        Assert.assertFalse(FormChecker.check(CHECK_TYPE,p4));
    }
}
