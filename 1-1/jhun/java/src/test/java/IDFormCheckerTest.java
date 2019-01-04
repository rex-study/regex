import org.junit.Assert;
import org.junit.Test;

public class IDFormCheckerTest {

    private final CheckType CHECK_TYPE = CheckType.ID;

    @Test
    public void ifWordIsNull() {
        String id = "";
        String id2 = " ";
        Assert.assertFalse(FormChecker.check(CHECK_TYPE, id));
        Assert.assertFalse(FormChecker.check(CHECK_TYPE, id2));
    }

    @Test
    public void wordLastIsNullWithNull() {
        String id = "aabbccdde ";
        String id2 = "a vcvasdw";
        Assert.assertFalse(FormChecker.check(CHECK_TYPE, id));
        Assert.assertFalse(FormChecker.check(CHECK_TYPE, id2));
    }

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
    public void onlyEnglishLength10() {
        String id = "aabbccddee";
        Assert.assertTrue(FormChecker.check(CHECK_TYPE, id));
    }

    @Test
    public void firstNotEnglish() {
        String id = "1234";
        String id2 = "!asdasd";
        String id3 = "ㄱasdasd";

        Assert.assertFalse(FormChecker.check(CHECK_TYPE, id));
        Assert.assertFalse(FormChecker.check(CHECK_TYPE, id2));
        Assert.assertFalse(FormChecker.check(CHECK_TYPE, id3));
    }

    @Test
    public void firstEnglishWithKorean() {
        String id = "a하하하하";
        String id2 = "a하asd";
        Assert.assertFalse(FormChecker.check(CHECK_TYPE, id));
        Assert.assertFalse(FormChecker.check(CHECK_TYPE, id2));
    }

    @Test
    public void firstEnglishWithMark() {
        String id = "a@!#";
        String id2 = "a123123.";
        Assert.assertFalse(FormChecker.check(CHECK_TYPE, id));
        Assert.assertFalse(FormChecker.check(CHECK_TYPE, id2));
    }
}