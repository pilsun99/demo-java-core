import java.util.Arrays;

public class Timmax {
    public static void main(String[] args) {
        int arr[] = {3, 4, 10, 4, 5, 6, 4, 2, 4, 5, 6};
        int max = arr[0];
        Arrays.sort(arr);

        for (int num: arr
             ) {
            if (max < num)
                max = num;
        }
        System.out.println("so lớn nhat trong mang là: " + max);
        System.out.println("so lớn thu 2 trong mang la: " + arr[arr.length - 1]);
    }
}
