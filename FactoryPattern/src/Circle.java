public class Circle implements Shape{
    private double Pi = 3.14;
    private double r;

    public Circle(double r){
        this.r=r;
    }

    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }

    public double getPi() {
        return Pi;
    }

    public void calculateArea(){
        System.out.println("Circle area = "+getPi()*r*r);
    }
}
