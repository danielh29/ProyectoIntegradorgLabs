package mvc.vistas;

import javax.swing.*;

import mvc.control.EscuchadorLogIn;

public class VistaLogin extends JFrame {
	private JTextField txtUser;
	private JPasswordField txtPass;
	private JLabel alert;

	public VistaLogin() {
		inicializar();

	}

	public void inicializar() {
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

		JButton btn = new JButton("Log In");
		btn.setBounds(629, 339, 117, 29);
		getContentPane().add(btn);

		alert = new JLabel("");
		alert.setBounds(486, 379, 337, 16);
		getContentPane().add(alert);

		EscuchadorLogIn escuchador = new EscuchadorLogIn();
		escuchador.setVistaPrincipal(this);
		btn.addActionListener(escuchador);
	}

	public void hacerVisible() {
		setVisible(true);
	}

	public void hacerInisible() {
		setVisible(false);
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
