public class Triangle implements Shape{
    private double a;
    private double ha;

    public Triangle(double a, double ha) {
        this.a = a;
        this.ha = ha;
    }

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }

    public double getHa() {
        return ha;
    }
    public void setHa(double ha) {
        this.ha = ha;
    }

    public void calculateArea(){
        System.out.println("Triangle area = "+(a*ha)/2);
    }
}
