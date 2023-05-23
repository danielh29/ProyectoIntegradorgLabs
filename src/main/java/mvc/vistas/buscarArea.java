package mvc.vistas;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.net.http.WebSocket.Listener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import mvc.control.buscarAreaAñadir;
import mvc.control.buscarAreaConsulta;
import mvc.control.buscarAreaEditarArea;
import mvc.control.buscarAreaHome;
import mvc.control.consultasAltas;
import mvc.control.consultasHome;
import mvc.modelo.datosAlumno;
import mvc.modelo.datosAreas;

/**
 * clase que contiene las vistas de buscarArea
 * 
 * @author alexjun09
 *
 */
public class buscarArea {
	private JFrame frame;
	private JPanel panel;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JLabel lblNewLabel_1;
	private JTextField txtHola;

	private JScrollPane scrollPane;
	public JList<datosAreas> datosAreas;

	private home h;
	private altas a;
	private consultas c;

	/**
	 * constructor del objeto buscarAreas
	 */
	public buscarArea() {

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
				ImageIcon imageIcon = new ImageIcon("Imagenes/FondoConsultarAreas.png");
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
		panelScroll2.setBounds(46,200,1054,437);
		frame.getContentPane().add(panelScroll2);
		
		datosAreas = new JList<datosAreas>();
		datosAreas.setFont(new Font("Verdana", Font.PLAIN, 18));
		panelScroll2.setViewportView(datosAreas);

		panelScroll2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

	}

	/**
	 * 
	 * @param listaAreas
	 */
	public void setListaArea(ArrayList<datosAreas> listaAreas) {
		DefaultListModel<datosAreas> modelo = new DefaultListModel<datosAreas>();
		modelo.addAll(listaAreas);
		// Esto no sé si puedes hacerlo o hay que hacer un foreach
		datosAreas.setModel(modelo);

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
	 * metodo que creará una nuevo controlador (boton) que redigirá a home
	 * 
	 * @param x la vista home
	 */
	public void setControlador(home x) {
		buscarAreaHome escuchador = new buscarAreaHome();
		escuchador.setVentanaUsuario(this, x);
		button1.addActionListener(escuchador);
	}

	/**
	 * metodo que creará una nuevo controlador (boton) que redigirá a altas
	 * 
	 * @param x la vista altas
	 */
	public void setControlador2(altas x) {
		buscarAreaAñadir escuchador = new buscarAreaAñadir();
		escuchador.setVentanaUsuario(this, x);
		button2.addActionListener(escuchador);
	}

	/**
	 * metodo que creará una nuevo controlador (boton) que redigirá a consultas
	 * 
	 * @param x la vista consultas
	 */
	public void setControlador3(consultas x) {
		buscarAreaConsulta escuchador = new buscarAreaConsulta();
		escuchador.setVentanaUsuario(this, x);
		button3.addActionListener(escuchador);
	}

	/**
	 * metodo que creará una nuevo controlador (boton) que redigirá a editarAreas
	 * 
	 * @param x la vista editarAreas
	 */
	public void setControlador4(editarAreas x) {
		buscarAreaEditarArea escuchador = new buscarAreaEditarArea();
		escuchador.setVentana(this, x);
		datosAreas.addListSelectionListener(escuchador);
	}

	/**
	 * metodo que cambiará la vista a editarAreas
	 * 
	 * @param editarAreas la vista editarAreas
	 */
	public void setEditarAreas(editarAreas editarAreas) {
		setControlador4(editarAreas);
	}

	/**
	 * metodo que cambiará la vista a altas
	 * 
	 * @param altas la vista altas
	 */
	public void setAltas(altas altas) {
		a = altas;
		// boton que va a altas
		setControlador2(a);
	}

	/**
	 * metodo que cambiará a la vista home
	 * 
	 * @param home la vista home
	 */
	public void setHome(home home) {
		h = home;
		// boton que vuelve a home
		setControlador(h);
	}

	/**
	 * metodo que cambiará la vista a consultas
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
