import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.KeyGenerator;
import java.util.*;

public class my_enc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            KeyGenerator kg = KeyGenerator.getInstance("DES");
            SecretKey myDESKey = kg.generateKey();
            Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            cipher.init(cipher.ENCRYPT_MODE, myDESKey);

            String text11 = sc.nextLine();

            byte[] text = text11.getBytes();
            System.out.println("text in byte : " + text);
            System.out.println("text : " + new String(text));
            byte[] textEnc = cipher.doFinal(text);
            System.out.println("text in byte : " + textEnc);
            System.out.println("text Encrypted : " + new String(textEnc));
            cipher.init(Cipher.DECRYPT_MODE, myDESKey);
            byte[] textDec = cipher.doFinal(textEnc);
            System.out.println("text Decrypted : " + new String(textDec));

        } catch (Exception e) {

        }

    }
}