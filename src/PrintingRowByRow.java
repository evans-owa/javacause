public class PrintingRowByRow {
    public static void main(String[] args) {
        int[][] owagos = { {2,5,3,73,2,7} , {2,4,5,2,6,3} };


// printing 2D array   using the for loop for printing

        for (int i = 0; i<2; i++) {
            for (int j = 0; j < 6; j++)
                System.out.print(owagos[i][j] + " ");

            System.out.println();
        }
//        printing 2D array

////        printing the first row
//        System.out.print(owagos[0][0] + " ");
//        System.out.print(owagos[0][1] + " ");
//        System.out.print(owagos[0][2] + " ");
//        System.out.print(owagos[0][3] + " ");
//        System.out.print(owagos[0][4] + " ");
//        System.out.print(owagos[0][5] + " ");
//
//
////        print the second row
//
//        System.out.print(owagos[1][0] + " ");
//        System.out.print(owagos[1][1] + " ");
//        System.out.print(owagos[1][2] + " ");
//        System.out.print(owagos[1][3] + " ");
//        System.out.print(owagos[1][4] + " ");
//        System.out.print(owagos[1][5] + " ");
    }
}
