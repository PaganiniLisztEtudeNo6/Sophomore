import java.util.Scanner;

class CircleSquareApp {

    public static void main(String[] args) {

        while (true) {

            Scanner sc = new Scanner(System.in);
            System.out.print("select 1 : circle 2 : square or " + "x" + " for Exit = ");
            String sel = sc.nextLine();

            if (sel.equals(1)) {
                System.out.print("Input radius = ");
                double ra = sc.nextDouble();
                Circle myobj = new Circle(ra);
                System.out.println("Area = " + myobj.getarea());
                System.out.println("pa = " + myobj.getpa());
                System.out.println("radius = " + myobj.geta());
            } else if (sel.equals(2)) {
                System.out.print("Input side = ");
                double side = sc.nextDouble();
                square myobj = new square(side);
                System.out.println("Area = " + myobj.getsquarearea());
                System.out.println("Area = " + myobj.geta());
            } else if (sel.equals(x)) {
                break;
            } else {
                System.out.print("Error !@");
            }
        }
    }
}