import java.sql.*;
import net.ucanaccess.jdbc.JackcessOpenerInterface;

public class JDBCExample {

	public static void main(String[] args) throws SQLException {
		Connection connDB = null;

		try {
			// 建立驅動程式，連結odbc至Microsoft Access
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			// 下列字串的://之後要加上access檔案存放的地方
			String dataSource = "jdbc:ucanaccess://D:/java/workspace/HelloTest/Resources/Database1.accdb";
			// 連結資料庫
			connDB = DriverManager.getConnection(dataSource);
			// SQL共有 INSERT、SELECT、UPDATE、DELETE，以下分別列舉
			Statement st = connDB.createStatement();

			st.executeUpdate("INSERT INTO Customer (CustomerName, Phone) VALUES ('Andycow3','62551')");
			st.executeUpdate("INSERT INTO Customer (CustomerName, Phone) VALUES ('Andycow4','62991')");
			st.executeUpdate("INSERT INTO Customer (CustomerName, Phone) VALUES ('Andycow5','67551')");
			// 撈出剛剛新增的資料
			st.execute("SELECT * FROM Customer");

			ResultSet rs=st.getResultSet();
			
			while (rs.next()) {
				System.out.println(rs.getString("CustomerName")+" " +rs.getString("Phone"));
				
			}
				

			st.close();
			connDB.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
