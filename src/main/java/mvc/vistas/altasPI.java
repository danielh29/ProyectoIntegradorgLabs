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
import mvc.control.altasAlumnosB;
import mvc.control.altasConsultas;
import mvc.control.altasHome;
import mvc.control.altasPIHome;
import mvc.control.altasPiAñadir;
import mvc.control.altasPiConsultas;

public class altasPI {

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
	private JLabel lblGrupo;
	private JTextField textField_4;
	private JLabel lblGrupo_1;
	private JTextField textField_5;
	private JLabel lblCurso;
	private JTextField textField_6;
	private JLabel lblIdProyecto;
	private JTextField textField_7;
	private JLabel lblGrupo_2;
	private JTextField textField_8;
	
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

	public JButton getButton1_1() {
		return button1_1;
	}

	public void setButton1_1(JButton button1_1) {
		this.button1_1 = button1_1;
	}

	public JLabel getLblGrupo() {
		return lblGrupo;
	}

	public void setLblGrupo(JLabel lblGrupo) {
		this.lblGrupo = lblGrupo;
	}

	public JTextField getTextField_4() {
		return textField_4;
	}

	public void setTextField_4(JTextField textField_4) {
		this.textField_4 = textField_4;
	}

	public JLabel getLblGrupo_1() {
		return lblGrupo_1;
	}

	public void setLblGrupo_1(JLabel lblGrupo_1) {
		this.lblGrupo_1 = lblGrupo_1;
	}

	public JTextField getTextField_5() {
		return textField_5;
	}

	public void setTextField_5(JTextField textField_5) {
		this.textField_5 = textField_5;
	}

	public JLabel getLblCurso() {
		return lblCurso;
	}

	public void setLblCurso(JLabel lblCurso) {
		this.lblCurso = lblCurso;
	}

	public JTextField getTextField_6() {
		return textField_6;
	}

	public void setTextField_6(JTextField textField_6) {
		this.textField_6 = textField_6;
	}

	public JLabel getLblIdProyecto() {
		return lblIdProyecto;
	}

	public void setLblIdProyecto(JLabel lblIdProyecto) {
		this.lblIdProyecto = lblIdProyecto;
	}

	public JTextField getTextField_7() {
		return textField_7;
	}

	public void setTextField_7(JTextField textField_7) {
		this.textField_7 = textField_7;
	}

	public JLabel getLblGrupo_2() {
		return lblGrupo_2;
	}

	public void setLblGrupo_2(JLabel lblGrupo_2) {
		this.lblGrupo_2 = lblGrupo_2;
	}

	public JTextField getTextField_8() {
		return textField_8;
	}

	public void setTextField_8(JTextField textField_8) {
		this.textField_8 = textField_8;
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

	public altasPI() {

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
				ImageIcon imageIcon = new ImageIcon("Imagenes/AltasPI.png");
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
		
		button1_1.setBounds(1168, 628, 90, 78);

		frame.setContentPane(panel);
		panel.setLayout(null);

		
		panel.add(button1);
		
		
		
		panel.add(button1_1);
		panel.add(button2);
		panel.add(button3);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 30));
		lblNewLabel.setBounds(46, 231, 174, 62);
		panel.add(lblNewLabel);
		
		JLabel lblNExpediente = new JLabel("URL:");
		lblNExpediente.setFont(new Font("SansSerif", Font.PLAIN, 30));
		lblNExpediente.setBounds(46, 528, 90, 62);
		panel.add(lblNExpediente);
		
		JLabel lblIdAlumno = new JLabel("ID Área:");
		lblIdAlumno.setFont(new Font("SansSerif", Font.PLAIN, 30));
		lblIdAlumno.setBounds(46, 339, 174, 62);
		panel.add(lblIdAlumno);
		
		lblGrupo = new JLabel("Año:");
		lblGrupo.setFont(new Font("SansSerif", Font.PLAIN, 30));
		lblGrupo.setBounds(441, 339, 83, 62);
		panel.add(lblGrupo);
		
		lblGrupo_1 = new JLabel("Grupo:");
		lblGrupo_1.setFont(new Font("SansSerif", Font.PLAIN, 30));
		lblGrupo_1.setBounds(798, 332, 174, 62);
		panel.add(lblGrupo_1);
		
		textField = new JTextField();
		textField.setBackground(new Color(211, 233, 250));
		textField.setBounds(192, 249, 926, 39);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(211, 233, 250));
		textField_1.setBounds(128, 539, 1130, 39);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(211, 233, 250));
		textField_2.setBounds(168, 350, 261, 39);
		panel.add(textField_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(211, 233, 250));
		textField_4.setBounds(516, 350, 261, 39);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBackground(new Color(211, 233, 250));
		textField_5.setBounds(910, 350, 261, 39);
		panel.add(textField_5);
		
		lblCurso = new JLabel("Curso:");
		lblCurso.setFont(new Font("SansSerif", Font.PLAIN, 30));
		lblCurso.setBounds(46, 420, 174, 62);
		panel.add(lblCurso);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBackground(new Color(211, 233, 250));
		textField_6.setBounds(168, 431, 261, 39);
		panel.add(textField_6);
		
		lblIdProyecto = new JLabel("ID Proyecto:");
		lblIdProyecto.setFont(new Font("SansSerif", Font.PLAIN, 30));
		lblIdProyecto.setBounds(441, 420, 174, 62);
		panel.add(lblIdProyecto);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBackground(new Color(211, 233, 250));
		textField_7.setBounds(625, 437, 261, 39);
		panel.add(textField_7);
		
		lblGrupo_2 = new JLabel("Nota:");
		lblGrupo_2.setFont(new Font("SansSerif", Font.PLAIN, 30));
		lblGrupo_2.setBounds(910, 420, 99, 62);
		panel.add(lblGrupo_2);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBackground(new Color(211, 233, 250));
		textField_8.setBounds(1003, 431, 261, 39);
		panel.add(textField_8);

		

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
	public void setControlador(home x) {
		altasPIHome escuchador = new altasPIHome();
		escuchador.setVentanaUsuario(this, x);
		button1.addActionListener(escuchador);
	}
	//Metodo que crea un nuevo controlador
	public void setControlador2(consultas x) {
		altasPiConsultas escuchador = new altasPiConsultas();
		escuchador.setVentanaUsuario(this, x);
		button3.addActionListener(escuchador);
	}
	//Metodo que crea un nuevo controlador
	public void setControlador3(altas x) {
		altasPiAñadir escuchador = new altasPiAñadir();
		escuchador.setVentanaUsuario(this, x);
		button2.addActionListener(escuchador);
	}
	public void setHome(home home) {
		//boton que vuelve a home
	    setControlador(home);
	}
	public void setConsultas(consultas con) {
		//boton que va a consultas
		setControlador2(con);
	}
	public void setAltas (altas altas) {
		//boton que va a altas
		setControlador3(altas);
	
	final AccesoBBDD accesoBBDD = new AccesoBBDD(this);
	button1_1.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	        // Insertar los datos en la tabla PROYECTO
	        try {
				accesoBBDD.insertarDatosPI();
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    }
	});
 }
}
