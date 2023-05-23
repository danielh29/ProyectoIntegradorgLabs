package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.altasAlumnos;
import mvc.vistas.home;

/**
 * Clase controlador que implementa ActionListener que cambiará de la vista
 * altasAlumnos al home
 * 
 * @author alexjun09
 *
 */
public class añadirAlumnosHome implements ActionListener {

	home h;
	altasAlumnos aa;

	/**
	 * Método que declarará las vistas con las que queremos trabjar
	 * 
	 * @param home la vista home
	 * @param aaa  la vista altasAlumnos
	 */
	public void setVentanaUsuario(home home, altasAlumnos aaa) {
		h = home;
		aa = aaa;
	}

	/**
	 * metodo actionPerformed que se deshará de la vista altasAlumnos y abrirá la
	 * vista home
	 */
	public void actionPerformed(ActionEvent e) {
		aa.dispose();
		h.hacerVisible();
	}

}
