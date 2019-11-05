import java.sql.*;

public class LoginDao {

	public static boolean validate(String name,String pass){
		boolean status=false;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/lab3?" + "user=root&password=krepa123");
			
			PreparedStatement ps=con.prepareStatement("select * from userreg where name=? and pass=?");
			ps.setString(1,name);
			ps.setString(2,pass);
			
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			
			
		}catch(Exception e){System.out.println(e);}
		return status;
	}

	public static int subscribe(String name,String pass){
		boolean status=false;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/lab3?" + "user=root&password=krepa123");
			
			PreparedStatement ps=con.prepareStatement("insert into lab3.userreg values (? ,?)");
			ps.setString(1,name);
			ps.setString(2,pass);
			
			int rs= ps.executeUpdate();
			System.out.println(rs);
			return rs;
			
		}catch(Exception e){
			System.out.println(e);
		}
		return -1;
	}
}
