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

    @Parameters(name = "{1} -> {0}")
    public static Object[][] data() {
        return new Object[][]{
                {"I", 1},
                {"II", 2},
                {"III", 3},
                {"IV", 4},
                {"V", 5},
                {"VI", 6},
                {"VII", 7},
                {"VIII", 8},
                {"IX", 9},
                {"X", 10},
                {"XI", 11},
                {"XIV", 14},
                {"XV", 15},
                {"XVII", 17},
                {"XIX", 19},
                {"XX", 20},
                {"XXXIX", 39},
                {"XL", 40},
                {"XLI", 41},
                {"L", 50},
                {"LXXXIX", 89},
                {"XC", 90},
                {"C", 100},
                {"CD", 400},
                {"D", 500},
                {"CM", 900},
                {"M", 1000},
        };
    }

    public RomanConverterTest(String expextedOutput, int number) { //elementy musza sie zgadzac parametra wyzej

        this.expextedOutput = expextedOutput;
        this.number = number;
    }

    @Test
    public void shouldConvertNumbertoRoman() {
        assertConversion(expextedOutput, number);
    }

    //FUNKCJA POMOCNICZA

    public void assertConversion(String expected, int number) {
        Assert.assertEquals(expected, testObject.convert(number));
    }
}
