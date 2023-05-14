package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.consultaAlumnos;
import mvc.vistas.consultaAreas;
import mvc.vistas.consultas;
import mvc.vistas.home;

public class consultaAreasHome implements ActionListener {

	consultaAreas ca;
	home h;

	/**
	 * Método que nos permite trabajar con una vista principal V
	 * @param vista, Clase Vista Principal
	 */
	public void setVentanaUsuario (consultaAreas consulArea, home home) {
		ca=consulArea;
		h=home;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		ca.dispose();
		h.hacerVisible();

	}

}
