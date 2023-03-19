import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double pi = 3.14, radius, circleCircum, circleArea;

        System.out.print("Enter the radius: ");
        radius = input.nextDouble();

        circleCircum = 2 * pi * radius;
        circleArea = pi * Math.pow(radius,2);

        System.out.println("Circumference of the Circle: " + circleCircum);
        System.out.print("Circumference of the Circle: " + circleArea);
    }
}