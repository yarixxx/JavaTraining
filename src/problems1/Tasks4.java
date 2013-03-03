package problems1;

import java.util.HashSet;
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
}
