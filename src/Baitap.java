

public class Baitap {
    static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr);
    }
        static void printArray(int arr[]) {
                int n = arr.length;
                for (int i = 0; i <n; ++i)
                    System.out.print(arr[i]+ " ");
                System.out.println();


        }
    public static void main(String[] args) {

                int arr[] = {3,4,10,4,5,6,4,2,4,5,6} ;
          bubbleSort(arr);
            }
}
