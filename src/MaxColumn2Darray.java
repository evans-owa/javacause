public class MaxColumn2Darray {
    public static void main(String[] args) {
        int[][] integers = {
                {10,20,30,40},
                {40,10,50,30,10},
                {20,160,50,20,60}
        };
        for (int i=0; i<3; i++)
            System.out.println("Row " + (i+1) + ": " + getMax(integers[i]) );
        }

    private static int getMax(int[] integer) {
        int max = integer[0];
          for (int j : integer) max = Math.max(max, j);

        return max;
    }
}
