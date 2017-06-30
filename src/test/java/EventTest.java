import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class EventTest {

  @Test
  public void numberPeople_howManyPeopleAreAttending_1()  {
    Event testEvent = new Event();
    Integer expected = 1;
    assertEquals(expected, testEvent.numberPeople());
  }
  @Test
  public void beverageWanted_doYouWantBeverageService_true() {
    Event testEvent = new Event();
    boolean expected = true;
    assertEquals(expected, testEvent.beverageWanted());
  }
  @Test
  public void foodWanted_doYouWantFoodService_true() {
    Event testEvent = new Event();
    boolean expected = true;
    assertEquals(expected, testEvent.foodWanted());
  }
}
