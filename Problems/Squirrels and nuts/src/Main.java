// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int k = scanner.nextInt();
        int c=k/n;
        int remainder = k-(c*n);
        System.out.println(remainder);
    }
}