package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.buscarAlumnos;
import mvc.vistas.buscarPI;
import mvc.vistas.home;

/**
 * Clase que implementa actionListener y cambia de vistas de buscarPI al home
 * 
 * @author alexjun09
 *
 */
public class buscarPIHome implements ActionListener {

	buscarPI bp;
	home h;

	/**
	 * Método que declarará las vistas con las que queremos trabjar
	 * 
	 * @param buscarPI vista buscarPI
	 * @param home     vista home
	 */
	public void setVentanaUsuario(buscarPI buscarPI, home home) {
		bp = buscarPI;
		h = home;
	}

	/**
	 * metodo que cambia de vista al home
	 */
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		bp.dispose();
		h.hacerVisible();

	}

}
