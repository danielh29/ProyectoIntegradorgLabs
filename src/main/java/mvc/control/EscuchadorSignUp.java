package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.*;
import BBDD.*;

public class EscuchadorSignUp implements ActionListener {
	// declaramos la vista principal
	VistaSignUp s;
	VistaLogin l;

	public EscuchadorSignUp() {

	}

	public void setVistaPrincipal(VistaSignUp vista) {
		s = vista;
	}

	// le damos funcionalidad al boton
	public void actionPerformed(ActionEvent e) {
		// almacenamos el usuario y la contraseña que pone el usuario
		String user = s.getTxtUser().getText();
		String pass = s.getTxtPass().getText();
		String repetirPass = s.getTxtRepetirPass().getText();

		AccesoBBDD bbdd = new AccesoBBDD();
		bbdd.getConexion();

		try {
			//el usuario ya existe
			if (bbdd.signUp(user, pass, repetirPass) == 1) {
				s.getAlert().setText("Usuario ya existe, prueba con otro nombre");
				//las contraseñas no coinciden
			} else if (bbdd.signUp(user, pass, repetirPass) == 2) {
				s.getAlert().setText("Las contraseñas no coinciden, intentalo de nuevo");
				//consigue acceso creando un usuario
			} else if (bbdd.signUp(user, pass, repetirPass) == 3) {
				s.hacerInisible();
				l.hacerVisible();
			}
			// control de errores
		} catch (Exception e2) {
			System.out.println("Error en la query:" + e2.getMessage());
		}
	}
}
