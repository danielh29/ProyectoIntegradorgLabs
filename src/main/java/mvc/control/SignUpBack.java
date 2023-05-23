package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.*;

/**
 * clase que Implementa actionListener y cambia de vistas de signup a la vista
 * principal
 * 
 * @author alexjun09
 *
 */
public class SignUpBack implements ActionListener {

	VistaPrincipal v;
	VistaSignUp a;

	/**
	 * metodo que actualiza los valores de las dos vistas para posteriormete poder
	 * ser utilizadas
	 * 
	 * @param altas vista altas
	 * @param vista vista vistaprincipal
	 */
	public void setVistaPrincipal(VistaSignUp altas, VistaPrincipal vista) {
		v = vista;
		a = altas;
	}

	/**
	 * metodo que cambia de vista a vista principal
	 */
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		v.hacerVisible();
		a.hacerInisible();

	}

}
