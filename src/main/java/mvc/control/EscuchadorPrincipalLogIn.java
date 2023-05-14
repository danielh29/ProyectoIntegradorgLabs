package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.*;
import BBDD.*;

public class EscuchadorPrincipalLogIn implements ActionListener {
	// declaramos la vista principal
	VistaPrincipal v;

	public EscuchadorPrincipalLogIn(VistaPrincipal vista) {
		this.v = vista;
	}

	// le damos funcionalidad al boton
	public void actionPerformed(ActionEvent e) {
		v.hacerInisible();
		VistaLogin l = new VistaLogin();
		l.hacerVisible();
	}
}
