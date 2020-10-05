import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(1);
        } else {
            System.out.print(n + " ");
            while (n != 1) {
                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n *= 3;
                    n += 1;
                }
                System.out.print(n + " ");
            }

        }
    }
}
