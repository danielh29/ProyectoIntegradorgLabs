package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.*;
import BBDD.*;

/**
 * clase que implementa action listener y contiene la funcionalidad del signuo
 * 
 * @author alexjun09
 *
 */
public class EscuchadorSignUp implements ActionListener {
	// declaramos la vista principal
	VistaSignUp s;
	VistaLogin l;

	/**
	 * constructor vacío
	 */
	public EscuchadorSignUp() {

	}

	/**
	 * metodo que actualiza los valores de las dos vistas para posteriormete poder
	 * ser utilizadas
	 * 
	 * @param vista            vista vistasignup
	 * @param vistaLogin`vista vistalogin
	 */
	public void setVistaPrincipal(VistaSignUp vista, VistaLogin vistaLogin) {
		s = vista;
		l = vistaLogin;
	}

	/**
	 * metodo que cambia de vista y se cominica con la base de datos atraves de las
	 * query dependiendo de varios escenarios diferentes
	 */
	public void actionPerformed(ActionEvent e) {
		// almacenamos el usuario y la contraseña que pone el usuario
		String user = s.getTxtUser().getText();
		String pass = s.getTxtPass().getText();
		String repetirPass = s.getTxtRepetirPass().getText();

		AccesoBBDD bbdd = new AccesoBBDD();
		bbdd.getConexion();

		try {
			int res = bbdd.signUp(user, pass, repetirPass);
			// el usuario ya existe
			if (res == 1) {
				s.getAlert().setText("Usuario ya existe, prueba con otro nombre.");
			}
			// las contraseñas no coinciden
			if (res == 2) {
				s.getAlert().setText("Las contraseñas no coinciden, intentalo de nuevo.");
			}
			// contraseña menor a 5 caracteres
			if (res == 3) {
				s.getAlert().setText("Contraseña menor a 5 caracteres, intentalo de nuevo.");

			}
			// consigue acceso creando un usuario
			if (res == 4) {
				System.out.println("Enhorabuena!");
				s.hacerInisible();
				l.hacerVisible();
			}
			// control de errores

		} catch (Exception e2) {
			System.out.println("Error en la query:" + e2.getMessage());
		}
	}
}
