import org.junit.Assert;
import org.junit.Test;

public class RomanConverterTest {
    RomanConverter testObject = new RomanConverter();  //tworzymy obiekt testowy
    @Test

//    public void nothing(){
//        Assert.fail("Zkiepszczony test");
//    }

    public void shouldReturnIwhen1isConverted(){
        Assert.assertEquals("I", testObject.convert(1));
    }

    @Test
    public void shouldReturnIIwhen2isConverted(){
        Assert.assertEquals("II", testObject.convert(2));
    }

    @Test
    public void shouldReturnIIIwhen3isConverted(){
        Assert.assertEquals("III", testObject.convert(3));
    }
}
