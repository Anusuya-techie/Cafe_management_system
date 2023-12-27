
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class orderRegisterDao {
	private String dburl = "jdbc:mysql://localhost:3306/myprj"; // default port 3306
	private String dbuname = "root"; 
	private String dbpassword = "";
	private String dbdriver = "com.mysql.cj.jdbc.Driver";
	public void loadDriver(String dbDriver)
	{
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(dburl, dbuname, dbpassword);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return con;
	}
	public String insert(orderMember members) {
		loadDriver(dbdriver);
		Connection con = getConnection();
		String sql = "insert into memorder values(?,?,?,?)";
		String result="order placed successfully.. we will get back you soon";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, members.getUname());
			ps.setString(2, members.getFoodname());
			ps.setString(3, members.getQuantity());
			ps.setString(4, members.getAddress());
			
			ps.executeUpdate(); // to check details entered by user is correctly set into table 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			result="Data Not Entered ";
			e.printStackTrace();
		}
		return result;
	}

//public class RegisterDao {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



