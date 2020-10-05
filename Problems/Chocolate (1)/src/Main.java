import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int M= sc.nextInt();
        int K =sc.nextInt();
        if((K%M==0)||(K%N==0)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}