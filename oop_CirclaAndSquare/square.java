
public class square {

    private double side = 0;
    private double squarearea = 0;
    private double a = 0;

    public square(double a) {
        this.side = a;
        squarearea = a * a;
        this.a = a * 4;
    }

    public double geta() {
        return a;
    }

    public double getsquarearea() {
        return squarearea;
    }

}