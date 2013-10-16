package internationalization;

import java.text.NumberFormat;
import java.util.Locale;

public class PriceCalculator {

    private float orangePrice;
    private int orangeNum;
    private NumberFormat numberFormatter;

    public void setOneOrangePrice(float price) {
        orangePrice = price;
    }

    public void setOrangesNumber(int num) {
        orangeNum = num;
    }

    public float calculatePrice() {
        return orangePrice * orangeNum;
    }

    public String formatPrice() {
        return numberFormatter.format(calculatePrice());
    }

    public void setNumberFormatter(Locale locale) {
        numberFormatter = NumberFormat.getCurrencyInstance(locale);
    }

}
