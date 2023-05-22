package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.*;


public class SignUpBack implements ActionListener {

	VistaPrincipal v;
	VistaSignUp a;

	/**
	 * Método que nos permite trabajar con una vista principal V
	 * @param vista, Clase Vista Principal
	 */
	public void setVistaPrincipal (VistaSignUp altas, VistaPrincipal vista) {
		v=vista;
		a=altas;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		v.hacerVisible();
		a.hacerInisible();
		

	}


}
