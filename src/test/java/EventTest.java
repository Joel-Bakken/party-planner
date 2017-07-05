import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class EventTest {

  @Test
  public void newEvent_instantiatesCorrectly_true() {
    Event testEvent = new Event(10, "yes", "yes", "yes");
    assertEquals(true, testEvent instanceof Event);
  }
}
