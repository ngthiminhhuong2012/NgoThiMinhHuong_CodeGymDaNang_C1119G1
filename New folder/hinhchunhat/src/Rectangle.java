import java.util.Scanner;

public class Rectangle {

    double width,height;
    public Rectangle(){
    }
    public Rectangle(double width,double height){
        this.height = height;
        this.width = width;
    }
    public double getArea(){
        return this.height *this.width;
    }
    public double getPremiter(){
        return (this.width + this.height)*2;
    }
    public String display(){
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
public class Ex14{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width:");
        double width = scanner.nextDouble();
        System.out.println("Enter height:");
        double height = scanner.nextDouble();
        Rectangle rectangleObj = new Rectangle(width,height);
        System.out.println("Area is"+rectangleObj.getArea());
        System.out.println("Premiter is"+rectangleObj.getPremiter());
        System.out.println("Rectangle is"+rectangleObj.display());
    }
}
