package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import BBDD.AccesoBBDD;
import mvc.modelo.datosAlumno;
import mvc.vistas.buscarAlumnos;
import mvc.vistas.editarAlumnos;
import mvc.vistas.consultas;

/**
 * clase que implementa action listener. Cambia de vistas y almacena datos de la
 * query de alumno
 * 
 * @author alexjun09
 *
 */
public class consultasAlumnosB implements ActionListener {

	consultas c;
	buscarAlumnos ba;
	ArrayList<datosAlumno> listaAlumnos = new ArrayList<>();

	/**
	 * Método que declarará las vistas con las que queremos trabjar
	 * 
	 * @param consultas     vista consultas
	 * @param buscarAlumnos vista buscarAlumnos
	 */
	public void setVentanaUsuario(consultas consultas, buscarAlumnos buscarAlumnos) {
		this.c = consultas;
		ba = buscarAlumnos;
	}

	/**
	 * metodo que cambia de vista y almacena los datos de la query
	 */
	public void actionPerformed(ActionEvent e) {
		AccesoBBDD acceso = new AccesoBBDD();

		listaAlumnos = acceso.obtenerDatosAlumnos();

		ba.setListaAlumnos(listaAlumnos);

		c.dispose();
		ba.hacerVisible();
	}

}
