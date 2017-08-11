import org.junit.Assert;
import org.junit.Test;

public class RomanConverterTest {
    @Test

//    public void nothing(){
//        Assert.fail("Zkiepszczony test");
//    }

    public void nothing(){
        RomanConverter testObject = new RomanConverter();  //tworzymy obiekt testowy
        Assert.assertEquals("I", testObject.convert(1));
    }
}
