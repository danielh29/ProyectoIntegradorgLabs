package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.altasPI;
import mvc.vistas.consultaAlumnos;
import mvc.vistas.consultas;

public class consultasAlumnoAñadir implements ActionListener {

	consultaAlumnos c;
	altas a;

	/**
	 * Método que nos permite trabajar con una vista principal V
	 * @param vista, Clase Vista Principal
	 */
	public void setVentanaUsuario (consultaAlumnos consultas, altas altas) {
		c=consultas;
		a=altas;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		c.dispose();
		a.hacerVisible();

	}

}
