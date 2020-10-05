import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        int k =s.length();
        if(n<s.length()){
            System.out.println(s.substring(n,k).concat(s.substring(0,n)));
        }
        else{
            System.out.print(s);
        }

    }
}