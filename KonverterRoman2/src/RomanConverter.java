public class RomanConverter {
    public String convert(int number) {
        String result = "";
        if (number == 9) return "IX";
        if (number >= 10) {
            result = "X";
            number -= 10;
        }
        if (number == 4) return result += "IV";
        if (number >= 5) {
            result = "V";
            number -= 5;
        }
        for (int i = 0; i < number; i++) {
            result += "I";
        }
        return result;
    }
}
