public class Test1 {
    public static void main(String args[]) {
        int i, j;

        for (i = 1; i <= 12; i++) {
            for (j = 1; j <= 12; j++) {
                System.out.printf("%6d", i * j);
            }
            System.out.println();
        }
    }
}
