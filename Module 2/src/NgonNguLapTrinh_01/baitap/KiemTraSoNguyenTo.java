import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {

        int count = 1;
        for (int i = 1; i < 100;i++){

            if (isPrime(i)) {
                System.out.println(i);
                count ++;
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;


    }
}