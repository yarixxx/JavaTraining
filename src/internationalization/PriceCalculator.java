package internationalization;


public class PriceCalculator {

    private float orangePrice;
    private int orangeNum;

    public void setOneOrangePrice(float price) {
        orangePrice = price;
    }

    public void setOrangesNumber(int num) {
        orangeNum = num;
    }

    public float calculatePrice() {
        return orangePrice * orangeNum;
    }

}
