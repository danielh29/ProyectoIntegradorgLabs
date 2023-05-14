package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.altasAlumnos;

public class altasAlumnosB implements ActionListener {

	altas a;
	altasAlumnos aa;

	/**
	 * Método que nos permite trabajar con una vista principal V
	 * @param vista, Clase Vista Principal
	 */
	public void setVentanaUsuario (altas altas, altasAlumnos aaa) {
		a=altas;
		aa=aaa;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		a.dispose();
		aa.hacerVisible();
		

	}

}
