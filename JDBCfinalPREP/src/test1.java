import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
 
public class test1 {
 
	public static void main(String[] args) throws Exception{
		// see note at bottom
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// variables for connection
		final String url = "jdbc:mysql:///baqar";
	    final String user = "root";
	    final String password = "baqar123";
	    
	    // establish the connection
	    Connection con = DriverManager.getConnection(url, user, password);
	    
	    // display status message
	 // create JDBC statement object
	      Statement st = con.createStatement();

	      // prepare SQL query
	      String query = "SELECT * FROM TEST";

	      // send and execute SQL query in Database software
	      ResultSet rs = st.executeQuery(query);

	      // process the ResultSet object
	      boolean flag = false;
	      while (rs.next()) {
	         flag = true;
	         System.out.println(rs.getInt(1) + " " + rs.getString(3));
	      }

	      if (flag == true) {
	         System.out.println("\nRecords retrieved and displayed");
	      } else {
	         System.out.println("Record not found");
	         System.out.println("Record not found");
	         System.out.println("Record not found");
	      }

	      // close JDBC objects
	      rs.close();
	      st.close();
	      con.close();

 
	}
 
}
