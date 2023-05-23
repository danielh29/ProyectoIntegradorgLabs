package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import BBDD.AccesoBBDD;
import mvc.vistas.buscarArea;
import mvc.vistas.consultas;
import mvc.vistas.editarPI;

/**
 * clase que Implementa actionListener y cambia de vistas de editarPI a
 * conusltas
 * 
 * @author alexjun09
 *
 */
public class editarPIConsultas implements ActionListener {

	consultas c;
	editarPI ePI;

	/**
	 * metodo que actualiza los valores de las dos vistas para posteriormete poder
	 * ser utilizadas
	 * 
	 * @param consultas vista consultas
	 * @param editarPI  vista editarPI
	 */
	public void setVentanaUsuario(consultas consultas, editarPI editarPI) {
		c = consultas;
		ePI = editarPI;
	}

	/**
	 * metodo que cambia de vista a consultas
	 */
	public void actionPerformed(ActionEvent e) {
		ePI.dispose();
		c.hacerVisible();

	}

}
