package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.*;

public class EscuchadorPrincipalSignUp implements ActionListener {
	// declaramos la vista principal
	VistaPrincipal v;
	VistaSignUp vs;

	public void setEscuchadorPrincipalSignUp(VistaPrincipal vista, VistaSignUp sign) {
		this.v = vista;
		vs=sign;
	}

	// le damos funcionalidad al boton
	public void actionPerformed(ActionEvent e) {
		v.hacerInisible();
		vs.hacerVisible();
	}
}
