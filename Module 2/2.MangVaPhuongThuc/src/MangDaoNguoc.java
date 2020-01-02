import java.util.Scanner;

public class MangDaoNguoc {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter size:");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("out of size");

            }
        }
        while (size>20);
        array = new  int[size];
        for(int i= 0; i<array.length;i++){
            System.out.println("Enter element"+(i+1)+":");
            array[i] = scanner.nextInt();
        }
        for(int j = 0; j<array.length;j++){
            System.out.println(array[j]+"\t");
        }
        for(int j=0;j<array.length/2;j++){
            int temp = array[j];
            array[j] = array[size-1-j];
            array[size-1-j] = temp;
        }
        System.out.println("Reverse array");
        for(int j= 0; j<array.length;j++) {
            System.out.println(array[j]+"\t");
        }
    }
}
