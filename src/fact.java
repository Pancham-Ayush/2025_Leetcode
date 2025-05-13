import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class fact {

    private static long fact(int n, ExecutorService executor) throws Exception {
        return (n <= 1) ? 1 : n * executor.submit(() -> fact(n - 1, executor)).get();
    }

    public static void main(String[] args) {

        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            System.out.println("Factorial: " + executor.submit(() -> fact(100, executor)).get());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}


