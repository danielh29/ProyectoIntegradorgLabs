package BBDD;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import mvc.modelo.datosAlumno;
import mvc.modelo.datosAreas;
import mvc.modelo.datosPI;
import mvc.vistas.*;

public class AccesoBBDD {
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost/loginpi";
	private String usuario = "root";
	private String pass = "";

	Connection con = null;

	public AccesoBBDD() {
	}
		//Constructores clases externas
	
	    altasAlumnos alumnos;

	    public AccesoBBDD(altasAlumnos alumnos) {
	        this.alumnos = alumnos;
	    }
	    
	    altasAreas areas;
	    
	    public AccesoBBDD(altasAreas areas){
	    	this.areas = areas;
	    }
	    
	    altasPI proyectos;
	    
	    public AccesoBBDD(altasPI proyectos) {
	    	this.proyectos = proyectos;
	    }
	    
	    datosAlumno consultarAlumno;
	    
	    public AccesoBBDD(datosAlumno consultarAlumno){
	    	this.consultarAlumno = consultarAlumno;
	    }
	    
	    datosAreas consultarAreas;
	    
	    public AccesoBBDD(datosAreas consultarAreas) {
	    	this.consultarAreas = consultarAreas;
	    }
	    
	    datosPI consultarPI;
	    
	    public AccesoBBDD(datosPI consultarPI) {
	    	this.consultarPI = consultarPI;
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
				System.out.println("error, las contraseñas no coinciden");
			} else {
				// el usuario no existe y las contraseñas son iguales asique almacenamos los
				// datos en la BBDD
				if (password.length() < 5) {
					answer = 3;
					System.out.println("Error, contraseña menor a 5 caracteres");
				} else {
					String queryInsert = "INSERT INTO USUARIOS VALUES ('" + user + "','" + password + "',null)";
					int insertar = stmt.executeUpdate(queryInsert);
					answer = 4;
					System.out.println("Usuario añadido correctamente");
				}

			}
		}

		return answer;
	}
	
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
    	    String consulta = "INSERT INTO ALUMNOS (ID_Alumno, Numero_exp, Nombre, ID_Proyecto) VALUES (?, ?, ?, ?)";
    	    
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
    	} catch (SQLException e) {
    	    System.out.println("Error al insertar los datos: " + e.getMessage());
    	} catch (NumberFormatException e) {
    	    System.out.println("Error de formato numérico: " + e.getMessage());
    	}

}  
    
    
    public void insertarDatosAreas() {
    		try {
                int idArea = Integer.parseInt(areas.getTextField().getText());
        		String descripcion = areas.getTextField_1().getText();
        		
                Connection conexion = getConexion();	
                
                String consulta2 = "INSERT INTO AREAS (ID_Area, DESCRIPCION) VALUES (?, ?)";
                
                PreparedStatement preparedStatement = conexion.prepareStatement(consulta2);

                preparedStatement.setInt(1, idArea);
                preparedStatement.setString(2, descripcion);

                preparedStatement.executeUpdate();

                preparedStatement.close();
                conexion.close();
        		
                System.out.println("Datos insertados correctamente en la tabla Areas.");
        	}catch(SQLException e) {
                System.out.println("Error al insertar los datos: " + e.getMessage());
        	}
    	}

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
			}catch(ParseException e) {
				System.out.println("Error al convertir la fecha: " + e.getMessage());
				return;
			}
			
			int grupo = Integer.parseInt(proyectos.getTextField_5().getText());
			String urlProyecto = proyectos.getTextField_1().getText();
			int curso = Integer.parseInt(proyectos.getTextField_6().getText());
			int idArea = Integer.parseInt(proyectos.getTextField_2().getText());
			
            Connection conexion = getConexion();	
            
            String consulta3 = "INSERT INTO PROYECTO (ID_Proyecto, Nombre, Nota_Obtenida, Ano, Grupo, URL_Proyecto, Curso, ID_Area) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            
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
		}catch(SQLException e) {
            System.out.println("Error al insertar los datos: " + e.getMessage());
    	}
    	
	}
	
	public void consultarDatosAlumnos() {
	    try {
	        Connection conexion = getConexion();
	        
	        // Consulta para obtener los datos de los alumnos
	        String consulta = "SELECT ID_Alumno, Numero_exp, Nombre, ID_Proyecto FROM ALUMNOS";
	        
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
	            
	            // Hacer algo con los datos obtenidos, por ejemplo, imprimirlos en la consola
	            System.out.println("ID_Alumno: " + idAlumno);
	            System.out.println("Numero_exp: " + numeroExp);
	            System.out.println("Nombre: " + nombre);
	            System.out.println("ID_Proyecto: " + idProyecto);
	            System.out.println("-------------------");
	        }
	        System.out.println("AARON");
	        // Cerrar el ResultSet, el PreparedStatement y la conexión
	        resultSet.close();
	        preparedStatement.close();
	        conexion.close();
	        
	        System.out.println("Consulta de datos de alumnos completada.");
	    } catch (SQLException e) {
	        System.out.println("Error al consultar los datos de los alumnos: " + e.getMessage());
	    }
	}
	
	public ArrayList<datosAlumno> obtenerDatosAlumnos() {
        ArrayList<datosAlumno> listaAlumnos = new ArrayList<>();
        
        try {
            Connection conexion = getConexion();
            
            // Consulta para obtener los datos de los alumnos
            String consulta = "SELECT ID_Alumno, Numero_exp, Nombre, ID_Proyecto FROM ALUMNOS";
            
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
                System.out.println(listaAlumnos);
                
            }
            System.out.println("SegundoMetodo");
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

}
 
    	
        	
 

