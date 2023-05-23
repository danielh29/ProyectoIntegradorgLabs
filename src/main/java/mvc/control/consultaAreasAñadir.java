package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.editarAreas;
import mvc.vistas.home;

/**
 * Clase que implementa actionListener y cambia de vistas de consultaAreas a
 * altas
 * 
 * @author alexjun09
 *
 */
public class consultaAreasAñadir implements ActionListener {

	editarAreas ca;
	altas a;
	// editarPI e;

	/**
	 * Método que nos permite trabajar con una vista principal V
	 * 
	 * @param vista, Clase Vista Principal
	 */
	public void setVentanaUsuario(editarAreas consulArea, altas altas) {
		ca = consulArea;
		a = altas;
		// e=editar;
	}

	/**
	 * metodo que cambia de vista a altas
	 */
	public void actionPerformed(ActionEvent e) {
		ca.dispose();
		a.dispose();

	}

}
