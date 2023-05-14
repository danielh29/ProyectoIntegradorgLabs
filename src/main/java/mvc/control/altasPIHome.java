package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.altasPI;
import mvc.vistas.consultas;
import mvc.vistas.home;

public class altasPIHome implements ActionListener {

	altasPI a;
	home h;

	/**
	 * Método que nos permite trabajar con una vista principal V
	 * @param vista, Clase Vista Principal
	 */
	public void setVentanaUsuario (altasPI altasPI, home home) {
		a=altasPI;
		h=home;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		a.dispose();
		h.hacerVisible();

	}

}
