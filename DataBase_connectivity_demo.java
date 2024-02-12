package advanced_java;

import java.sql.Connection; // to establish a connection 
import java.sql.DriverManager; // check the configuration bw java and sql (jdbc,mysql,localhost,ssl- checks these 
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBase_connectivity_demo {

	public static void main(String[] args) throws Exception {
		Connection con = null; // connection - interface
		String dbURL  = "jdbc:mysql://localhost:3306/sla?useSSL=true";// jdbc - api,mysql-dbms, sla -db, ssl -  connection certification, 3306 - internal port 
		String driver = "com.mysql.cj.jdbc.Driver"; // common driver , cj - someone's name who developed this query
		String username = "root";
		String password = "";
		//Database connection creation 
		Class.forName(driver).newInstance(); // creates overall memory for all  above(jdbc,mysql,ssl,localhost) configured things
		con = DriverManager.getConnection(dbURL,username,password); // like a event organizer
		System.out.println("Java DB connection created successfully");
		// fetching records from mysql DB - two interfaces- statement, result set
		Statement st = con.createStatement(); // acts like cursor object
		//ResultSet rs = 	st.executeUpdate("insert into students values('jhfj','jhsfh','hgfhg','jhf',23,'jhfj')");
		ResultSet rs = st.executeQuery("select * from student"); // resultset container used to save the executed query op , resultset - o/p register
	
		while(rs.next()) {
			System.out.println("|student name |"+rs.getString("s_name")); // if you want age then give getint
			System.out.println("|blood group |"+rs.getString("blood"));
			System.out.println("|hometown name |"+rs.getString("city"));
			System.out.println("-------------------------------------------");
		}
		rs.close();

	}

} // ssl - secured socket , certificate 
