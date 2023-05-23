package mvc.vistas;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.net.http.WebSocket.Listener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import BBDD.AccesoBBDD;

import mvc.control.consultaAreasAñadir;
import mvc.control.consultaAreasHome;
import mvc.control.consultasAlumnoAñadir;
import mvc.control.consultasAlumnoConsultas;
import mvc.control.consultasAlumnosB;
import mvc.control.consultasAreasB;
import mvc.control.consultasAreasConsultas;
import mvc.control.editarPIAñadir;
import mvc.control.editarPIConsultas;
import mvc.control.editarPIHome;

/**
 * clase que contiene la vista de editar pi y sus correspondientes accesos a la
 * bbdd
 * 
 * @author alexjun09
 *
 */
public class editarPI {

	private JFrame frame;
	private JPanel panel;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton buttonadd1;
	private JButton buttonadd2;
	private JButton buttonadd3;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField textField;
	private JButton button1_1;
	private JButton button1_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	// setters y getters habituales
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

	public JButton getButton1_1() {
		return button1_1;
	}

	public void setButton1_1(JButton button1_1) {
		this.button1_1 = button1_1;
	}

	public JButton getButton1_2() {
		return button1_2;
	}

	public void setButton1_2(JButton button1_2) {
		this.button1_2 = button1_2;
	}

	public JTextField getTextField_3() {
		return textField_3;
	}

	public void setTextField_3(JTextField textField_3) {
		this.textField_3 = textField_3;
	}

	public JTextField getTextField_4() {
		return textField_4;
	}

	public void setTextField_4(JTextField textField_4) {
		this.textField_4 = textField_4;
	}

	public JTextField getTextField_5() {
		return textField_5;
	}

	public void setTextField_5(JTextField textField_5) {
		this.textField_5 = textField_5;
	}

	public JTextField getTextField_6() {
		return textField_6;
	}

	public void setTextField_6(JTextField textField_6) {
		this.textField_6 = textField_6;
	}

	public JTextField getTextField_7() {
		return textField_7;
	}

	public void setTextField_7(JTextField textField_7) {
		this.textField_7 = textField_7;
	}

	public JTextField getTextField_8() {
		return textField_8;
	}

	public void setTextField_8(JTextField textField_8) {
		this.textField_8 = textField_8;
	}

	public JTextField getTextField_9() {
		return textField_9;
	}

	public void setTextField_9(JTextField textField_9) {
		this.textField_9 = textField_9;
	}

	public JTextField getTextField_10() {
		return textField_10;
	}

