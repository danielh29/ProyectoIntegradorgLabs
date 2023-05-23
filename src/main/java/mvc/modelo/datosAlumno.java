package mvc.modelo;

/**
 * Clase que almacena todos los datos de los alumnos
 * 
 * @author alexjun09
 *
 */
public class datosAlumno {
	private int ID_Alumno;
	private int Numero_exp;
	private String Nombre;
	private int ID_Proyecto;

	/**
	 * Constructor del objeto datosAlumno
	 * 
	 * @param ID_Alumno   el Identificador del alumno
	 * @param Numero_exp  el numero de expediente del alumno
	 * @param Nombre      el nombre del alumno
	 * @param ID_Proyecto el id del proyecto integrador que ha hecho
	 */
	public datosAlumno(int ID_Alumno, int Numero_exp, String Nombre, int ID_Proyecto) {
		this.ID_Alumno = ID_Alumno;
		this.Numero_exp = Numero_exp;
		this.Nombre = Nombre;
		this.ID_Proyecto = ID_Proyecto;
	}

	/**
	 * constructor vacio del objeto datos alumno
	 */
	public datosAlumno() {

	}

	/**
	 * getter del id del alumno
	 * 
	 * @return ID_Alumno devuelve el id del alumno
	 */
	public int getID_Alumno() {
		return ID_Alumno;
	}

	/**
	 * setter del id del alumno
	 * 
	 * @param ID_Alumno el id del alumno
	 */
	public void setID_Alumno(int ID_Alumno) {
		this.ID_Alumno = ID_Alumno;
	}

	/**
	 * getter del numero de expendiente del alumno
	 * 
	 * @return Numero_exp el numero de expediente
	 */
	public int getNumero_exp() {
		return Numero_exp;
	}

	/**
	 * setter del numero de expendiente del alumno
	 * 
	 * @param Numero_exp el numero de expediente
	 */
	public void setNumero_exp(int Numero_exp) {
		this.Numero_exp = Numero_exp;
	}

	/**
	 * getter del nombre del alumno
	 * 
	 * @return Nombre el nombre del alumno
	 */
	public String getNombre() {
		return Nombre;
	}

	/**
	 * setter del nombre del alumno
	 * 
	 * @param Nombre el nombre del alumno
	 */
	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}

	/**
	 * getter del id del proyecto que ha hecho el alumno
	 * 
	 * @return ID_Proyecto el id del proyecto
	 */
	public int getID_Proyecto() {
		return ID_Proyecto;
	}

	/**
	 * setter del id del proyecto que ha hecho el alumno
	 * 
	 * @param ID_Proyecto el id del proyecto
	 */
	public void setID_Proyecto(int ID_Proyecto) {
		this.ID_Proyecto = ID_Proyecto;
	}

	/**
	 * metodo tostring con todos los datos del alumno
	 * 
	 * @return todos los datos del alumno en forma de string
	 */
	public String toString() {
		return "datosAlumno [idAlumno=" + ID_Alumno + ", numeroExp=" + Numero_exp + ", nombre=" + Nombre
				+ ", idProyecto=" + ID_Proyecto + "]";
	}
}
