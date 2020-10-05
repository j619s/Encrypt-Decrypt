/* Please, do not rename it */
import java.util.*;
class Problem {

    public static void main(String args[]) {
        String operator = args[0];
        int sum = 0;
        int []a = new int[args.length-1];
        for (int i = 1;i < args.length; i++){
            a[i-1] = Integer.parseInt(args[i]);
        }
        Arrays.sort(a);
        if (operator.equals("MAX")) {
            System.out.println(a[a.length-1]);

        } else if (operator.equals("MIN")) {
            System.out.println(a[0]);

        }else if (operator.equals("SUM")) {
            for (int b : a){
                sum += b;
            }
            System.out.println(sum);

        }
        
    }
}
