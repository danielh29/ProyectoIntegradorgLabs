package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.buscarAlumnos;
import mvc.vistas.buscarArea;

public class buscarAlumnosAñadir implements ActionListener {

	buscarAlumnos ba;
	altas a;

	/**
	 * Método que nos permite trabajar con una vista principal V
	 * @param vista, Clase Vista Principal
	 */
	public void setVentanaUsuario (buscarAlumnos buscarAlumnos, altas altas) {
		ba=buscarAlumnos;
		a=altas;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		ba.dispose();
		a.hacerVisible();

	}

}
