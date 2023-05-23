package mvc.modelo;

import java.sql.Date;

/**
 * Clase que almacenará todos los datos de los proyectos integradores
 * 
 * @author alexjun09
 *
 */
public class datosPI {
	int ID_Proyecto;
	String Nombre;
	int Nota_Obtenida;
	Date Ano;
	int Grupo;
	String URL_Proyecto;
	int Curso;
	int ID_Area;

	/**
	 * Constructor del objeto datosPI
	 * 
	 * @param ID_Proyecto   el id del proyecto al que pertenece
	 * @param Nombre        el nombre del proyecto
	 * @param Nota_Obtenida la nota obtenida
	 * @param Ano           el año del proyecto
	 * @param Grupo         el grupo al que pertenece el proyecto
	 * @param URL_Proyecto  el link al proyecto
	 * @param Curso         el curso del proyecto
	 * @param ID_Area       el id del area del proyecto
	 */
	public datosPI(int ID_Proyecto, String Nombre, int Nota_Obtenida, Date Ano, int Grupo, String URL_Proyecto,
			int Curso, int ID_Area) {
		this.ID_Proyecto = ID_Proyecto;
		this.Nombre = Nombre;
		this.Nota_Obtenida = Nota_Obtenida;
		this.Ano = Ano;
		this.Grupo = Grupo;
		this.URL_Proyecto = URL_Proyecto;
		this.Curso = Curso;
		this.ID_Area = ID_Area;
	}

	/**
	 * constructor del objeto vacío
	 */
	public datosPI() {

	}

	/**
	 * getter del id del proyecto
	 * 
	 * @return ID_Proyecto el id del poyecto
	 */
	public int getID_Proyecto() {
		return ID_Proyecto;
	}

	/**
	 * setter del id del prouecto
	 * 
	 * @param iD_Proyecto el id del proyecto
	 */
	public void setID_Proyecto(int iD_Proyecto) {
		ID_Proyecto = iD_Proyecto;
	}

	/**
	 * getter del nombre del proyecto
	 * 
	 * @return Nombre el nombre del proyecto
	 */
	public String getNombre() {
		return Nombre;
	}

	/**
	 * setter del nombre del proyecto
	 * 
	 * @param nombre el nombre del proyecto
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	/**
	 * getter de la nota obtenida por el proyecto
	 * 
	 * @return Nota_Obtenida la nota obtenida
	 */
	public int getNota_Obtenida() {
		return Nota_Obtenida;
	}

	/**
	 * setter de la nota obtenida en el proyecto
	 * 
	 * @param nota_Obtenida la nota obtenida
	 */
	public void setNota_Obtenida(int nota_Obtenida) {
		Nota_Obtenida = nota_Obtenida;
	}

	/**
	 * getter del año del proyecto
	 * 
	 * @return Ano el año del proyecto
	 */
	public Date getAno() {
		return Ano;
	}

	/**
	 * setter del año del proyecto
	 * 
	 * @param ano2 el año del proyecto
	 */
	public void setAno(Date ano2) {
		Ano = ano2;
	}

	/**
	 * getter del grupo del proyecto
	 * 
	 * @return Grupo el grupo del proyecto
	 */
	public int getGrupo() {
		return Grupo;
	}

	/**
	 * setter del grupo del proyecto
	 * 
	 * @param grupo el grupo
	 */
	public void setGrupo(int grupo) {
		Grupo = grupo;
	}

	/**
	 * getter del link del proyecto
	 * 
	 * @return URL_Proyecto el link del proyecto
	 */
	public String getURL_Proyecto() {
		return URL_Proyecto;
	}

	/**
	 * setter del URL del proyecto
	 * 
	 * @param uRL_Proyecto el url del proyecto
	 */
	public void setURL_Proyecto(String uRL_Proyecto) {
		URL_Proyecto = uRL_Proyecto;
	}

	/**
	 * getter del curso del proyecto
	 * 
	 * @return Curso el curso del proyecto
	 */
	public int getCurso() {
		return Curso;
	}

	/**
	 * setter del curso
	 * 
	 * @param curso el curso
	 */
	public void setCurso(int curso) {
		Curso = curso;
	}

	/**
	 * getter del id del area
	 * 
	 * @return ID_Area el id del area
	 */
	public int getID_Area() {
		return ID_Area;
	}

	/**
	 * setter del id del area del proyecto
	 * 
	 * @param iD_Area el id del area
	 */
	public void setID_Area(int iD_Area) {
		ID_Area = iD_Area;
	}

	/**
	 * metodo tostring que devolverá todos los datos del area
	 * 
	 * @return todos los datos del area en forma de string
	 */
	public String toString() {
		return "datosPI{" + "ID_Proyecto=" + ID_Proyecto + ", Nombre='" + Nombre + '\'' + ", Nota_Obtenida="
				+ Nota_Obtenida + ", Ano=" + Ano + ", Grupo=" + Grupo + ", URL_Proyecto='" + URL_Proyecto + '\''
				+ ", Curso=" + Curso + ", ID_Area=" + ID_Area + '}';
	}

}
