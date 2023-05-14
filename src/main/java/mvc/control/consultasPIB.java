package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.consultaAlumnos;
import mvc.vistas.consultas;

public class consultasPIB implements ActionListener {

	consultas c;

	/**
	 * Método que nos permite trabajar con una vista principal V
	 * @param vista, Clase Vista Principal
	 */
	public void setVentanaUsuario (consultas consultas) {
		c=consultas;
		c=consultas;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		c.dispose();
		c.hacerVisible();

	}

}
