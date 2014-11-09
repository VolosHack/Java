public class ISODateTest {
    public static void main(String[] args) {
        ISODate aDate = new ISODate(2014, 11, 9);

        System.out.println("original date (should be 2014-11-09):");
        aDate.displayDate();

        aDate.setYear(2015);
        aDate.setMonth(5);
        aDate.setDay(23);

        System.out.println("changed date (should be 2015-05-23):");
        aDate.displayDate();

        System.out.println("fields of the date, accessed with getters:");
        System.out.printf("year: %d, month: %2d, day: %2d\n",
                aDate.getYear(), aDate.getMonth(), aDate.getDay());
    }
}
