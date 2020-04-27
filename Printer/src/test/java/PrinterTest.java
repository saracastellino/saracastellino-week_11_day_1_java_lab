import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer(50, 30, 40, 50);
    }

    @Test
    public void getNumberOfSheets() {
        assertEquals(50, printer.getNumberOfSheets());
    }

    @Test
    public void getVolumeOfInk() {
        assertEquals(30, printer.getVolumeOfInk());
    }

    @Test
    public void print() {
        printer.print();
        assertEquals(10, printer.getNumberOfSheets());
        assertEquals(20, printer.getToner());
    }
}
