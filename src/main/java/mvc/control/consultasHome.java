package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.consultas;
import mvc.vistas.home;

/**
 * Clase que implementa actionListener y cambia de vistas de consulta al home
 * 
 * @author alexjun09
 *
 */
public class consultasHome implements ActionListener {

	home v;
	consultas c;

	/**
	 * Método que actualiza los datos de las dos vistas a utilizar
	 * 
	 * @param vista    vista home
	 * @param consulta vista consulta
	 */
	public void setVentanaUsuario(home vista, consultas consulta) {
		v = vista;
		c = consulta;
	}

	/**
	 * metodo que cambia de vista al home
	 */
	public void actionPerformed(ActionEvent e) {
		c.dispose();
		v.hacerVisible();

	}

}
