import org.junit.Assert;
import org.junit.Test;

public class IDFormCheckerTest {

    private final CheckType CHECK_TYPE = CheckType.ID;

    @Test
    public void onlyEnglish() {

        String id = "jhun";

        Assert.assertTrue(FormChecker.check(CHECK_TYPE, id));

    }
}