package example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {

	public static boolean validate(String username,String userpass){
		boolean status=false;
		/*try{
                    Class.forName("com.mysql.jdbc.Driver");  
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","");  
			PreparedStatement ps=con.prepareStatement("select * from user where name=? and password=?");
			ps.setString(1,username);
			ps.setString(2,userpass);
			ResultSet rs=ps.executeQuery();
			status=rs.next();
		}catch(Exception e){e.printStackTrace();}*/
                if(username.equals("admin") && userpass.equals("123")){
                    status=true;
                }
                
		
return status;
	}
}
