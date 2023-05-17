package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.*;
import BBDD.*;

public class EscuchadorPrincipalLogIn implements ActionListener {
	// declaramos la vista principal
	VistaPrincipal v;
	VistaLogin vl;

	public void setEscuchadorPrincipalLogIn(VistaPrincipal vista, VistaLogin vistaLogin) {
		this.v = vista;
		this.vl = vistaLogin;
	}

	// le damos funcionalidad al boton
	public void actionPerformed(ActionEvent e) {
		v.hacerInvisible();
		vl.hacerVisible();
	}
}
