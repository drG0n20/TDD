package com.company;
import org.junit.Assert;
import org.junit.Test;

public class VendingMachineTest {
        VendingMachine vendingMachine = new VendingMachine();

        @Test
        public void whenChoosingProductWithoutMoneyNothingHappens(){
            String result = vendingMachine.execute("A");
            Assert.assertEquals("",result);
        }

        @Test
        public void whenInsertNotEnoughMoneyAndPressProductGiveMoneyBack(){
            String result = vendingMachine.execute("DA");
            Assert.assertEquals("D",result);
        }

        @Test
        public void whenInsertQarterIwantQarterBack(){
            String result = vendingMachine.execute("QA");
            Assert.assertEquals("Q",result);
        }

        @Test
        public void whenInsertMoreThanOneCoinShouldReturnThemAllBack(){
            String result = vendingMachine.execute("DQNdA");
            Assert.assertEquals("DQNd",result);
        }

        @Test
        public void whenClickAShouldGetAWithoutMoney(){
            String result = vendingMachine.execute("AA");
            Assert.assertEquals("",result);
        }
}
