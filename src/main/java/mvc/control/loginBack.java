package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.*;

/**
 * clase que Implementa actionListener y cambia de vistas del login a la vista
 * princiapal
 * 
 * @author alexjun09
 *
 */
public class loginBack implements ActionListener {

	VistaPrincipal v;
	VistaLogin a;

	/**
	 * metodo que actualiza los valores de las dos vistas para posteriormete poder
	 * ser utilizadas
	 * 
	 * @param altas vista altas
	 * @param vista vista vistaprincipal
	 */
	public void setVistaPrincipal(VistaLogin altas, VistaPrincipal vista) {
		v = vista;
		a = altas;
	}

	/**
	 * metodo que cambia de vista a vistalogin
	 */
	public void actionPerformed(ActionEvent e) {
		v.hacerVisible();
		a.hacerInisible();

	}

}
