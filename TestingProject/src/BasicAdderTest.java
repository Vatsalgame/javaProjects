import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasicAdderTest {
    private int num1;
    private int num2;

    @Before
    public void setUp() throws Exception {
        num1 = 5;
        num2 = 7;
    }

    @Test
    public void testAdd() throws Exception {
        int result = new BasicAdder().add(num1, num2);
        assertEquals(12, result);
    }
}