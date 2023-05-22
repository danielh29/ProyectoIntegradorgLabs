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
import mvc.control.loginBack;
import mvc.vistas.*;

public class VistaLogin extends JFrame {
	private JTextField txtUser;
	private JPasswordField txtPass;
	private JLabel alert;
	private JButton btn;
	private JButton btn_atras;
	private home home;
	private VistaPrincipal VistaPrincipal;
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
		
		//Cambia el icono de la ventana de Java
		ImageIcon icon = new ImageIcon("Imagenes/7.png");
		setIconImage(icon.getImage());
		
		
		JLabel labelUser = new JLabel("Usuario");
		labelUser.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 50));
		labelUser.setBounds(517, 374, 153, 46);
		getContentPane().add(labelUser);

		JLabel labelPass = new JLabel("Contraseña");
		labelPass.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 50));
		labelPass.setBounds(474, 482, 200, 62);
		getContentPane().add(labelPass);

		txtUser = new JTextField();
		txtUser.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtUser.setBounds(659, 375, 252, 45);
		getContentPane().add(txtUser);
		txtUser.setColumns(10);

		txtPass = new JPasswordField();
		txtPass.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtPass.setBounds(659, 494, 252, 45);
		getContentPane().add(txtPass);
		
		
//Botón atras
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
		
		
		
		//BOTÓN PRINCIPAL
  		btn = new JButton("");
  		btn.setBounds(601, 613, 167, 79);
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
        for (int i = 1; i <= 2; i++) {
            String imagePath = "ImagenesGifL/imagen (" + i + ").png";
            ImageIcon frame = new ImageIcon(imagePath);
            ImageIcon scaledFrame = scaleImageIcon(frame, ICON_WIDTH, ICON_HEIGHT);
            frames.add(scaledFrame);
        }

        // Configura el primer frame como icono inicial del botón
        currentFrameIndex = 0;

        // Inicia un temporizador para cambiar automáticamente los frames
        int delay = 3000; // Intervalo en milisegundos entre cada cambio de frame
        Timer timer = new Timer(delay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonFondo.doClick(); // Simula un clic en el botón para cambiar el frame
            }
        });
        timer.start();
        
		
		        botonFondo = new JButton();
		        botonFondo.setBounds(601, 613, 170, 70);
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
	public void setControlador2(VistaPrincipal vp) {
		loginBack escuchador = new loginBack();
		escuchador.setVistaPrincipal(this, vp);
		btn_atras.addActionListener(escuchador);
	}
	
	
	public void setHome(home x) {
		home = x;
		setControlador(x);
	}
	
	public void setVistaPrincipal (VistaPrincipal vp) {
		VistaPrincipal = vp;
		setControlador2(vp);
		
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
	
	public JButton getBtn_atras() {
		return btn_atras;
	}
	
	private static ImageIcon scaleImageIcon(ImageIcon icon, int width, int height) {
        Image image = icon.getImage();
        Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }

}
