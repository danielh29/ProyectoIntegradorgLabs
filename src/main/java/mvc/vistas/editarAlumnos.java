package mvc.vistas;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.net.http.WebSocket.Listener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import BBDD.AccesoBBDD;
import mvc.control.altasAreasAñadir;
import mvc.control.altasAreasConsultas;
import mvc.control.buscarAlumnoEditarAlumno;
import mvc.control.consultaAlumnoHome;
import mvc.control.consultasAlumnoAñadir;
import mvc.control.consultasAlumnoConsultas;
import mvc.control.consultasHome;
import mvc.modelo.datosAlumno;

/**
 * clase que contiene las vistas de editar alumnos
 * 
 * @author alexjun09
 *
 */
public class editarAlumnos {

	private JFrame frame;
	private JPanel panel;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton buttonadd1;
	private JButton buttonadd2;
	private JButton buttonadd3;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblNuevoIdAlumno;
	private JTextField textField_4;

	// setters y getters habituales
	public JLabel getLblNuevoIdAlumno() {
		return lblNuevoIdAlumno;
	}

	public void setLblNuevoIdAlumno(JLabel lblNuevoIdAlumno) {
		this.lblNuevoIdAlumno = lblNuevoIdAlumno;
	}

	public JTextField getTextField_4() {
		return textField_4;
	}

	public void setTextField_4(JTextField textField_4) {
		this.textField_4 = textField_4;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JButton getButtonadd1() {
		return buttonadd1;
	}

	public void setButtonadd1(JButton buttonadd1) {
		this.buttonadd1 = buttonadd1;
	}

	public JButton getButtonadd2() {
		return buttonadd2;
	}

	public void setButtonadd2(JButton buttonadd2) {
		this.buttonadd2 = buttonadd2;
	}

	public JButton getButtonadd3() {
		return buttonadd3;
	}

	public void setButtonadd3(JButton buttonadd3) {
		this.buttonadd3 = buttonadd3;
	}

	public JLabel getLblNewLabel_1() {
		return lblNewLabel_1;
	}

	public void setLblNewLabel_1(JLabel lblNewLabel_1) {
		this.lblNewLabel_1 = lblNewLabel_1;
	}

	public JLabel getLblNewLabel_2() {
		return lblNewLabel_2;
	}

	public void setLblNewLabel_2(JLabel lblNewLabel_2) {
		this.lblNewLabel_2 = lblNewLabel_2;
	}

	public JLabel getLblNewLabel_3() {
		return lblNewLabel_3;
	}

	public void setLblNewLabel_3(JLabel lblNewLabel_3) {
		this.lblNewLabel_3 = lblNewLabel_3;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}

	public void setButton1(JButton button1) {
		this.button1 = button1;
	}

	public void setButton2(JButton button2) {
		this.button2 = button2;
	}

	public void setButton3(JButton button3) {
		this.button3 = button3;
	}

	public JButton getButton4() {
		return button4;
	}

	public void setButton4(JButton button4) {
		this.button4 = button4;
	}

	public JButton getButton5() {
		return button5;
	}

	public void setButton5(JButton button5) {
		this.button5 = button5;
	}

	public JTextField getTextField_3() {
		return textField_3;
	}

	public void setTextField_3(JTextField textField_3) {
		this.textField_3 = textField_3;
	}

	/**
	 * constructor del objeto editarAlumnos
	 */
	public editarAlumnos() {

		///////////////////// MENÚ Y FONDO/////////////////////////////77
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize();

		frame = new JFrame("Modificar Alumnos");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1350, 820);

		panel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {

				// Carga y dibuja la imagen de fondo
				ImageIcon imageIcon = new ImageIcon("Imagenes/modAlum.png");
				Image image = imageIcon.getImage();
				g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
				setOpaque(false);
				setVisible(true);
				super.paintComponent(g);
			}
		};

		// Cambia el icono de la ventana de Java
		ImageIcon icon = new ImageIcon("Imagenes/7.png");
		frame.setIconImage(icon.getImage());

