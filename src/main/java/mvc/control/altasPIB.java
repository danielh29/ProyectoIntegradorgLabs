package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.altasAlumnos;
import mvc.vistas.altasPI;
import mvc.vistas.consultas;

/**
 * Clase controlador que implementa ActionListener que cambiará de la vista
 * altas a altasPI
 * 
 * @author alexjun09
 *
 */
public class altasPIB implements ActionListener {

	altas a;
	altasPI ap;

	/**
	 * Método que declarará las vistas con las que queremos trabjar
	 * 
	 * @param altas   la vista de altas
	 * @param altasPI la vista de altasPI
	 */
	public void setVentanaUsuario(altas altas, altasPI altasPI) {
		a = altas;
		ap = altasPI;

	}

	/**
	 * metodo actionPerformed que se deshará de la vista altas y abrirá la vista
	 * altasPI
	 */
	public void actionPerformed(ActionEvent e) {
		a.dispose();
		ap.hacerVisible();
	}

}
