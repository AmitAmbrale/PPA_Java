import java.sql.*;

class Database1
{
    public static void main(String Arg[])
    {

        String Url="jdbc:mysql://localhost:3306//ppa49";
        String Username="root";
        String Password="root";
        String Query="select * from student";

        Connection cobj=DriverManager.getConnection(Url,Username,Password);

        Statement sobj=cobj.createStatement();

        ResultSet robj=sobj.executeQuery(Query);

        while(robj.next())
        {
            System.out.println("RID is " + robj.getInt("rno"));
            System.out.println("name is " + robj.getString("name"));
            System.out.println("city is " + robj.getString("city"));
            System.out.println("marks is " + robj.getInt("marks"));
        }
    }
}