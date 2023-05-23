package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.*;
import BBDD.*;

/**
 * clase que Implementa actionListener y cambia de vistas de vista principal al
 * login
 * 
 * @author alexjun09
 *
 */
public class EscuchadorPrincipalLogIn implements ActionListener {
	// declaramos la vista principal
	VistaPrincipal v;
	VistaLogin vl;

	/**
	 * metodo que actualiza los valores de las dos vistas para posteriormete poder
	 * ser utilizadas
	 * 
	 * @param vista      vista vistaprincipal
	 * @param vistaLogin vista vistaLogin
	 */
	public void setEscuchadorPrincipalLogIn(VistaPrincipal vista, VistaLogin vistaLogin) {
		this.v = vista;
		this.vl = vistaLogin;
	}

	/**
	 * metodo que cambia de vista a vistalogin
	 */
	public void actionPerformed(ActionEvent e) {
		v.hacerInvisible();
		vl.hacerVisible();
	}
}
