package class030;

public class BitwiseTest {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        long result = 0;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            result ^= i;
        }
        long endTime = System.nanoTime();
        System.out.println("Result: " + result);
        System.out.println("Execution time (ns): " + (endTime - startTime));
    }
}
