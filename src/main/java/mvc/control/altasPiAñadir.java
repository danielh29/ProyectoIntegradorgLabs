package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.altasPI;
import mvc.vistas.consultas;

public class altasPiAñadir implements ActionListener {

	altasPI a;
	altas aa;

	/**
	 * Método que nos permite trabajar con una vista principal V
	 * @param vista, Clase Vista Principal
	 */
	public void setVentanaUsuario (altasPI altasPI, altas altas) {
		a=altasPI;
		aa=altas;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		a.dispose();
		aa.hacerVisible();

	}

}
