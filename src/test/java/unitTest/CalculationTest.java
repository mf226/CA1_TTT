package unitTest;

import logic.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculationTest {

    Calculator sc = new Calculator();

    @Test
    public void testAddPositive() {
        int result = sc.add(2, 2);
        assertEquals(4, result);
    }

    @Test
    public void testAddNegative() {
        int result = sc.add(-2, -2);
        assertEquals(-4, result);
    }

    @Test
    public void testAddPositiveAndNegative() {
        int result = sc.add(2, -2);
        assertEquals(0, result);
    }

    @Test
    public void testSubPositive() {
        int result = sc.sub(2, 2);
        assertEquals(0, result);
    }

    @Test
    public void testSubNegative() {
        int result = sc.sub(-2, -2);
        assertEquals(0, result);
    }

    @Test
    public void testSubPositiveAndNegative() {
        int result = sc.sub(2, -2);
        assertEquals(4, result);
    }

    @Test
    public void testMulPositive() {
        int result = sc.mul(2, 2);
        assertEquals(4, result);
    }

    @Test
    public void testMulNegative() {
        Calculator sc = new Calculator();
        int result = sc.mul(-2, -2);
        assertEquals(4, result);
    }

    @Test
    public void testMulPositiveAndNegative() {
        int result = sc.mul(2, -2);
        assertEquals(-4, result);
    }

    @Test
    public void testDivPositive() {
        int result = sc.div(2, 2);
        assertEquals(1, result);
    }

    @Test
    public void testDivNegative() {
        int result = sc.div(-2, -2);
        assertEquals(1, result);
    }

    @Test
    public void testDivPositiveAndNegative() {
        int result = sc.div(2, -2);
        assertEquals(-1, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivException() {
        sc.div(2, 0);
    }
}
