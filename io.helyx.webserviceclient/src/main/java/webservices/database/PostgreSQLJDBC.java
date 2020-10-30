package webservices.database;

import webservices.database.requests.TableRequests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgreSQLJDBC {
	
  public Connection connection = null;
  private static PostgreSQLJDBC instance = null;
  
  private PostgreSQLJDBC() {}
  
  /**
   * Singleton getInstance method to get the current instance
   * @return the current instance or a new instance
   */
  public static PostgreSQLJDBC getInstance() {
	  if (instance == null) {
		  instance = new PostgreSQLJDBC();
	  }
	  
	  return instance;
  }
  
  /**
   * Initialize the database connection
   */
  public void init() {
	  try {
	     Class.forName("org.postgresql.Driver");
	     this.connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/corentinhelyx", "postgres", "");

	     this.reset();
	     this.createTables();

	  } catch (Exception e) {
	     e.printStackTrace();
	     System.err.println(e.getClass().getName()+": "+e.getMessage());
	     System.exit(0);
	  }
	  System.out.println("Opened database successfully");
  }
  
  /**
   * Create tables in the database
   * @throws SQLException 
   */
  private void createTables() throws SQLException {
	  Statement statement = this.connection.createStatement();
	  statement.executeUpdate(TableRequests.CREATE_AUTHOR_TABLE);
	  statement.executeUpdate(TableRequests.CREATE_BOOK_TABLE);
  }

  private void reset() throws SQLException {
		Statement statement = this.connection.createStatement();
	  statement.executeUpdate("DROP TABLE IF EXISTS book CASCADE");
	  statement.executeUpdate("DROP TABLE IF EXISTS author");
  }

  
}