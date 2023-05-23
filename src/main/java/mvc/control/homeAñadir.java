package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.home;

/**
 * clase que Implementa actionListener y cambia de vistas de home a altas
 * 
 * @author alexjun09
 *
 */
public class homeAñadir implements ActionListener {

	home v;
	altas a;

	/**
	 * metodo que actualiza los valores de las dos vistas para posteriormete poder
	 * ser utilizadas
	 * 
	 * @param vista vista home
	 * @param altas vista altas
	 */
	public void setVentanaUsuario(home vista, altas altas) {
		v = vista;
		a = altas;
	}

	/**
	 * metodo que cambia de vista a altas
	 */
	public void actionPerformed(ActionEvent e) {
		v.dispose();
		a.hacerVisible();

	}

}
