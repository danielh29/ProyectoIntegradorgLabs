package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.editarAlumnos;
import mvc.vistas.consultas;
import mvc.vistas.home;

/**
 * Clase que implementa actionListener y cambia de vistas de consultaAlumno al
 * home
 * 
 * @author alexjun09
 *
 */
public class consultaAlumnoHome implements ActionListener {

	home h;
	editarAlumnos ca;

	/**
	 * metodo que actualiza los datos de las dos vistas
	 * 
	 * @param home
	 * @param consuAlum
	 */
	public void setVentanaUsuario(home home, editarAlumnos consuAlum) {
		h = home;
		ca = consuAlum;
	}

	/**
	 * metodo que cambia de vista al home
	 */
	public void actionPerformed(ActionEvent e) {
		ca.dispose();
		h.hacerVisible();
	}

}
