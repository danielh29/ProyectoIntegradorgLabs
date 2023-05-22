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
				editarAlumnos ca = new editarAlumnos();
				editarAreas car = new editarAreas();
				buscarAlumnos ba = new buscarAlumnos();
				buscarArea bar = new buscarArea();
				buscarPI bp = new buscarPI();
				editarAlumnos ea = new editarAlumnos();
				editarPI ei = new editarPI();
	
				principal.hacerVisible();
				
				//Seteo de los botones de la vista principal
				principal.setVistaLogin(login);
				principal.setVistaSignUp(signup);
				
				//Seteo de los botones de Vista Login
				login.setHome(vistaHome);
				
				//Seteo de los botones de VistaSingUp
				signup.setVistaLogin(login);
				
				// Seteo de los botones del home
				vistaHome.setAltas(al);
				vistaHome.setConsultas(co);
	
				// Seteo de los botones de la vista Consultas
				co.setAltas(al);
				co.setHome(vistaHome);
				// Botones secundarios
				co.setBuscarAlumnos(ba);
				co.setBuscarAreas(bar);
				co.setBuscarPI(bp);
	
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
				
				//Seteo de los botones de la vista buscarAlumno
				ba.setAltas(al);
				ba.setHome(vistaHome);
				ba.setConsultas(co);
				ba.setEditarAlumnos(ea);
				
				//Seteo de los botones de la vista editarAlumnos
				ea.setAltas(al);
				ea.setConsultas(co);
				ea.setHome(vistaHome);
				
				//Seteo de los botones de la vista buscarAreas
				bar.setAltas(al);
				bar.setConsultas(co);
				bar.setHome(vistaHome);
				bar.setEditarAreas(car);
				
				//Seteo de los botones de la vista buscarPI
				bp.setHome(vistaHome);
				bp.setAltas(al);
				bp.setConsultas(co);
				bp.setEditarPI(ei);
				
			
			}
		});
	}
}