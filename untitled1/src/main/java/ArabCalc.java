public class ArabCalc {

    private int value1;
    private int value2;
    private int result;

    public ArabCalc(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }



    public int addition() {
        result = value1 + value2;
        return result;

    }


    public int division() {
        try {
            result = value1 / value2;
            return result;
        } catch (ArithmeticException exception) {
            return 0;
        }

    }


    public int multiplication() {
        result = value1 * value2;
        return result;
    }


    public int subtraction() {
        result = value1 - value2;
        return result;
    }


    public int getResult() {
        return result;
    }


}