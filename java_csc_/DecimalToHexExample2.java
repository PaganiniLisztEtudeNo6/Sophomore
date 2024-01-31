import java.util.*;

public class DecimalToHexExample2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hexadecimal : ");
        int dec = sc.nextInt();
        System.out.println("Hexadecimal of " + dec + " is :" + Integer.toHexString(dec));
    }

}
