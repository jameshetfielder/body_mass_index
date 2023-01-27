import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int weight;
        double height;

        System.out.print("Enter your weight (kg): ");
        weight = input.nextInt();
        System.out.print("Enter your height (cm): ");
        height = input.nextDouble();
        double bodyIndex = weight / (height * height);

        System.out.print("Your body index is: " + bodyIndex);
    }
}