import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        System.out.println(s.startsWith("J")||s.startsWith("j"));

//
//        import java.util.Scanner;
//
//        class Main {
//            public static void main(String[] args) {
//                Scanner scanner = new Scanner(System.in);
//                String jChar = "j";
//                String s = scanner.nextLine().substring(0, 1);
//                System.out.println(s.equalsIgnoreCase(jChar));
//            }
//        }
    }
}