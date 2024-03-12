public class MaxNumber2Darray {
    public static void main(String[] args) {
        int[][] integers = {
                {10,20,30,40},
                {40,10,50,30,10},
                {20,60,50,20,60}
                };
        for (int i=0; i<3; i++) {
            int max = integers[i][0];
            for (int j= 1; j <4; j++)
//             max = Math.max(integers[i][j], max);
                                //OR FOR getting the max and assigning
              max = (integers[i][j] > max) ? integers[i][j] : max;

            System.out.println("Row " + (i+1) + ": " + max );
        }
    }
}
