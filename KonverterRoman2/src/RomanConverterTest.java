import org.junit.Assert;
import org.junit.Test;

public class RomanConverterTest {
    RomanConverter testObject = new RomanConverter();  //tworzymy obiekt testowy
    @Test

//    public void nothing(){
//        Assert.fail("Zkiepszczony test");
//    }

    public void shouldReturnIwhen1isConverted(){
        assertConversion("I", 1);
    }

    @Test
    public void shouldReturnIIwhen2isConverted() {
        assertConversion("II", 2);
    }

    @Test
    public void shouldReturnIIIwhen3isConverted(){
        assertConversion("III", 3);
    }

    /**
     * FUNKCJA POMOCNICZA
     *
     */

    public void assertConversion(String expected, int number) {
        Assert.assertEquals(expected, testObject.convert(number));
    }
}
