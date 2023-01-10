public class Giaithua {
    public static void main(String[] args) {
        int arr[] = {3, 4, 10, 4, 5, 6, 4, 2, 4, 5, 6};
        int giaiThua = 1;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 1; j <= arr[i] ; j++) {
                giaiThua = giaiThua * j;
            }
            System.out.println(" gia thua cua " + arr[i] + " la :" + giaiThua);
            giaiThua = 1;
        }

    }

}
