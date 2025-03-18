public class SwitchStatementDemo {
    public static void main(String[] args) {

        int dayOfWeek = 4;

        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday: Start of the work week.");
                break;
            case 2:
                System.out.println("Tuesday: Keep going!");
                break;
            case 3:
                System.out.println("Wednesday: Midweek.");
                break;
            case 4:
                System.out.println("Thursday: Almost there.");
                break;
            case 5:
                System.out.println("Friday: Weekend is near.");
                break;
            case 6:
                System.out.println("Saturday: Enjoy your day off!");
                break;
            case 7:
                System.out.println("Sunday: Rest and recharge.");
                break;
            default:
                System.out.println("Invalid day.");
        }


    }
}