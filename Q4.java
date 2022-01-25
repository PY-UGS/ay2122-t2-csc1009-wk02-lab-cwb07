import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean validInput = false;

        do {
            System.out.print("Enter a year: ");

            if (input.hasNextInt()) {
                int year = input.nextInt();
                int zodiacValue = year % 12;

                switch (zodiacValue) {
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
                }
                validInput = true;
            } else {
                System.out.println("Please enter an integer");
                //clears invalid input
                input.nextLine();
            }   
        } while (!validInput);
    }
}
