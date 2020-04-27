import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculate;

    @Before
    public void before() {
        calculate = new Calculator();
    }

    @Test
    public void add() {
        assertEquals(30, calculate.add(20, 10));
    }

    @Test
    public void subtract() {
        assertEquals(-10, calculate.subtract(10, 20));
    }

    @Test
    public void multiply() {
        assertEquals(200, calculate.multiply(20, 10));
    }

    @Test
    public void divide() {
        assertEquals(0.51, calculate.divide(10.5, 20.5), 0.01);
    }

}