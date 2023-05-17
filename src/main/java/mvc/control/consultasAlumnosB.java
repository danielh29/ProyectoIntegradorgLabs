package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.buscarAlumnos;
import mvc.vistas.consultaAlumnos;
import mvc.vistas.consultas;

public class consultasAlumnosB implements ActionListener {

	consultas c;
	buscarAlumnos ba;
	
	public void setVentanaUsuario(consultas consultas, buscarAlumnos buscarAlumnos) {
		this.c=consultas;
		ba=buscarAlumnos;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		c.dispose();
		ba.hacerVisible();
	}

}
