package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import mvc.modelo.datosAlumno;
import mvc.modelo.datosPI;
import mvc.vistas.VistaPrincipal;
import mvc.vistas.VistaSignUp;
import mvc.vistas.buscarAlumnos;
import mvc.vistas.buscarPI;
import mvc.vistas.editarAlumnos;
import mvc.vistas.editarPI;

public class buscarPIEditarPI implements ActionListener, ListSelectionListener {

    // Declaramos la vista principal
    buscarPI bi;
    editarPI ei;
    private boolean bandera;
    

    public void setVentana(buscarPI buscarPI, editarPI editarPI) {
        bi = buscarPI;
        ei = editarPI;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (bandera == true) {
            bi.dispose();
            ei.hacerVisible();
        }
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            // Obtener el índice de la fila seleccionada
            int selectedIndex = bi.datosPI.getSelectedIndex();

            if (selectedIndex != -1) { // Se ha seleccionado una fila
                // Obtener los datos del alumno seleccionado
                datosPI pi = bi.datosPI.getModel().getElementAt(selectedIndex);

                // Establecer los datos del alumno en los JTextFields de la ventana editarPI
                ei.getTextField().setText(String.valueOf(pi.getID_Proyecto()));
                ei.getTextField_3().setText(pi.getNombre());
                ei.getTextField_4().setText(String.valueOf(pi.getNota_Obtenida()));
                ei.getTextField_5().setText(String.valueOf(pi.getAno()));
                ei.getTextField_6().setText(String.valueOf(pi.getGrupo()));
                ei.getTextField_3().setText(pi.getURL_Proyecto());
                ei.getTextField_8().setText(String.valueOf(pi.getCurso()));
                ei.getTextField_9().setText(String.valueOf(pi.getID_Area()));

                // Ocultar la ventana buscarAlumnos
                bi.dispose();

                // Mostrar la ventana editarAlumnos
                ei.hacerVisible();
            }
        }
    }
}

