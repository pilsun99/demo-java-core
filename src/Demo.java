public class Demo {
    public static void main(String[] args) {
        int arr[][] = new int[2][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d",arr[i][j]);
            }
            System.out.printf("\n");

            }

        //cách khai báo thứ 2
        int arr2[][] = {{1, 2, 3}, {4, 5, 6}};
        for (int[] item:arr2
             ) {
            for (int item2 : item
            ) {
                System.out.printf("%d",item2);
            }
            System.out.printf("\n");

        }
        }
    }

