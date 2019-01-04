import org.junit.Assert;
import org.junit.Test;

public class IDFormCheckerTest {

    private final CheckType CHECK_TYPE = CheckType.ID;

    @Test
    public void onlyEnglish() {
        String id = "jhun";
        Assert.assertTrue(FormChecker.check(CHECK_TYPE, id));
    }

    @Test
    public void englishWithNumber() {
        String id = "jhun1234";
        Assert.assertTrue(FormChecker.check(CHECK_TYPE, id));
    }


    @Test
    public void onlyEnglishAndLong() {
        String id = "jhunjhunjhunjhunjhun";
        Assert.assertFalse(FormChecker.check(CHECK_TYPE, id));
    }

    @Test
    public void firstNotEnglish() {
        String id = "1234";
        Assert.assertFalse(FormChecker.check(CHECK_TYPE, id));
    }

    @Test
    public void firstEnglishWithKorean() {
        String id = "a하하하하";
        Assert.assertFalse(FormChecker.check(CHECK_TYPE, id));
    }

    @Test
    public void firstEnglishWithMark() {
        String id = "a@!#";
        Assert.assertFalse(FormChecker.check(CHECK_TYPE, id));
    }
}