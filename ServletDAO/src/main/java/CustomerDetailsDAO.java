import java.sql.*;
public class CustomerDetailsDAO {
	private String dburl="jdbc:mysql://localhost:3306/customerdb";
	private String dbusername="root";
	private String dbpassword="root";
	private String dbdriver="com.mysql.jdbc.Driver";
	
	public void loadJDBCDriver(String dbdriver) {
		try {
			Class.forName(dbdriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		Connection con=null;
		try {
			con=DriverManager.getConnection(dburl, dbusername, dbpassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;		
	}
	
	public String insertCustomerRecord(Customer customer) {
		loadJDBCDriver(dbdriver);
		Connection con=getConnection();
		String sql="insert into customerdb.customer values(?,?,?,?,?)";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, customer.getUsername());
			ps.setString(2, customer.getLocation());
			ps.setString(3, customer.getAddress());
			ps.setString(4, customer.getBusiness());
			ps.setString(5, customer.getNoofemp());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
		
	}
}