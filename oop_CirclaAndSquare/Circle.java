
public class Circle {

    double a = 0;
    double area = 0;
    double pa = 0;

    public Circle(double a) {
        this.a = a;
        area = 3.14159 * a * a;
        pa = 2 * Math.PI * a;
    }

    public double geta() {
        return a;
    }

    public double getarea() {
        return area;
    }

    public double getpa() {
        return pa;
    }

}