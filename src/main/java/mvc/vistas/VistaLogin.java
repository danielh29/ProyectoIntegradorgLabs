package mvc.vistas;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.*;

import mvc.control.EscuchadorLogIn;
import mvc.control.EscuchadorSignUp;

public class VistaLogin extends JFrame {
	private JTextField txtUser;
	private JPasswordField txtPass;
	private JLabel alert;
	private JButton btn;
	private home home;

	public VistaLogin() {
		inicializar();

	}

	public void inicializar() {
		JPanel panel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				// Carga y dibuja la imagen de fondo
				ImageIcon imageIcon = new ImageIcon("Imagenes/fondo.png");
				Image image = imageIcon.getImage();
				g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
				setOpaque(false);
				super.paintComponent(g);
			}
		};

		setContentPane(panel);
		setSize(1350, 820);
		getContentPane().setLayout(null);

		JLabel labelUser = new JLabel("Usuario");
		labelUser.setBounds(524, 279, 61, 16);
		getContentPane().add(labelUser);

		JLabel labelPass = new JLabel("Contraseña");
		labelPass.setBounds(524, 307, 90, 16);
		getContentPane().add(labelPass);

		txtUser = new JTextField();
		txtUser.setBounds(616, 273, 130, 26);
		getContentPane().add(txtUser);
		txtUser.setColumns(10);

		txtPass = new JPasswordField();
		txtPass.setBounds(616, 301, 130, 26);
		getContentPane().add(txtPass);

		btn = new JButton("Log In");
		btn.setBounds(629, 339, 117, 29);
		getContentPane().add(btn);
		setControlador();
		
		alert = new JLabel("");
		alert.setBounds(486, 379, 337, 16);
		getContentPane().add(alert);

		
	}

	public void hacerVisible() {
		setVisible(true);
	}

	public void hacerInisible() {
		setVisible(false);
	}
	//Metodo que crea un nuevo controlador
	public void setControlador() {
		EscuchadorLogIn escuchador = new EscuchadorLogIn();
		escuchador.setVistaPrincipal(this, home);
		btn.addActionListener(escuchador);
	}
	public void setHome(home x) {
		home = x;
	}
	public JLabel getAlert() {
		return alert;
	}

	public void setAlert(JLabel alert) {
		this.alert = alert;
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

}
