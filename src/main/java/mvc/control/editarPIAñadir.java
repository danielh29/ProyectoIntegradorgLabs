package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import BBDD.AccesoBBDD;
import mvc.vistas.altas;
import mvc.vistas.buscarArea;
import mvc.vistas.consultas;
import mvc.vistas.editarPI;

public class editarPIAñadir implements ActionListener {

	altas a;
	editarPI ePI;
	/**
	 * Método que nos permite trabajar con una vista principal V
	 * @param vista, Clase Vista Principal
	 */
	public void setVentanaUsuario (altas altas, editarPI editarPI) {
		a=altas;
		ePI=editarPI;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		ePI.dispose();
		a.hacerVisible();

	}

}
