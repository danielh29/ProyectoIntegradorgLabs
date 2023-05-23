package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.altasAreas;
import mvc.vistas.home;

/**
 * Clase controlador que implementa ActionListener que cambiará de la vista
 * altasAreas a altas
 * 
 * @author alexjun09
 *
 */
public class altasAreasAñadir implements ActionListener {

	altasAreas aa;
	altas a;

	/**
	 * Método que declarará las vistas con las que queremos trabjar
	 * 
	 * @param altasAreas la vista altasAreas
	 * @param altas      la vista altas
	 */
	public void setVentanaUsuario(altasAreas altasAreas, altas altas) {
		aa = altasAreas;
		a = altas;
	}

	/**
	 * metodo actionPerformed que se deshará de la vista altasAreas y abrirá la
	 * vista altas
	 */
	public void actionPerformed(ActionEvent e) {
		aa.dispose();
		a.hacerVisible();

	}

}
