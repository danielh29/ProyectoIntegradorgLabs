package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.buscarArea;
import mvc.vistas.consultas;
import mvc.vistas.home;

/**
 * Clase que implementa actionListener y cambia de vistas de buscarArea a
 * Conulta
 * 
 * @author alexjun09
 *
 */
public class buscarAreaConsulta implements ActionListener {

	buscarArea ba;
	consultas c;

	/**
	 * Método que declarará las vistas con las que queremos trabjar
	 * 
	 * @param buscarArea vista buscar area
	 * @param consultas  vista consulta
	 */
	public void setVentanaUsuario(buscarArea buscarArea, consultas consultas) {
		ba = buscarArea;
		c = consultas;
	}

	/**
	 * metodo que cambia de vista a consultas
	 */
	public void actionPerformed(ActionEvent e) {
		ba.dispose();
		c.hacerVisible();

	}

}
