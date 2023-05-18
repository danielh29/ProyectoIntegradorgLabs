package mvc.vistas;

import java.awt.*;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

import mvc.control.EscuchadorLogIn;
import mvc.control.EscuchadorSignUp;

public class VistaLogin extends JFrame {
	private JTextField txtUser;
	private JPasswordField txtPass;
	private JLabel alert;
	private JButton btn;
	private home home;
    private static JButton botonFondo;
    private static List<ImageIcon> frames;
    private static int currentFrameIndex;
    private static final int ICON_WIDTH = 167;
    private static final int ICON_HEIGHT = 79;
	EscuchadorLogIn comprobar;
	
	public VistaLogin() {
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
		
		
		//BOTÓN PRINCIPAL
  		btn = new JButton("");
  		btn.setBounds(601, 340, 167, 79);
  		getContentPane().add(btn);
          // Establecer la opacidad del botón
          btn.setOpaque(false);
          btn.setContentAreaFilled(false);
          btn.setBorderPainted(false);

          // Establecer el fondo del botón como transparente
          btn.setBackground(new Color(0, 0, 0, 0));
        
        //BOTÖN FONDO
		frames = new ArrayList<>();

        // Carga las imágenes del GIF en una lista
        for (int i = 0; i <= 13; i++) {
            String imagePath = "ImagenesGifL/imagen (" + i + ").png";
            ImageIcon frame = new ImageIcon(imagePath);
            ImageIcon scaledFrame = scaleImageIcon(frame, ICON_WIDTH, ICON_HEIGHT);
            frames.add(scaledFrame);
        }

        // Configura el primer frame como icono inicial del botón
        currentFrameIndex = 0;

        // Inicia un temporizador para cambiar automáticamente los frames
        int delay = 10; // Intervalo en milisegundos entre cada cambio de frame
        Timer timer = new Timer(delay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonFondo.doClick(); // Simula un clic en el botón para cambiar el frame
            }
        });
        timer.start();
        
		
		        botonFondo = new JButton();
		        botonFondo.setBounds(601, 339, 170, 70);
		        botonFondo.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                // Cambia la imagen del botón al siguiente frame
		                currentFrameIndex = (currentFrameIndex + 1) % frames.size();
		                botonFondo.setIcon(frames.get(currentFrameIndex));
		            }
		        });
		        botonFondo.setIcon(frames.get(currentFrameIndex));
		        
		          botonFondo.setOpaque(false);
		          botonFondo.setContentAreaFilled(false);
		          botonFondo.setBorderPainted(false);
		          botonFondo.setBackground(new Color(0, 0, 0, 0));
		        
		        getContentPane().add(botonFondo);
		        
		        alert = new JLabel("");
				alert.setBounds(486, 450, 337, 16);
				getContentPane().add(alert);

		
	}

	public void hacerVisible() {
		setVisible(true);
	}

	public void hacerInisible() {
		setVisible(false);
	}
	//Metodo que crea un nuevo controlador
	public void setControlador(home x) {
		EscuchadorLogIn escuchador = new EscuchadorLogIn();
		escuchador.setVistaPrincipal(this, x);
		btn.addActionListener(escuchador);
	}
	public void setHome(home x) {
		home = x;
		setControlador(x);
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
	
	private static ImageIcon scaleImageIcon(ImageIcon icon, int width, int height) {
        Image image = icon.getImage();
        Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }

}
