package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.editarAlumnos;
import mvc.vistas.editarAreas;
import mvc.vistas.consultas;
import mvc.vistas.home;

/**
 * Clase que implementa actionListener y cambia de vistas de consultaAreas al
 * home
 * 
 * @author alexjun09
 *
 */
public class consultaAreasHome implements ActionListener {

	editarAreas ca;
	home h;

	/**
	 * Método que nos permite trabajar con una vista principal V
	 * 
	 * @param vista, Clase Vista Principal
	 */
	public void setVentanaUsuario(editarAreas consulArea, home home) {
		ca = consulArea;
		h = home;
	}

	/**
	 * metodo que cambia de vista al home
	 */
	public void actionPerformed(ActionEvent e) {
		ca.dispose();
		h.hacerVisible();

	}

}
