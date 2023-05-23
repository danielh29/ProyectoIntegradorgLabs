package BBDD;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

import mvc.modelo.datosAlumno;
import mvc.modelo.datosAreas;
import mvc.modelo.datosPI;
import mvc.vistas.*;

/**
 * Esta clase contiene todos los metodos que se comunican con la base de datos
 * (altas, bajas, queries y demas)
 */
public class AccesoBBDD {
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost/loginpi";
	private String usuario = "root";
	private String pass = "root";

	Connection con = null;

	/**
	 * Constructor vacio para comunicarse con la base de datos
	 */
	public AccesoBBDD() {
	}

	altasAlumnos alumnos;

	/**
	 * Constructor de acceso a la base de datos
	 * 
	 * @param alumnos Los vista que da de alta a los alumnos
	 */
	public AccesoBBDD(altasAlumnos alumnos) {
		this.alumnos = alumnos;
	}

	altasAreas areas;

	/**
	 * Constructor de acceso a la base de datos
	 * 
	 * @param areas La vista que da de alta las areas
	 */
	public AccesoBBDD(altasAreas areas) {
		this.areas = areas;
	}

	altasPI proyectos;

	/**
	 * Constructor de acceso a la base de datos
	 * 
	 * @param proyectos La vista que da de alta los proyectos integradores
	 */
	public AccesoBBDD(altasPI proyectos) {
		this.proyectos = proyectos;
	}

	datosAlumno consultarAlumno;

	/**
	 * Constructor de acceso a la base de datos
	 * 
	 * @param consultarAlumno La clase que almacena los datos del alumno
	 */
	public AccesoBBDD(datosAlumno consultarAlumno) {
		this.consultarAlumno = consultarAlumno;
	}

	datosAreas consultarAreas;

	/**
	 * Constructor de acceso a la base de datos
	 * 
	 * @param consultarAreas La clase que almacena los datos del area
	 */
	public AccesoBBDD(datosAreas consultarAreas) {
		this.consultarAreas = consultarAreas;
	}

	datosPI consultarPI;

	/**
	 * Constructor de acceso a la base de datos
	 * 
	 * @param consultarPI La clase que almacena los datos del proyecto integrador
	 */
	public AccesoBBDD(datosPI consultarPI) {
		this.consultarPI = consultarPI;
	}

	editarAlumnos editarAlumno;

	/**
	 * Constructor de acceso a la base de datos
	 * 
	 * @param editarAlumnos La vista que edita los datos alumnos
	 */
	public AccesoBBDD(editarAlumnos editarAlumno) {
		this.editarAlumno = editarAlumno;
	}

	editarAreas editarArea;

	/**
	 * Constructor de acceso a la base de datos
	 * 
	 * @param editarArea La vista que edita los datos de las Areas
	 */
	public AccesoBBDD(editarAreas editarArea) {
		this.editarArea = editarArea;
	}

	editarPI editarPI;

	/**
	 * Constructor de acceso a la base de datos
	 * 
	 * @param editarPI La vista edita los datos de los proyectos integradores
	 */
	public AccesoBBDD(editarPI editarPI) {
		this.editarPI = editarPI;
	}

