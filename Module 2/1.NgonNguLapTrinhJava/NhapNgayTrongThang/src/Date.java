import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        System.out.println("Nhap Thang:");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        System.out.println("Nhap nam");
        int year = scanner.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang " +month+ "co 31 ngay");
                break;
            case  4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang "+ month+"co 30 ngay");
                break;
            case 2:
                if (year % 4 == 0){
                    System.out.println("Thang "+month + " co 28 ngay");
                }
                else {
                    System.out.println("Thang "+ month + "co 29 ngay");
                }
        }
    }
}
