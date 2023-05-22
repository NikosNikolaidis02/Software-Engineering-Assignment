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

    public boolean isPrime(int n) {
        if (n < 2) {
            throw new IllegalArgumentException("The input value should be greater or equal than 2");
        } else {
            int counter = 0;
            boolean prime = true;
            for (int i = 1 ; i < n ; i++) {
                if (n % i == 0) {
                    counter ++;
                    if (counter > 2) {
                        prime = false;
                        break;
                    }
                }
            }
            return prime;
        }
    }
}
