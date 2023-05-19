package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import BBDD.AccesoBBDD;
import mvc.modelo.datosAlumno;
import mvc.modelo.datosAreas;
import mvc.vistas.buscarArea;
import mvc.vistas.editarAlumnos;
import mvc.vistas.editarAreas;
import mvc.vistas.consultas;

public class consultasAreasB implements ActionListener {

	consultas c;
	buscarArea ba;
	ArrayList<datosAreas> listaAreas = new ArrayList<>();


	/**
	 * Método que nos permite trabajar con una vista principal V
	 * @param vista, Clase Vista Principal
	 */
	public void setVentanaUsuario (consultas consultas, buscarArea buscarArea) {
		c=consultas;
		ba=buscarArea;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		AccesoBBDD acceso = new AccesoBBDD();
		
		listaAreas=acceso.obtenerDatosAreas();
		
		ba.setListaArea(listaAreas);
		
		c.dispose();
		ba.hacerVisible();

	}

}
