import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.jasypt.util.text.BasicTextEncryptor;

/** JavaMadeSoEasy.com */
public class WriteEncryptedTextToFile {
    public static void main(String... args) {

        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        String fileName = "c:/myFile.txt";
        try {
            fos = new FileOutputStream(fileName);
            bos = new BufferedOutputStream(fos);
            String originalText = "You are learning File IO from javaMadeSoEasy.com";
            System.out.println("originalText = " + originalText);

            /*
             * Encrypting a text
             */
            BasicTextEncryptor basicTextEncryptor = new BasicTextEncryptor();
            // Must remember this password, as it will be required at time of decryption
            basicTextEncryptor.setPassword("password");
            String encryptedText = basicTextEncryptor.encrypt(originalText);
            System.out.println("encryptedText = " + encryptedText);

            // convert encryptedText into byte array to write it in file
            bos.write(encryptedText.getBytes());
            bos.flush();

            System.out.println("encryptedText has been written successfully in "
                    + fileName);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bos != null) {
                    bos.close(); // close FileOutputStream
                }
                if (fos != null) {
                    fos.close(); // close FileOutputStream
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}