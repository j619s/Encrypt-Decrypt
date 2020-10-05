package encryptdecrypt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Cypher {
    int key = 0;
    String mode = "enc";
    String text = "";
    String inPath = "";
    String outPath = "";

    Crypt crypt = new Shift();

    public void execute(){
        readData();
        switch (this.mode) {
            case "enc" :
                String message = crypt.encryption(text,key);
                output(message, outPath);
                break;

            case "dec":
                String message1 = crypt.decryption(text, key);
                output(message1,outPath);
                break;

            default: System.err.println("unknown mode");
                System.exit(1);
        }
    }

    private static void output (String message, String outPath) {
        if (outPath.equals("")) {
            System.out.println(message);
        } else {
            File file = new File(outPath);

            try (FileWriter writer = new FileWriter(file)){
                writer.write(message);
            } catch (IOException e) {
                System.err.println("can't write to " + outPath);
                System.exit(1);
            }
        }
    }

    private void readData() {
        if(text.equals("")) {
            String fileName = inPath;
            File file = new File(fileName);
            try (Scanner sc = new Scanner(file)) {
                text = sc.nextLine();
            } catch (FileNotFoundException e) {
                System.err.println(fileName + "not found");
                System.exit(1);
            }
        }
    }
    public void parseArgs(String[] args) {
        for (int i = 0; i < args.length; i += 2) {
            switch (args[i]) {
                case "-alg":
                    switch (args[i + 1]) {
                        case "shift":
                            crypt = new Shift();
                            break;
                        case "unicode":
                            crypt = new Unicode();
                            break;
                        default:
                            System.err.println("unknown algorithm " + args[i + 1]);
                            System.exit(1);
                    }
                    break;
                case "-mode":
                    mode = args[i + 1];
                    break;
                case "-key":
                    key = Integer.parseInt(args[i + 1]);
                    break;
                case "-in":
                    inPath = args[i + 1];
                    break;
                case "-data":
                    text = args[i + 1];
                    break;
                case "-out":
                    outPath = args[i + 1];
                    break;
                default:
                    System.err.println("unknown argument");
                    System.exit(1);
            }
        }
    }

}