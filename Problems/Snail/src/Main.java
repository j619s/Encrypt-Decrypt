// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h= scanner.nextInt();
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int daily =a-b;
        int days=0;
        while (h>0){
            if(h<=a){
                days+=1;
                break;
            }
            h-=daily;
            days+=1;
        }
        System.out.println(days);
}
}
