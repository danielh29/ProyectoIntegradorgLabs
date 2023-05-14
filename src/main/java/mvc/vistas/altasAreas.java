package mvc.vistas;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.net.http.WebSocket.Listener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import mvc.control.altasAreasAñadir;
import mvc.control.altasAreasConsultas;
import mvc.control.altasAreasHome;
import mvc.control.homeAñadir;
import mvc.control.homeConsultas;

public class altasAreas {
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
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton button1_1;

	public altasAreas() {

		///////////////////// MENÚ Y FONDO/////////////////////////////77
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize();

		frame = new JFrame("Añadir áreas");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1350, 820);

		panel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {

				// Carga y dibuja la imagen de fondo
				ImageIcon imageIcon = new ImageIcon("Imagenes/AltasAreas.png");
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
		
		ImageIcon imagenAnadirIcon = new ImageIcon("Imagenes/agregar.png");
		Image resizedAnadirImage = imagenAnadirIcon.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		
		button1_1 = new JButton("");
		button1_1.setBorderPainted(false);
		button1_1.setOpaque(false);
		button1_1.setFocusPainted(false);
		button1_1.setIcon(new ImageIcon(resizedAnadirImage));
		button1_1.setContentAreaFilled(false);
		
		button1_1.setBounds(1282, 512, 90, 78);

		frame.setContentPane(panel);
		panel.setLayout(null);

		
		panel.add(button1);
		
		
		
		panel.add(button1_1);
		panel.add(button2);
		panel.add(button3);
		
		JLabel lblNewLabel = new JLabel("ID Área:");
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 30));
		lblNewLabel.setBounds(59, 431, 174, 62);
		panel.add(lblNewLabel);
		
		JLabel lblNExpediente = new JLabel("Descripción:");
		lblNExpediente.setFont(new Font("SansSerif", Font.PLAIN, 30));
		lblNExpediente.setBounds(46, 528, 229, 62);
		panel.add(lblNExpediente);
		
		JLabel lblIdAlumno = new JLabel("Nº Ciclo:");
		lblIdAlumno.setFont(new Font("SansSerif", Font.PLAIN, 30));
		lblIdAlumno.setBounds(972, 431, 174, 62);
		panel.add(lblIdAlumno);
		
		textField = new JTextField();
		textField.setBackground(new Color(211, 233, 250));
		textField.setBounds(192, 445, 319, 39);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(211, 233, 250));
		textField_1.setBounds(270, 539, 727, 108);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(211, 233, 250));
		textField_2.setBounds(1111, 445, 261, 39);
		panel.add(textField_2);

		
		frame.setVisible(true);

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
	public void hacerVisible() {
	    frame.setVisible(true);
	}
	public void dispose() {
		frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	}
	//Metodo que crea un nuevo controlador
	public void setControlador1(altas x) {
		altasAreasAñadir escuchador = new altasAreasAñadir();
		escuchador.setVentanaUsuario(this, x);
		button2.addActionListener(escuchador);
	}
	//Metodo que crea un nuevo controlador
	public void setControlador2(consultas x) {
		altasAreasConsultas escuchador2 = new altasAreasConsultas();
		escuchador2.setVentanaUsuario(this, x);
		button3.addActionListener(escuchador2);
	}
	//Metodo que crea un nuevo controlador
	public void setControlador3(home x) {
		altasAreasHome escuchador2 = new altasAreasHome();
		escuchador2.setVentanaUsuario(this, x);
		button1.addActionListener(escuchador2);
	}
	public void setAltas(altas a) {
        //Boton que va a altas
        setControlador1(a);
	}
	public void setConsultas(consultas c) {
        //Boton que va a consultas
        setControlador2(c);
	}
	public void setHome(home h) {
        //Boton que va a consultas
        setControlador3(h);
	}
}
