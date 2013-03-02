package problems1;

public class Tasks4 {

    public enum WeekDay {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public enum Month {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }

    public enum Season {
        WINTER, SPRING, SUMMER, AUTUMN
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
}
