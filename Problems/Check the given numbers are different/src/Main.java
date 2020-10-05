// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean f;
        if(a!=b&&b!=c&&c!=a){
            System.out.println("true");
        }
        else System.out.println("false");
    }
}