package mvc.vistas;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.net.http.WebSocket.Listener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import BBDD.AccesoBBDD;
import mvc.control.buscarAlumnoEditarAlumno;
import mvc.control.buscarAlumnosAñadir;
import mvc.control.buscarAlumnosConsultas;
import mvc.control.buscarAlumnosHome;
import mvc.control.consultasAltas;
import mvc.control.consultasHome;
import mvc.modelo.datosAlumno;
import mvc.modelo.datosAreas;

/**
 * clase que contiene la vista de buscar alumnos
 * 
 * @author alexjun09
 *
 */
public class buscarAlumnos {
	private JFrame frame;
	private JPanel panel;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JLabel lblNewLabel_1;
	private JTextField txtHola;

	private JScrollPane scrollPane;
	public JList<datosAlumno> datosAlumnos;

	private home h;
	private altas a;
	private consultas c;

	/**
	 * constructor del objeto altasAlumnos
	 */
	public buscarAlumnos() {

		///////////////////// MENÚ Y FONDO/////////////////////////////77
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize();

		frame = new JFrame("Consultar");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1350, 820);

		panel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {

				// Carga y dibuja la imagen de fondo
				ImageIcon imageIcon = new ImageIcon("Imagenes/FondoConsultarAlumnos.png");
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

		frame.setContentPane(panel);
		panel.setLayout(null);

		// BOTONES DE BUSCAR
		ImageIcon imagenAnadir = new ImageIcon("Imagenes/lupa.png");
		Image resizedAnadir = imagenAnadir.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);

		JScrollPane panelScroll2 = new JScrollPane();
		panelScroll2.setBounds(400, 250, 417, 437);
		frame.getContentPane().add(panelScroll2);

		datosAlumnos = new JList<datosAlumno>();
		panelScroll2.setViewportView(datosAlumnos);
		panelScroll2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

	}

	public void setListaAlumnos(ArrayList<datosAlumno> alumnos) {
		DefaultListModel<datosAlumno> modelo = new DefaultListModel<datosAlumno>();
		modelo.addAll(alumnos);
		// Esto no sé si puedes hacerlo o hay que hacer un foreach
		datosAlumnos.setModel(modelo);
	}

	/**
	 * metodo que hace la vista invisible
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
	 * metodo que creará una nuevo controlador (boton) que redigirá a home
	 * 
	 * @param x la vista home
	 */
	public void setControlador(home x) {
		buscarAlumnosHome escuchador = new buscarAlumnosHome();
		escuchador.setVentanaUsuario(this, x);
		button1.addActionListener(escuchador);
	}

	/**
	 * metodo que creará una nuevo controlador (boton) que redigirá a altas
	 * 
	 * @param x la vista altas
	 */
	public void setControlador2(altas x) {
		buscarAlumnosAñadir escuchador = new buscarAlumnosAñadir();
		escuchador.setVentanaUsuario(this, x);
		button2.addActionListener(escuchador);
	}

	/**
	 * metodo que creará una nuevo controlador (boton) que redigirá a consultas
	 * 
	 * @param x la vista consultas
	 */
	public void setControlador3(consultas x) {
		buscarAlumnosConsultas escuchador = new buscarAlumnosConsultas();
		escuchador.setVentanaUsuario(this, x);
		button3.addActionListener(escuchador);
	}

	/**
	 * metodo que creará una nuevo controlador (boton) que redigirá a editar alumnos
	 * 
	 * @param x la vista editaralumnos
	 */
	public void setControlador4(editarAlumnos x) {
		buscarAlumnoEditarAlumno escuchador = new buscarAlumnoEditarAlumno();
		escuchador.setVentana(this, x);
		datosAlumnos.addListSelectionListener(escuchador);
	}

	/**
	 * metodo que cambia la vista a editar alumnos
	 * 
	 * @param editarAlumnos la vista editarAlumnos
	 */
	public void setEditarAlumnos(editarAlumnos editarAlumnos) {
		setControlador4(editarAlumnos);
	}

	public void setAltas(altas altas) {
		a = altas;
		// boton que va a altas
		setControlador2(a);
	}

	/**
	 * metodo que cambia la vista aal home
	 * 
	 * @param altas la vista home
	 */
	public void setHome(home home) {
		h = home;
		// boton que vuelve a home
		setControlador(h);
	}

	/**
	 * metodo que cambia la vista a consultas
	 * 
	 * @param consultas la vista consultas
	 */
	public void setConsultas(consultas consultas) {
		c = consultas;
		setControlador3(c);
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
	 * getter del boton 3
	 * 
	 * @return button3 el boton 3
	 */
	public JButton getButton3() {
		return button3;
	}
}
