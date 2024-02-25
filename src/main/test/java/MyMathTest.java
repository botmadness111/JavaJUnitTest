import org.junit.Test;

public class MyMathTest {

    @Test(expected = ArithmeticException.class)
    public void divideOnZeroShouldThrowException(){
        MyMath.divide(4, 0);
    }
}
