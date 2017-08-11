public class RomanConverter {
    private String[] RomanNumber = {"I", "IV", "V", "IX", "X"};
    private int[] romanValues = {1, 4, 5, 9, 10};

    public String convert(int number) {
        String result = "";

        for (int romanIndex = RomanNumber.length - 1; number > 0; romanIndex--) { //-- bo idziemy od tylu
           if (ro)
            result += RomanNumber[romanIndex]; //doklejamy sobie znaczek
            number -= romanValues[romanIndex];
        }
        return result;
//        if (number >= 10) {
//            for (; number >= 10; ) {
//                result += "X";
//                number -= 10;
//            }
//        }
//        if (number == 9) return result += "IX";
//        if (number == 4) return result += "IV";
//        if (number >= 5) {
//            result += "V"; // +zeby zadzialalo z 15
//            number -= 5;
//        }
//        for (int i = 0; i < number; i++) {
//            result += "I";
//        }
//        return result;
    }
}
