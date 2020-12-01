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

    @Test
    public void givenMaxStringAtFirstPosition_shouldReturnSame() {

        String result = FindMaximum.findMaximumString("Peach","Banana","Apple");
        Assert.assertEquals((String)"Peach" ,result);
    }

    @Test
    public void givenMaxStringAtSecondPosition_shouldReturnSame() {

        String result = FindMaximum.findMaximumString("Banana","Peach","Apple");
        Assert.assertEquals((String)"Peach" ,result);
    }

    @Test
    public void givenMaxStringAtThirdPosition_shouldReturnSame() {

        String result = FindMaximum.findMaximumString("Banana","Apple","Peach");
        Assert.assertEquals((String)"Peach" ,result);
    }


    @Test
    public void maximumObjectInteger() {
        Integer maximumObject = FindMaximum.maximumOfObject(240, 250, 220);
        Assert.assertEquals((Integer) 250, maximumObject);
    }

    @Test
    public void maximumObjectFloat() {
        Float maximumObject = FindMaximum.maximumOfObject(9.999f, 10.001f, 10.0f);
        Assert.assertEquals((Float) 10.001f, maximumObject);
    }

    @Test
    public void maximumObjectString() {
        String maximumObject = FindMaximum.maximumOfObject("Sai", "Chetan", "Murli");
        Assert.assertEquals((String) "Sai", maximumObject);
    }

    @Test
    public void givenGenericInteger() {
        Integer maxValueInteger = new FindMaximum<Integer>(6, 7, 8).findMaxValueAtAnyPosition();
        Assert.assertEquals((Integer) 8, maxValueInteger);
    }

    @Test
    public void givenGenericFloat() {
        Float maxValueFloat = new FindMaximum<Float>(6.9f, 9.9f, 8.0f).findMaxValueAtAnyPosition();
        Assert.assertEquals((Float) 9.9f, maxValueFloat);
    }

    @Test
    public void givenGenericString() {
        String maxValueString = new FindMaximum<String>("Yahoo", "Google", "Microsoft").findMaxValueAtAnyPosition();
        Assert.assertEquals((String) "Yahoo", maxValueString);
    }

}
