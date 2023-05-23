package mvc.vistas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import mvc.control.*;
import java.awt.Font;

/**
 * clase que contiene las vistas y funcionalidad del signup
 * 
 * @author alexjun09
 *
 */
public class VistaSignUp extends JFrame {
	private JTextField txtUser;
	private JPasswordField txtPass;
	private JPasswordField txtRepetirPass;
	private JLabel alert;
	private JButton botonSignup;
	private JButton btn_atras;
	private VistaPrincipal VistaPrincipal;
	private static JButton botonFondoSignUp;
	private static List<ImageIcon> framesSignUp = new ArrayList<>();
	private static int currentFrameIndexSignUp;
	private static final int ICON_WIDTH = 235;
	private static final int ICON_HEIGHT = 164;
	VistaLogin login;

	/**
	 * constructor del objeto vistasignup
	 */
	public VistaSignUp() {
		inicializar();

	}

	/**
	 * metodo que contiene la funcionalidad y las vistas dels ignup
	 */
	public void inicializar() {
		JPanel panel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				// Carga y dibuja la imagen de fondo
				ImageIcon imageIcon = new ImageIcon("Imagenes/FondoLogin.png");
				Image image = imageIcon.getImage();
				g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
				setOpaque(false);
				super.paintComponent(g);
			}
		};

		// Cambia el icono de la ventana de Java
		ImageIcon icon = new ImageIcon("Imagenes/7.png");
		setIconImage(icon.getImage());

		setContentPane(panel);
		setSize(1350, 820);
		getContentPane().setLayout(null);

		JLabel labelUser = new JLabel("Usuario");
		labelUser.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 50));
		labelUser.setBounds(281, 238, 130, 55);
		getContentPane().add(labelUser);

		JLabel labelPass = new JLabel("Contraseña");
		labelPass.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 50));
		labelPass.setBounds(279, 300, 184, 69);
		getContentPane().add(labelPass);

		txtUser = new JTextField();
		txtUser.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtUser.setBounds(511, 238, 252, 45);
		getContentPane().add(txtUser);
		txtUser.setColumns(10);

		txtPass = new JPasswordField();
		txtPass.setBounds(511, 300, 252, 45);
		getContentPane().add(txtPass);

		// Botón atras
		btn_atras = new JButton("");
		btn_atras.setBorderPainted(false);
		btn_atras.setBounds(115, 677, 90, 78);
		btn_atras.setContentAreaFilled(false);
		btn_atras.setFocusPainted(false);
		btn_atras.setOpaque(false);
		ImageIcon imagenHome = new ImageIcon("Imagenes/back.png");
		Image resizedImage = imagenHome.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		btn_atras.setIcon(new ImageIcon(resizedImage));
		getContentPane().add(btn_atras);

//BOTÖN CON FUNCIONALIDAD
		botonSignup = new JButton("");
		botonSignup.setFont(new Font("Tahoma", Font.PLAIN, 30));
		botonSignup.setBounds(931, 438, 235, 164);
		getContentPane().add(botonSignup);
		// Establecer la opacidad del botón
		botonSignup.setOpaque(false);
		botonSignup.setContentAreaFilled(false);
		botonSignup.setBorderPainted(false);
		// Establecer el fondo del botón como transparente
		botonSignup.setBackground(new Color(0, 0, 0, 0));

