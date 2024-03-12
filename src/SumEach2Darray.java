public class SumEach2Darray {
    public static void main(String[] args) {

        int[][] integers = {
                {10,20,30,40},
                {40,10,50,30,10},
                {20,60,50,20,60}
                        };

        printSumRow(integers);
        System.out.println(  );
        printSumColumn(integers);
    }

// declaration of the int sum outside the for loop deallocates the sum each time the loop is exe

//    so if sum was to be used outside it must be resigned after the first for loop for the rows
    public static void printSumRow(int[][] integers) {
        int sum = 0;
        for (int i = 0; i < 3;  i++) {
//            int sum = 0;
            sum=0;
            for (int j = 0;  j < integers[i].length; j++)
                sum += integers[i][j];
            System.out.println("The sum of row " + (i+1) + " is "+ sum);
        }
    }


    public static void printSumColumn(int[][] integers) {

        for (int i = 0; i < 4 ; i++) { //loop among the column
            int sum = 0;
            for (int j = 0;  j < 3; j++) //loop among the row
                sum += integers[j][i];
            System.out.println("The sum of Column " + (i + 1) + " is "+ sum);
        }
    }
}