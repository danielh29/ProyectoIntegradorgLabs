package mvc.vistas;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.net.http.WebSocket.Listener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import mvc.control.homeConsultas;
import mvc.control.homeAñadir;

public class home {
	private JFrame frame;
	private JPanel panel;
	private JButton button1;
	private JButton button2_1;
	private JButton button3_1;
	private altas a;
	private consultas c;

	public home() {
		

		
		// Creacion de clases

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize();

		frame = new JFrame("Home Page");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1350, 820);

		panel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {

				// Carga y dibuja la imagen de fondo
				ImageIcon imageIcon = new ImageIcon("Imagenes/Sara.png");
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
		
		//Iconos de los botones
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

		button2_1 = new JButton("");
		button2_1.setBorderPainted(false);
		button2_1.setBounds(600, 677, 90, 78);
		button2_1.setIcon(new ImageIcon(resizedAdd));
		button2_1.setContentAreaFilled(false);
		button2_1.setFocusPainted(false);
		button2_1.setOpaque(false);

		button3_1 = new JButton("");
		button3_1.setBorderPainted(false);
		button3_1.setBounds(1085, 677, 90, 78);
		button3_1.setIcon(new ImageIcon(resizedConsultar));
		button3_1.setContentAreaFilled(false);
		button3_1.setFocusPainted(false);
		button3_1.setOpaque(false);

		frame.setContentPane(panel);
		panel.setLayout(null);
		panel.add(button1);
		panel.add(button2_1);
		panel.add(button3_1);

	}

	public void hacerVisible() {
		frame.setVisible(true);
	}

	public void dispose() {
		frame.setVisible(false);
	}

	public JButton getButton1() {
		return button1;
	}

	public JButton getButton2() {
		return button2_1;
	}

	public JButton getButton3() {
		return button3_1;
	}

	// Metodo que crea un nuevo controlador
	public void setControlador1(altas x) {
		homeAñadir escuchador = new homeAñadir();
		escuchador.setVentanaUsuario(this, x);
		button2_1.addActionListener(escuchador);
	}

	// Metodo que crea un nuevo controlador
	public void setControlador2(consultas x) {
		homeConsultas escuchador2 = new homeConsultas();
		escuchador2.setVentanaUsuario(this, x);
		button3_1.addActionListener(escuchador2);
	}

	public void setAltas(altas altas) {
		a = altas;
		// Boton que va a altas
		setControlador1(a);
	}

	public void setConsultas(consultas con) {
		c = con;
		// Boton que va a consultas
		setControlador2(c);
	}
}
