import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class DataBaseLayerIT {

	private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultSet = null;

	@Test
	public void testConnection() throws SQLException, ClassNotFoundException{

			Class.forName("com.mysql.jdbc.Driver");
			// Setup the connection with the DB
			connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/addressbook?user=root"); // ?user=...&password=...
			assertNotNull(connection);
			// Statements allow to issue SQL queries to the database
			statement = connection.createStatement();

			// Result set get the result of the SQL query
			resultSet = statement.executeQuery("SELECT * FROM address");
			assertTrue(resultSet.first());

	}
	
	@Test (expected = SQLException.class)
	public void testInsertInvalidIdNeg() throws SQLException, ClassNotFoundException {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/addressbook?user=root"); 
			assertNotNull(connection);
			statement = connection.createStatement();

			String insertSql = "INSERT INTO `address` (`id`,`name`,`phone`,`street`,`city`) VALUES (\"rrr\",\"Kurt Kleeblatt\",\"00491321654\",\"Am Planweg\",\"Brankldorf\")";
			resultSet = statement.executeQuery(insertSql);

	}

}
