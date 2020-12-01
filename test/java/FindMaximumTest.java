import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {
    @Test
    public void givenMaxIntAtFirstPosition_shouldReturnSame() {

        Integer result = FindMaximum.findMaximumInteger(15,2,13);
        Assert.assertEquals((Integer) 15,result);
    }

    @Test
    public void givenMaxIntAtSecondPosition_shouldReturnSame() {

        Integer result = FindMaximum.findMaximumInteger(2,15,13);
        Assert.assertEquals((Integer) 15,result);
    }

    @Test
    public void givenMaxIntAtThirdPosition_shouldReturnSame() {

        Integer result = FindMaximum.findMaximumInteger(15,12,20);
        Assert.assertSame((Integer) 20,result);
    }


}
