import java.math.BigInteger;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

class prime_ {
    public static int countPrimes(int n) {
        return countPrimes(n, 4); // Default to 4 threads
    }

    public static int countPrimes(int n, int numThreads) {
        AtomicInteger count = new AtomicInteger(0); // Use AtomicInteger for thread-safe updates
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        CountDownLatch latch = new CountDownLatch(numThreads);

        // Divide the work among threads
        int chunkSize = n / numThreads;
        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize;
            int end = (i == numThreads - 1) ? n : (i + 1) * chunkSize; // Adjust for the last thread

            executor.submit(() -> {
                int localCount = 0;
                for (int j = start; j < end; j++) {
                    BigInteger b = new BigInteger(String.valueOf(j));
                    if (b.isProbablePrime(80)) {
                        localCount++;
                    }
                }
                count.addAndGet(localCount); // Atomically add to the shared count
                latch.countDown();
            });
        }

        try {
            latch.await(); // Wait for all threads to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executor.shutdown();
        return count.get();
    }
}
