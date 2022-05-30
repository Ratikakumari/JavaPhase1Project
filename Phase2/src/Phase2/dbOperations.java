package Phase2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Statement;



public class dbOperations {
	public static final String DB_URL="jdbc:mysql://localhost:3306/db";
	public static final String USERNAME="root";
	public static final String PASSWORD="Ratika@123";
	
	public static void main(String[] args) throws ClassNotFoundException,SQLException { 
		
		//register my driver
Class.forName("com.mysql.jdbc.Driver");
//establish connection with DB
Connection con=DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
if(con!=null) {
	System.out.println(con+":connection established");
}
else {
	System.out.println("not established");
}
//prepare a sql statement ->Statement,PreparedStatement 
String sql="select* from student3";
Statement st=con.createStatement();
//R
ResultSet rs=st.executeQuery(sql);
System.out.println(rs.next());
st.close();
con.close();
	}}
	


