package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.consultas;
import mvc.vistas.home;

/**
 * Clase controlador que implementa ActionListener que cambiará de la vista
 * altas a consultas
 * 
 * @author alexjun09
 *
 */
public class altasConsultas implements ActionListener {

	altas a;
	consultas c;

	/**
	 * Método que declarará las vistas con las que queremos trabjar
	 * 
	 * @param altas    la vista altas
	 * @param consulta la vista consultas
	 */
	public void setVentanaUsuario(altas altas, consultas consulta) {
		a = altas;
		c = consulta;
	}

	/**
	 * metodo actionPerformed que se deshará de la vista altas y abrirá la vista
	 * consultas
	 */
	public void actionPerformed(ActionEvent e) {
		a.dispose();
		a.hacerInVisible();
		c.hacerVisible();

	}

}
