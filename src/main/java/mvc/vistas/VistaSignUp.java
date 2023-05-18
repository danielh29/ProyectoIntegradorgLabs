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

public class VistaSignUp extends JFrame {
	private JTextField txtUser;
	private JPasswordField txtPass;
	private JPasswordField txtRepetirPass;
	private JLabel alert;
	private JButton botonSignup;
	private static JButton botonFondoSignUp;
	private static List<ImageIcon> framesSignUp= new ArrayList<>();
	private static int currentFrameIndexSignUp;
    private static final int ICON_WIDTH = 235;
    private static final int ICON_HEIGHT = 164;
	VistaLogin login;

	public VistaSignUp() {
		inicializar();

	}

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

		setContentPane(panel);
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
//BOTÖN CON FUNCIONALIDAD
		botonSignup = new JButton("");
		botonSignup.setBounds(686, 349, 235, 164);
		getContentPane().add(botonSignup);
		// Establecer la opacidad del botón
        botonSignup.setOpaque(false);
        botonSignup.setContentAreaFilled(false);
        botonSignup.setBorderPainted(false);
        // Establecer el fondo del botón como transparente
        botonSignup.setBackground(new Color(0, 0, 0, 0));
        
//BOTÓN DISEÑO SIGNUP
        // Carga las imágenes del GIF en una lista
           for (int i = 1; i <= 13; i++) {
               String imagePath = "ImagenesGifS/imagen (" + i + ").png";
               ImageIcon frame = new ImageIcon(imagePath);
               ImageIcon scaledFrame = scaleImageIcon(frame, ICON_WIDTH, ICON_HEIGHT);
               framesSignUp.add(scaledFrame);
           }

           // Configura el primer frame como icono inicial del botón
           currentFrameIndexSignUp = 0;

           // Inicia un temporizador para cambiar automáticamente los frames
           int delayS = 10; // Intervalo en milisegundos entre cada cambio de frame
           Timer timerS = new Timer(delayS, new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   botonFondoSignUp.doClick(); // Simula un clic en el botón para cambiar el frame
               }
           });
           timerS.start();
           
   		
   		        botonFondoSignUp = new JButton();
   		        botonFondoSignUp.setBounds(686, 349, 235, 164);
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
		labelRepetirPass.setBounds(488, 325, 130, 16);
		getContentPane().add(labelRepetirPass);

		txtRepetirPass = new JPasswordField();
		txtRepetirPass.setBounds(619, 320, 130, 26);
		getContentPane().add(txtRepetirPass);

		alert = new JLabel("");
		alert.setBounds(446, 397, 413, 16);
		getContentPane().add(alert);

		

	}

	public void hacerVisible() {
		setVisible(true);
	}

	public void hacerInisible() {
		setVisible(false);
	}
	public void setVistaLogin(VistaLogin x) {
		login=x;
		setControlador(x);
	}
	//Metodo que crea un nuevo controlador
	public void setControlador(VistaLogin x) {
		EscuchadorSignUp escuchador = new EscuchadorSignUp();
		escuchador.setVistaPrincipal(this, login);
		botonSignup.addActionListener(escuchador);
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
	
	private static ImageIcon scaleImageIcon(ImageIcon icon, int width, int height) {
        Image image = icon.getImage();
        Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }
}
