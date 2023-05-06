import java.util.Scanner;

public class ArrayFor 
{
        public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter size of the array : ");
        int iSize = sobj.nextInt();

        int Arr[]=new int[iSize];

        System.out.println("Enter the elements : ");
        int iCnt;
        for(iCnt=0;iCnt<=3;iCnt++)
        {
            Arr[iCnt]=sobj.nextInt();
        }
        System.out.println("Elements of the array are : ");
        for(iCnt=0;iCnt<=3;iCnt++)
        {
            System.out.println(Arr[iCnt]);

        }
        
        // Arr[0]=sobj.nextInt();
        // Arr[1]=sobj.nextInt();
        // Arr[2]=sobj.nextInt();
        // Arr[3]=sobj.nextInt();

        // System.out.println(Arr[0]);
        // System.out.println(Arr[1]);
        // System.out.println(Arr[2]);
        // System.out.println(Arr[3]);
        

        



    }
}
