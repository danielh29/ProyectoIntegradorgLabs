package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altasAreas;
import mvc.vistas.consultas;
import mvc.vistas.home;

/**
 * Clase controlador que implementa ActionListener que cambiará de la vista
 * altasAreas a consultas
 * 
 * @author alexjun09
 *
 */
public class altasAreasConsultas implements ActionListener {

	altasAreas aa;
	consultas c;

	/**
	 * Método que declarará las vistas con las que queremos trabjar
	 * 
	 * @param altasAreas la vista altasAreas
	 * @param consultas  la vista consultas
	 */
	public void setVentanaUsuario(altasAreas altasAreas, consultas consultas) {
		aa = altasAreas;
		c = consultas;
	}

	/**
	 * metodo actionPerformed que se deshará de la vista altasAreas y abrirá la
	 * vista consultas
	 */
	public void actionPerformed(ActionEvent e) {
		aa.dispose();
		c.hacerVisible();

	}

}
