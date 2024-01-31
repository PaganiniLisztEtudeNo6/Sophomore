import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class des {

    public static void encryptDecrypt(String key, int cipherMode, File in, File out)
            throws InvalidKeyException, NoSuchAlgorithmException, InvalidKeySpecException, NoSuchPaddingException,
            IOException {
        FileInputStream fis = new FileInputStream(in);
        FileOutputStream fos = new FileOutputStream(out);
        DESKeySpec deskeyspec = new DESKeySpec(key.getBytes());
        SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
        SecretKey secretKey = skf.generateSecret(deskeyspec);

        Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");

        if (cipherMode == Cipher.ENCRYPT_MODE) {
            cipher.init(Cipher.ENCRYPT_MODE, secretKey, SecureRandom.getInstance("SHA1PRNG"));
            CipherInputStream cis = new CipherInputStream(fis, cipher);
            write(cis, fos);
        } else if (cipherMode == Cipher.DECRYPT_MODE) {
            cipher.init(Cipher.DECRYPT_MODE, secretKey, SecureRandom.getInstance("SHA1PRNG"));
            CipherOutputStream cos = new CipherOutputStream(fos, cipher);
            write(fis, cos);
        }
    }

    private static void write(InputStream in, OutputStream out) throws IOException {
        byte[] buffer = new byte[64];
        int numOfBytesRead;
        while ((numOfBytesRead = in.read(buffer)) != -1) {
            out.write(buffer, 0, numOfBytesRead);
        }
        out.close();
        in.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select 1 for Encrypt  , 2 for Decrypt");
        int ch = sc.nextInt();
        if (ch == 1) {

            try {
                File plainFile = new File("C:\\Users\\Hp\\OneDrive\\Desktop\\plain.txt");
                File encrypted = new File("C:\\Users\\Hp\\OneDrive\\Desktop\\Encrypted.txt");

                encryptDecrypt("12345678", Cipher.ENCRYPT_MODE, plainFile, encrypted);
                System.out.println("Encryption complete");
            } catch (InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | NoSuchPaddingException
                    | IOException e) {
            }

        } else if (ch == 2) {
            File encrypted = new File("C:\\Users\\Hp\\OneDrive\\Desktop\\Encrypted.txt");
            File decrypted = new File("C:\\Users\\Hp\\OneDrive\\Desktop\\Decrypted.txt");

            try {
                encryptDecrypt("12345679", Cipher.DECRYPT_MODE, encrypted, decrypted);
                System.out.println("Decryption complete");
            } catch (InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | NoSuchPaddingException
                    | IOException e) {
            }

        } else {
            System.out.println("Error ch");
        }
    }

}