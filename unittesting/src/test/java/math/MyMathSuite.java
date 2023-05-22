package math;

import org.junit.Rule;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * This a Suite file for MyMathTest and MyMathFactorialParameterizedTest
 *
 * @author NikosNikolaidis02
 * @version 1.0
 * @since 2023-05-22
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({MyMathTest.class, MyMathFactorialParameterizedTest.class})
public class MyMathSuite {

}
