package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import mvc.modelo.datosAlumno;
import mvc.vistas.VistaPrincipal;
import mvc.vistas.VistaSignUp;
import mvc.vistas.buscarAlumnos;
import mvc.vistas.editarAlumnos;

public class buscarAlumnoEditarAlumno implements ActionListener, ListSelectionListener {

    // Declaramos la vista principal
    buscarAlumnos ba;
    editarAlumnos ea;
    private boolean bandera;
    

    public void setVentana(buscarAlumnos buscarAlumnos, editarAlumnos editarAlumnos) {
        ba = buscarAlumnos;
        ea = editarAlumnos;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (bandera == true) {
            ba.dispose();
            ea.hacerVisible();
        }
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            // Obtener el índice de la fila seleccionada
            int selectedIndex = ba.datosAlumnos.getSelectedIndex();

            if (selectedIndex != -1) { // Se ha seleccionado una fila
                // Obtener los datos del alumno seleccionado
                datosAlumno alumno = ba.datosAlumnos.getModel().getElementAt(selectedIndex);

                // Establecer los datos del alumno en los JTextFields de la ventana editarAlumnos
                ea.getTextField().setText(alumno.getNombre());
                ea.getTextField_1().setText(String.valueOf(alumno.getNumero_exp()));
                ea.getTextField_2().setText(String.valueOf(alumno.getID_Alumno()));
                ea.getTextField_3().setText(String.valueOf(alumno.getID_Proyecto()));

                // Ocultar la ventana buscarAlumnos
                ba.dispose();

                // Mostrar la ventana editarAlumnos
                ea.hacerVisible();
            }
        }
    }
}

