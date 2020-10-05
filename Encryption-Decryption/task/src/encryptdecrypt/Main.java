package encryptdecrypt;


public class Main {

    public static void main(String[] args) {
        Cypher cypher = new Cypher();
        cypher.parseArgs(args);
        cypher.execute();
    }
}
