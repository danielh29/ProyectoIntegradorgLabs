package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.consultas;
import mvc.vistas.home;

public class consultasHome implements ActionListener{

	home v;
	consultas c;

	/**
	 * Método que nos permite trabajar con una vista principal V
	 * @param vista, Clase Vista Principal
	 */
	public void setVentanaUsuario (home vista, consultas consulta) {
		v=vista;
		c=consulta;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		c.dispose();
		v.hacerVisible();

	}

}
