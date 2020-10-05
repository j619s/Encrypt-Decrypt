class Problem {
    public static void main(String[] args) {
        int count = -1;
            for (int i = 0; i < args.length; i++) {
                if (args[i].equals("test")) {
                    count = i;
                }
            }
            System.out.println(count);
            
    }
}
