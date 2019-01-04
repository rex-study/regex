import org.junit.Assert;
import org.junit.Test;

public class IDFormCheckerTest {

//    영어,숫자 , 단 첫번째 글자는 무조건 영어소문자, 길이 10
    private final CheckType CHECK_TYPE = CheckType.ID;

    @Test
    public void onlyEnglishAndShort() {

        String id = "jhun";

        Assert.assertFalse(FormChecker.check(CHECK_TYPE, id));

    }
}