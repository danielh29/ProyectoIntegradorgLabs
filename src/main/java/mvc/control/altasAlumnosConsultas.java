package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.altasAlumnos;
import mvc.vistas.consultas;

/**
 * Clase controlador que implementa ActionListener que cambiará de la vista
 * altas a altasAlumnos
 * 
 * @author alexjun09
 *
 */
public class altasAlumnosConsultas implements ActionListener {

	consultas c;
	altasAlumnos aa;

	/**
	 * Método que declarará las vistas con las que queremos trabjar
	 * 
	 * @param consultas la vista consultas
	 * @param aaa       la vista altasAlumnos
	 */
	public void setVentanaUsuario(consultas consultas, altasAlumnos aaa) {
		c = consultas;
		aa = aaa;
	}

	/**
	 * metodo actionPerformed que se deshará de la vista altasAlumnos y abrirá la
	 * vista consultas
	 */
	public void actionPerformed(ActionEvent e) {
		aa.dispose();
		c.hacerVisible();
	}

}
