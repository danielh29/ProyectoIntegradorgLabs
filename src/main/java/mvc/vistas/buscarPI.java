package mvc.vistas;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.net.http.WebSocket.Listener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import mvc.control.buscarAlumnoEditarAlumno;
import mvc.control.buscarPIAñadir;
import mvc.control.buscarPIConsultas;
import mvc.control.buscarPIEditarPI;
import mvc.control.buscarPIHome;
import mvc.control.consultasAltas;
import mvc.control.consultasHome;
import mvc.modelo.datosAlumno;
import mvc.modelo.datosAreas;
import mvc.modelo.datosPI;

public class buscarPI {
	private JFrame frame;
	private JPanel panel;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton buttonadd1;
	private JLabel lblNewLabel_1;
	private JTextField txtHola;

	private JScrollPane scrollPane;
	public JList <datosPI> datosPI;
	
	private home h;
	private altas a;
	private consultas c;
	public buscarPI() {

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

		JScrollPane panelScroll2 = new JScrollPane();
		panelScroll2.setBounds(400,250,417,437);
		frame.add(panelScroll2);
		
		datosPI = new JList<datosPI>();
		panelScroll2.setViewportView(datosPI);
		panelScroll2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
	}
	public void setListaPI(ArrayList<datosPI> listaPI) {
		DefaultListModel<datosPI> modelo = new DefaultListModel<datosPI>();
		modelo.addAll(listaPI);
		//Esto no sé si puedes hacerlo o hay que hacer un foreach
		datosPI.setModel(modelo);

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
		buscarPIHome escuchador = new buscarPIHome();
		escuchador.setVentanaUsuario(this, x);
		button1.addActionListener(escuchador);
	}
	//Metodo que crea un nuevo controlador
	public void setControlador2(altas x) {
		buscarPIAñadir escuchador = new buscarPIAñadir();
		escuchador.setVentanaUsuario(this, x);
		button2.addActionListener(escuchador);
	}
	//Metodo que crea un nuevo controlador
	public void setControlador3(consultas x) {
		buscarPIConsultas escuchador = new buscarPIConsultas();
		escuchador.setVentanaUsuario(this, x);
		button3.addActionListener(escuchador);
	}
	
	public void setControlador4(editarPI x) {
		buscarPIEditarPI escuchador = new buscarPIEditarPI();
		escuchador.setVentana(this, x);
		datosPI.addListSelectionListener(escuchador);
	}
	
	public void setEditarPI ( editarPI editarPI) {
		setControlador4(editarPI);
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
