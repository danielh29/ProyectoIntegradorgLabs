package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.buscarArea;
import mvc.vistas.consultas;
import mvc.vistas.home;

public class buscarAreaConsulta implements ActionListener {

	buscarArea ba;
	consultas c;

	/**
	 * Método que nos permite trabajar con una vista principal V
	 * @param vista, Clase Vista Principal
	 */
	public void setVentanaUsuario (buscarArea buscarArea, consultas consultas) {
		ba=buscarArea;
		c=consultas;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		ba.dispose();
		c.hacerVisible();

	}

}
