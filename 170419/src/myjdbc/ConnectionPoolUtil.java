package myjdbc;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.activation.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

public class ConnectionPoolUtil {
	private static ConnectionPoolUtil     datasource;
    private BasicDataSource ds;

    public ConnectionPoolUtil() throws IOException, SQLException, PropertyVetoException {
        ds = new BasicDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUsername("root");
        ds.setPassword("1ghddlr!@");
        ds.setUrl("jdbc:mysql://localhost:3306/hr");
       
     // the settings below are optional -- dbcp can work with defaults
        ds.setMinIdle(5);
        ds.setMaxIdle(20);
        ds.setMaxOpenPreparedStatements(180);

    }

    public static ConnectionPoolUtil getInstance() throws IOException, SQLException, PropertyVetoException {
        if (datasource == null) {
            datasource = new ConnectionPoolUtil();
            return datasource;
        } else {
            return datasource;
        }
    }

    public Connection getConnection() throws SQLException {
        return this.ds.getConnection();
    }

}
