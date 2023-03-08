import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class JDBC1
{
    static final String DB_URL = "jdbc:mysql://localhost/java";
    static final String USER = "root";
    static final String PASS = "Bhagy@1234";
    static final String QUERY = "create table math(Id int(),Chapter_Name varchar())";
    JDBC1() throws ClassNotFoundException
    {
        Class.forName("com.mysql.jdbc.Driver");
    }
    void exec()
    {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
        ){
            stmt.executeUpdate(QUERY);
            System.out.println("DONE");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
public class JDBC {
    public static void main(String[] args) {
        try {
            JDBC1 j=new JDBC1();
            j.exec();
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Class Not Found");
        }
    }
}