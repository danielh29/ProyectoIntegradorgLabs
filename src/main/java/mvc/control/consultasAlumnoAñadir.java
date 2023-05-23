package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.altasPI;
import mvc.vistas.editarAlumnos;
import mvc.vistas.consultas;

/**
 * Clase que implementa actionListener y cambia de vistas de consultaAlumno a
 * altas
 * 
 * @author alexjun09
 *
 */
public class consultasAlumnoAñadir implements ActionListener {

	editarAlumnos c;
	altas a;

	/**
	 * Método que nos permite trabajar con una vista principal V
	 * 
	 * @param vista, Clase Vista Principal
	 */
	public void setVentanaUsuario(editarAlumnos consultas, altas altas) {
		c = consultas;
		a = altas;
	}

	/**
	 * metodo que cambia de vista a altas
	 */
	public void actionPerformed(ActionEvent e) {
		c.dispose();
		a.hacerVisible();

	}

}
