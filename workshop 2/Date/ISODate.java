public class ISODate {
    int year;
    int month;
    int day;

    ISODate(int y, int m, int d) {
        year = y;
        month = m;
        day = d;
    }

    void setYear(int y) {
        year = y;
    }

    int getYear() {
        return year;
    }

    void setMonth(int y) {
        month = y;
    }

    int getMonth() {
        return month;
    }

    void setDay(int y) {
        day = y;
    }

    int getDay() {
        return day;
    }

    void displayDate() {
        System.out.printf("%d-%02d-%02d\n", year, month, day);
    }
}
