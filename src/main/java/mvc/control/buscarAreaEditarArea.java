package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import mvc.modelo.datosAlumno;
import mvc.vistas.VistaPrincipal;
import mvc.vistas.VistaSignUp;
import mvc.vistas.buscarAlumnos;
import mvc.vistas.buscarArea;
import mvc.vistas.editarAlumnos;
import mvc.vistas.editarAreas;

public class buscarAreaEditarArea implements ActionListener, ListSelectionListener {

	// declaramos la vista principal
	buscarArea ba;
	editarAreas ea;
	private boolean bandera;

	public void setVentana(buscarArea buscarArea, editarAreas editarAreas) {
		ba = buscarArea;
		ea = editarAreas;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		 if(bandera==true) {
			 ba.dispose();
			 ea.hacerVisible();
		 }
    }

	@Override
	public void valueChanged(ListSelectionEvent e) {
        if (e != null && !e.getValueIsAdjusting()) {
            bandera = true;
        }
    }

}

