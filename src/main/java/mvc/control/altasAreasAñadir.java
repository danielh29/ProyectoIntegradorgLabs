package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.altasAreas;
import mvc.vistas.home;

public class altasAreasAñadir implements ActionListener {

	altasAreas aa;
	altas a;

	/**
	 * Método que nos permite trabajar con una vista principal V
	 * @param vista, Clase Vista Principal
	 */
	public void setVentanaUsuario (altasAreas altasAreas, altas altas) {
		aa=altasAreas;
		a=altas;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		aa.dispose();
		a.hacerVisible();

	}

}
