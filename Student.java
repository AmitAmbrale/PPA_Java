import java.util.*;

public class Student {
    public static void main(String Arg[]) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the number of Rows in the array : ");
        int Row = obj.nextInt();

        System.out.println("Enter the number of Columns in the array : ");
        int Col = obj.nextInt();

        int Arr[][] = new int[Row][Col];

        System.out.println("Enter the elements of the First Array : ");
        int iCnt = 0, jCnt = 0;
        for (iCnt = 0; iCnt < Row; iCnt++) {
            for (jCnt = 0; jCnt < Col; jCnt++) {
                Arr[iCnt][jCnt] = obj.nextInt();
            }
        }

        System.out.println("Elements of the First Array are : ");

        for (iCnt = 0; iCnt < Row; iCnt++) {
            System.out.print("|");

            for (jCnt = 0; jCnt < Col; jCnt++) {
                System.out.print(Arr[iCnt][jCnt]);
            }
            System.out.println("|");
        }

        int Arr1[][] = new int[Row][Col];

        System.out.println("Enter the elements of the Second Array : ");
        for (iCnt = 0; iCnt < Row; iCnt++) {
            for (jCnt = 0; jCnt < Col; jCnt++) {
                Arr1[iCnt][jCnt] = obj.nextInt();
            }
        }

        System.out.println("Elements of the Second Array are : ");

        for (iCnt = 0; iCnt < Row; iCnt++) {
            System.out.print("|");

            for (jCnt = 0; jCnt < Col; jCnt++) {
                System.out.print(Arr1[iCnt][jCnt]);
            }
            System.out.println("|");
        }

        int Arr2[][] = new int[Row][Col];
        System.out.println("Addition of First Array and Second Array : ");
        for (iCnt = 0; iCnt < Row; iCnt++) 
        {
            System.out.print("|");
            for (jCnt = 0; jCnt < Col; jCnt++) 
            {
                Arr2[iCnt][jCnt] = Arr[iCnt][jCnt] + Arr1[iCnt][jCnt];
                System.out.print(Arr2[iCnt][jCnt]);
            }
            System.out.println("|");
        }

    }
}
