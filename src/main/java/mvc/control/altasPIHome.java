package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.altasPI;
import mvc.vistas.consultas;
import mvc.vistas.home;

/**
 * Clase controlador que implementa ActionListener que cambiará de la vista
 * altasPI al home
 * 
 * @author alexjun09
 *
 */
public class altasPIHome implements ActionListener {

	altasPI a;
	home h;

	/**
	 * Método que declarará las vistas con las que queremos trabjar
	 * 
	 * @param altasPI la vista de altasPI
	 * @param home    la vista del home
	 */
	public void setVentanaUsuario(altasPI altasPI, home home) {
		a = altasPI;
		h = home;
	}

	/**
	 * metodo actionPerformed que se deshará de la vista altasPI y abrirá la vista
	 * home
	 */
	public void actionPerformed(ActionEvent e) {
		a.dispose();
		h.hacerVisible();

	}

}
