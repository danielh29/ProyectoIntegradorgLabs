package mvc.main;

import java.awt.EventQueue;

import mvc.vistas.*;

public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {


			@Override
			public void run() {

				VistaPrincipal principal = new VistaPrincipal();
				VistaLogin login = new VistaLogin();
				VistaSignUp signup = new VistaSignUp();

				home vistaHome = new home();
				consultas co = new consultas();
				altas al = new altas();
				altasAlumnos aa = new altasAlumnos();
				altasPI ap = new altasPI();
				altasAreas aar = new altasAreas();
				consultaAlumnos ca = new consultaAlumnos();
				consultaAreas car = new consultaAreas();

				principal.hacerVisible();

				// Seteo de los botones de la vista principal
				vistaHome.setAltas(al);
				vistaHome.setConsultas(co);

				// Seteo de los botones de la vista Consultas
				co.setAltas(al);
				co.setHome(vistaHome);
				// Botones secundarios
				co.setConsultaAlumnos(ca);
				co.setConsultaAreas(car);

				// Seteo de los botones de la vista Altas
				al.setConsultas(co);
				al.setHome(vistaHome);
				// Botones secundarios
				al.setAltasAlumnos(aa);
				al.setAltasPI(ap);
				al.setAltasAreas(aar);

				// Seteo de los botones de la vista altasAlumnos
				aa.setHome(vistaHome);
				aa.setAltas(al);
				aa.setConsultas(co);

				// Seteo de los botones de la vista altasAreas
				aar.setAltas(al);
				aar.setConsultas(co);
				aar.setHome(vistaHome);

				// Seteo de los botones de la vista altasPI
				ap.setAltas(al);
				ap.setHome(vistaHome);
				ap.setConsultas(co);

				// Seteo de los botones de la vista consultaAlumno
				ca.setHome(vistaHome);
				ca.setAltas(al);
				ca.setConsultas(co);

				// Seteo de los botones de la vista consultaAreas
				car.setAltas(al);
				car.setHome(vistaHome);
				car.setConsultas(co);

			}
		});
	}
}