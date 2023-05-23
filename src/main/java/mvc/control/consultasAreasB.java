package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import BBDD.AccesoBBDD;
import mvc.modelo.datosAlumno;
import mvc.modelo.datosAreas;
import mvc.vistas.buscarArea;
import mvc.vistas.editarAlumnos;
import mvc.vistas.editarAreas;
import mvc.vistas.consultas;

/**
 * clase que almacena los datos de las consultas de las areas
 * 
 * @author alexjun09
 *
 */
public class consultasAreasB implements ActionListener {

	consultas c;
	buscarArea ba;
	ArrayList<datosAreas> listaAreas = new ArrayList<>();

	/**
	 * Método que declarará las vistas con las que queremos trabjar
	 * 
	 * @param consultas  vista consultas
	 * @param buscarArea vista buscarAreas
	 */
	public void setVentanaUsuario(consultas consultas, buscarArea buscarArea) {
		c = consultas;
		ba = buscarArea;
	}

	/**
	 * metodo que cambia de vista y almacena los datos de la query
	 */
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		AccesoBBDD acceso = new AccesoBBDD();

		listaAreas = acceso.obtenerDatosAreas();

		ba.setListaArea(listaAreas);

		c.dispose();
		ba.hacerVisible();

	}

}
