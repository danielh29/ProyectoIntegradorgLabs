package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.buscarPI;
import mvc.vistas.consultas;
import mvc.vistas.home;

public class buscarPIConsultas implements ActionListener {

	buscarPI bp;
	consultas c;

	/**
	 * Método que nos permite trabajar con una vista principal V
	 * @param vista, Clase Vista Principal
	 */
	public void setVentanaUsuario (buscarPI buscarPI, consultas consultas) {
		bp=buscarPI;
		c=consultas;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		bp.dispose();
		c.hacerVisible();

	}

}
