package encryptdecrypt;

import java.io.IOException;

public class Unicode extends Crypt {
    public String encryption(String message, int key) {
        StringBuilder cipherText = new StringBuilder();

        for (char c : message.toCharArray()) {
            cipherText.append((char) (c + key));
        }

        return cipherText.toString();
    }

    public String decryption(String message, int key) {
        return encryption(message, -key);
    }

}
