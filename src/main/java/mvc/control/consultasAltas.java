package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.consultas;

/**
 * Clase que implementa actionListener y cambia de vistas de consulta a altas
 * 
 * @author alexjun09
 *
 */
public class consultasAltas implements ActionListener {

	altas a;
	consultas c;

	/**
	 * Método que nos permite trabajar con una vista principal V
	 * 
	 * @param vista, Clase Vista Principal
	 */
	public void setVentanaUsuario(altas altas, consultas consulta) {
		a = altas;
		c = consulta;
	}

	/**
	 * metodo que cambia de vista a altas
	 */
	public void actionPerformed(ActionEvent e) {
		c.dispose();
		a.hacerVisible();

	}

}
