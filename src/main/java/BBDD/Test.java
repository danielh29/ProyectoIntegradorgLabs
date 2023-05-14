package BBDD;

import java.sql.*;

//clase de prueba para la BBDD
public class Test {
	public static void main(String[] args) throws SQLException {
		AccesoBBDD prueba = new AccesoBBDD();
		prueba.getConexion();
		//prueba.logIn("Dani", "adios");
	}
}
