package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.*;

/**
 * clase que Implementa actionListener y cambia de vistas de vista principal al
 * signup
 * 
 * @author alexjun09
 *
 */
public class EscuchadorPrincipalSignUp implements ActionListener {
	// declaramos la vista principal
	VistaPrincipal v;
	VistaSignUp vs;

	/**
	 * metodo que actualiza los valores de las dos vistas para posteriormete poder
	 * ser utilizadas
	 * 
	 * @param vista vista vistaprincipal
	 * @param sign  vista signup
	 */
	public void setEscuchadorPrincipalSignUp(VistaPrincipal vista, VistaSignUp sign) {
		this.v = vista;
		vs = sign;
	}

	/**
	 * metodo que cambia de vista a vistaSignUp
	 */
	public void actionPerformed(ActionEvent e) {
		v.hacerInvisible();
		vs.hacerVisible();
	}
}
