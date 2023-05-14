package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altasAreas;
import mvc.vistas.consultas;
import mvc.vistas.home;

public class altasAreasConsultas implements ActionListener {

	altasAreas aa;
	consultas c;

	/**
	 * Método que nos permite trabajar con una vista principal V
	 * @param vista, Clase Vista Principal
	 */
	public void setVentanaUsuario (altasAreas altasAreas, consultas consultas) {
		aa=altasAreas;
		c=consultas;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		aa.dispose();
		c.hacerVisible();

	}

}
