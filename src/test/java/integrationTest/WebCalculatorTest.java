package integrationTest;

import logic.utils.HttpClient;
import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

public class WebCalculatorTest {

    HttpClient client = new HttpClient("http://localhost:7777/CA1_TTT/calculator");

    @Test
    public void testAdd() throws IOException {
        String res = client.makeHttpRequest("?operation=add&n1=2&n2=3");
        assertEquals("Result of: 2+3= 5", res);
    }

    @Test(expected = IOException.class)
    public void testAddIllegal() throws IOException {
        client.makeHttpRequest("?operation=add&n1=a&n2=3");
    }

    @Test
    public void testSub() throws IOException {
        String res = client.makeHttpRequest("?operation=sub&n1=2&n2=3");
        assertEquals("Result of: 2-3= -1", res);
    }

    @Test(expected = IOException.class)
    public void testSubIllegal() throws IOException {
        client.makeHttpRequest("?operation=sub&n1=a&n2=3");
    }

    @Test
    public void testMul() throws IOException {
        String res = client.makeHttpRequest("?operation=mul&n1=2&n2=3");
        assertEquals("Result of: 2*3= 6", res);
    }

    @Test(expected = IOException.class)
    public void testMulIllegal() throws IOException {
        client.makeHttpRequest("?operation=mul&n1=a&n2=3");
    }

    @Test
    public void testDiv() throws IOException {
        String res = client.makeHttpRequest("?operation=div&n1=2&n2=3");
        assertEquals("Result of: 2/3= 0", res);
    }

    @Test(expected = IOException.class)
    public void testDivIllegal() throws IOException {
        client.makeHttpRequest("?operation=div&n1=a&n2=3");
    }

    @Test(expected = IOException.class)
    public void testDivIllegal2() throws IOException {
        client.makeHttpRequest("?operation=div&n1=2&n2=0");
    }
}
