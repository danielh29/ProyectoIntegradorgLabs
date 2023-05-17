package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.buscarAlumnos;
import mvc.vistas.buscarPI;
import mvc.vistas.home;

public class buscarPIHome implements ActionListener {

	buscarPI bp;
	home h;

	/**
	 * Método que nos permite trabajar con una vista principal V
	 * @param vista, Clase Vista Principal
	 */
	public void setVentanaUsuario (buscarPI buscarPI, home home) {
		bp=buscarPI;
		h=home;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		bp.dispose();
		h.hacerVisible();

	}

}
