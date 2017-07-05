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

  @Test
  public void newEvent_calculatesCorrectly_2400() {
    Event testEvent = new Event(200, "no", "no", "no");
    assertEquals(2400, testEvent.calculateCost());
  }
}
