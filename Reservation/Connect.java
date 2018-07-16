import java.sql.*;
public class Connect
{
public Connection con;

public Connect()
{
try
{
//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:ucanaccess://C:\\Reservation/Railway.accdb");
}
catch(Exception e1)
{
System.out.println("Connection failed: 6"+e1);
}
}
}