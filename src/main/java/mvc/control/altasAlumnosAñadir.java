package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.altasAlumnos;

/**
 * La clase {@code altasAlumnosAñadir} implementa la interfaz {@code ActionListener} y se utiliza como controlador para el evento de acción de agregar en la vista {@code altasAlumnos}.
 */
public class altasAlumnosAñadir implements ActionListener {

	altas a;
	altasAlumnos aa;
	
	public void setVentanaUsuario (altas altas, altasAlumnos aaa) {
		a=altas;
		aa=aaa;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		aa.dispose();
		a.hacerVisible();
	}

}
