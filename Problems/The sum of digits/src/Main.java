// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int temp;
        int sum=0;
        while (k!=0){
            temp=k%10;
            sum+=temp;
            k/=10;
        }
        System.out.println(sum);
    }
}