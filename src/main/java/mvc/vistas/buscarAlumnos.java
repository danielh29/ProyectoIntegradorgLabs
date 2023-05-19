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
import mvc.control.buscarAlumnosAñadir;
import mvc.control.buscarAlumnosConsultas;
import mvc.control.buscarAlumnosHome;
import mvc.control.consultasAltas;
import mvc.control.consultasHome;
import mvc.modelo.datosAlumno;
import mvc.modelo.datosAreas;

public class buscarAlumnos {
	private JFrame frame;
	private JPanel panel;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton buttonadd1;
	private JLabel lblNewLabel_1;
	private JTextField txtHola;
	
	private JScrollPane scrollPane;
	private JList <datosAlumno> datosAlumnos;

	private home h;
	private altas a;
	private consultas c;
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
				ImageIcon imageIcon = new ImageIcon("Imagenes/fondo.png");
				Image image = imageIcon.getImage();
				g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
				setOpaque(false);
				setVisible(true);
				super.paintComponent(g);
			}
		};

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

		buttonadd1 = new JButton("");
		buttonadd1.setBorderPainted(false);
		buttonadd1.setBounds(1185, 298, 90, 78);
		buttonadd1.setIcon(new ImageIcon(resizedAnadir));
		buttonadd1.setContentAreaFilled(false);
		buttonadd1.setFocusPainted(false);
		buttonadd1.setOpaque(false);

		panel.add(buttonadd1);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);

		///////////////////////////// LABELS//////////////////////////////////

//		JLabel lblNewLabel = new JLabel("Introduzca el ID de Alumno");
//		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
//		lblNewLabel.setForeground(new Color(247, 254, 255));
//		lblNewLabel.setFont(new Font("Kefa", Font.PLAIN, 90));
//		lblNewLabel.setBounds(150, 6, 1174, 119);
//		panel.add(lblNewLabel);
//		
//		lblNewLabel_1 = new JLabel("ID Alumno:");
//		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 65));
//		lblNewLabel_1.setBounds(255, 272, 364, 102);
//		panel.add(lblNewLabel_1);
//		
//		txtHola = new JTextField();
//		txtHola.setFont(new Font("Lucida Grande", Font.PLAIN, 65));
//		txtHola.setBounds(656, 298, 375, 69);
//		panel.add(txtHola);
//		txtHola.setColumns(10);
//		frame.setVisible(false);
		
		JScrollPane panelScroll2 = new JScrollPane();
		panelScroll2.setBounds(400,250,417,437);
		frame.getContentPane().add(panelScroll2);
		
		//Listado conceptos
//		DefaultListModel<datosAlumno> modelo = new DefaultListModel<datosAlumno>();
//		modelo.addElement(new datosAlumno());
//		modelo.addElement(new datosAlumno());
//		modelo.addElement(new datosAlumno());
		
		datosAlumnos = new JList<datosAlumno>();
		panelScroll2.setViewportView(datosAlumnos);
		panelScroll2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		

	}
	
	public void setListaAlumnos(ArrayList<datosAlumno> alumnos) {
		DefaultListModel<datosAlumno> modelo = new DefaultListModel<datosAlumno>();
		modelo.addAll(alumnos);
		//Esto no sé si puedes hacerlo o hay que hacer un foreach
		datosAlumnos.setModel(modelo);

	}
	
	
	public void hacerVisible() {
    	frame.setVisible(true);
	}
	public void dispose() {
		frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		frame.setVisible(false);
	}
	//Metodo que crea un nuevo controlador
	public void setControlador(home x) {
		buscarAlumnosHome escuchador = new buscarAlumnosHome();
		escuchador.setVentanaUsuario(this, x);
		button1.addActionListener(escuchador);
	}
	//Metodo que crea un nuevo controlador
	public void setControlador2(altas x) {
		buscarAlumnosAñadir escuchador = new buscarAlumnosAñadir();
		escuchador.setVentanaUsuario(this, x);
		button2.addActionListener(escuchador);
	}
	//Metodo que crea un nuevo controlador
	public void setControlador3(consultas x) {
		buscarAlumnosConsultas escuchador = new buscarAlumnosConsultas();
		escuchador.setVentanaUsuario(this, x);
		button3.addActionListener(escuchador);
	}
	public void setAltas(altas altas) {
		a=altas;
		//boton que va a altas
		setControlador2(a);
	}
	public void setHome(home home) {
		h=home;
		//boton que vuelve a home
	    setControlador(h);
	}
	public void setConsultas (consultas consultas) {
		c=consultas;
		setControlador3(c);
	}
	public JButton getButton1() {
		return button1;
	}

	public JButton getButton2() {
		return button2;
	}

	public JButton getButton3() {
		return button3;
	}
}
