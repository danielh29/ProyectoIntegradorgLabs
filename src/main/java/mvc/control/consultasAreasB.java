package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import mvc.modelo.datosAlumno;
import mvc.vistas.buscarArea;
import mvc.vistas.consultaAlumnos;
import mvc.vistas.consultaAreas;
import mvc.vistas.consultas;

public class consultasAreasB implements ActionListener {

	consultas c;
	buscarArea ba;

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
		
		c.dispose();
		ba.hacerVisible();

	}

}
