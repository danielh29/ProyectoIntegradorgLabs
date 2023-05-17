package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.buscarPI;
import mvc.vistas.home;

public class buscarPIAñadir implements ActionListener {

	buscarPI bp;
	altas a;

	/**
	 * Método que nos permite trabajar con una vista principal V
	 * @param vista, Clase Vista Principal
	 */
	public void setVentanaUsuario (buscarPI buscarPI, altas altas) {
		bp=buscarPI;
		a=altas;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		bp.dispose();
		a.hacerVisible();

	}

}
