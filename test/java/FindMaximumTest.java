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

    @Test
    public void givenMaxFloatAtFirstPosition_shouldReturnSame() {

        Float result = FindMaximum.findMaximumFloat(15.1f,2.2f,13.3f);
        Assert.assertEquals((Float) 15.1f,result);
    }

    @Test
    public void givenMaxFloatAtSecondPosition_shouldReturnSame() {

        Float result = FindMaximum.findMaximumFloat(2.2f,15.1f,13.3f);
        Assert.assertEquals((Float)15.1f,result);
    }

    @Test
    public void givenMaxFloatAtThirdPosition_shouldReturnSame() {

        Float result = FindMaximum.findMaximumFloat(15.1f,12.2f,20.1f);
        Assert.assertEquals((Float)20.1f,result);
    }
}
