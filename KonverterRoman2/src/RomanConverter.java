public class RomanConverter {
    public String convert(int number) {
        String result = "";
        if(number == 4)return "IV";
        if(number>=5) {
            result = "V";
                    number -=5;
        }
        for (int i = 0; i <number ; i++) {
            result +="I";
        }
        return result;
    }
}
