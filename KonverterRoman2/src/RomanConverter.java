public class RomanConverter {
    private String[] romanNumbers = {"I", "IV", "V", "IX", "X", "XL"};
    private int[] romanValues = {1, 4, 5, 9, 10, 40};

    public String convert(int number) {
        String result = "";
        int romanIndex = romanNumbers.length - 1;
        while (number > 0) {
            while (romanValues[romanIndex] <= number) {
                result += romanNumbers[romanIndex];
                number -= romanValues[romanIndex];
            }
            romanIndex--;
        }
//        for (int romanIndex = romanNumbers.length - 1; number > 0; romanIndex--) { //-- bo idziemy od tylu
//            for (; romanValues[romanIndex] <= number; ) {
//                result += romanNumbers[romanIndex]; //doklejamy sobie znaczek
//                number -= romanValues[romanIndex];
//            }
//        }
        return result;
    }
}
