package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.altasAreas;
import mvc.vistas.altasPI;

public class altasAreasB implements ActionListener {

	altas a;
	altasAreas aa;
	
	public void setVentanaUsuario (altas altas, altasAreas altasAreas) {
		a=altas;
		aa=altasAreas;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		a.dispose();
		aa.hacerVisible();
	}

}
