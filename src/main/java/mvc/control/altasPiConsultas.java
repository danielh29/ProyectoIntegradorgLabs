package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.altasPI;
import mvc.vistas.consultas;

/**
 * Clase controlador que implementa ActionListener que cambiará de la vista
 * altasPI a consultas
 * 
 * @author alexjun09
 *
 */
public class altasPiConsultas implements ActionListener {

	altasPI a;
	consultas c;

	/**
	 * Método que declarará las vistas con las que queremos trabjar
	 * 
	 * @param altasPI  la vista de altasPI
	 * @param consulta la vista de consultas
	 */
	public void setVentanaUsuario(altasPI altasPI, consultas consulta) {
		a = altasPI;
		c = consulta;
	}

	/**
	 * metodo actionPerformed que se deshará de la vista altasPI y abrirá la vista
	 * consultas
	 */
	public void actionPerformed(ActionEvent e) {
		a.dispose();
		c.hacerVisible();

	}

}