	public void setTextField_10(JTextField textField_10) {
		this.textField_10 = textField_10;
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

	/**
	 * constructor del objeto editarPI
	 */
	public editarPI() {

		///////////////////// MENÚ Y FONDO/////////////////////////////77
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize();

		frame = new JFrame("Consultar áreas");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1350, 820);

		panel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {

				// Carga y dibuja la imagen de fondo
				ImageIcon imageIcon = new ImageIcon("Imagenes/modPI.png");
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

		button1_1 = new JButton("");
		button1_1.setBorderPainted(false);
		button1_1.setOpaque(false);
		button1_1.setFocusPainted(false);
		button1_1.setIcon(new ImageIcon(resizedModImage));
		button1_1.setContentAreaFilled(false);
		button1_1.setBounds(1104, 523, 75, 71);

		frame.setContentPane(panel);
		panel.setLayout(null);

		ImageIcon imagenEliminarIcon = new ImageIcon("Imagenes/cancelar.png");
		Image resizedEliminarImage = imagenEliminarIcon.getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);

		button1_2 = new JButton("");
		button1_2.setOpaque(false);
		button1_2.setFocusPainted(false);
		button1_2.setContentAreaFilled(false);
		button1_2.setIcon(new ImageIcon(resizedEliminarImage));
		button1_2.setBorderPainted(false);
		button1_2.setBounds(1200, 523, 75, 71);

		panel.add(button1);
		panel.add(button1_1);
		panel.add(button1_2);
		panel.add(button2);
		panel.add(button3);

		JLabel lblNewLabel = new JLabel("ID Proyecto:");
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 30));
		lblNewLabel.setBounds(57, 250, 174, 62);
		panel.add(lblNewLabel);

		textField = new JTextField();
		textField.setBackground(new Color(211, 233, 250));
		textField.setBounds(230, 270, 283, 39);
		panel.add(textField);
		textField.setColumns(10);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("SansSerif", Font.PLAIN, 30));
		lblNombre.setBounds(57, 394, 174, 62);
		panel.add(lblNombre);

		JLabel lblNotaObtenida = new JLabel("Nota :");
		lblNotaObtenida.setFont(new Font("SansSerif", Font.PLAIN, 30));
		lblNotaObtenida.setBounds(57, 487, 225, 62);
		panel.add(lblNotaObtenida);

		JLabel lblAo = new JLabel("Año:");
		lblAo.setFont(new Font("SansSerif", Font.PLAIN, 30));
		lblAo.setBounds(57, 575, 174, 62);
		panel.add(lblAo);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(211, 233, 250));
		textField_3.setBounds(230, 414, 283, 39);
		panel.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(211, 233, 250));
		textField_4.setBounds(230, 507, 283, 39);
		panel.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBackground(new Color(211, 233, 250));
		textField_5.setBounds(230, 583, 243, 39);
		panel.add(textField_5);

		JLabel lblGrupo = new JLabel("Grupo:");
		lblGrupo.setFont(new Font("SansSerif", Font.PLAIN, 30));
		lblGrupo.setBounds(650, 314, 174, 62);
		panel.add(lblGrupo);

		JLabel lblUrl = new JLabel("URL:");
		lblUrl.setFont(new Font("SansSerif", Font.PLAIN, 30));
		lblUrl.setBounds(650, 394, 174, 62);
		panel.add(lblUrl);

		JLabel lblCurso = new JLabel("Curso:");
		lblCurso.setFont(new Font("SansSerif", Font.PLAIN, 30));
		lblCurso.setBounds(650, 487, 174, 62);
		panel.add(lblCurso);

		JLabel lblIdArea = new JLabel("ID Area:");
		lblIdArea.setFont(new Font("SansSerif", Font.PLAIN, 30));
		lblIdArea.setBounds(650, 575, 158, 62);
		panel.add(lblIdArea);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBackground(new Color(211, 233, 250));
		textField_6.setBounds(780, 334, 298, 39);
		panel.add(textField_6);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBackground(new Color(211, 233, 250));
		textField_7.setBounds(780, 414, 298, 39);
		panel.add(textField_7);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBackground(new Color(211, 233, 250));
		textField_8.setBounds(780, 507, 298, 39);
		panel.add(textField_8);

		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBackground(new Color(211, 233, 250));
		textField_9.setBounds(780, 583, 298, 39);
		panel.add(textField_9);

		JLabel lblNuevoIdProyecto = new JLabel("Nuevo ID Proyecto:");
		lblNuevoIdProyecto.setFont(new Font("SansSerif", Font.PLAIN, 30));
		lblNuevoIdProyecto.setBounds(57, 322, 283, 46);
		panel.add(lblNuevoIdProyecto);

		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBackground(new Color(211, 233, 250));
		textField_10.setBounds(333, 336, 243, 39);
		panel.add(textField_10);

		frame.setVisible(false);

	}

	/**
	 * metodo que hace visible la vista
	 */
	public void hacerVisible() {
		frame.setVisible(true);
	}

	/**
	 * metodo que se desace de la vista
	 */
	public void dispose() {
		frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
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
	 * metodo que cambia de vista al home
	 * 
	 * @param x vista home
	 */
	public void setHome(home x) {
		setControlador(x);
	}

	/**
	 * metodo que cambia la vista a altas
	 * 
	 * @param a vista altas
	 */
	public void setAltas(altas a) {
		// Boton que va a altas
		setControlador2(a);
	}

	/**
	 * metodo que cambia la vista a consultas
	 * 
	 * @param c vista consultas
	 */
	public void setConsultas(consultas c) {
		// Boton que va a consultas
		setControlador1(c);
	}

	/**
	 * metodo que creará una nuevo controlador (boton) que redigirá a editar home
	 * 
	 * @param x vista home
	 */
	public void setControlador(home x) {
		editarPIHome escuchador = new editarPIHome();
		escuchador.setVentanaUsuario(x, this);
		button1.addActionListener(escuchador);
	}

	/**
	 * metodo que creará una nuevo controlador (boton) que redigirá a editar
	 * consultas
	 * 
	 * @param x vista consultas
	 */
	public void setControlador1(consultas x) {
		editarPIConsultas escuchador = new editarPIConsultas();
		escuchador.setVentanaUsuario(x, this);
		button3.addActionListener(escuchador);
	}

	/**
	 * metodo que creará una nuevo controlador (boton) que redigirá a editar altas
	 * 
	 * @param x vista altas
	 */
	public void setControlador2(altas x) {
		editarPIAñadir escuchador2 = new editarPIAñadir();
		escuchador2.setVentanaUsuario(x, this);
		button2.addActionListener(escuchador2);

		final AccesoBBDD accesoBBDD = new AccesoBBDD(this);
		button1_1.addActionListener(new ActionListener() {
			/**
			 * metodo que accede a la base de datos y edita los datos de los proyecot
			 * sintegradores
			 */
			public void actionPerformed(ActionEvent e) {
				// Insertar los datos en la tabla ALUMNOS
				try {
					accesoBBDD.editarDatosPI();
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		button1_2.addActionListener(new ActionListener() {
			/**
			 * metodo que accede a la base de datos y borra los datos del proyecto
			 * integrador
			 * 
			 * @param e
			 */
			public void actionPerformed(ActionEvent e) {
				// Insertar los datos en la tabla ALUMNOS
				accesoBBDD.borrarDatosPI();
			}
		});

	}
}
