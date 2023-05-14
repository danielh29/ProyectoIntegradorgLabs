package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.consultas;
import mvc.vistas.home;

public class altasConsultas implements ActionListener {

	altas a;
	consultas c;

	/**
	 * Método que nos permite trabajar con una vista principal V
	 * @param vista, Clase Vista Principal
	 */
	public void setVentanaUsuario (altas altas, consultas consulta) {
		a=altas;
		c=consulta;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		a.dispose();
		c.hacerVisible();

	}

}
