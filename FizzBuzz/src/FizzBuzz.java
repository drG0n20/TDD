public class FizzBuzz {
    public String[] fizzBuzz(int n) {
        String[] result = new String[n];
        for (int i = 1; i <= n; i++) {
            transformElement(result, i);
        }
//        if (n == 2) result = new String[]{"1", "2"};
//        if (n == 1) result = new String[]{"1"};
        return result;
    }

    private void transformElement(String[] result, int i) {
        if (i == 3) {  //bo i +1
            result[i - 1] = "Fizz";
        } else {
            result[i - 1] = (i) + "";
        }
    }
}
