import java.util.*;
import java.io.*;
import java.lang.*;

class Collection7
{
    public static void main(String Arg[]) throws Exception
    {
        //Create Stack of integers
        //This similar as template in c++
        Stack <Integer>sobj=new Stack<Integer>();

        //Insert the contents in stack
        sobj.push(10);
        sobj.push(20);
        sobj.push(30);
        sobj.push(40);
        sobj.push(50);
        //int i;
        //REmove the conents from stack
        Integer element=sobj.pop();
        System.out.println("poped element is "+ element);

        //We can search the element in the stack
        int position=0;
        position=sobj.search(30);
        if(position == -1)
        {
            System.out.println("There is no such element in stack");
        }
        System.out.println("Element is found at position "+ position);

        //Display all the contents of stack
        System.out.println("Stack contains : "+sobj);
    }
}