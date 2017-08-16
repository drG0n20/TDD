package com.company;
import org.junit.Assert;
import org.junit.Test;

public class VendingMachineTest {

        @Test
        public void nothing(){
            Kasa kasa = null;
            Produkty produkty = null;
            VendingMachine vendingMachine = new VendingMachine(kasa, produkty);
        }


}
