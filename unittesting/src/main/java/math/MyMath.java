package math;

/**
 * This is a Java class that contains a method that computes the factorial of a number n
 *
 * @author NikosNikolaidis02
 * @version 1.0
 * @since 2023-05-21
 */
public class MyMath {

    /***
     * Receives an Integer value n and computes the factorial of it!
     * @param n the input variable
     * @return the factorial of the parameter
     * @exception ArithmeticException when the value is higher than 12 or lower than 0
     */
    public int factorial(int n) {
        if (n<0 || n > 12) {
            throw new ArithmeticException("The value is higher than 12 or lower than 0");
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
}