//BOTÓN DISEÑO SIGNUP
		// Carga las imágenes del GIF en una lista
		for (int i = 1; i <= 2; i++) {
			String imagePath = "ImagenesGifS/imagen (" + i + ").png";
			ImageIcon frame = new ImageIcon(imagePath);
			ImageIcon scaledFrame = scaleImageIcon(frame, ICON_WIDTH, ICON_HEIGHT);
			framesSignUp.add(scaledFrame);
		}

		// Configura el primer frame como icono inicial del botón
		currentFrameIndexSignUp = 0;

		// Inicia un temporizador para cambiar automáticamente los frames
		int delayS = 3000; // Intervalo en milisegundos entre cada cambio de frame
		Timer timerS = new Timer(delayS, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				botonFondoSignUp.doClick(); // Simula un clic en el botón para cambiar el frame
			}
		});
		timerS.start();

		botonFondoSignUp = new JButton();
		botonFondoSignUp.setBounds(931, 438, 235, 164);
		botonFondoSignUp.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Cambia la imagen del botón al siguiente frame
				currentFrameIndexSignUp = (currentFrameIndexSignUp + 1) % framesSignUp.size();
				botonFondoSignUp.setIcon(framesSignUp.get(currentFrameIndexSignUp));
			}
		});
		botonFondoSignUp.setIcon(framesSignUp.get(currentFrameIndexSignUp));

		botonFondoSignUp.setOpaque(false);
		botonFondoSignUp.setContentAreaFilled(false);
		botonFondoSignUp.setBorderPainted(false);
		botonFondoSignUp.setBackground(new Color(0, 0, 0, 0));

		getContentPane().add(botonFondoSignUp);

		JLabel labelRepetirPass = new JLabel("Repetir Contraseña");
		labelRepetirPass.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 40));
		labelRepetirPass.setBounds(244, 360, 286, 65);
		getContentPane().add(labelRepetirPass);

		txtRepetirPass = new JPasswordField();
		txtRepetirPass.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtRepetirPass.setBounds(511, 360, 252, 45);
		getContentPane().add(txtRepetirPass);

		alert = new JLabel("");
		alert.setBounds(446, 397, 413, 16);
		getContentPane().add(alert);

	}

	/**
	 * metodo que hace visible la vista
	 */
	public void hacerVisible() {
		setVisible(true);
	}

	/**
	 * metodo que hace invisible la vista
	 */
	public void hacerInisible() {
		setVisible(false);
	}

	/**
	 * metodo que cambia la vista al login
	 * 
	 * @param x vista login
	 */
	public void setVistaLogin(VistaLogin x) {
		login = x;
		setControlador(x);
	}

	/**
	 * metodo que cambia la vista a la vista principal
	 * 
	 * @param vp vista vistaprincipal
	 */
	public void setVistaPrincipal(VistaPrincipal vp) {
		VistaPrincipal = vp;
		setControlador2(vp);

	}

	/**
	 * metodo que creará una nuevo controlador (boton) que redigirá a la vista login
	 * 
	 * @param x vista vistalogin
	 */
	public void setControlador(VistaLogin x) {
		EscuchadorSignUp escuchador = new EscuchadorSignUp();
		escuchador.setVistaPrincipal(this, login);
		botonSignup.addActionListener(escuchador);
	}

	/**
	 * metodo que creará una nuevo controlador (boton) que redigirá a la vista
	 * principal
	 * 
	 * @param x vista vistaprincipal
	 */
	public void setControlador2(VistaPrincipal vp) {
		SignUpBack escuchador = new SignUpBack();
		escuchador.setVistaPrincipal(this, vp);
		btn_atras.addActionListener(escuchador);
	}

//setters y getters habituales
	public JLabel getAlert() {
		return alert;
	}

	public void setAlert(JLabel alert) {
		this.alert = alert;
	}

	public JPasswordField getTxtRepetirPass() {
		return txtRepetirPass;
	}

	public void setTxtRepetirPass(JPasswordField txtRepetirPass) {
		this.txtRepetirPass = txtRepetirPass;
	}

	public JTextField getTxtUser() {
		return txtUser;
	}

	public void setTxtUser(JTextField txtUser) {
		this.txtUser = txtUser;
	}

	public JPasswordField getTxtPass() {
		return txtPass;
	}

	public void setTxtPass(JPasswordField txtPass) {
		this.txtPass = txtPass;
	}

	private static ImageIcon scaleImageIcon(ImageIcon icon, int width, int height) {
		Image image = icon.getImage();
		Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
		return new ImageIcon(scaledImage);
	}
}
