import java.util.ArrayList;
import java.util.List;

class Event {
  private int mPeople;
  private Boolean mBeverage;
  private Boolean mFood;
  private Boolean mEntertainment;
  private double mPrice;

  public Event(int people, String beverage, String food, String entertainment){
    mPeople = 1;
    mBeverage = beverage;
    mFood = food;
    mEntertainment = entertainment;
    mPrice = 0;
  }
   public int getPeople() {
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
    }

    public int getBeverage() {
      if (userBeverage.equals("yes")) {
        return cost = cost * 1.20;
      } else {
        return cost += 0;
      }
    }

    public int getFood() {
      if (userFood.equals("yes")) {
        return cost = cost * 1.60;
      } else {
        return cost += 0;
      }
    }

    public int getEntertainment() {
      if (userEntertainment.equals("yes")) {
        return cost = cost * 1.5;
      } else {
        return cost += 0;
      }
    }

    }
}
//only here to make a commit message work
