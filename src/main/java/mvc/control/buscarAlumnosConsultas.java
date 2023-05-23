package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.buscarAlumnos;
import mvc.vistas.buscarArea;
import mvc.vistas.consultas;

/**
 * metodo que cambia de buscarAlumnos a consultas, tambien implementa action
 * listener
 * 
 * @author alexjun09
 *
 */
public class buscarAlumnosConsultas implements ActionListener {

	buscarAlumnos ba;
	consultas c;

	/**
	 * Método que declarará las vistas con las que queremos trabjar
	 * 
	 * @param buscarAlumnos vista buscarAlumnos
	 * @param consultas     vista consultas
	 */
	public void setVentanaUsuario(buscarAlumnos buscarAlumnos, consultas consultas) {
		ba = buscarAlumnos;
		c = consultas;
	}

	/**
	 * metodo que cambia de vista a consultas
	 */
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		ba.dispose();
		c.hacerVisible();

	}
}
