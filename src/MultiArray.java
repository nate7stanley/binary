public class MultiArray {

    public static void main(String arg[]) {
        int [][] arr= {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        // arr[row][column]

        for (int i=0 ; i<arr.length ; i++) {
            for (int j=0 ; j<arr[i].length ; j++) {
                System.out.print(arr[i][j]);
            }
        }


    }
}


//start the presentation for friday of what we have learned this week