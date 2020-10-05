import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String fh;
        String sh;
        long firstHalf;
        long secondHalf;
        int l = s.length();
        long sum = 0;
        long sum1 = 0;

        if(l%2==0){
            fh = s.substring(0,l/2);
            sh = s.substring(l/2);
            firstHalf = Long.parseLong(fh);
            secondHalf = Long.parseLong(sh);

            while(firstHalf!=0||secondHalf!=0){
                sum=sum+firstHalf%10;
                firstHalf/=10;

                sum1=sum1+secondHalf%10;
                secondHalf/=10;
            }

            if(sum==sum1){
                System.out.print("YES");
            }
            else{
                System.out.print("NO");
            }


        }
        else{
            System.out.println("NO");
        }
    
    }
}
