package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.altasAreas;
import mvc.vistas.consultas;
import mvc.vistas.home;

public class altasAreasHome implements ActionListener {
	altasAreas aa;
	home h;

	/**
	 * Método que nos permite trabajar con una vista principal V
	 * @param vista, Clase Vista Principal
	 */
	public void setVentanaUsuario (altasAreas altasAreas, home home) {
		aa=altasAreas;
		h=home;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		aa.dispose();
		h.hacerVisible();

	}

}
