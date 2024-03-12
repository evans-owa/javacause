public class RaggedArray {
    public static void main(String[] args) {
//        an array that does not have same number of lenght

        int[][] integers = {
                {43,6,3,8},
                {8,6,4,7,2,7,2},
                {5,67,4,2,6}
        };

        printArray(integers);

    }

    public static void printArray(int[][] integers){
        for (int i = 0; i < integers.length; i++){
            for (int j=0; j< integers[i].length; j++) // shows the exact length of an array
                System.out.print(integers[i][j]);

            System.out.println();
        }
    }
}
