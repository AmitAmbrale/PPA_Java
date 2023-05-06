import java.lang.*;
import java.io.*;
import java.util.*;

class Collection6
{
    public static void main(String Arg[])
    {
        //Create Vector of integers
        //This is similar as template in C++
        //In this case vector if size 10 gets created
        Vector <Integer> vobj1=new Vector<Integer>();

        //We can create vector as in which size of vector is 50
        Vector <Integer> vobj2=new Vector<Integer>(50);

        //We can create vector as in which size of vector is 50
        //When vector becme full its size gets incremented by 10
        Vector <Integer> vobj3=new Vector<Integer>(50,10);

        //Inserting the contents in vector
        vobj1.add(10);
        vobj1.add(20);
        vobj1.add(30);
        vobj1.add(40);
        vobj1.add(50);
        System.out.println("Contents of vector " + vobj1);

        //We can insert data at Specified position
        vobj1.add(3,11);
        System.out.println("Contents of vector \n"+vobj1);

        //We can remove elements from the specified position
        vobj1.remove(3);
        System.out.println("Contents of Vector \n"+vobj1);

        // We can replace the element from the specified position
        vobj1.add(3,21);
        System.out.println("Contents of vector \n"+vobj1);

        System.out.println("Number of elements in vector are : " + vobj1.size());

        System.out.println("First occurance of Third is : " + vobj1.indexOf(21));
        System.out.println("Last occurance of Third is : " + vobj1.lastIndexOf(21));

        //We can use iterator to iterate the vector 
        System.out.println("Iterating the vector ");
        Iterator it=vobj1.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        //We can remove all elements from vector
        vobj1.clear();
    }
}