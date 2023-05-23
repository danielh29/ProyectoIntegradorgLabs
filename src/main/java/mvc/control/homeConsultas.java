package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.consultas;
import mvc.vistas.home;

/**
 * clase que Implementa actionListener y cambia de vistas de home a consultas
 * 
 * @author alexjun09
 *
 */
public class homeConsultas implements ActionListener {

	home v;
	consultas c;

	/**
	 * metodo que actualiza los valores de las dos vistas para posteriormete poder
	 * ser utilizadas
	 * 
	 * @param vista    vista home
	 * @param consulta vista consulta
	 */
	public void setVentanaUsuario(home vista, consultas consulta) {
		v = vista;
		c = consulta;
	}

	/**
	 * metodo que cambia de vista a cnsultas
	 */
	public void actionPerformed(ActionEvent e) {
		v.dispose();
		c.hacerVisible();

	}

}
