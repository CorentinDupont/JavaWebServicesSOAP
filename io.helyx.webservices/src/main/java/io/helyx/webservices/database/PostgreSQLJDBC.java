package io.helyx.webservices.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgreSQLJDBC {
	
  Connection connection = null;
  
  /**
   * Initialize the database connection
   */
  public void init() {
	  try {
	     Class.forName("org.postgresql.Driver");
	     connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/corentinhelyx", "postgres", "");
	     
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

  
}