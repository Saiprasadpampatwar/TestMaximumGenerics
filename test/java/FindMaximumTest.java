import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {
    @Test
    public void givenMaxAtFirstPosition_shouldReturnSame() {

        Integer result = FindMaximum.findMaximumInteger(15,2,13);
        Assert.assertSame(15,result);
    }

    @Test
    public void givenMaxAtSecondPosition_shouldReturnSame() {

        Integer result = FindMaximum.findMaximumInteger(2,15,13);
        Assert.assertSame(15,result);
    }

    @Test
    public void givenMaxAtThirdPosition_shouldReturnSame() {

        Integer result = FindMaximum.findMaximumInteger(15,12,20);
        Assert.assertSame(20,result);
    }
}
