public class MyMath {
    int x;
    int y;

    public static void main(String[] args) {
        System.out.println(divide(4, 0));
    }

    public static double divide(int x, int y){
        if (y == 0) throw new ArithmeticException("нельзя делить на 0");

        return x / y;
    }
}
