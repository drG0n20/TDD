package com.company;
import org.junit.Assert;
import org.junit.Test;

public class VendingMachineTest {

    public static void main(String[] args) {

        @Test
         public void WhenChoosingProductWithoutMoneyNothingHappens{
            VendingMachine vendingMachine = new VendingMachine();
            String result = vendingMachine.execute("A");
            Assert.assertEquals("",result);
        }
    }
}
