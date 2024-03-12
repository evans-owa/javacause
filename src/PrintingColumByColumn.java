import java.util.Arrays;

public class PrintingColumByColumn {
            public static void main(String[] args) {
            int[][] owagos = {
                        {2,5,3,73,2,7} ,
                        {2,4,5,2,6,3}
                                };

//                System.out.println(Arrays.toString(owagos));
//                System.out.println(Arrays.deepToString((owagos))); // to string printing an array

// printing 2D array   column by column

            for (int i = 0; i<6; i++) {
                for (int j = 0; j < 2;  j++)
                    System.out.print(owagos[j][i] + " ");

                System.out.println();
            }

        }
}
