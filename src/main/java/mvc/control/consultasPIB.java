package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.buscarPI;
import mvc.vistas.consultaAlumnos;
import mvc.vistas.consultas;

public class consultasPIB implements ActionListener {

	consultas c;
	buscarPI pi;

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
		
		c.dispose();
		pi.hacerVisible();

	}

}
