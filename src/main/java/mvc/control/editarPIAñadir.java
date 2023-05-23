package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import BBDD.AccesoBBDD;
import mvc.vistas.altas;
import mvc.vistas.buscarArea;
import mvc.vistas.consultas;
import mvc.vistas.editarPI;

/**
 * clase que Implementa actionListener y cambia de vistas de editarPI a altas
 * 
 * @author alexjun09
 *
 */
public class editarPIAñadir implements ActionListener {

	altas a;
	editarPI ePI;

	/**
	 * metodo que actualiza los valores de las dos vistas para posteriormete poder
	 * ser utilizadas
	 * 
	 * @param altas    vista altas
	 * @param editarPI vista altas pi
	 */
	public void setVentanaUsuario(altas altas, editarPI editarPI) {
		a = altas;
		ePI = editarPI;
	}

	/**
	 * metodo que cambia de vista a altas
	 */
	public void actionPerformed(ActionEvent e) {
		ePI.dispose();
		a.hacerVisible();

	}

}
