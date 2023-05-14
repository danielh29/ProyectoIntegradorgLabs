package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.consultaAlumnos;
import mvc.vistas.consultas;

public class consultasAlumnosB implements ActionListener {

	consultas c;
	consultaAlumnos ca;
	public void setVentanaUsuario(consultas consultas, consultaAlumnos consuAlum) {
		this.c=consultas;
		ca=consuAlum;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		c.dispose();
		ca.hacerVisible();
	}

}
