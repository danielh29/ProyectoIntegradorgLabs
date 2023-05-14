package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.*;

public class EscuchadorPrincipalSignUp implements ActionListener {
	// declaramos la vista principal
	VistaPrincipal v;

	public EscuchadorPrincipalSignUp(VistaPrincipal vista) {
		this.v = vista;
	}

	// le damos funcionalidad al boton
	public void actionPerformed(ActionEvent e) {
		v.hacerInisible();
		VistaSignUp s = new VistaSignUp();
		s.hacerVisible();
	}
}
