import java.util.*;

public class encryption_and_decryption_Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];
        String[] num1 = new String[10];
        num1[0] = "a";
        num1[1] = "b";
        num1[2] = "c";
        num1[3] = "d";
        num1[4] = "e";
        num1[5] = "f";
        num1[6] = "g";
        num1[7] = "h";
        num1[8] = "i";
        num1[9] = "j";
        for (int i = 0; i < num.length; i++) {
            num[i] = i;
            System.err.println("num" + "[" + i + "] = " + num1[i]);
        }

        int input = sc.nextInt();
        int round = 0;

        while (round < input) {
            String txt = num1[round];
            if (txt == num1[round]) {
                String txt1 = num1[1];
                num1[0] = txt1;
                num1[1] = txt;
                round++;
                break;
            }
        }

        System.err.println("asdfasdfasdfasdfasdfasdf");
        for (int c = 0; c < num1.length; c++) {

            System.err.println("num" + "[" + c + "] = " + num1[c]);
        }
    }
}