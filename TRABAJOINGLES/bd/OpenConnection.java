package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OpenConnection {

	public Connection getConnection() throws SQLException {
		String url = "jdbc:mariadb://10.50.20.120/wallagamepop";
		String clase = "org.mariadb.jdbc.Driver";
		String usuario = "flavio";
		String contra = "flavio";

		try {
			Class.forName(clase);
			return DriverManager.getConnection(url, usuario, contra);
		} catch (ClassNotFoundException | SQLException e) {
			System.err.println("No se ha encontrado la clase del driver: " + clase);
			throw new SQLException("No se ha encontrado la clase del driver", e);
		}

	}
}
