import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
    Maximum max;
    @Test
    public void givenIntegers_WhenMaxAtPositionOne_ShouldReturnMaximum() {
        max=new Maximum(5,4,3);
        Integer maximum = (Integer) max.findMax();
        Assert.assertEquals((Integer)5,maximum);
    }

    @Test
    public void givenIntegers_WhenMaxAtPositionTwo_ShouldReturnMaximum() {
        max=new Maximum(4,5,3);
        Integer maximum = (Integer) max.findMax();
        Assert.assertEquals((Integer)5, maximum);
    }

    @Test
    public void givenIntegers_WhenMaxAtPositionThree_ShouldReturnMaximum() {
        max=new Maximum(3,4,5);
        Integer maximum = (Integer) max.findMax();
        Assert.assertEquals((Integer)5,maximum);
    }

    @Test
    public void givenFloats_WhenMaxAtPositionOne_ShouldReturnMaximum() {
        max=new Maximum(5.2f,4.1f,3.4f);
        Float maximum = (Float) max.findMax();
        Assert.assertEquals((Float)5.2f,maximum);
    }

    @Test
    public void givenFloats_WhenMaxAtPositionTwo_ShouldReturnMaximum() {
        max=new Maximum(4.1f,5.2f,3.4f);
        Float maximum = (Float) max.findMax();
        Assert.assertEquals((Float)5.2f,maximum);
    }

    @Test
    public void givenFloats_WhenMaxAtPositionThree_ShouldReturnMaximum() {
        max=new Maximum(3.4f,4.1f,5.2f);
        Float maximum = (Float) max.findMax();
        Assert.assertEquals((Float)5.2f,maximum);
    }

    @Test
    public void givenStrings_WhenMaxAtPositionOne_ShouldReturnMaximum() {
        max=new Maximum("C","B","A");
        String maximum = (String) max.findMax();
        Assert.assertEquals("C",maximum);
    }

    @Test
    public void givenStrings_WhenMaxAtPositionTwo_ShouldReturnMaximum() {
        max=new Maximum("A","C","B");
        String maximum = (String) max.findMax();
        Assert.assertEquals("C",maximum);
    }

    @Test
    public void givenStrings_WhenMaxAtPositionThree_ShouldReturnMaximum() {
        max=new Maximum("A","B","C");
        String maximum = (String) max.findMax();
        Assert.assertEquals("C",maximum);
    }

}
