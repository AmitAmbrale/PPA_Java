import java.lang.*;
import java.io.*;
import java.util.*;

class Collection4
{
    public static void main(String Arg[])
    {
        //Creating user defined class objects
        Student s1=new Student(101,"A",23);
        Student s2=new Student(102,"B",21);
        Student s3=new Student(103,"C",25);

        //Creating list
        ArrayList <Student>al=new ArrayList<Student>();
        al.add(s1);//adding Student class object
        al.add(s2);
        al.add(s3);

        System.out.println("Rollno "+ "name "+"age");
        Iterator itr=al.iterator();
        //traversing elements of ArrayList object
        while(itr.hasNext())
        {
            Student st=(Student)itr.next();
            if(st.age >= 20)
            {
                System.out.println(""+st.rollno+"    "+st.name+"    "+st.age);
            }
        }
    }
}
class Student
{
    public int rollno;
    public String name;
    public int age;

    public Student(int rollno,String name,int age)
    {
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
}