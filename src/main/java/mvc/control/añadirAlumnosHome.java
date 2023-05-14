package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.altasAlumnos;
import mvc.vistas.home;

public class añadirAlumnosHome implements ActionListener {

	home h;
	altasAlumnos aa;
	
	public void setVentanaUsuario (home home, altasAlumnos aaa) {
		h=home;
		aa=aaa;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		aa.dispose();
		h.hacerVisible();
	}

}
