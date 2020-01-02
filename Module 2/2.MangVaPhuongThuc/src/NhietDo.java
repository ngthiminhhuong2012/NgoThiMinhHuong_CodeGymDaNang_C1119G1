import java.util.Scanner;

public class NhietDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter do F");
        double fahrenheit  = scanner.nextDouble();
        System.out.println(fahrenheitToCelsius(fahrenheit));
        System.out.println("Enter do C");
        double celsius  = scanner.nextDouble();
        System.out.println(celsiusToFahrenheit(celsius));
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    System.exit(0);
            }
        }
        while (choice!=0);
    }
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

}
