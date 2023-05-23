package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.altasPI;
import mvc.vistas.editarAlumnos;
import mvc.vistas.consultas;

/**
 * Clase que implementa actionListener y cambia de vistas de consultaAlumno a
 * Conultas
 * 
 * @author alexjun09
 *
 */
public class consultasAlumnoConsultas implements ActionListener {

	editarAlumnos ca;
	consultas c;

	/**
	 * Método que actualiza los datos de las dos vistas a utilizar
	 * 
	 * @param consultasA vista consultasAlumnos
	 * @param consultas  vista consultas
	 */
	public void setVentanaUsuario(editarAlumnos consultasA, consultas consultas) {
		ca = consultasA;
		c = consultas;
	}

	/**
	 * metodo que cambia de vista a consultas
	 */
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		ca.dispose();
		c.hacerVisible();

	}

}
