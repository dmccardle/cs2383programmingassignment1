public class MonkeyEatPeach {
    /*
    *  This variable can be adjusted to determine the amount on each day of the week:
    *  7: Monday, 6: Tuesday, 5: Wednesday, ... , 1: Sunday 
    */
    public static int numberOfDays = 7;

    public static void main(String[] args) {
        System.out.println("The monkey had " + numberOfPeaches(1) + " peaches on " + getDayOfWeek() + ".");
    }

    public static int numberOfPeaches(int n) {
        if(n == numberOfDays) { 
            // Sunday
            return 1;
        } else {
            // number of peaches on current day = (number of peaches on previous day + 1) * 2
            return (numberOfPeaches(n + 1) + 1) * 2;
        }
    }

    public static String getDayOfWeek() {
        switch (numberOfDays) {
            case 1: return "Sunday";
            case 2: return "Saturday";
            case 3: return "Friday";
            case 4: return "Thursday";
            case 5: return "Wednesday";
            case 6: return "Tuesday";
            default: return "Monday";
        }
    }
}