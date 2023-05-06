import java.util.Scanner;

public class ArrayFor1
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter size of the array : ");
        int iSize = sobj.nextInt();

        int Arr[]=new int[iSize];

        int iCnt=0;
        System.out.println("Enter the elements : ");

        for(iCnt=0;iCnt<iSize;iCnt++)
        {
            Arr[iCnt]=sobj.nextInt();
        }
        System.out.println("Elements of the array are : ");

        for(iCnt=0;iCnt<iSize;iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }



   }
}