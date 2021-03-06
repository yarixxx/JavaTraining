package problems1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tasks4 {

    public enum WeekDay {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public enum Month {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }

    public enum Season {
        WINTER(Month.DECEMBER, Month.JANUARY, Month.FEBRUARY), SPRING(
                Month.MARCH, Month.APRIL, Month.MAY), SUMMER(Month.JUNE,
                Month.JULY, Month.AUGUST), AUTUMN(Month.SEPTEMBER,
                Month.OCTOBER, Month.NOVEMBER);

        private final Month first;
        private final Month second;
        private final Month third;

        Season(Month first, Month second, Month third) {
            this.first = first;
            this.second = second;
            this.third = third;
        }

        boolean isOver(Set<Month> months) {
            return months.contains(first) && months.contains(second)
                    && months.contains(third);
        }

        boolean isStarted(Set<Month> months) {
            return months.contains(first);
        }
    }

    public boolean isFreeDay(WeekDay day) {
        return (day == WeekDay.SATURDAY || day == WeekDay.SUNDAY);
    }

    public Season getSeason(Month month) {
        switch (month) {
        case JANUARY:
        case FEBRUARY:
        case DECEMBER:
            return Season.WINTER;
        case MARCH:
        case APRIL:
        case MAY:
            return Season.SPRING;
        case JUNE:
        case JULY:
        case AUGUST:
            return Season.SUMMER;
        default:
            return Season.AUTUMN;
        }
    }

    public Set<Season> seasonsOver(Set<Month> months) {
        Set<Season> seasons = new HashSet<Season>();
        for (Season season : Season.values()) {
            if (season.isOver(months)) {
                seasons.add(season);
            }
        }
        return seasons;
    }

    public Integer[] removeDuplicates(Integer[] numsArrayWithDups) {
        Set<Integer> cleanNums = new HashSet<Integer>();
        for (int num : numsArrayWithDups) {
            cleanNums.add(num);
        }
        return cleanNums.toArray(new Integer[0]);
    }

    public boolean isArmstrongNumber(int number) {
        int copyNumber = number;
        int computed = 0;
        while (copyNumber > 0) {
            int currentPart = copyNumber % 10;
            computed += currentPart * currentPart * currentPart;
            copyNumber /= 10;
        }

        return (computed == number);
    }

    boolean isPowerOfFive(int num) {
        while (num % 5 == 0) {
            num /= 5;
        }
        return num == 1;
    }

    private boolean fizz(int num) {
        return num % 3 == 0;
    }

    private boolean buzz(int num) {
        return num % 5 == 0;
    }

    String[] fizzBuzz(int[] nums) {
        List<String> result = new ArrayList<String>();
        for (Integer num : nums) {
            if (fizz(num) && buzz(num)) {
                result.add("FizzBuzz");
            } else if (fizz(num)) {
                result.add("Fizz");
            } else if (buzz(num)) {
                result.add("Buzz");
            } else {
                result.add(num.toString());
            }
        }
        return result.toArray(new String[0]);
    }
}
