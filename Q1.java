import java.util.Scanner;

public class Q1 {
    static final double PI = 3.14159;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a byte value: ");
        byte byteValue = input.nextByte();

        System.out.print("Enter a short value: ");
        short shortValue = input.nextShort();

        System.out.print("Enter a int value: ");
        int intValue = input.nextInt();

        System.out.print("Enter a long value: ");
        long longValue = input.nextLong();

        System.out.print("Enter a float value: ");
        float floatValue = input.nextFloat();

        System.out.println("BYTE VALUE: " + byteValue);
        System.out.println("SHORT VALUE: " + shortValue);
        System.out.println("INT VALUE: " + intValue);
        System.out.println("LONG VALUE: " + longValue);
        System.out.println("FLOAT VALUE: " + floatValue);
        
        System.out.print("Enter a number for radius: ");
        float radiusValue = input.nextFloat();
        double area = radiusValue*radiusValue*PI;
        System.out.print("The area for the circle of radius " + radiusValue + " is " + area);   
    }
}