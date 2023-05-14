package mvc.vistas;

import java.awt.*;

import javax.swing.*;

import mvc.control.*;

public class VistaPrincipal extends JFrame {
	VistaLogin login;

	public VistaPrincipal() {

		inicializar();

	}

	public void inicializar() {

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize();

		JFrame frame = new JFrame("Home Page");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel() {
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

		setSize(1350, 820);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Bienvenido");
		lblNewLabel.setBounds(610, 240, 163, 16);
		getContentPane().add(lblNewLabel);

		JButton botonLogIn = new JButton("Log In");
		botonLogIn.setBounds(482, 349, 117, 29);
		getContentPane().add(botonLogIn);
		EscuchadorPrincipalLogIn escuchador = new EscuchadorPrincipalLogIn(this);
		escuchador.actionPerformed(null);
		botonLogIn.addActionListener(escuchador);

		JButton botonSignUp = new JButton("Sign Up");
		botonSignUp.setBounds(686, 349, 117, 29);
		getContentPane().add(botonSignUp);
		EscuchadorPrincipalSignUp escuchador2 = new EscuchadorPrincipalSignUp(this);
		escuchador2.actionPerformed(null);
		botonSignUp.addActionListener(escuchador2);
	}

	public void hacerVisible() {
		setVisible(true);
	}

	public void hacerInisible() {
		setVisible(false);
	}

}
