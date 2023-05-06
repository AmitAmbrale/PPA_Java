import java.util.*;
import java.io.*;
import java.lang.*;

class Collection3
{
    public static void main(String Arg[]) throws Exception
    {
        //Create ArrayList of strings
        //This similar as template in c++
        ArrayList <String>aobj=new ArrayList<String>();

        //Inserting the contents in ArrayList
        aobj.add("First");
        aobj.add("Second");
        aobj.add("Third");
        aobj.add("Fourth");
        aobj.add("Fifth");
        System.out.println("Contents of Array list \n"+aobj);

        //We can insert data at Specified position
        aobj.add(3,"new");
        System.out.println("Contents of Array list \n"+aobj);

        //We can insert data at last
        aobj.add("Two");
        System.out.println("Contents of Array list \n"+aobj);

        //We can remove elements from the specified position
        aobj.remove(3);
        System.out.println("Contents of Array list \n"+aobj);

        // We can replace the element from the specified position
        aobj.add(3,"New_Data");
        System.out.println("Contents of Array list \n"+aobj);

        System.out.println("Number of elements in Array list are : " + aobj.size());

        System.out.println("First occurance of Third is : " + aobj.indexOf("Third"));
        System.out.println("Last occurance of Third is : " + aobj.lastIndexOf("Third"));

        //We can use iterator to iterate the Array list 
        System.out.println("Iterating the Array list");
        Iterator it=aobj.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        //We can remove all elemnts from arraylist
        aobj.clear();
    }
}