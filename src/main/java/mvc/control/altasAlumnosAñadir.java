package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.altasAlumnos;

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
