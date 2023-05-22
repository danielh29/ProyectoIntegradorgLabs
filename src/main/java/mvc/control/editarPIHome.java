package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import BBDD.AccesoBBDD;
import mvc.vistas.buscarArea;
import mvc.vistas.consultas;
import mvc.vistas.editarPI;
import mvc.vistas.home;

public class editarPIHome implements ActionListener {

	home h;
	editarPI ePI;
	/**
	 * Método que nos permite trabajar con una vista principal V
	 * @param vista, Clase Vista Principal
	 */
	public void setVentanaUsuario (home home, editarPI editarPI) {
		h=home;
		ePI=editarPI;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ePI.dispose();
		h.hacerVisible();

	}

}
