package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.altasAlumnos;
import mvc.vistas.consultas;

public class altasAlumnosConsultas implements ActionListener {

	consultas c;
	altasAlumnos aa;
	
	public void setVentanaUsuario (consultas consultas, altasAlumnos aaa) {
		c=consultas;
		aa=aaa;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		aa.dispose();
		c.hacerVisible();
	}

}
