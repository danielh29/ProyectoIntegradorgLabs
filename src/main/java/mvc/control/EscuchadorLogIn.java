package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.*;
import mvc.main.*;
import BBDD.*;

/**
 * clase que implementa action listener y contiene toda la funcionalidad del
 * login
 * 
 * @author alexjun09
 *
 */
public class EscuchadorLogIn implements ActionListener {
	// declaramos la vista principal
	VistaLogin v;
	home h;
	int counter = 3;

	/**
	 * constructor vacío
	 */
	public EscuchadorLogIn() {

	}

	/**
	 * metodo que actualiza los valores de las dos vistas para posteriormete poder
	 * ser utilizadas
	 * 
	 * @param vista vista vistalogin
	 * @param home  vista home
	 */
	public void setVistaPrincipal(VistaLogin vista, home home) {
		v = vista;
		h = home;
	}

	/**
	 * metodo que cambia de vista y se comunica con la bbdd atraves de las queries
	 * dependiendo de los datos introducidos
	 */
	public void actionPerformed(ActionEvent e) {
		// almacenamos el usuario y la contraseña que pone el usuario
		String user = v.getTxtUser().getText();
		String pass = v.getTxtPass().getText();

		AccesoBBDD bbdd = new AccesoBBDD();
		bbdd.getConexion();
		// dependiendo de lo que devuelva el metodo query, haremos visible una pantalla
		// u otra, o editaremos el JLabel oara hacerle saber al usuario del error.
		try {
			// acceso conseguido
			if (bbdd.logIn(user, pass) == 1) {
				v.hacerInisible();
				h.hacerVisible();
				// contraseña incorrecta
			} else if (bbdd.logIn(user, pass) == 2) {
				counter--;
				v.getAlert().setText("Contraseña incorrecta, " + counter + " oportunidades restantes.");
				// usuario no existe
			} else if (bbdd.logIn(user, pass) == 3) {
				v.getAlert().setText("Usuario no existe, intentalo de nuevo");
			}
			// control de errores
		} catch (Exception e2) {
			System.out.println("Error en la query: " + e2.getMessage());
		}
		// cuando se falla 3 veces, se cierra el programa
		if (counter == 0) {
			System.exit(0);
		}

	}
}
