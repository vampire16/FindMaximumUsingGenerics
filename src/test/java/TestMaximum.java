import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
    Maximum max;
    @Test
    public void givenIntegers_WhenMaxAtPositionOne_ShouldReturnMaximum() {
        max = new Maximum();
        Integer maximum = Maximum.findMaxInt(5,4,3);
        Assert.assertEquals((Integer)5,maximum);
    }

    @Test
    public void givenIntegers_WhenMaxAtPositionTwo_ShouldReturnMaximum() {
        max = new Maximum();
        Integer maximum = Maximum.findMaxInt(4, 5, 3);
        Assert.assertEquals((Integer)5, maximum);
    }

    @Test
    public void givenIntegers_WhenMaxAtPositionThree_ShouldReturnMaximum() {
        max = new Maximum();
        Integer maximum = Maximum.findMaxInt(3, 4, 5);
        Assert.assertEquals((Integer)5,maximum);
    }

    @Test
    public void givenFloats_WhenMaxAtPositionOne_ShouldReturnMaximum() {
        max = new Maximum();
        Float maximum = Maximum.findMaxFloat(5.2f,4.1f,3.4f);
        Assert.assertEquals((Float)5.2f,maximum);
    }

    @Test
    public void givenFloats_WhenMaxAtPositionTwo_ShouldReturnMaximum() {
        max = new Maximum();
        Float maximum = Maximum.findMaxFloat(4.1f,5.2f,3.4f);
        Assert.assertEquals((Float)5.2f,maximum);
    }

    @Test
    public void givenFloats_WhenMaxAtPositionThree_ShouldReturnMaximum() {
        max = new Maximum();
        Float maximum = Maximum.findMaxFloat(3.4f,4.1f,5.2f);
        Assert.assertEquals((Float)5.2f,maximum);
    }

}
