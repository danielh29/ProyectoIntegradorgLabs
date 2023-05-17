package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.buscarAlumnos;
import mvc.vistas.buscarArea;
import mvc.vistas.consultas;
import mvc.vistas.home;

public class buscarAlumnosHome implements ActionListener {

	buscarAlumnos ba;
	home h;

	/**
	 * Método que nos permite trabajar con una vista principal V
	 * @param vista, Clase Vista Principal
	 */
	public void setVentanaUsuario (buscarAlumnos buscarAlumnos, home home) {
		ba=buscarAlumnos;
		h=home;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		ba.dispose();
		h.hacerVisible();

	}

}
