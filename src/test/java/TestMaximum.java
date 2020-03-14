import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
    Maximum max;
    @Test
    public void givenIntegers_WhenMaxAtPositionOne_ShouldReturnMaximum() {
        max = new Maximum();
        Integer maximum = Maximum.findMaxInt(5,4,3);
        Assert.assertEquals(5,(int)maximum);
    }

    @Test
    public void givenIntegers_WhenMaxAtPositionTwo_ShouldReturnMaximum() {
        max = new Maximum();
        Integer maximum = Maximum.findMaxInt(4, 5, 3);
        Assert.assertEquals(5, (int) maximum);
    }

    @Test
    public void givenIntegers_WhenMaxAtPositionThree_ShouldReturnMaximum() {
        max = new Maximum();
        Integer maximum = Maximum.findMaxInt(3, 4, 5);
        Assert.assertEquals(5, (int) maximum);
    }

}
