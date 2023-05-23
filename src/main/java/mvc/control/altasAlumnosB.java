package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.altasAlumnos;

/**
 * Clase controlador que implementa ActionListener que cambiará de la vista
 * altas a altasAlumnos
 * 
 * @author alexjun09
 *
 */
public class altasAlumnosB implements ActionListener {

	altas a;
	altasAlumnos aa;

	/**
	 * Método que declarará las vistas con las que queremos trabjar
	 * 
	 * @param altas La clase vista altas
	 * @param aaa   La clase vista altasAlumnos
	 */
	public void setVentanaUsuario(altas altas, altasAlumnos aaa) {
		a = altas;
		aa = aaa;
	}

	/**
	 * metodo actionPerformed que se deshará de la vista altas y abrirá la clase
	 * altasAlumnos
	 * 
	 */
	public void actionPerformed(ActionEvent e) {
		a.dispose();
		aa.hacerVisible();

	}

}
