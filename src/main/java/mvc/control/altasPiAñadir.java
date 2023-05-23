package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.altasPI;
import mvc.vistas.consultas;

/**
 * Clase controlador que implementa ActionListener que cambiará de la vista
 * altasPI a altas
 * 
 * @author alexjun09
 *
 */
public class altasPiAñadir implements ActionListener {

	altasPI a;
	altas aa;

	/**
	 * Método que declarará las vistas con las que queremos trabjar
	 * 
	 * @param altasPI la vista de altasPI
	 * @param altas   la vista de altas
	 */
	public void setVentanaUsuario(altasPI altasPI, altas altas) {
		a = altasPI;
		aa = altas;
	}

	/**
	 * metodo actionPerformed que se deshará de la vista altasPI y abrirá la vista
	 * altas
	 */
	public void actionPerformed(ActionEvent e) {
		a.dispose();
		aa.hacerVisible();

	}

}
