import java.util.ArrayList;
import java.util.List;

class Event {
  private int mPeople;
  private Boolean mBeverage;
  private Boolean mFood;
  private Boolean mEntertainment;
  private int mPrice;

  public Event(int people, Boolean beverage, Boolean food, Boolean entertainment, int price){
    mPeople = 1;
    mBeverage = beverage;
    mFood = food;
    mEntertainment = entertainment;
    mPrice = 0;
    Integer cost = 0;
  }

    public int getPeople(int people) {
      if (mPeople <=10)  {
        return cost = 150;
      } else if (mPeople > 10 && mPeople <= 50) {
        return  cost = ;
      } else if (mPeople > 50 && mPeople <= 100)  {
        return mPeople * 7;
      } else if (mPeople > 100 && mPeople <= 200) {
        return mPeople * 9;
      } else if (mPeople > 200)  {
        return mPeople * 11;
      }
      return mPeople;
    }

    public Boolean getBeverage(boolean beverage) {
      if (userBeverage.equals("yes")) {
        return mBeverage = 1.20;
      } else {
        return mBeverage = 0;
      }
    }

    public Boolean getFood() {
      if (userFood.equals("yes")) {
        return mFood = 1.60;
      } else {
        return mFood = 0;
      }
    }

    public String getEntertainment() {
      if (userEntertainment.equals("yes")) {
        return mEntertainment = 1.5;
      } else {
        return mEntertainment = 0;
      }
    }
    public Integer getPrice(){
      mPrice = ((mBeverage + mFood + mEntertainment) * mPeople);
    }
}
//only here to make a commit message work
