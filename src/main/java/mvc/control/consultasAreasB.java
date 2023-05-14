package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.consultaAlumnos;
import mvc.vistas.consultaAreas;
import mvc.vistas.consultas;

public class consultasAreasB implements ActionListener {

	consultas c;
	consultaAreas ca;

	/**
	 * Método que nos permite trabajar con una vista principal V
	 * @param vista, Clase Vista Principal
	 */
	public void setVentanaUsuario (consultas consultas, consultaAreas consultaAreas) {
		c=consultas;
		ca=consultaAreas;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		c.dispose();
		ca.hacerVisible();

	}

}
