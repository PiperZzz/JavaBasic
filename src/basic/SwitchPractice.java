package basic;

/**
 *
 * @author PiperZzz
 */
public class SwitchPractice {

    private static final String INT_RESULT = "int case is ";
    private static final String ENUM_RESULT = "enum case is ";
    private static final String STR_RESULT = "String case is ";

    public static enum Day {

        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static String print(int i) {
        switch (i) {
            case 1:
                return INT_RESULT + String.valueOf(i);
            case 2:
                return INT_RESULT + String.valueOf(i);
            case 3:
                return INT_RESULT + String.valueOf(i);
            case 4:
                return INT_RESULT + String.valueOf(i);
            case 5:
                return INT_RESULT + String.valueOf(i);
            case 6:
                return INT_RESULT + String.valueOf(i);
            case 7:
                return INT_RESULT + String.valueOf(i);
            default:
                throw new IllegalArgumentException("Invalid data" + i);
        }
    }

    public static String print(Day day) {
        switch (day) {
            case MONDAY:
                return ENUM_RESULT + Day.MONDAY;
            case TUESDAY:
                return ENUM_RESULT + Day.TUESDAY;
            case WEDNESDAY:
                return ENUM_RESULT + Day.WEDNESDAY;
            case THURSDAY:
                return ENUM_RESULT + Day.THURSDAY;
            case FRIDAY:
                return ENUM_RESULT + Day.FRIDAY;
            case SATURDAY:
                return ENUM_RESULT + Day.SATURDAY;
            case SUNDAY:
                return ENUM_RESULT + Day.SUNDAY;
            default:
                throw new IllegalArgumentException("Invalid data" + day);
        }
    }

    public static String print(String str) {
        switch (str) {
            case "Monday":
                return STR_RESULT + str;
            case "Tuesday":
                return STR_RESULT + str;
            case "Wednesday":
                return STR_RESULT + str;
            case "Thursday":
                return STR_RESULT + str;
            case "Friday":
                return STR_RESULT + str;
            case "Saturday":
                return STR_RESULT + str;
            case "Sunday":
                return STR_RESULT + str;
            default:
                throw new IllegalArgumentException("Invalid data " + str);
        }
    }
}

//Java 1.4 supports Integer, int, short and char as switch case type
//Since Java 1.6, enum has been added as valid swtich case type 
//Since Java 1.7, String has been added as valid switch case type   
