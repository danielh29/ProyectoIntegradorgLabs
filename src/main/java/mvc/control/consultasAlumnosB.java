package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import BBDD.AccesoBBDD;
import mvc.modelo.datosAlumno;
import mvc.vistas.buscarAlumnos;
import mvc.vistas.editarAlumnos;
import mvc.vistas.consultas;

public class consultasAlumnosB implements ActionListener {

	consultas c;
	buscarAlumnos ba;
	ArrayList<datosAlumno> listaAlumnos = new ArrayList<>();
	
	public void setVentanaUsuario(consultas consultas, buscarAlumnos buscarAlumnos) {
		this.c=consultas;
		ba=buscarAlumnos;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		AccesoBBDD acceso = new AccesoBBDD();
		
		listaAlumnos=acceso.obtenerDatosAlumnos();
		
		ba.setListaAlumnos(listaAlumnos);
		
		c.dispose();
		ba.hacerVisible();
	}

}
