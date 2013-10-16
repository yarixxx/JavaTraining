package collections;

public class Pocket {
    private Integer money;

    public void setMoney(int money) {
        this.money = money;
    }

    public void addMoney(int income) {
        money += income;
    }

    public boolean canIHaveThis(int price) {
        return money > price;
    }

    public boolean buyThis(int price) {
        if (canIHaveThis(price)) {
            money -= price;
            return true;
        }
        return false;
    }
}
