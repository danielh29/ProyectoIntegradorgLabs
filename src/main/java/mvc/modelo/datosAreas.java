package mvc.modelo;

/**
 * Clase que almacenará todos los datos de las areas
 * 
 * @author alexjun09
 *
 */
public class datosAreas {
	private int ID_Area;
	private String DESCRIPCION;

	/**
	 * constructor del objeto datosAreas
	 * 
	 * @param ID_Area     el id del area
	 * @param DESCRIPCION la description del area
	 */
	public datosAreas(int ID_Area, String DESCRIPCION) {
		this.ID_Area = ID_Area;
		this.DESCRIPCION = DESCRIPCION;
	}

	/**
	 * constructor del objeto datos area vacio
	 */
	public datosAreas() {

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
	 * getter de la description
	 * 
	 * @return DESCRIPCION la description
	 */
	public String getDESCRIPCION() {
		return DESCRIPCION;
	}

	/**
	 * setter de la descripcion
	 * 
	 * @param dESCRIPCION la descripcion
	 */
	public void setDESCRIPCION(String dESCRIPCION) {
		DESCRIPCION = dESCRIPCION;
	}

	/**
	 * metodo tostring que devolverá todos los datos del area
	 * 
	 * @return todos los datos del area en forma de string
	 */
	public String toString() {
		return "datosAreas [ID_Area= " + ID_Area + ", DESCRIPCION= " + DESCRIPCION + " ]";
	}

}
