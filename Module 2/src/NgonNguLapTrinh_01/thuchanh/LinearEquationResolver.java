import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Linear");
        System.out.println("Given a equation as 'a*x + b = c', please enter constant:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = scanner.nextDouble();
        System.out.println("Enter b:");
        double b = scanner.nextDouble();
        System.out.println("Enter c:");
        double c = scanner.nextDouble();
        if(a!=0){
            double answer = (c-b)/a;
            System.out.println("The solution is: %f\n"+answer);
        }
        else{
            if(b == 0){
                System.out.println("The solution is all x");
            }
            else {
                System.out.println("No solution");
            }
        }

    }
}
