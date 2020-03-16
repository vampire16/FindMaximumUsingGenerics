import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
    @Test
    public void givenIntegers_WhenMaxAtPositionOne_ShouldReturnMaximum() {
        Integer maximum = Maximum.findMaxInt(5,4,3);
        Assert.assertEquals((Integer)5,maximum);
    }

    @Test
    public void givenIntegers_WhenMaxAtPositionTwo_ShouldReturnMaximum() {
        Integer maximum = Maximum.findMaxInt(4, 5, 3);
        Assert.assertEquals((Integer)5, maximum);
    }

    @Test
    public void givenIntegers_WhenMaxAtPositionThree_ShouldReturnMaximum() {
        Integer maximum = Maximum.findMaxInt(3, 4, 5);
        Assert.assertEquals((Integer)5,maximum);
    }

    @Test
    public void givenFloats_WhenMaxAtPositionOne_ShouldReturnMaximum() {
        Float maximum = Maximum.findMaxFloat(5.2f,4.1f,3.4f);
        Assert.assertEquals((Float)5.2f,maximum);
    }

    @Test
    public void givenFloats_WhenMaxAtPositionTwo_ShouldReturnMaximum() {
        Float maximum = Maximum.findMaxFloat(4.1f,5.2f,3.4f);
        Assert.assertEquals((Float)5.2f,maximum);
    }

    @Test
    public void givenFloats_WhenMaxAtPositionThree_ShouldReturnMaximum() {
        Float maximum = Maximum.findMaxFloat(3.4f,4.1f,5.2f);
        Assert.assertEquals((Float)5.2f,maximum);
    }

    @Test
    public void givenStrings_WhenMaxAtPositionOne_ShouldReturnMaximum() {
        String maximum = Maximum.findMaxString("C","B","A");
        Assert.assertEquals((String)"C",maximum);
    }

    @Test
    public void givenStrings_WhenMaxAtPositionTwo_ShouldReturnMaximum() {
        String maximum = Maximum.findMaxString("A","C","B");
        Assert.assertEquals((String)"C",maximum);
    }

    @Test
    public void givenStrings_WhenMaxAtPositionThree_ShouldReturnMaximum() {
        String maximum = Maximum.findMaxString("A","B","C");
        Assert.assertEquals((String)"C",maximum);
    }


}
