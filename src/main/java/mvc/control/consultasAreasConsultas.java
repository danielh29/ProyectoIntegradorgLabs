package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.editarAreas;
import mvc.vistas.consultas;
import mvc.vistas.home;

public class consultasAreasConsultas implements ActionListener {

	editarAreas ca;
	consultas c;

	/**
	 * Método que nos permite trabajar con una vista principal V
	 * @param vista, Clase Vista Principal
	 */
	public void setVentanaUsuario (editarAreas consulArea, consultas consultas) {
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
