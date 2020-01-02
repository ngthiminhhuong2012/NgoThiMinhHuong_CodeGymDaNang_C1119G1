import java.util.Scanner;

public class DoiSoThanhChu {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        DoiSoThanhChu doiSoThanhChuObj = new DoiSoThanhChu();
        if(number.length() == 1){
           String motchuso =  doiSoThanhChuObj.donvi(Integer.parseInt(number));
            System.out.println(motchuso);
        }
        else if(number.length() == 2){
            String chuc = doiSoThanhChuObj.chuc(Integer.parseInt(number));
            String donvi = doiSoThanhChuObj.donvi(Integer.parseInt(number));
            System.out.println(chuc + donvi);
        }
        else if(number.length() == 3){
            String tram = doiSoThanhChuObj.tram(Integer.parseInt(number));
            String chuc = doiSoThanhChuObj.chuc(Integer.parseInt(number));
            String donvi = doiSoThanhChuObj.donvi(Integer.parseInt(number));
            System.out.println(tram + chuc+ donvi);
        }


    }
    //
    public String donvi(int n){
        switch (n){
            case 0:
                System.out.println("khong");
                break;
            case 1:
                System.out.println("mot");
                break;
            case 2:
                System.out.println("hai");
                break;
            case 3:
                System.out.println("ba");
                break;
            case 4:
                System.out.println("bon");
                break;
            case 5:
                System.out.println("nam");
                break;
            case 6:
                System.out.println("sau");
                break;
            case 7:
                System.out.println("bay");
                break;
            case 8:
                System.out.println("tam");
                break;
            default:
                System.out.println("chin");
                break;

        }
    }
    public String chuc(int n ){
        switch (n){
            case 0:
                System.out.println("linh");
                break;
            case 1:
                System.out.println("muoi");
                break;
            case 2:
                System.out.println("hai muoi");
                break;
            case 3:
                System.out.println("ba muoi");
                break;
            case 4:
                System.out.println("bon muoi");
                break;
            case 5:
                System.out.println("nam muoi");
                break;
            case 6:
                System.out.println("sau muoi");
                break;
            case 7:
                System.out.println("bay muoi");
                break;
            case 8:
                System.out.println("tam muoi");
                break;
            default:
                System.out.println("chin muoi");
                break;


        }
    }
    public String tram(int n){
        switch (n){
            case 0:
                System.out.println("khong tram");
                break;
            case 1:
                System.out.println("mot tram");
                break;
            case 2:
                System.out.println("hai tram");
                break;
            case 3:
                System.out.println("ba tram");
                break;
            case 4:
                System.out.println("bon tram");
                break;
            case 5:
                System.out.println("nam tram");
                break;
            case 6:
                System.out.println("sau tram");
                break;
            case 7:
                System.out.println("bay tram");
                break;
            case 8:
                System.out.println("tam tram");
                break;
            default:
                System.out.println("chin tram");
                break;

        }
    }
}
