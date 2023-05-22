package mvc.vistas;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.net.http.WebSocket.Listener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import BBDD.AccesoBBDD;
import mvc.control.altasAlumnosAñadir;
import mvc.control.altasAlumnosB;
import mvc.control.altasAlumnosConsultas;
import mvc.control.añadirAlumnosHome;

public class altasAlumnos {

	private JFrame frame;
	private JPanel panel;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton buttonadd1;
	private JButton buttonadd2;
	private JButton buttonadd3;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
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
	
	public JTextField getTextField_3() {
		return textField_3;
	}
	public void setTextField_3(JTextField textField_3) {
		this.textField_3 = textField_3;
	}
	private JTextField textField_3;

	public altasAlumnos() {
		
	

		///////////////////// MENÚ Y FONDO/////////////////////////////77
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize();

		frame = new JFrame("Añadir Alumnos");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1350, 820);

		panel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {

				// Carga y dibuja la imagen de fondo
				ImageIcon imageIcon = new ImageIcon("Imagenes/AltasAlumnos.png");
				Image image = imageIcon.getImage();
				g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
				setOpaque(false);
				setVisible(true);
				super.paintComponent(g);
			}
		};
		
		//Cambia el icono de la ventana de Java
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
		
		button4 = new JButton("");
		button4.setBorderPainted(false);
		button4.setOpaque(false);
		button4.setFocusPainted(false);
		button4.setIcon(new ImageIcon(resizedAnadir));
		button4.setContentAreaFilled(false);
		
		button4.setBounds(1236, 652, 90, 78);
		
		frame.setContentPane(panel);
		panel.setLayout(null);
		button3.setIcon(new ImageIcon(resizedConsultar));
		
		
		

		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 30));
		lblNewLabel.setBounds(59, 431, 174, 62);
		panel.add(lblNewLabel);
		
		JLabel lblNExpediente = new JLabel("Nº Expediente:");
		lblNExpediente.setFont(new Font("SansSerif", Font.PLAIN, 30));
		lblNExpediente.setBounds(59, 528, 229, 62);
		panel.add(lblNExpediente);
		
		JLabel lblIdAlumno = new JLabel("ID Alumno:");
		lblIdAlumno.setFont(new Font("SansSerif", Font.PLAIN, 30));
		lblIdAlumno.setBounds(930, 431, 174, 62);
		panel.add(lblIdAlumno);
		
		textField = new JTextField();
		textField.setBackground(new Color(211, 233, 250));
		textField.setBounds(192, 445, 667, 39);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(211, 233, 250));
		textField_1.setBounds(283, 548, 319, 39);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(211, 233, 250));
		textField_2.setBounds(1111, 445, 261, 39);
		panel.add(textField_2);
		
		JLabel lblIdProyectoExistente = new JLabel("ID Proyecto Existente:");
		lblIdProyectoExistente.setFont(new Font("SansSerif", Font.PLAIN, 30));
		lblIdProyectoExistente.setBounds(687, 544, 299, 62);
		panel.add(lblIdProyectoExistente);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(211, 233, 250));
		textField_3.setBounds(1006, 564, 299, 39);
		panel.add(textField_3);


		

	}
	public void hacerVisible() {
    	frame.setVisible(true);
	}
	public void dispose() {
		frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		frame.setVisible(false);
	}
	//Metodo que crea un nuevo controlador
	public void setControlador1(home x) {
		añadirAlumnosHome escuchador = new añadirAlumnosHome();
		escuchador.setVentanaUsuario(x, this);
		button1.addActionListener(escuchador);
	}
	//Metodo que crea un nuevo controlador
	public void setControlador2(altas x) {
		altasAlumnosAñadir escuchador = new altasAlumnosAñadir();
		escuchador.setVentanaUsuario(x, this);
		button2.addActionListener(escuchador);
	}
	//Metodo que crea un nuevo controlador
	public void setControlador3(consultas x) {
		altasAlumnosConsultas escuchador = new altasAlumnosConsultas();
		escuchador.setVentanaUsuario(x, this);
		button3.addActionListener(escuchador);
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
	public void setHome(home home) {
		//boton que vuelve a home
	    setControlador1(home);
	}
	public void setAltas(altas alta) {
		//boton que va a altas
		setControlador2(alta);
		
	}
	public void setConsultas(consultas con) {
		//boton que va a consultas
		setControlador3(con);
	
	
	final AccesoBBDD accesoBBDD = new AccesoBBDD(this);
	button4.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	        // Insertar los datos en la tabla ALUMNOS
	        accesoBBDD.insertarDatosAlumnos();
	    }
	});
}
}
