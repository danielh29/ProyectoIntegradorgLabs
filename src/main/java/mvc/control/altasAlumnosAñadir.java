package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.altasAlumnos;

/**
 * Clase controlador que implementa ActionListener que cambiará de la vista
 * altasAlumnos a altas
 * 
 * @author alexjun09
 *
 */
public class altasAlumnosAñadir implements ActionListener {

	altas a;
	altasAlumnos aa;

	/**
	 * Metodo que declara las vistas a cambiar
	 * 
	 * @param altas la clase vista de altas (menu)
	 * @param aaa   la clase vista de altasAlumnos
	 */
	public void setVentanaUsuario(altas altas, altasAlumnos aaa) {
		a = altas;
		aa = aaa;
	}

	/**
	 * meotodo actionPerformed que se deshará de la ventana de altasAlumnos y abrirá
	 * la ventana de altas (menu)
	 */
	public void actionPerformed(ActionEvent e) {
		aa.dispose();
		a.hacerVisible();
	}

}
