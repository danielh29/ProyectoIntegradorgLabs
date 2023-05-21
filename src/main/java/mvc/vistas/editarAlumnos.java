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
import mvc.control.consultaAlumnoHome;
import mvc.control.consultasAlumnoAñadir;
import mvc.control.consultasAlumnoConsultas;
import mvc.control.consultasHome;
import mvc.modelo.datosAlumno;

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
		button4.setBounds(974, 523, 122, 113);
		
		ImageIcon imagenEliminarIcon = new ImageIcon("Imagenes/cancelar.png");
		Image resizedEliminarImage = imagenEliminarIcon.getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);

		
		
		button5 = new JButton("");
		button5.setBorderPainted(false);
		button5.setOpaque(false);
		button5.setFocusPainted(false);
		button5.setIcon(new ImageIcon(resizedEliminarImage));
		button5.setContentAreaFilled(false);
		button5.setBounds(1136, 523, 122, 113);

		frame.setContentPane(panel);
		panel.setLayout(null);
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 30));
		lblNewLabel.setBounds(59, 431, 174, 62);
		panel.add(lblNewLabel);
		
		JLabel lblNExpediente = new JLabel("Nº Expediente:");
		lblNExpediente.setFont(new Font("SansSerif", Font.PLAIN, 30));
		lblNExpediente.setBounds(46, 528, 229, 62);
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
		textField_1.setBounds(270, 539, 319, 39);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(211, 233, 250));
		textField_2.setBounds(1111, 445, 261, 39);
		panel.add(textField_2);
		
		
		frame.setVisible(false);

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
		frame.setVisible(false);
	}
	//Metodo que crea un nuevo controlador
	public void setControlador(home x) {
		consultaAlumnoHome escuchador = new consultaAlumnoHome();
		escuchador.setVentanaUsuario(x, this);
		button1.addActionListener(escuchador);
	}
	//Metodo que crea un nuevo controlador
	public void setControlador1(altas x) {
		consultasAlumnoAñadir escuchador = new consultasAlumnoAñadir();
		escuchador.setVentanaUsuario(this, x);
		button2.addActionListener(escuchador);
	}
	//Metodo que crea un nuevo controlador
	public void setControlador2(consultas x) {
		consultasAlumnoConsultas escuchador2 = new consultasAlumnoConsultas();
		escuchador2.setVentanaUsuario(this, x);
		button3.addActionListener(escuchador2);
	}
	public void setHome(home x) {
		setControlador(x);
	}
	public void setAltas(altas a) {
        //Boton que va a altas
        setControlador1(a);
	}
	public void setConsultas(consultas c) {
        //Boton que va a consultas
        setControlador2(c);
	}
	
	
}
