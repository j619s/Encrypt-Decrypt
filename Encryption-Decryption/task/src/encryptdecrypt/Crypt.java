package encryptdecrypt;

import java.io.IOException;

public abstract class Crypt {
    public abstract String encryption(String text, int key);
    public abstract String decryption(String text, int key);

}