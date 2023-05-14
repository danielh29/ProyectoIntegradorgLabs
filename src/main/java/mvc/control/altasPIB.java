package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.altasAlumnos;
import mvc.vistas.altasPI;
import mvc.vistas.consultas;

public class altasPIB implements ActionListener {
	
	altas a;
	altasPI ap;
	
	public void setVentanaUsuario (altas altas, altasPI altasPI) {
		a=altas;
		ap=altasPI;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		a.dispose();
		ap.hacerVisible();
	}

}
