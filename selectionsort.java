public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        System.out.println("Array before sorting:");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();

        selectionSort(array);

        System.out.println("Array after sorting:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
