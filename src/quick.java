import java.util.Random;
import java.util.concurrent.*;

 class ParallelQuickSort extends RecursiveTask<Void> {
    private final int[] arr;
    private final int low, high;
    private static final int THRESHOLD = 1000;

    public ParallelQuickSort(int[] arr, int low, int high) {
        this.arr = arr;
        this.low = low;
        this.high = high;
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int left = low, right = high;

        while (left < right) {
            while (left < high && arr[left] <= pivot) left++;
            while (arr[right] > pivot) right--;
            if (left < right) {
                swap(arr, left, right);
            }
        }

        swap(arr, low, right);
        return right;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    @Override
    protected Void compute() {
        if (low < high) {
            if (high - low < THRESHOLD) {
                // Use sequential sort for small partitions
                quicksort(arr, low, high);
            } else {
                int pivotIndex = partition(arr, low, high);
                ParallelQuickSort leftTask = new ParallelQuickSort(arr, low, pivotIndex - 1);
                ParallelQuickSort rightTask = new ParallelQuickSort(arr, pivotIndex + 1, high);

                invokeAll(leftTask, rightTask);
            }
        }
        return null;
    }

    private static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quicksort(arr, low, pivotIndex - 1);
            quicksort(arr, pivotIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        long start, end;
        double highest = 0;

        ForkJoinPool pool = ForkJoinPool.commonPool();

        for (int i = 1000; i <= 100_000_000; i += 10000000) {
            int[] arr = new int[i];

            for (int j = 0; j < i; j++) {
                arr[j] = rand.nextInt(1000000);
            }

            start = System.nanoTime();

            pool.execute(new ParallelQuickSort(arr, 0, i - 1)); // Parallel execution

            end = System.nanoTime();

            double timeTaken = (end - start) / 1e9; // Convert to seconds
            highest = Math.max(highest, timeTaken);

            System.out.printf("For n = %d, Time Taken: %.6f seconds\n", i, timeTaken);
        }

        pool.shutdown();
        System.out.println("Max Time Taken: " + highest);
    }
}
