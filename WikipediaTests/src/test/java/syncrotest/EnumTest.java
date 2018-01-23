package syncrotest;

/**
 * Created by karol on 16.12.17.
 */
public class EnumTest {

    public enum Day

    {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
                THURSDAY, FRIDAY, SATURDAY
    }

    Day day;

    public EnumTest(Day d) {
        this.day = d;
    }

    public void tellWhatIsTheBest() {
        switch (day) {
            case FRIDAY:
                System.out.println("Friday are the best");
                break;
            case MONDAY:
                System.out.println("Monday are worst");
                break;
            default:
                System.out.println("No no no");
        }


    }


    public static void main(String[] args) {

        EnumTest mday = new EnumTest(Day.FRIDAY);
        mday.tellWhatIsTheBest();
        if (mday.day.toString() == "FRIDAY") System.out.println("YES");
        {
            System.out.println(mday.day);
        }

        for (Day d : Day.values()) ;
        System.out.println(d);

    }


}
