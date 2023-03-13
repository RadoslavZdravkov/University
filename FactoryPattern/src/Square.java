public class Square implements Shape{
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }

    public void calculateArea(){
        System.out.println("Square area = "+a*a);
    }
}