		ImageIcon imagenHome = new ImageIcon("Imagenes/home.png");
		Image resizedImage = imagenHome.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon imagenAdd = new ImageIcon("Imagenes/mas.png");
		Image resizedAdd = imagenAdd.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon imagenConsultar = new ImageIcon("Imagenes/buscar.png");
		Image resizedConsultar = imagenConsultar.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon imagenAnadir = new ImageIcon("Imagenes/agregar.png");
		Image resizedAnadir = imagenAnadir.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);

		button1 = new JButton("");
		button1.setBorderPainted(false);
		button1.setBounds(115, 677, 90, 78);
		button1.setIcon(new ImageIcon(resizedImage));
		button1.setContentAreaFilled(false);
		button1.setFocusPainted(false);
		button1.setOpaque(false);

		button2 = new JButton("");
		button2.setBorderPainted(false);
		button2.setBounds(600, 677, 90, 78);
		button2.setIcon(new ImageIcon(resizedAdd));
		button2.setContentAreaFilled(false);
		button2.setFocusPainted(false);
		button2.setOpaque(false);

		button3 = new JButton("");
		button3.setBorderPainted(false);
		button3.setBounds(1085, 677, 90, 78);
		button3.setIcon(new ImageIcon(resizedConsultar));
		button3.setContentAreaFilled(false);
		button3.setFocusPainted(false);
		button3.setOpaque(false);

		ImageIcon imagenModificarIcon = new ImageIcon("Imagenes/lapiz.png");
		Image resizedModImage = imagenModificarIcon.getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);

		button4 = new JButton("");
		button4.setOpaque(false);
		button4.setFocusPainted(false);
		button4.setContentAreaFilled(false);
		button4.setIcon(new ImageIcon(resizedModImage));
		button4.setBorderPainted(false);
		button4.setBounds(1166, 551, 43, 39);

		ImageIcon imagenEliminarIcon = new ImageIcon("Imagenes/cancelar.png");
		Image resizedEliminarImage = imagenEliminarIcon.getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);

		button5 = new JButton("");
		button5.setBorderPainted(false);
		button5.setOpaque(false);
		button5.setFocusPainted(false);
		button5.setIcon(new ImageIcon(resizedEliminarImage));
		button5.setContentAreaFilled(false);
		button5.setBounds(1229, 551, 43, 39);

		frame.setContentPane(panel);
		panel.setLayout(null);

		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);

		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 30));
		lblNewLabel.setBounds(46, 431, 174, 62);
		panel.add(lblNewLabel);

		JLabel lblNExpediente = new JLabel("Nº Expediente:");
		lblNExpediente.setFont(new Font("SansSerif", Font.PLAIN, 30));
		lblNExpediente.setBounds(46, 528, 229, 62);
		panel.add(lblNExpediente);

		JLabel lblIdAlumno = new JLabel("ID Alumno:");
		lblIdAlumno.setFont(new Font("SansSerif", Font.PLAIN, 30));
		lblIdAlumno.setBounds(533, 431, 174, 62);
		panel.add(lblIdAlumno);

		textField = new JTextField();
		textField.setBackground(new Color(211, 233, 250));
		textField.setBounds(176, 451, 303, 39);
		panel.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(211, 233, 250));
		textField_1.setBounds(270, 539, 319, 39);
		panel.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(211, 233, 250));
		textField_2.setBounds(717, 451, 123, 39);
		panel.add(textField_2);

		JLabel lblIdProyecto = new JLabel("ID Proyecto:");
		lblIdProyecto.setFont(new Font("SansSerif", Font.PLAIN, 30));
		lblIdProyecto.setBounds(625, 528, 174, 62);
		panel.add(lblIdProyecto);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(211, 233, 250));
		textField_3.setBounds(809, 548, 319, 39);
		panel.add(textField_3);

		lblNuevoIdAlumno = new JLabel("Nuevo ID Alumno:");
		lblNuevoIdAlumno.setFont(new Font("SansSerif", Font.PLAIN, 30));
		lblNuevoIdAlumno.setBounds(867, 431, 240, 62);
		panel.add(lblNuevoIdAlumno);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(211, 233, 250));
		textField_4.setBounds(1117, 451, 123, 39);
		panel.add(textField_4);

		frame.setVisible(false);

	}

	/**
	 * getter del boton 1
	 * 
	 * @return button1 el boton 1
	 */
	public JButton getButton1() {
		return button1;
	}

	/**
	 * getter del boton 2
	 * 
	 * @return button2 el boton 2
	 */
	public JButton getButton2() {
		return button2;
	}

	/**
	 * getter del boton 2
	 * 
	 * @return button2 el boton 2
	 */
	public JButton getButton3() {
		return button3;
	}

	/**
	 * metodo que hace la vista visible
	 */
	public void hacerVisible() {
		frame.setVisible(true);
	}

	/**
	 * metodo que se deshace de la vista
	 */
	public void dispose() {
		frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		frame.setVisible(false);
	}

	/**
	 * metodo que creará una nuevo controlador (boton) que redigirá a editar home
	 * 
	 * @param x vista home
	 */
	public void setControlador(home x) {
		consultaAlumnoHome escuchador = new consultaAlumnoHome();
		escuchador.setVentanaUsuario(x, this);
		button1.addActionListener(escuchador);
	}

	/**
	 * metodo que creará una nuevo controlador (boton) que redigirá a editar altas
	 * 
	 * @param x vista altas
	 */
	public void setControlador1(altas x) {
		consultasAlumnoAñadir escuchador = new consultasAlumnoAñadir();
		escuchador.setVentanaUsuario(this, x);
		button2.addActionListener(escuchador);
	}

	/**
	 * metodo que creará una nuevo controlador (boton) que redigirá a editar
	 * consultas
	 * 
	 * @param x vista consultas
	 */
	public void setControlador2(consultas x) {
		consultasAlumnoConsultas escuchador2 = new consultasAlumnoConsultas();
		escuchador2.setVentanaUsuario(this, x);
		button3.addActionListener(escuchador2);
	}

	/**
	 * cambia la vista a la vista home
	 * 
	 * @param x vista home
	 */
	public void setHome(home x) {
		setControlador(x);
	}

	/**
	 * cambia la vista a la vista altas
	 * 
	 * @param a vista altas
	 */
	public void setAltas(altas a) {
		// Boton que va a altas
		setControlador1(a);
	}

	/**
	 * cambia la vista a la vista consultas
	 * 
	 * @param c vista consultas
	 */
	public void setConsultas(consultas c) {
		// Boton que va a consultas
		setControlador2(c);

		final AccesoBBDD accesoBBDD = new AccesoBBDD(this);
		button4.addActionListener(new ActionListener() {
			/**
			 * metodo action performed que accede a la base de datos y edita los datos de
			 * alumnos
			 */
			public void actionPerformed(ActionEvent e) {
				// Insertar los datos en la tabla ALUMNOS
				accesoBBDD.editarDatosAlumnos();
			}
		});

		button5.addActionListener(new ActionListener() {
			/**
			 * metodo que acede a la abse de datos y borra alumnos
			 */
			public void actionPerformed(ActionEvent e) {
				// Insertar los datos en la tabla ALUMNOS
				accesoBBDD.borrarDatosAlumnos();
			}
		});
	}
}
