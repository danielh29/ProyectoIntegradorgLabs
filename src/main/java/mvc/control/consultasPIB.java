package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import BBDD.AccesoBBDD;
import mvc.modelo.datosAreas;
import mvc.modelo.datosPI;
import mvc.vistas.buscarPI;
import mvc.vistas.editarAlumnos;
import mvc.vistas.consultas;

public class consultasPIB implements ActionListener {

	consultas c;
	buscarPI pi;
	ArrayList<datosPI> listaPI = new ArrayList<>();


	/**
	 * Método que nos permite trabajar con una vista principal V
	 * @param vista, Clase Vista Principal
	 */
	public void setVentanaUsuario (consultas consultas, buscarPI buscar) {
		c=consultas;
		pi=buscar;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		AccesoBBDD acceso = new AccesoBBDD();
		
		listaPI=acceso.obtenerDatosPI();
		
		pi.setListaPI(listaPI);
		
		c.dispose();
		pi.hacerVisible();

	}

}
