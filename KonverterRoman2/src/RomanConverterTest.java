import org.junit.Assert;
import org.junit.Test;

public class RomanConverterTest {
    @Test

//    public void nothing(){
//        Assert.fail("Zkiepszczony test");
//    }

    public void shouldReturnIwhen1isConverted(){
        RomanConverter testObject = new RomanConverter();  //tworzymy obiekt testowy
        Assert.assertEquals("I", testObject.convert(1));
    }

    @Test
    public void shouldReturnIIwhen2isConverted(){
        RomanConverter testObject = new RomanConverter();
        Assert.assertEquals("II", testObject.convert(2));
    }

    @Test
    public void shouldReturnIIIwhen3isConverted(){
        RomanConverter testObject = new RomanConverter();
        Assert.assertEquals("III", testObject.convert(3));
    }
}
