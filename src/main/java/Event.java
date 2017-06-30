import java.util.ArrayList;
import java.util.List;

class Event {
  private int mPeople;
  private Boolean mBeverage;
  private Boolean mFood;
  private Boolean mEntertainment;
  private int mPrice;

  public Event(int people, String beverage, String food, String entertainment){
    mPeople = 1;
    mBeverage = beverage;
    mFood = food;
    mEntertainment = entertainment;
    Integer cost = 0;
  }
    int getPeople(int people) {
      if (mPeople <=10)  {
        return cost += 150;
      } else if (mPeople > 10 && mPeople <= 50) {
        return  cost += 300;
      } else if (mPeople > 50 && mPeople <= 100)  {
        return cost = +600;
      } else if (mPeople > 100 && mPeople <= 200) {
        return cost = +1200;
      } else if (mPeople > 200)  {
        return cost = +2400;
      }

    String getBeverage(String userBeverage) {
      if (userBeverage.equals("yes")) {
        return cost = cost * 1.20;
      } else {
        return cost += 0;
      }
    }

    Boolean getFood(String userFood) {
      if (userFood.equals("yes")) {
        return cost = cost * 1.60;
      } else {
        return cost += 0;
      }
    }

    String getEntertainment(String userEntertainment) {
      if (userEntertainment.equals("yes")) {
        return cost = cost * 1.5;
      } else {
        return cost += 0;
      }
    }

    }
}
//only here to make a commit message work
