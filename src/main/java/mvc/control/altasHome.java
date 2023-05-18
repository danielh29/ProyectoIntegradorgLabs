package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.home;

public class altasHome implements ActionListener {
	
	home v;
	altas a;

	/**
	 * Método que nos permite trabajar con una vista principal V
	 * @param vista, Clase Vista Principal
	 */
	public void setVentanaUsuario (home vista, altas altas) {
		v=vista;
		a=altas;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		a.dispose();
		a.hacerInVisible();
		v.hacerVisible();

	}

}
