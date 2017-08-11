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

    @Test
    public void shouldReturnArraywithBuzzWhen5Provided() {
        Assert.assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz"}, testObject.fizzBuzz(5));
    }

    @Test
    public void shouldReturnArraywith2Fizzon3rdAnd6thPositionWhen6Provided() {
        Assert.assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz"}, testObject.fizzBuzz(6));
    }

    @Test
    public void shouldReturnArraywith2BuzzWhen10Provided() {
        Assert.assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"},
                testObject.fizzBuzz(10));
    }

    @Test
    public void shouldReturnFizzBuzzWhenElementis15() {
        Assert.assertEquals("FizzBuzz", testObject.getStringRepresentation(300));
        //tu getstringrepresentation zamiast testObject()
    }

//    @Test
//    public void shouldNotAcceptNegativeNumbers() {
//        ("Fizz", testObject.getStringRepresentation(-5));
//    }

//    public void test (int input, String[] expectedOutput){
//        Assert.assertArrayEquals(expectedOutput, testObject.fizzBuzz());
//    }
}
