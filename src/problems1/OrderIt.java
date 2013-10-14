package problems1;

public class OrderIt {

    private Integer[] numbers;

    public void setNumbers(Integer[] numbers) {
        this.numbers = numbers;
    }

    public Integer[] getNumbers() {
        return this.numbers;
    }

    public boolean switchNumbers(int a, int b) {
        if (!(getValue(a) == 0 || getValue(b) == 0)) {
            return false;
        }
        if (a > b) {
            return switchNumbers(b, a);
        }
        int difference = b - a;
        if (difference == 1 || (difference - 2) == 1) {
            if (a != 2 && a != 5) {
                Integer tmp = numbers[a];
                numbers[a] = numbers[b];
                numbers[b] = tmp;
                return true;
            }
        }
        return false;
    }

    public Integer getValue(int position) {
        return numbers[position];
    }

    public String keepIt(boolean isRequired) {
        return isRequired ? "keep" : "throw";
    }
}
