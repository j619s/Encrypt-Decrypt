import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String s1= sc.nextLine();
       String s2= s.replace(" ","");
       String s3= s1.replace(" ","");
        System.out.println(s2.equalsIgnoreCase(s3));
    }
}