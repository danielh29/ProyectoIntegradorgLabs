package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import BBDD.AccesoBBDD;
import mvc.vistas.buscarArea;
import mvc.vistas.consultas;
import mvc.vistas.editarPI;
import mvc.vistas.home;

/**
 * clase que Implementa actionListener y cambia de vistas de editarPI al home
 * 
 * @author alexjun09
 *
 */
public class editarPIHome implements ActionListener {

	home h;
	editarPI ePI;

	/**
	 * metodo que actualiza los valores de las dos vistas para posteriormete poder
	 * ser utilizadas
	 * 
	 * @param home     vista home
	 * @param editarPI vista editarPI
	 */
	public void setVentanaUsuario(home home, editarPI editarPI) {
		h = home;
		ePI = editarPI;
	}

	/**
	 * metodo que cambia de vista al home
	 */
	public void actionPerformed(ActionEvent e) {
		ePI.dispose();
		h.hacerVisible();

	}

}
