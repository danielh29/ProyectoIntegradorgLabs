package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.consultaAreas;
import mvc.vistas.consultas;
import mvc.vistas.home;

public class consultasAreasConsultas implements ActionListener {

	consultaAreas ca;
	consultas c;

	/**
	 * Método que nos permite trabajar con una vista principal V
	 * @param vista, Clase Vista Principal
	 */
	public void setVentanaUsuario (consultaAreas consulArea, consultas consultas) {
		ca=consulArea;
		c=consultas;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		ca.dispose();
		c.hacerVisible();

	}

}
