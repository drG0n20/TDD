import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    FizzBuzz testObject = new FizzBuzz();

    @Test //zeby uruchomic test

    public void shouldReturnEmptyArrayWhenZeroProvided() {
        Assert.assertArrayEquals(new String[0], testObject.fizzBuzz(0));
    }

    @Test
    public void shouldReturnArraywithOnly1When1Provided() {
        Assert.assertArrayEquals(new String[]{"1"}, testObject.fizzBuzz(1));
    }

    @Test
    public void shouldReturnArraywithOnly1And2When2Provided() {
        Assert.assertArrayEquals(new String[]{"1", "2"}, testObject.fizzBuzz(2));
    }

    @Test
    public void shouldReturnArraywithOnly1And2AndFizWhen3Provided() {
        Assert.assertArrayEquals(new String[]{"1", "2", "Fizz"}, testObject.fizzBuzz(3));
    }
}
