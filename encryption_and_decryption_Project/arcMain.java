public class arcMain {

    public arcMain() {
    }

    public static void main(String[] args) {
        StringBuffer input, key, result;
        input = new StringBuffer("TEXT");
        key = new StringBuffer("keyText");
        result = new StringBuffer();
        byte[] buf;
        int len;
        // first encrypt the input with the key and print
        Crypt(input, key);
        System.out.println("DATA : " + input);
        // lets decrypt it
        Crypt(input, key);
        System.out.println("DATA : " + input);
    }

    static void Crypt(StringBuffer inp, StringBuffer key) {
        int Sbox[];
        int Sbox2[];
        Sbox = new int[257];
        Sbox2 = new int[257];
        int i, j, t, x;

        String OurUnSecuredKey = "CrusadersNeverSleep";
        char temp, k;
        i = 0;
        j = 0;
        k = 0;
        t = 0;
        x = 0;
        temp = 0;

        // initialize sbox i
        for (i = 0; i < 256; i++) {
            Sbox[i] = i;
        }

        j = 0;
        if (key.length() > 0) {
            for (i = 0; i < 256; i++) {
                if (j == key.length())
                    j = 0;

                Sbox2[i] = key.charAt(j++);
            }
        } else {
            for (i = 0; i < 256; i++) {
                if (j == OurUnSecuredKey.length() + 1)
                    j = 0;

                Sbox2[i] = OurUnSecuredKey.charAt(j++);
            }
        }

        j = 0;
        for (i = 0; i < 256; i++) {
            j = (j + Sbox[i] + Sbox2[i]) % 256;
            temp = (char) Sbox[i];
            Sbox[i] = Sbox[j];
            Sbox[j] = temp;
        }

        i = j = 0;
        for (x = 0; x < inp.length(); x++) {
            // increment i
            i = (i + 1) % 256;
            // increment j
            j = (j + Sbox[i]) % 256;

            // Scramble SBox #1 further so encryption routine will
            // will repeat itself at great interval
            temp = (char) Sbox[i];
            Sbox[i] = Sbox[j];
            Sbox[j] = temp;

            // Get ready to create pseudo random byte for encryption key
            t = (Sbox[i] + Sbox[j]) % 256;

            // get the random byte
            k = (char) Sbox[t];

            // xor with the data and done
            inp.setCharAt(x, (char) (inp.charAt(x) ^ k));
        }
    }

}