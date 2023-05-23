package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.editarAreas;
import mvc.vistas.consultas;
import mvc.vistas.home;

/**
 * Clase que implementa actionListener y cambia de vistas de consultaAreas a
 * consultas
 * 
 * @author alexjun09
 *
 */
public class consultasAreasConsultas implements ActionListener {

	editarAreas ca;
	consultas c;

	/**
	 * Método que actualiza los datos de las dos vistas a utilizar
	 * 
	 * @param consulArea vista consultasAreas
	 * @param consultas  vista consultas
	 */
	public void setVentanaUsuario(editarAreas consulArea, consultas consultas) {
		ca = consulArea;
		c = consultas;
	}

	/**
	 * metodo que cambia de vista a consultas
	 */
	public void actionPerformed(ActionEvent e) {
		ca.dispose();
		c.hacerVisible();

	}

}
