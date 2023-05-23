package mvc.vistas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import mvc.control.*;

/**
 * clase que contiene la vista de vistaPricnipal y sus correspondientes accesos
 * 
 * @author alexjun09
 *
 */
public class VistaPrincipal extends JFrame {

	private JButton botonLogIn;
	private JButton botonSignUp;
	VistaLogin login;
	VistaSignUp sign;
	private static JButton botonFondoLogIn;
	private static JButton botonFondoSignUp;
	private static List<ImageIcon> framesLogIn = new ArrayList<>();
	private static List<ImageIcon> framesSignUp = new ArrayList<>();
	private static int currentFrameIndexLogIn;
	private static int currentFrameIndexSignUp;
	private static final int ICON_WIDTH = 235;
	private static final int ICON_HEIGHT = 164;

	/**
	 * constructor del objeto vistaprincipal
	 */
	public VistaPrincipal() {
		inicializar();
	}

	/**
	 * metodo con toda la funcionalidad de la vista
	 */
	public void inicializar() {
		JPanel panel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				// Carga y dibuja la imagen de fondo
				ImageIcon imageIcon = new ImageIcon("Imagenes/FondoVistaPrincipal.png");
				Image image = imageIcon.getImage();
				g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
				setOpaque(false);
				super.paintComponent(g);
			}
		};

		setContentPane(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1350, 820);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Bienvenido");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Agency FB", Font.BOLD | Font.ITALIC, 99));
		lblNewLabel.setBounds(468, 75, 402, 99);
		getContentPane().add(lblNewLabel);

		// Cambia el icono de la ventana de Java
		ImageIcon icon = new ImageIcon("Imagenes/7.png");
		setIconImage(icon.getImage());

//BOTÓN LOGIN FUNCIONAL
		botonLogIn = new JButton("");
		botonLogIn.setBounds(364, 600, 235, 164);
		getContentPane().add(botonLogIn);
		// Establecer la opacidad del botón
		botonLogIn.setOpaque(false);
		botonLogIn.setContentAreaFilled(false);
		botonLogIn.setBorderPainted(false);
		// Establecer el fondo del botón como transparente
		botonLogIn.setBackground(new Color(0, 0, 0, 0));
//BOTÓN DISEÑO LOGIN
		// Carga las imágenes del GIF en una lista
		for (int i = 1; i <= 2; i++) {
			String imagePath = "ImagenesGifL/imagen (" + i + ").png";
			ImageIcon frame = new ImageIcon(imagePath);
			ImageIcon scaledFrame = scaleImageIcon(frame, ICON_WIDTH, ICON_HEIGHT);
			framesLogIn.add(scaledFrame);
		}

		// Configura el primer frame como icono inicial del botón
		currentFrameIndexLogIn = 0;

		// Inicia un temporizador para cambiar automáticamente los frames
		int delay = 3000; // Intervalo en milisegundos entre cada cambio de frame
		Timer timer = new Timer(delay, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				botonFondoLogIn.doClick(); // Simula un clic en el botón para cambiar el frame
			}
		});
		timer.start();

		botonFondoLogIn = new JButton();
		botonFondoLogIn.setBounds(364, 600, 235, 164);
		botonFondoLogIn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Cambia la imagen del botón al siguiente frame
				currentFrameIndexLogIn = (currentFrameIndexLogIn + 1) % framesLogIn.size();
				botonFondoLogIn.setIcon(framesLogIn.get(currentFrameIndexLogIn));
			}
		});
		botonFondoLogIn.setIcon(framesLogIn.get(currentFrameIndexLogIn));

		botonFondoLogIn.setOpaque(false);
		botonFondoLogIn.setContentAreaFilled(false);
		botonFondoLogIn.setBorderPainted(false);
		botonFondoLogIn.setBackground(new Color(0, 0, 0, 0));

		getContentPane().add(botonFondoLogIn);

//BOTÓN SIGNUP FUNCIONAL
		botonSignUp = new JButton("");
		botonSignUp.setBounds(686, 600, 235, 164);
		getContentPane().add(botonSignUp);
		// Establecer la opacidad del botón
		botonSignUp.setOpaque(false);
		botonSignUp.setContentAreaFilled(false);
		botonSignUp.setBorderPainted(false);
		// Establecer el fondo del botón como transparente
		botonSignUp.setBackground(new Color(0, 0, 0, 0));

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
		botonFondoSignUp.setBounds(686, 600, 235, 164);
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

	}

	/**
	 * cambia la vista a vistalogin
	 * 
	 * @param x vista vistalogin
	 */
	public void setVistaLogin(VistaLogin x) {
		login = x;
		setControlador1(x);
	}

	/**
	 * cambia la vista a vistasignup
	 * 
	 * @param x vista vistasignup
	 */
	public void setVistaSignUp(VistaSignUp x) {
		sign = x;
		setControlador2(x);
	}

	/**
	 * metodo que creará una nuevo controlador (boton) que redigirá a vistalogin
	 * 
	 * @param x vista vistalogin
	 */
	public void setControlador1(VistaLogin x) {
		EscuchadorPrincipalLogIn escuchador = new EscuchadorPrincipalLogIn();
		escuchador.setEscuchadorPrincipalLogIn(this, x);
		botonLogIn.addActionListener(escuchador);
	}

	/**
	 * metodo que creará una nuevo controlador (boton) que redigirá a vistasignup
	 * 
	 * @param x vista vistasignup
	 */
	public void setControlador2(VistaSignUp x) {
		EscuchadorPrincipalSignUp escuchador2 = new EscuchadorPrincipalSignUp();
		escuchador2.setEscuchadorPrincipalSignUp(this, x);
		botonSignUp.addActionListener(escuchador2);
	}

	/**
	 * metodo que hace la vista visible
	 */
	public void hacerVisible() {
		setVisible(true);
	}

	/**
	 * metodo que hace la vista invisible
	 */
	public void hacerInvisible() {
		setVisible(false);
	}

	private static ImageIcon scaleImageIcon(ImageIcon icon, int width, int height) {
		Image image = icon.getImage();
		Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
		return new ImageIcon(scaledImage);
	}
}