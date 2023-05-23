package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.buscarArea;
import mvc.vistas.home;

/**
 * 
 * @author alexjun09
 *
 */
public class buscarAreaAñadir implements ActionListener {

	buscarArea ba;
	altas a;

	/**
	 * Método que declarará las vistas con las que queremos trabjar
	 * 
	 * @param buscarArea vista buscar areas
	 * @param altas      vista altas
	 */
	public void setVentanaUsuario(buscarArea buscarArea, altas altas) {
		ba = buscarArea;
		a = altas;
	}

	/**
	 * metodo que cambia de vista a altas
	 */
	public void actionPerformed(ActionEvent e) {
		ba.dispose();
		a.hacerVisible();

	}

}
