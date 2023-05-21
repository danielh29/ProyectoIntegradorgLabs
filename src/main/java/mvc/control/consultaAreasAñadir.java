package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.editarAreas;
import mvc.vistas.home;

public class consultaAreasAñadir implements ActionListener {

	editarAreas ca;
	altas a;
	//editarPI e;

	/**
	 * Método que nos permite trabajar con una vista principal V
	 * @param vista, Clase Vista Principal
	 */
	public void setVentanaUsuario (editarAreas consulArea, altas altas) {
		ca=consulArea;
		a=altas;
		//e=editar;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		ca.dispose();
		a.dispose();

	}

}
