public class JVMStressTest {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        System.out.println("=== JVM Stress Test ===");
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("JVM: " + System.getProperty("java.vm.name"));
        System.out.println("Available Cores: " + runtime.availableProcessors());
        System.out.println();

        // Initial memory check
        System.out.println("=== Memory Before Stress ===");
        printMemory(runtime);

        // Start stress test
        long startTime = System.currentTimeMillis();
        try {
            for (int i = 0; i < 200_000; i++) {
                byte[] data = new byte[1024 * 10]; // allocate 10 KB
                if (i % 25_000 == 0) {
                    System.out.printf("Allocated %d KB total so far... Free Memory: %d MB%n",
                            i * 10, runtime.freeMemory() / (1024 * 1024));
                }
            }
        } catch (OutOfMemoryError e) {
            System.err.println("💥 OutOfMemoryError! Heap size is too small.");
        }
        long endTime = System.currentTimeMillis();

        System.out.println("\n=== Memory After Stress (Before GC) ===");
        printMemory(runtime);

        // Trigger and measure GC
        System.out.println("\nRequesting Garbage Collection...");
        long gcStart = System.currentTimeMillis();
        System.gc();
        long gcEnd = System.currentTimeMillis();

        System.out.println("GC Completed in " + (gcEnd - gcStart) + " ms");
        System.out.println("\n=== Memory After GC ===");
        printMemory(runtime);

        System.out.println("\nStress Duration: " + (endTime - startTime) + " ms");
        System.out.println("✅ JVM Stress Test Completed Successfully!");
    }

    private static void printMemory(Runtime runtime) {
        long max = runtime.maxMemory() / (1024 * 1024);
        long total = runtime.totalMemory() / (1024 * 1024);
        long free = runtime.freeMemory() / (1024 * 1024);
        long used = total - free;
        System.out.printf("Max Memory: %d MB%nTotal Memory: %d MB%nUsed Memory: %d MB%nFree Memory: %d MB%n%n",
                max, total, used, free);
    }
}
