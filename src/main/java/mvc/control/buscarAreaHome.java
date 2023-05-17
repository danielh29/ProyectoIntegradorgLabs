package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.buscarAlumnos;
import mvc.vistas.buscarArea;
import mvc.vistas.home;

public class buscarAreaHome implements ActionListener {

	buscarArea ba;
	home h;

	/**
	 * Método que nos permite trabajar con una vista principal V
	 * @param vista, Clase Vista Principal
	 */
	public void setVentanaUsuario (buscarArea buscarArea, home home) {
		ba=buscarArea;
		h=home;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		ba.dispose();
		h.hacerVisible();

	}

}
