import java.util.ArrayList;
import java.util.List;

class Event {
  private float mPeople;
  private String mBeverage;
  private String mFood;
  private String mEntertainment;
  private float mPrice;

  public Event(int people, String beverage, String food, String entertainment){
    mPeople = 0;
    mBeverage = beverage;
    mFood = food;
    mEntertainment = entertainment;
    mPrice = 0;
  }
   public float getPeople() {
      if (mPeople <=10)  {
        return mPrice += 150;
      } else if (mPeople > 10 && mPeople <= 50) {
        return  mPrice += 300;
      } else if (mPeople > 50 && mPeople <= 100)  {
        return mPrice += 600;
      } else if (mPeople > 100 && mPeople <= 200) {
        return mPrice += 1200;
      } else if (mPeople > 200)  {
        return mPrice += 2400;
      } else {
        return 0;
      }
    }

    public float getBeverage() {
      if (mBeverage.equals("yes")) {
        return mPrice *= 1.20;
      } else {
        return mPrice += 0;
      }
    }

    public float getFood() {
      if (mFood.equals("yes")) {
        return mPrice *= 1.60;
      } else {
        return mPrice += 0;
      }
    }

    public float getEntertainment() {
      if (mEntertainment.equals("yes")) {
        return mPrice *= 1.5;
      } else {
        return mPrice += 0;
      }
    }
    public float calculateCost()  {
      return mPrice;
    }
}
