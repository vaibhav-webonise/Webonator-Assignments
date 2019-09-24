import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class PingPongTest {

    @Test
    public void runPingPongTest() {
        PingPong testPingPong = new PingPong();
        ArrayList<String> expectedOutput = new ArrayList<String>();
        expectedOutput.add("VAIBHAV");
        assertEquals(expectedOutput, testPingPong.runPingPong());

    }

}