package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.altasAreas;
import mvc.vistas.consultas;
import mvc.vistas.home;

/**
 * Clase controlador que implementa ActionListener que cambiará de la vista
 * altasAreas al home
 * 
 * @author alexjun09
 *
 */
public class altasAreasHome implements ActionListener {
	altasAreas aa;
	home h;

	/**
	 * Método que declarará las vistas con las que queremos trabjar
	 * 
	 * @param altasAreas la vista altasAreas
	 * @param home       la vista home
	 */
	public void setVentanaUsuario(altasAreas altasAreas, home home) {
		aa = altasAreas;
		h = home;
	}

	/**
	 * metodo actionPerformed que se deshará de la vista altasAreas y abrirá la
	 * vista home
	 */
	public void actionPerformed(ActionEvent e) {
		aa.dispose();
		h.hacerVisible();

	}

}
