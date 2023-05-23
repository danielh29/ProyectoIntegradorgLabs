package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.home;

/**
 * Clase controlador que implementa ActionListener que cambiará de la vista
 * altas al home
 * 
 * @author alexjun09
 *
 */
public class altasHome implements ActionListener {

	home v;
	altas a;

	/**
	 * Método que declarará las vistas con las que queremos trabjar
	 * 
	 * @param vista la vista home
	 * @param altas la vista de altas
	 */
	public void setVentanaUsuario(home vista, altas altas) {
		v = vista;
		a = altas;
	}

	/**
	 * metodo actionPerformed que se deshará de la vista altas y abrirá la vista
	 * home
	 */
	public void actionPerformed(ActionEvent e) {
		a.dispose();
		a.hacerInVisible();
		v.hacerVisible();

	}

}
