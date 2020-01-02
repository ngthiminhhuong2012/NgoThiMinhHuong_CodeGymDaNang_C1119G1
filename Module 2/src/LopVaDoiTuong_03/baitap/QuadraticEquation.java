package LopVaDoiTuong_03.baitap;

public class QuadraticEquation {
    private double a,b,c;
    public QuadraticEquation(){

    }
    public QuadraticEquation(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }
    public double getB() {
        return this.b;
    }
    public double getC() {
        return this.c;
    }
     double delta = Math.pow(b,0.5) - 4*a*c;
    public double getDiscriminant(){
        return this.delta;
    }
    public double getRoot1(){
        if(delta <0){
            return 0;
        }
        else {
            return (-this.b) + Math.sqrt(this.delta))/2*this.a;
        }
    }
    public double getRoot2(){
        if(delta<0){
            return 0;
        }
        else {
            return (t)
        }


    }
}
