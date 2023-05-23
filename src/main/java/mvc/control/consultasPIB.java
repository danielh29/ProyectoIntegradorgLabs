package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import BBDD.AccesoBBDD;
import mvc.modelo.datosAreas;
import mvc.modelo.datosPI;
import mvc.vistas.buscarPI;
import mvc.vistas.editarAlumnos;
import mvc.vistas.consultas;

/**
 * clase que almacena los datos de las consultas de los proyectos integradores
 * 
 * @author alexjun09
 *
 */
public class consultasPIB implements ActionListener {

	consultas c;
	buscarPI pi;
	ArrayList<datosPI> listaPI = new ArrayList<>();

	/**
	 * Método que declarará las vistas con las que queremos trabjar
	 * 
	 * @param consultas vista consultas
	 * @param buscar    vista buscar
	 */
	public void setVentanaUsuario(consultas consultas, buscarPI buscar) {
		c = consultas;
		pi = buscar;
	}

	/**
	 * metodo que cambia de vistas y almacena los datos de los proyectos
	 * integradores
	 */
	public void actionPerformed(ActionEvent e) {
		AccesoBBDD acceso = new AccesoBBDD();

		listaPI = acceso.obtenerDatosPI();

		pi.setListaPI(listaPI);

		c.dispose();
		pi.hacerVisible();

	}

}
