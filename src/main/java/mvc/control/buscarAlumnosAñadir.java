package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.buscarAlumnos;
import mvc.vistas.buscarArea;

/**
 * clase que implementa action listener y que cambia de buscar alumnos a altas
 * 
 * @author alexjun09
 *
 */
public class buscarAlumnosAñadir implements ActionListener {

	buscarAlumnos ba;
	altas a;

	/**
	 * Método que declarará las vistas con las que queremos trabjar
	 * 
	 * @param buscarAlumnos vista buscar Alumnos
	 * @param altas         vista altas
	 */
	public void setVentanaUsuario(buscarAlumnos buscarAlumnos, altas altas) {
		ba = buscarAlumnos;
		a = altas;
	}

	/**
	 * metodo que cambia de vista a altas
	 */
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		ba.dispose();
		a.hacerVisible();

	}

}
