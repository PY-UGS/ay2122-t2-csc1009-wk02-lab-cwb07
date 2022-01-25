import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.print("Enter three numbers: ");
        Scanner input = new Scanner(System.in);
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        float num3 = input.nextFloat();

        float average = (num1 + num2 + num3) / 3;
        System.out.print("The average of " + num1 + " " + num2 + " " + num3 + " is " + average);
    }
}
