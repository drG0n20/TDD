package com.company;

public class VendingMachine {
    public String execute(String input) {
        if (input.length()>1) return input.substring(0,1); //jezeli podajemy 2 argumenty to jest pocatek i koniec
        return "";
    }
}
