import java.util.*;

public class DecimaltoHexa_array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Hexadecimal : ");
        int reamain, num;
        num = sc.nextInt();

        char ch[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        String hexadecimal = "";

        while (num != 0) {
            reamain = num % 16;
            hexadecimal = ch[reamain] + hexadecimal;
            num = num / 16;

        }
        System.out.print("hexadecimal : " + hexadecimal);

        // System.out.println("Hexadecimal of " + dec + " is :" +
        // Integer.toHexString(dec));
    }

}
