package problems1;

public class Tasks5 {

    public boolean isSquareFree(int num) {
        for (int i = 2; i <= 9; i++) {
            if (num % i == 0 && num / i == i) {
                return false;
            }
        }
        return true;
    }
}
