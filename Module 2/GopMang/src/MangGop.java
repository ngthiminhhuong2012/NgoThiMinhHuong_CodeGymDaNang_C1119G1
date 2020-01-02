import java.util.Scanner;

public class MangGop {
    public static void main(String[] args) {
        int [] array1 = new int[5];
        int [] array2 = new int[3];
        int length = array1.length + array2.length;
        int [] array3 = new int[length];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0;i<array1.length;i++){
            System.out.println("nhap phan tu thu"+ (i+1)+":");
            array1[i] = scanner.nextInt();
        }
        for (int i=0;i<array1.length;i++){
            System.out.println(array1[i]);
        }
        for(int i = 0;i<array2.length;i++){
            System.out.println("nhap phan tu tu "+(i+1)+":");
            array2[i] = scanner.nextInt();
        }
        for(int i=0;i<array2.length;i++){
            System.out.println(array2[i]);
        }
        for(int i=0;i<array1.length;i++){
            array3[i]=array1[i];
        }
        for(int i=0;i <array2.length;i++){
            array3[array1.length+i] = array2[i];
        }
        for(int i= 0;i<array3.length;i++){
            System.out.println(array3[i]);

        }
    }
}
