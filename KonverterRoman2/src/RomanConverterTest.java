import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class RomanConverterTest {
    private final String expextedOutput;
    private final int number;
    RomanConverter testObject = new RomanConverter();  //tworzymy obiekt testowy

    @Parameters
    public static Object[][] data(){
        return new Object[][] {
                {"I", 1},
                {"II", 2},
                {"III", 3},
                {"IV", 5}
        };
    }

    public RomanConverterTest(String expextedOutput, int number) { //elementy musza sie zgadzac parametra wyzej

        this.expextedOutput = expextedOutput;
        this.number = number;
    }

    @Test
    public void assertConvertedNumbers(){
        assertConversion(expextedOutput, number);
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

    @Test
    public void shouldReturnVIIIwhen8isConverted(){
        assertConversion("VIII", 8);
    }



    //FUNKCJA POMOCNICZA

    public void assertConversion(String expected, int number) {
        Assert.assertEquals(expected, testObject.convert(number));
    }
}
