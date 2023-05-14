package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.consultaAlumnos;
import mvc.vistas.consultas;
import mvc.vistas.home;

public class consultaAlumnoHome implements ActionListener {
	
	home h;
	consultaAlumnos ca;
	public void setVentanaUsuario(home home, consultaAlumnos consuAlum) {
		h=home;
		ca=consuAlum;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ca.dispose();
		h.hacerVisible();
	}

}
