package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.buscarAlumnos;
import mvc.vistas.buscarArea;
import mvc.vistas.consultas;
import mvc.vistas.home;

/**
 * clase que implementa action listener y cambia de vista de buscarAlumnos al
 * home
 * 
 * @author alexjun09
 *
 */
public class buscarAlumnosHome implements ActionListener {

	buscarAlumnos ba;
	home h;

	/**
	 * Método que declarará las vistas con las que queremos trabjar
	 * 
	 * @param buscarAlumnos vista buscar Alumnos
	 * @param home
	 */
	public void setVentanaUsuario(buscarAlumnos buscarAlumnos, home home) {
		ba = buscarAlumnos;
		h = home;
	}

	/**
	 * metodo que cambia de vista al home
	 */
	public void actionPerformed(ActionEvent e) {
		ba.dispose();
		h.hacerVisible();

	}

}
