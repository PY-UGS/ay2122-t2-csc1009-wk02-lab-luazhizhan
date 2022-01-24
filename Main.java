import java.util.Scanner;

public class Main {
    static final double PI = 3.14159;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Qn 1
        System.out.print("Enter radius value: ");
        double radius = input.nextDouble();
        double area = radius * radius * PI;
        System.out.println(String.format("The area for the circle of radius %.1f is %f\n", radius, area));

        // Qn 2
        System.out.print("Enter three numbers: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double avg = (a + b + c) / 3;
        System.out.println(String.format("The average of %.1f %.1f %.1f is %.1f\n", a, b, c, avg));

        // Qn 3
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMins = totalSeconds / 60;
        long currentMins = totalMins % 60;
        long totalHours = totalMins / 60;
        long currentHours = totalHours % 24;
        System.out.println(String.format("Current time is %02d:%02d:%02d GMT\n",
                currentHours, currentMins, currentSeconds));

        // Qn 4
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        int zodiac = year % 12;
        switch (zodiac) {
            case 0:
                System.out.println("monkey");
                break;
            case 1:
                System.out.println("rooster");
                break;
            case 2:
                System.out.println("dog");
                break;
            case 3:
                System.out.println("pig");
                break;
            case 4:
                System.out.println("rat");
                break;
            case 5:
                System.out.println("ox");
                break;
            case 6:
                System.out.println("tiger");
                break;
            case 7:
                System.out.println("rabbit");
                break;
            case 8:
                System.out.println("dragon");
                break;
            case 9:
                System.out.println("snake");
                break;
            case 10:
                System.out.println("horse");
                break;
            case 11:
                System.out.println("sheep");
                break;
            default:
                System.out.println("Invalid year");
                break;
        }
        input.close();
    }
}
