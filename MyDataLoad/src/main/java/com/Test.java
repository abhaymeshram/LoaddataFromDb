import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class Test {
public static void main(String[] args) {
    Context initContext = null;
	try {
		initContext = new InitialContext();
		   Context envContext = new InitialContext();;
		    DataSource ds = (DataSource) envContext.lookup("java:jboss/datasources/kieDS");
		    Connection conn = ds.getConnection();
		    Statement statement = conn.createStatement();
            String sql = "SELECT isSupplementary FROM kie.card";
            ResultSet rs = statement.executeQuery(sql);
             
            while (rs.next()) {
              System.out.println(rs.getString("isSupplementary"));
            }
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
