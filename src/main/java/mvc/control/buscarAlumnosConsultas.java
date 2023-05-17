package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.buscarAlumnos;
import mvc.vistas.buscarArea;
import mvc.vistas.consultas;

public class buscarAlumnosConsultas implements ActionListener {

	buscarAlumnos ba;
	consultas c;

	/**
	 * Método que nos permite trabajar con una vista principal V
	 * @param vista, Clase Vista Principal
	 */
	public void setVentanaUsuario (buscarAlumnos buscarAlumnos, consultas consultas) {
		ba=buscarAlumnos;
		c=consultas;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		ba.dispose();
		c.hacerVisible();

	}
}
