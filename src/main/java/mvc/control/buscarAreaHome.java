package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.buscarAlumnos;
import mvc.vistas.buscarArea;
import mvc.vistas.home;

/**
 * Clase que implementa actionListener y cambia de vistas de buscarArea al home
 * 
 * @author alexjun09
 *
 */
public class buscarAreaHome implements ActionListener {

	buscarArea ba;
	home h;

	/**
	 * Método que declarará las vistas con las que queremos trabjar
	 * 
	 * @param buscarArea vista buscar area
	 * @param home       vista home
	 */
	public void setVentanaUsuario(buscarArea buscarArea, home home) {
		ba = buscarArea;
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