	/**
	 * metodo para conectarse con la base de datos, contiene control de errores
	 * 
	 * @return con La conexion
	 */
	public Connection getConexion() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, usuario, pass);

			System.out.println("Conexión establecida");
		} catch (Exception e) {
			System.out.println("Error de Conexión con la BBDD" + e.getMessage());
			JOptionPane.showMessageDialog(null, "Error de Conexión con la BBDD");
			e.printStackTrace();
		}
		return con;
	}

	/**
	 * Metodo que comprobará que los datos introducidos en el login son correctos
	 * 
	 * @param user El usuario que desea hacer login
	 * 
	 * @param pass La contraseña del usuario que desea hacer login
	 * 
	 * @throws SQLException Lanza exception ya que accede a una BBDD SQL
	 * 
	 * @return answer dependiendo de si la contraseña es correcta, o no, o si el
	 *         usuario existe, devuelve un numero u otro el cual es usado en la
	 *         vista del login
	 */
	public int logIn(String user, String pass) throws SQLException {
		int answer = 0;

		Statement stmt = con.createStatement();

		// buscamos los usuarios en la BBDD
		String query = "SELECT usuario FROM usuarios WHERE usuario = '" + user + "'";
		ResultSet resultado = stmt.executeQuery(query);

		// verificamos que la BBDD ha devueto algo (el usuario existe)
		if (resultado.next()) {
			// verificamos que lo que ha devuelto coincide con lo escrito
			if (resultado.getString("usuario").equals(user)) {
				// buscamos la contraseña
				String query2 = "SELECT contrasena FROM usuarios WHERE usuario = '" + user + "'";
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

	/**
	 * Metodo que comprobará que los datos introducidos en el signup son validos
	 * 
	 * @param user            El nombre de usuario que desea ser creado
	 * 
	 * @param password        La contraseña que le quiere asignar al nuevo usuario
	 * 
	 * @param repetirPassword Repetir la contraseña que se le desea asignar al nuevo
	 *                        usuario
	 * 
	 * @throws SQLException Lanza exception ya que accede a una BBDD SQL
	 * 
	 * @return answer dependiendo de si la contraseña es correcta, o no, o si el
	 *         usuario existe, devuelve un numero u otro el cual es usado en la
	 *         vista del login
	 * 
	 */
	public int signUp(String user, String password, String repetirPassword) throws SQLException {
		int answer = 0;

		Statement stmt = con.createStatement();
		String queryUsuario = "SELECT * FROM USUARIOS WHERE usuario = '" + user + "'";
		ResultSet resultado1 = stmt.executeQuery(queryUsuario);

		// el usuario ya existe, hay que usar otro nombre
		if (resultado1.next()) {
			answer = 1;
			System.out.println("Error, usuario ya existe");
			JOptionPane.showMessageDialog(null, "Error, usuario ya existe");
		} else {
			// la contraseña no coincide
			if (!password.equals(repetirPassword)) {
				answer = 2;
				System.out.println("error, las contraseñas no coinciden");
				JOptionPane.showMessageDialog(null, "error, las contraseñas no coinciden");
			} else {
				// el usuario no existe y las contraseñas son iguales asique almacenamos los
				// datos en la BBDD
				if (password.length() < 5) {
					answer = 3;
					System.out.println("Error, contraseña menor a 5 caracteres");
					JOptionPane.showMessageDialog(null, "Error, contraseña menor a 5 caracteres");
				} else {
					String queryInsert = "INSERT INTO usuarios VALUES ('" + user + "','" + password + "',null)";
					int insertar = stmt.executeUpdate(queryInsert);
					answer = 4;
					System.out.println("Usuario añadido correctamente");
					JOptionPane.showMessageDialog(null, "Usuario añadido correctamente");
				}

			}
		}

		return answer;
	}

	/**
	 * Metodo que insertará los datos de los alumnos en la BBDD
	 */
	public void insertarDatosAlumnos() {
		try {
			String nombre = alumnos.getTextField().getText();
			int numeroExp = Integer.parseInt(alumnos.getTextField_1().getText());
			int idAlumno = Integer.parseInt(alumnos.getTextField_2().getText());

			// Verificar si el campo textField_3 está vacío
			String textField3Value = alumnos.getTextField_3().getText();
			Integer idProyecto = null;
			if (!textField3Value.isEmpty()) {
				idProyecto = Integer.parseInt(textField3Value);
			}

			Connection conexion = getConexion();

			// Consulta para insertar los datos en la tabla ALUMNOS
			String consulta = "INSERT INTO alumnos (ID_Alumno, Numero_exp, Nombre, ID_Proyecto) VALUES (?, ?, ?, ?)";

			// Crear el objeto PreparedStatement
			PreparedStatement preparedStatement = conexion.prepareStatement(consulta);

			// Insertar los datos en la consulta
			preparedStatement.setInt(1, idAlumno);
			preparedStatement.setInt(2, numeroExp);
			preparedStatement.setString(3, nombre);

			if (idProyecto != null) {
				preparedStatement.setInt(4, idProyecto);
			} else {
				preparedStatement.setNull(4, java.sql.Types.INTEGER);
			}

			// Ejecutar la consulta
			preparedStatement.executeUpdate();

			// Cerrar el PreparedStatement y la conexión
			preparedStatement.close();
			conexion.close();

			System.out.println("Datos insertados correctamente en la tabla Alumnos.");
			JOptionPane.showMessageDialog(null, "Alumno insertado correctamente");
		} catch (SQLException e) {
			System.out.println("Error al insertar los datos: " + e.getMessage());
			JOptionPane.showMessageDialog(null, "Error al insertar los datos");

		} catch (NumberFormatException e) {
			System.out.println("Error de formato numérico: " + e.getMessage());
			JOptionPane.showMessageDialog(null, "Error de formato numérico");

		}

	}

	/**
	 * Metodo que insertará los datos de las areas en la BBDD
	 */
	public void insertarDatosAreas() {
		try {
			int idArea = Integer.parseInt(areas.getTextField().getText());
			String descripcion = areas.getTextField_1().getText();

			Connection conexion = getConexion();

			String consulta2 = "INSERT INTO areas (ID_Area, DESCRIPCION) VALUES (?, ?)";

			PreparedStatement preparedStatement = conexion.prepareStatement(consulta2);

			preparedStatement.setInt(1, idArea);
			preparedStatement.setString(2, descripcion);

			preparedStatement.executeUpdate();

			preparedStatement.close();
			conexion.close();

			System.out.println("Datos insertados correctamente en la tabla Areas.");
			JOptionPane.showMessageDialog(null, "Area insertada correctamente");

		} catch (SQLException e) {
			System.out.println("Error al insertar los datos: " + e.getMessage());
			JOptionPane.showMessageDialog(null, "Error al insertar los datos: " + e.getMessage());

		}
	}

	/**
	 * Metodo que insertará los datos de los proyectos integradores en la BBDD
	 */
	public void insertarDatosPI() throws ParseException {
		try {

			int idProyecto = Integer.parseInt(proyectos.getTextField_7().getText());
			String nombre = proyectos.getTextField().getText();
			int notaObtenida = Integer.parseInt(proyectos.getTextField_8().getText());
			String fechaTexto = proyectos.getTextField_4().getText();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
			Date ano = dateFormat.parse(fechaTexto);

			try {
				ano = dateFormat.parse(fechaTexto);
			} catch (ParseException e) {
				System.out.println("Error al convertir la fecha: " + e.getMessage());
				JOptionPane.showMessageDialog(null, "Error al convertir la fecha: " + e.getMessage());

				return;
			}

			int grupo = Integer.parseInt(proyectos.getTextField_5().getText());
			String urlProyecto = proyectos.getTextField_1().getText();
			int curso = Integer.parseInt(proyectos.getTextField_6().getText());
			int idArea = Integer.parseInt(proyectos.getTextField_2().getText());

			Connection conexion = getConexion();

			String consulta3 = "INSERT INTO proyecto (ID_Proyecto, Nombre, Nota_Obtenida, Ano, Grupo, URL_Proyecto, Curso, ID_Area) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

			PreparedStatement preparedStatement = conexion.prepareStatement(consulta3);

			preparedStatement.setInt(1, idProyecto);
			preparedStatement.setString(2, nombre);
			preparedStatement.setInt(3, notaObtenida);
			preparedStatement.setDate(4, new java.sql.Date(ano.getTime()));
			preparedStatement.setInt(5, grupo);
			preparedStatement.setString(6, urlProyecto);
			preparedStatement.setInt(7, curso);
			preparedStatement.setInt(8, idArea);

			preparedStatement.executeUpdate();
			preparedStatement.close();
			conexion.close();
			
			System.out.println("Datos insertados correctamente en la tabla Proyectos.");
			JOptionPane.showMessageDialog(null, "Proyecto insertado correctamente");
		} catch (SQLException e) {
			System.out.println("Error al insertar los datos: " + e.getMessage());
			JOptionPane.showMessageDialog(null, "Error al insertar los datos: " + e.getMessage());

		}

	}

	/**
	 * metodo que generará un arraylist con los datos de los alumnos
	 * 
	 * @return listaAlumnos La lista con los alumnos y sus correspondientes datos
	 */
	public ArrayList<datosAlumno> obtenerDatosAlumnos() {
		ArrayList<datosAlumno> listaAlumnos = new ArrayList<>();

		try {
			Connection conexion = getConexion();

			// Consulta para obtener los datos de los alumnos
			String consulta = "SELECT ID_Alumno, Numero_exp, Nombre, ID_Proyecto FROM alumnos";

			// Crear el objeto PreparedStatement
			PreparedStatement preparedStatement = conexion.prepareStatement(consulta);

			// Ejecutar la consulta y obtener el resultado
			ResultSet resultSet = preparedStatement.executeQuery();

			// Iterar sobre el resultado y procesar los datos
			while (resultSet.next()) {
				int idAlumno = resultSet.getInt("ID_Alumno");
				int numeroExp = resultSet.getInt("Numero_exp");
				String nombre = resultSet.getString("Nombre");
				int idProyecto = resultSet.getInt("ID_Proyecto");

				// Crear un objeto datosAlumno y agregarlo a la lista
				datosAlumno alumno = new datosAlumno();
				alumno.setID_Alumno(idAlumno);
				alumno.setNumero_exp(numeroExp);
				alumno.setNombre(nombre);
				alumno.setID_Proyecto(idProyecto);

				listaAlumnos.add(alumno);
			}
			// Cerrar el ResultSet, el PreparedStatement y la conexión
			resultSet.close();
			preparedStatement.close();
			conexion.close();

			System.out.println("Consulta de datos de alumnos completada.");
		} catch (SQLException e) {
			System.out.println("Error al consultar los datos de los alumnos: " + e.getMessage());
		}

		return listaAlumnos;
	}

	/**
	 * metodo que generará un arraylist con los datos de las areas
	 * 
	 * @return AREAS La lista con las areas y sus correspondientes datos
	 */
	public ArrayList<datosAreas> obtenerDatosAreas() {

		ArrayList<datosAreas> AREAS = new ArrayList<>();
		try {
			Connection conexion = getConexion();

			// Consulta para obtener los datos de los alumnos
			String consulta = "SELECT ID_Area, DESCRIPCION FROM areas";

			// Crear el objeto PreparedStatement
			PreparedStatement preparedStatement = conexion.prepareStatement(consulta);

			// Ejecutar la consulta y obtener el resultado
			ResultSet resultSet = preparedStatement.executeQuery();

			// Iterar sobre el resultado y procesar los datos
			while (resultSet.next()) {
				int idArea = resultSet.getInt("ID_Area");
				String descripcion = resultSet.getString("DESCRIPCION");

				// Crear un objeto datosAlumno y agregarlo a la lista
				datosAreas areasob = new datosAreas();
				areasob.setID_Area(idArea);
				areasob.setDESCRIPCION(descripcion);
				AREAS.add(areasob);

			}
			// Cerrar el ResultSet, el PreparedStatement y la conexión
			resultSet.close();
			preparedStatement.close();
			conexion.close();

			System.out.println("Consulta de datos de alumnos completada.");
		} catch (SQLException e) {
			System.out.println("Error al consultar los datos de los alumnos: " + e.getMessage());
		}

		return AREAS;

	}

	/**
	 * metodo que generará un arraylist con los datos de los proyectos integradores
	 * 
	 * @return PI La lista con los proyectos integradores y sus correspondientes
	 *         datos
	 */
	public ArrayList<datosPI> obtenerDatosPI() {

		ArrayList<datosPI> PI = new ArrayList<>();
		try {
			Connection conexion = getConexion();

			// Consulta para obtener los datos de los alumnos
			String consulta = "SELECT ID_Proyecto, nombre, Nota_obtenida, Ano, Grupo, URL_Proyecto, Curso, ID_Area  FROM proyecto";

			// Crear el objeto PreparedStatement
			PreparedStatement preparedStatement = conexion.prepareStatement(consulta);

			// Ejecutar la consulta y obtener el resultado
			ResultSet resultSet = preparedStatement.executeQuery();

			// Iterar sobre el resultado y procesar los datos
			while (resultSet.next()) {
				int ID_Proyecto = resultSet.getInt("ID_Proyecto");
				String nombre = resultSet.getString("nombre");
				int Nota_obtenida = resultSet.getInt("Nota_obtenida");
				Date Ano = resultSet.getDate("Ano");
				int Grupo = resultSet.getInt("Grupo");
				String URL_Proyecto = resultSet.getString("URL_Proyecto");
				int Curso = resultSet.getInt("Curso");
				int ID_Area = resultSet.getInt("ID_Area");

				// Crear un objeto datosAlumno y agregarlo a la lista
				datosPI datosPI = new datosPI();
				datosPI.setID_Proyecto(ID_Proyecto);
				datosPI.setNombre(nombre);
				datosPI.setAno((java.sql.Date) Ano);
				datosPI.setGrupo(Grupo);
				datosPI.setURL_Proyecto(URL_Proyecto);
				datosPI.setCurso(Curso);
				datosPI.setID_Area(ID_Area);
				PI.add(datosPI);

			}
			// Cerrar el ResultSet, el PreparedStatement y la conexión
			resultSet.close();
			preparedStatement.close();
			conexion.close();

			System.out.println("Consulta de datos de alumnos completada.");
		} catch (SQLException e) {
			System.out.println("Error al consultar los datos de los alumnos: " + e.getMessage());
		}

		return PI;

	}

	/**
	 * Metodo que cogera los datos de los alumnos de la BBDD y los actualizará con
	 * los nuevos datos proporcionados por el usuario
	 */
	public void editarDatosAlumnos() {
		try {
			String nombre = editarAlumno.getTextField().getText();
			int numeroExp = Integer.parseInt(editarAlumno.getTextField_1().getText());
			int idAlumno = Integer.parseInt(editarAlumno.getTextField_2().getText());
			int idProyecto = Integer.parseInt(editarAlumno.getTextField_3().getText());
			String nuevoIdAlumnoString = editarAlumno.getTextField_4().getText();
			Integer nuevoIdAlumno = null; // Valor por defecto

			if (!nuevoIdAlumnoString.isEmpty()) {
				nuevoIdAlumno = Integer.parseInt(nuevoIdAlumnoString);
			}

			Connection conexion = getConexion();

			String consulta;
			PreparedStatement preparedStatement;

			if (nuevoIdAlumno != null) {
				consulta = "UPDATE alumnos SET Numero_exp = ?, Nombre = ?, ID_Proyecto = ?, ID_Alumno = ? WHERE ID_Alumno = ?";
				preparedStatement = conexion.prepareStatement(consulta);
				preparedStatement.setInt(1, numeroExp);
				preparedStatement.setString(2, nombre);
				preparedStatement.setInt(3, idProyecto);
				preparedStatement.setInt(4, nuevoIdAlumno);
				preparedStatement.setInt(5, idAlumno);
			} else {
				consulta = "UPDATE alumnos SET Numero_exp = ?, Nombre = ?, ID_Proyecto = ? WHERE ID_Alumno = ?";
				preparedStatement = conexion.prepareStatement(consulta);
				preparedStatement.setInt(1, numeroExp);
				preparedStatement.setString(2, nombre);
				preparedStatement.setInt(3, idProyecto);
				preparedStatement.setInt(4, idAlumno);
			}

			int filasActualizadas = preparedStatement.executeUpdate();

			preparedStatement.close();
			conexion.close();

			if (filasActualizadas > 0) {
				System.out.println("Datos actualizados correctamente en la tabla Alumnos.");
				JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");

			} else {
				System.out.println("No se encontró ningún alumno con el ID especificado.");
				JOptionPane.showMessageDialog(null, "No se encontró ningún alumno con el ID especificado.");

			}
		} catch (SQLException e) {
			System.out.println("Error al actualizar los datos: " + e.getMessage());
			JOptionPane.showMessageDialog(null, "Error al actualizar los datos: " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Error de formato numérico: " + e.getMessage());
			JOptionPane.showMessageDialog(null, "Error al actualizar los datos: " + e.getMessage());

		}
	}

	/**
	 * Metodo que cogera los datos de las areas de la BBDD y los actualizará con los
	 * nuevos datos proporcionados por el usuario
	 */
	public void editarDatosAreas() {
		try {
			int idArea = Integer.parseInt(editarArea.getTextField().getText());
			String descripcion = editarArea.getTextField_1().getText();

			// Obtener el nuevo valor de ID_Area
			String nuevoIdAreaString = editarArea.getTextField_2().getText();
			Integer nuevoIdArea = null; // Valor por defecto

			if (!nuevoIdAreaString.isEmpty()) {
				nuevoIdArea = Integer.parseInt(nuevoIdAreaString);
			}

			Connection conexion = getConexion();

			String consulta;
			PreparedStatement preparedStatement;

			if (nuevoIdArea != null) {
				consulta = "UPDATE areas SET ID_Area = ?, DESCRIPCION = ? WHERE ID_Area = ?";
				preparedStatement = conexion.prepareStatement(consulta);
				preparedStatement.setInt(1, nuevoIdArea);
				preparedStatement.setString(2, descripcion);
				preparedStatement.setInt(3, idArea);
			} else {
				consulta = "UPDATE areas SET DESCRIPCION = ? WHERE ID_Area = ?";
				preparedStatement = conexion.prepareStatement(consulta);
				preparedStatement.setString(1, descripcion);
				preparedStatement.setInt(2, idArea);
			}

			preparedStatement.executeUpdate();

			preparedStatement.close();
			conexion.close();

			System.out.println("Datos actualizados correctamente en la tabla Areas.");
			JOptionPane.showMessageDialog(null, "Datos actualizados correctamente en la tabla Areas.");

		} catch (SQLException e) {
			System.out.println("Error al actualizar los datos: " + e.getMessage());
			JOptionPane.showMessageDialog(null, "Error al actualizar los datos: " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Error de formato numérico: " + e.getMessage());

		}
	}

	/**
	 * Metodo que cogera los datos los proyectos integradores de la BBDD y los
	 * actualizará con los nuevos datos proporcionados por el usuario
	 */

	public void editarDatosPI() throws ParseException {
		try {
			String idProyectoString = editarPI.getTextField().getText();
			int idProyecto = Integer.parseInt(idProyectoString);
			String nombre = editarPI.getTextField_3().getText();
			int notaObtenida = Integer.parseInt(editarPI.getTextField_4().getText());
			String fechaTexto = editarPI.getTextField_5().getText();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
			Date ano = dateFormat.parse(fechaTexto);
			String nuevoIdProyecto = editarPI.getTextField_10().getText();
			Integer nuevoIdProyectoInteger = null; // Valor por defecto

			try {
				ano = dateFormat.parse(fechaTexto);
			} catch (ParseException e) {
				System.out.println("Error al convertir la fecha: " + e.getMessage());
				return;
			}

			int grupo = Integer.parseInt(editarPI.getTextField_6().getText());
			String urlProyecto = editarPI.getTextField_7().getText();
			int curso = Integer.parseInt(editarPI.getTextField_8().getText());
			int idArea = Integer.parseInt(editarPI.getTextField_9().getText());

			Connection conexion = getConexion();

			String consulta;
			PreparedStatement preparedStatement;

			if (!nuevoIdProyecto.isEmpty()) {
				nuevoIdProyectoInteger = Integer.parseInt(nuevoIdProyecto);
				consulta = "UPDATE PROYECTO SET ID_Proyecto = ?, Nombre = ?, Nota_Obtenida = ?, Ano = ?, Grupo = ?, URL_Proyecto = ?, Curso = ?, ID_Area = ? WHERE ID_Proyecto = ?";
				preparedStatement = conexion.prepareStatement(consulta);
				preparedStatement.setInt(1, nuevoIdProyectoInteger);
				preparedStatement.setString(2, nombre);
				preparedStatement.setInt(3, notaObtenida);
				preparedStatement.setDate(4, new java.sql.Date(ano.getTime()));
				preparedStatement.setInt(5, grupo);
				preparedStatement.setString(6, urlProyecto);
				preparedStatement.setInt(7, curso);
				preparedStatement.setInt(8, idArea);
				preparedStatement.setInt(9, idProyecto);
			} else {
				consulta = "UPDATE PROYECTO SET Nombre = ?, Nota_Obtenida = ?, Ano = ?, Grupo = ?, URL_Proyecto = ?, Curso = ?, ID_Area = ? WHERE ID_Proyecto = ?";
				preparedStatement = conexion.prepareStatement(consulta);
				preparedStatement.setString(1, nombre);
				preparedStatement.setInt(2, notaObtenida);
				preparedStatement.setDate(3, new java.sql.Date(ano.getTime()));
				preparedStatement.setInt(4, grupo);
				preparedStatement.setString(5, urlProyecto);
				preparedStatement.setInt(6, curso);
				preparedStatement.setInt(7, idArea);
				preparedStatement.setInt(8, idProyecto);
			}

			preparedStatement.executeUpdate();
			preparedStatement.close();
			conexion.close();

			System.out.println("Los datos del proyecto se han actualizado correctamente.");
			JOptionPane.showMessageDialog(null, "Los datos del proyecto se han actualizado correctamente");

		} catch (SQLException e) {
			System.out.println("Error al actualizar los datos: " + e.getMessage());
			JOptionPane.showMessageDialog(null, "Error al actualizar los datos: " + e.getMessage());
		}
	}

	/**
	 * metodo que eliminará los datos de los alumnos de la BBDD
	 */
	public void borrarDatosAlumnos() {
		try {
			int idAlumno = Integer.parseInt(editarAlumno.getTextField_2().getText());

			Connection conexion = getConexion();

			// Consulta para eliminar los datos de la tabla ALUMNOS
			String consulta = "DELETE FROM alumnos WHERE ID_Alumno = ?";

			// Crear el objeto PreparedStatement
			PreparedStatement preparedStatement = conexion.prepareStatement(consulta);

			// Insertar los datos en la consulta
			preparedStatement.setInt(1, idAlumno);

			// Ejecutar la consulta
			int filasBorradas = preparedStatement.executeUpdate();

			// Cerrar el PreparedStatement y la conexión
			preparedStatement.close();
			conexion.close();

			if (filasBorradas > 0) {
				System.out.println("Datos eliminados correctamente de la tabla Alumnos.");
				System.out.println("Datos eliminados correctamente de la tabla Alumnos");
			} else {
				System.out.println("No se encontró ningún alumno con el ID especificado.");
				System.out.println("No se encontró ningún alumno con el ID especificado.");
			}
		} catch (SQLException e) {
			System.out.println("Error al eliminar los datos: " + e.getMessage());
			JOptionPane.showMessageDialog(null, "Error al eliminar los datos: " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Error de formato numérico: " + e.getMessage());
			JOptionPane.showMessageDialog(null, "Error de formato numérico: " + e.getMessage());
		}
	}

	/**
	 * metodo que eliminará los datos de las areas de la BBDD
	 */
	public void borrarDatosAreas() {
		try {
			int idArea = Integer.parseInt(editarArea.getTextField().getText());

			Connection conexion = getConexion();

			// Consulta para eliminar los datos de la tabla AREAS
			String consulta = "DELETE FROM areas WHERE ID_Area = ?";

			// Crear el objeto PreparedStatement
			PreparedStatement preparedStatement = conexion.prepareStatement(consulta);

			// Insertar los datos en la consulta
			preparedStatement.setInt(1, idArea);

			// Ejecutar la consulta
			int filasBorradas = preparedStatement.executeUpdate();

			// Cerrar el PreparedStatement y la conexión
			preparedStatement.close();
			conexion.close();

			if (filasBorradas > 0) {
				System.out.println("Datos eliminados correctamente de la tabla Areas.");
				JOptionPane.showMessageDialog(null, "Datos eliminados correctamente de la tabla Areas");
			} else {
				System.out.println("No se encontró ninguna área con el ID especificado.");
				JOptionPane.showMessageDialog(null, "No se encontró ninguna área con el ID especificado");
			}
		} catch (SQLException e) {
			System.out.println("Error al eliminar los datos: " + e.getMessage());
			JOptionPane.showMessageDialog(null, "Error al eliminar los datos: " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Error de formato numérico: " + e.getMessage());
			JOptionPane.showMessageDialog(null, "Error de formato numérico: " + e.getMessage());
		}
	}

	/**
	 * metodo que eliminará los datos de los proyectos integradores de la BBDD
	 */
	public void borrarDatosPI() {
		try {
			String idProyectoString = editarPI.getTextField().getText();
			int idProyecto = Integer.parseInt(idProyectoString);

			Connection conexion = getConexion();

			String consulta = "DELETE FROM PROYECTO WHERE ID_Proyecto = ?";
			PreparedStatement preparedStatement = conexion.prepareStatement(consulta);
			preparedStatement.setInt(1, idProyecto);

			int filasBorradas = preparedStatement.executeUpdate();

			preparedStatement.close();
			conexion.close();

			if (filasBorradas > 0) {
				System.out.println("Los datos del proyecto se han borrado correctamente.");
				JOptionPane.showMessageDialog(null, "Los datos del proyecto se han borrado correctamente");
			} else {
				System.out.println("No se encontró ningún proyecto con el ID especificado.");
				JOptionPane.showMessageDialog(null, "No se encontró ningún proyecto con el ID especificado");
			}

		} catch (SQLException e) {
			System.out.println("Error al borrar los datos: " + e.getMessage());
			JOptionPane.showMessageDialog(null, "Error al borrar los datos: " + e.getMessage());
		}
	}

}
