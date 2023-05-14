package BBDD;

import java.sql.*;

public class AccesoBBDD {
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost/loginpi";
	private String usuario = "root";
	private String pass = "landsend00";

	Connection con = null;

	public AccesoBBDD() {
	}

	// nos conectamos a la BBDD
	public Connection getConexion() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, usuario, pass);
			System.out.println("Conexión establecida");
		} catch (Exception e) {
			System.out.println("Error de Conexión con la BBDD" + e.getMessage());
			e.printStackTrace();
		}
		return con;
	}

	// metodo que comprobará los datos
	public int logIn(String user, String pass) throws SQLException {
		int answer = 0;

		Statement stmt = con.createStatement();

		// buscamos los usuarios en la BBDD
		String query = "SELECT usuario FROM USUARIOS WHERE usuario = '" + user + "'";
		ResultSet resultado = stmt.executeQuery(query);

		// verificamos que la BBDD ha devueto algo (el usuario existe)
		if (resultado.next()) {
			// verificamos que lo que ha devuelto coincide con lo escrito
			if (resultado.getString("usuario").equals(user)) {
				// buscamos la contraseña
				String query2 = "SELECT contrasena FROM USUARIOS WHERE usuario = '" + user + "'";
				ResultSet resultado2 = stmt.executeQuery(query2);
				resultado2.next();
				// verificamos que la contraseña coincide con el usuario
				if (resultado2.getString("contrasena").equals(pass)) {
					System.out.println("Acceso conseguido!");
					resultado.close();
					stmt.close();
					con.close();
					answer = 1;
					// contraseña incorrecta
				} else {
					System.out.println("Acceso denegado, Contraseña incorrecta");
					answer = 2;
				}
			}
			return answer;
			// usuario no existe
		} else {
			System.out.println("Acceso denegado, usuario no existe");
			return 3;
		}
	}

	public int signUp(String user, String password, String repetirPassword) throws SQLException {
		int answer = 0;

		Statement stmt = con.createStatement();
		String queryUsuario = "SELECT * FROM USUARIOS WHERE usuario = '" + user + "'";
		ResultSet resultado1 = stmt.executeQuery(queryUsuario);

		// el usuario ya existe, hay que usar otro nombre
		if (resultado1.next()) {
			answer = 1;
			System.out.println("Error, usuario ya existe");
		} else {
			// la contraseña no coincide
			if (!password.equals(repetirPassword)) {
				answer = 2;
				System.out.println("Las contraseñas no coinciden");
			} else {
				// el usuario no existe y las contraseñas son iguales asique almacenamos los
				// datos en la BBDD
				String queryInsert = "INSERT INTO USUARIOS VALUES ('" + user + "','" + password + "',null)";
				int insertar = stmt.executeUpdate(queryInsert);
				answer = 3;
				System.out.println("Usuario añadido correctamente");
			}
		}

		return answer;
	}

}