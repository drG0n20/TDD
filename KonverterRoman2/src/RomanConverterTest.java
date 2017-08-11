import org.junit.Assert;
import org.junit.Test;

public class RomanConverterTest {
    RomanConverter testObject = new RomanConverter();  //tworzymy obiekt testowy
    @Test

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

    @Test
    public void shouldReturnIVwhen4isConverted(){
        assertConversion("IV", 4);
    }

    @Test
    public void shouldReturnVwhen5isConverted(){
        assertConversion("V", 5);
    }

    @Test
    public void shouldReturnVIwhen6isConverted(){
        assertConversion("VI", 6);
    }

    @Test
    public void shouldReturnVIIwhen7isConverted(){
        assertConversion("VII", 7);
    }



    //FUNKCJA POMOCNICZA

    public void assertConversion(String expected, int number) {
        Assert.assertEquals(expected, testObject.convert(number));
    }
}
