package encryptdecrypt;

import java.io.IOException;

public class Shift extends Crypt {
    public String encryption(String message, int key) {
        StringBuilder plainText = new StringBuilder();

        for (char c : message.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                int shift = Character.isUpperCase(c) ? 65 : 97;
                plainText.append((char) (modulo(c - shift + key) + shift));
            } else {
                plainText.append(c);
            }
        }

        return plainText.toString();
    }

    public String decryption(String message, int key) {
        return encryption(message, -key);
    }

    private static int modulo(int x) {
        return (x % 26 + 26) % 26;
    }
}