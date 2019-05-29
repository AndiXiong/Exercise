

public class May31_2019_1 {
    public static void main(String args[]) {
        /**
         * Create a two-dimensional array with the following numbers
         *
         *  1 3 5 7
         *  2 4 6 8
         *  3 5 7 9
         */

        int [][] arr = new int [3][4];
        arr[0][0] = 1;
        arr[0][1] = 3;
        arr[0][2] = 5;
        arr[0][3] = 7;

        arr[1][0] = 2;
        arr[1][1] = 4;
        arr[1][2] = 6;
        arr[1][3] = 8;

        arr[2][0] = 3;
        arr[2][1] = 5;
        arr[2][2] = 7;
        arr[2][3] = 9;

        System.out.println(arr.length);
        System.out.println(arr[0].length);

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {

//                System.out.println(arr[i].length);

//                System.out.print(arr[i][j] + " ");

            }
//            System.out.println();
        }

    }

}
