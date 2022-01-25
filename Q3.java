public class Q3 {
    public static void main(String[] args) {
        double totalMilliseconds = System.currentTimeMillis();

        double totalSeconds = totalMilliseconds / 1000;
        int currentSecond = (int) totalSeconds % 60;

        double totalMinutes = totalSeconds / 60;
        int currentMinute = (int) totalMinutes % 60;

        double totalHours = totalMinutes / 60;
        int currentHour = (int) totalHours % 24;

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
    }
}