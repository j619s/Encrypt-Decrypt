// Posted from EduTools plugin
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        if(a<10)
            System.out.println("true");
        else
            System.out.println("false");
    }
}