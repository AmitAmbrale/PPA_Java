import java.util.Scanner;

public class ArrayWhile
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter size of the array : ");
        int iSize = sobj.nextInt();

        int Arr[]=new int[iSize];

        int iCnt=0;
        System.out.println("Enter the elements : ");

        while(iCnt<iSize)
        {
            Arr[iCnt]=sobj.nextInt();
            iCnt++;
        }
        System.out.println("Elements of the array are : ");
        
        iCnt=0;
        while(iCnt<iSize)
        {
            System.out.println(Arr[iCnt]);
            iCnt++;
        }



   }
}