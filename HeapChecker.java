public class HeapChecker {
    public static boolean isMaxHeap(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= (n - 2) / 2; i++) {
            int leftChild = 2 * i + 1;
            int rightChild = 2 * i + 2;
            if (leftChild < n && arr[i] < arr[leftChild]) {
                return false;
            }
            if (rightChild < n && arr[i] < arr[rightChild]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] maxHeapArray = {100, 80, 70, 50, 60, 30, 20, 10, 5};
        int[] notMaxHeapArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] notHeapArray2 = {100, 80, 70, 90, 60, 30, 20, 10, 5};
        System.out.println("Is maxHeapArray a max heap? " + isMaxHeap(maxHeapArray)); // Output: true
        System.out.println("Is notMaxHeapArray a max heap? " + isMaxHeap(notMaxHeapArray)); // Output: false
        System.out.println("Is notHeapArray2 a max heap? " + isMaxHeap(notHeapArray2)); // Output: false
    }
}