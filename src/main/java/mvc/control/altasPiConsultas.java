package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.altasPI;
import mvc.vistas.consultas;

public class altasPiConsultas implements ActionListener {

	altasPI a;
	consultas c;

	/**
	 * Método que nos permite trabajar con una vista principal V
	 * @param vista, Clase Vista Principal
	 */
	public void setVentanaUsuario (altasPI altasPI, consultas consulta) {
		a=altasPI;
		c=consulta;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		a.dispose();
		c.hacerVisible();

	}

}
