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
  public void newEvent_reportsCorrectPartyCostBasedOnPeopleAttending_150() {
    Event testEvent = new Event(10, "no", "no", "no");
    assertEquals((150.0, 150.0, 0.0f), testEvent.getPeople());
  }

  @Test
  public void newEvent_reportsCorrectPartyCostPeopleAttendingAndDrinks_180() {
    Event testEvent = new Event(10, "yes", "no", "no");
    assertEquals((180.0, 180.0, 0.0f), testEvent.getBeverage());
  }

  @Test
  public void nnewEvent_reportsCorrectPartyCostPeopleAttendingAndDrinksAndFood_288() {
    Event testEvent = new Event(10, "yes", "yes", "no");
    assertEquals(288.0, testEvent.getFood());
  }

  @Test
  public void newEvent_reportsCorrectPartyCostPeopleAttendingAndDrinksAndEntertainment_432() {
    Event testEvent = new Event(10, "yes", "yes", "yes");
    assertEquals(432.0, testEvent.getEntertainment());
  }
}
