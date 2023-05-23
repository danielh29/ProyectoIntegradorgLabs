package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.buscarPI;
import mvc.vistas.consultas;
import mvc.vistas.home;

/**
 * Clase que implementa actionListener y cambia de vistas de buscarPI a Conultas
 * 
 * @author alexjun09
 *
 */
public class buscarPIConsultas implements ActionListener {

	buscarPI bp;
	consultas c;

	/**
	 * Método que declarará las vistas con las que queremos trabjar
	 * 
	 * @param buscarPI  vista buscar PI
	 * @param consultas vista consultas
	 */
	public void setVentanaUsuario(buscarPI buscarPI, consultas consultas) {
		bp = buscarPI;
		c = consultas;
	}

	/**
	 * metodo que cambia de vista a consultas
	 */
	public void actionPerformed(ActionEvent e) {
		bp.dispose();
		c.hacerVisible();

	}

}
