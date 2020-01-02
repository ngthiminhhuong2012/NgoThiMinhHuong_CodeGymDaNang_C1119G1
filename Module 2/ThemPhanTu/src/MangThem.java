import java.util.Scanner;

public class MangThem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang la N:");
        int N = scanner.nextInt();
        int []arr;
        arr = new int[N];
        int [] b = new int[N+1];
        for(int i=0;i<N;i++){
            System.out.println("nhap phan tu thu"+(i+1)+":");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Nhap so can chen X:");
        int X = scanner.nextInt();
        System.out.println("Nhap vi tri can chen index:");
        int index = scanner.nextInt();
        if(index <= 1 &&index >= arr.length-1){
            System.out.println("khong chen duoc phan tu vao mang");
     }
        for(int i = 0;i<arr.length;i++){
            b[i]=arr[i];
        }
        for(int i =b.length-1;i>index;i--){
            b[i] = b[i-1];
            b[index]=X;
        }
        for (int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }


    }
}
