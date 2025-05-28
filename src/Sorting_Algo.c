#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <string.h>

// Insertion Sort
void insertionSort(int arr[], int n) {
    int i, key, j;
    for (i = 1; i < n; i++) {
        key = arr[i];
        j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }
}

// Selection Sort
void selectionSort(int arr[], int n) {
    int i, j, min_idx, temp;
    for (i = 0; i < n - 1; i++) {
        min_idx = i;
        for (j = i + 1; j < n; j++) {
            if (arr[j] < arr[min_idx]) {
                min_idx = j;
            }
        }
        temp = arr[min_idx];
        arr[min_idx] = arr[i];
        arr[i] = temp;
    }
}

// Heapify function (recursive)
void heapify(int arr[], int n, int i) {
    int largest = i;
    int left = 2 * i + 1;
    int right = 2 * i + 2;

    if (left < n && arr[left] > arr[largest]) {
        largest = left;
    }
    if (right < n && arr[right] > arr[largest]) {
        largest = right;
    }

    if (largest != i) {
        int temp = arr[i];
        arr[i] = arr[largest];
        arr[largest] = temp;
        heapify(arr, n, largest);
    }
}

// Heap Sort
void heapSort(int arr[], int n) {
    for (int i = n / 2 - 1; i >= 0; i--) {
        heapify(arr, n, i);
    }

    for (int i = n - 1; i > 0; i--) {
        int temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;
        heapify(arr, i, 0);
    }
}

// Display Array (up to 10 per line)
void displayArray(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
        if ((i + 1) % 10 == 0)
            printf("\n");
    }
    if (n % 10 != 0)
        printf("\n");
}

int main() {
    int n, inputMethod;
    int *arr, *arr_insertion, *arr_selection, *arr_heap;
    clock_t start, end;
    double time_taken;

    printf("Enter number of elements: ");
    scanf("%d", &n);

    // Allocate memory dynamically
    arr = malloc(n * sizeof(int));
    arr_insertion = malloc(n * sizeof(int));
    arr_selection = malloc(n * sizeof(int));
    arr_heap = malloc(n * sizeof(int));

    if (!arr || !arr_insertion || !arr_selection || !arr_heap) {
        printf("Memory allocation failed!\n");
        return 1;
    }

    printf("Choose input method:\n1. Manual Input\n2. Generate Random Array\n");
    scanf("%d", &inputMethod);

    if (inputMethod == 1) {
        printf("Enter %d elements:\n", n);
        for (int i = 0; i < n; i++) {
            scanf("%d", &arr[i]);
        }
    } else if (inputMethod == 2) {
        srand(time(NULL));
        for (int i = 0; i < n; i++) {
            arr[i] = rand() % 10000;
        }
        printf("Random array generated:\n");
    } else {
        printf("Invalid input method choice!\n");
        return 1;
    }

    // Copy original array to each sorting array
    memcpy(arr_insertion, arr, n * sizeof(int));
    memcpy(arr_selection, arr, n * sizeof(int));
    memcpy(arr_heap, arr, n * sizeof(int));


    // Insertion Sort
    start = clock();
    insertionSort(arr_insertion, n);
    end = clock();
    free(arr_insertion);

    time_taken = ((double)(end - start)) / CLOCKS_PER_SEC;
    printf("\nTime taken by Insertion Sort: %.6f seconds\n", time_taken);

    // Selection Sort
    start = clock();
    selectionSort(arr_selection, n);
    end = clock();
    time_taken = ((double)(end - start)) / CLOCKS_PER_SEC;
    free(arr_selection);

    printf("Time taken by Selection Sort: %.6f seconds\n", time_taken);

    // Heap Sort
    start = clock();
    heapSort(arr_heap, n);
    end = clock();
    free(arr_heap);
    time_taken = ((double)(end - start)) / CLOCKS_PER_SEC;
    printf("Time taken by Heap Sort: %.6f seconds\n", time_taken);
    // Free dynamically allocated memory

    free(arr);


    return 0;
}
