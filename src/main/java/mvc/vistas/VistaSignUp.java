package mvc.vistas;

import javax.swing.*;

import mvc.control.*;

public class VistaSignUp extends JFrame {
	private JTextField txtUser;
	private JPasswordField txtPass;
	private JPasswordField txtRepetirPass;
	private JLabel alert;

	public VistaSignUp() {
		inicializar();

	}

	public void inicializar() {
		setSize(1350, 820);
		getContentPane().setLayout(null);

		JLabel labelUser = new JLabel("Usuario");
		labelUser.setBounds(488, 270, 61, 16);
		getContentPane().add(labelUser);

		JLabel labelPass = new JLabel("Contraseña");
		labelPass.setBounds(488, 297, 90, 16);
		getContentPane().add(labelPass);

		txtUser = new JTextField();
		txtUser.setBounds(619, 264, 130, 26);
		getContentPane().add(txtUser);
		txtUser.setColumns(10);

		txtPass = new JPasswordField();
		txtPass.setBounds(619, 292, 130, 26);
		getContentPane().add(txtPass);

		JButton botonSignup = new JButton("Sign Up");
		botonSignup.setBounds(632, 357, 117, 29);
		getContentPane().add(botonSignup);

		JLabel labelRepetirPass = new JLabel("Repetir Contraseña");
		labelRepetirPass.setBounds(488, 325, 130, 16);
		getContentPane().add(labelRepetirPass);

		txtRepetirPass = new JPasswordField();
		txtRepetirPass.setBounds(619, 320, 130, 26);
		getContentPane().add(txtRepetirPass);

		alert = new JLabel("");
		alert.setBounds(446, 397, 413, 16);
		getContentPane().add(alert);

		EscuchadorSignUp escuchador = new EscuchadorSignUp();
		escuchador.setVistaPrincipal(this);
		botonSignup.addActionListener(escuchador);

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
}
