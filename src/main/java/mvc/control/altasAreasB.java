package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.altasAreas;
import mvc.vistas.altasPI;

/**
 * Clase controlador que implementa ActionListener que cambiará de la vista
 * altas a altasAreas
 * 
 * @author alexjun09
 *
 */
public class altasAreasB implements ActionListener {

	altas a;
	altasAreas aa;

	/**
	 * Método que declarará las vistas con las que queremos trabjar
	 * 
	 * @param altas      la vista altas
	 * @param altasAreas la vista altasAreas
	 */
	public void setVentanaUsuario(altas altas, altasAreas altasAreas) {
		a = altas;
		aa = altasAreas;

	}

	/**
	 * metodo actionPerformed que se deshará de la vista altas y abrirá la vista
	 * altasAreas
	 */
	public void actionPerformed(ActionEvent e) {
		a.dispose();
		aa.hacerVisible();
	}

}
