import org.junit.Assert;
import org.junit.Test;
public class Testclass {
    @Test
    public void givenTwoNumbersWhenAddedShouldReturnSum() {
        int i = 10;
        int j = 20;
        Sumofnumbers add = new Sumofnumbers();
        int result = add.add(i, j);
        Assert.assertEquals(30, result);
    }
}
