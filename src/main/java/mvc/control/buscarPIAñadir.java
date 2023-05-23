package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.buscarPI;
import mvc.vistas.home;

/**
 * Clase que implementa actionListener y cambia de vistas de buscarPI a altas
 * 
 * @author alexjun09
 *
 */
public class buscarPIAñadir implements ActionListener {

	buscarPI bp;
	altas a;

	/**
	 * Método que declarará las vistas con las que queremos trabjar
	 * 
	 * @param buscarPI vista buscarPI
	 * @param altas    vista altas
	 */
	public void setVentanaUsuario(buscarPI buscarPI, altas altas) {
		bp = buscarPI;
		a = altas;
	}

	/**
	 * metodo que cambia de vista a altas
	 */
	public void actionPerformed(ActionEvent e) {
		bp.dispose();
		a.hacerVisible();

	}

}
