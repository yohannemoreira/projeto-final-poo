package gui_swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField txtEmail;
	private JPasswordField password;
	private JButton btnLogin;
	private JButton btnFrameRegistration;
	private JLabel lblNoSeInscreveu;
	private JLabel lblCadastreseJ;
	private JLabel imgButterfly;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(51, 51, 51));
		frame.setBackground(new Color(51, 51, 51));
		frame.getContentPane().setForeground(new Color(255, 255, 255));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 232, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 27, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JPanel panel = new JPanel();
		  panel.setBackground(Color.DARK_GRAY);
		  GridBagConstraints gbc_panel = new GridBagConstraints();
		  gbc_panel.insets = new Insets(50, 50, 5, 5);
		  gbc_panel.fill = GridBagConstraints.BOTH;
		  gbc_panel.gridx = 1;
		  gbc_panel.gridy = 1;
		  GridBagLayout gbl_panel = new GridBagLayout();
		  gbl_panel.columnWidths = new int[]{177, 74, 96, 0};
		  gbl_panel.rowHeights = new int[]{52, 0, 0, 0, 0, 0, 0, 0};
		  gbl_panel.columnWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		  gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		  panel.setLayout(gbl_panel);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblEmail.setForeground(new Color(255, 215, 0));
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 1;
		gbc_lblEmail.gridy = 6;
		frame.getContentPane().add(lblEmail, gbc_lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Segoe UI", Font.BOLD, 11));
		txtEmail.setToolTipText("");
		txtEmail.setBackground(new Color(204, 204, 204));
		GridBagConstraints gbc_txtEmail = new GridBagConstraints();
		gbc_txtEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEmail.insets = new Insets(0, 0, 5, 5);
		gbc_txtEmail.gridx = 1;
		gbc_txtEmail.gridy = 7;
		frame.getContentPane().add(txtEmail, gbc_txtEmail);

		txtEmail.setColumns(15);

		txtEmail.setColumns(10);
		
		JLabel label = new JLabel("");
		ImageIcon img = new ImageIcon(Login.class.getResource("/img/group-chat.png"));
		label.setIcon(new ImageIcon(img.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT)));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 0);
		
		gbc_label.gridheight = 8;
		gbc_label.gridx = 2;
		gbc_label.gridy = 4;
		frame.getContentPane().add(label, gbc_label);

		
		JLabel lblPassword = new JLabel("Senha");
		lblPassword.setForeground(new Color(255, 215, 0));
		lblPassword.setFont(new Font("Segoe UI", Font.BOLD, 13));
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 1;
		gbc_lblPassword.gridy = 8;
		frame.getContentPane().add(lblPassword, gbc_lblPassword);
		
		password = new JPasswordField();
		password.setHorizontalAlignment(SwingConstants.CENTER);
		password.setColumns(15);
		password.setBackground(new Color(204, 204, 204));
		GridBagConstraints gbc_password = new GridBagConstraints();
		gbc_password.insets = new Insets(0, 0, 5, 5);
		gbc_password.fill = GridBagConstraints.HORIZONTAL;
		gbc_password.gridx = 1;
		gbc_password.gridy = 9;
		frame.getContentPane().add(password, gbc_password);
		
		btnLogin = new JButton("ENTRAR");
		btnLogin.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_btnLogin = new GridBagConstraints();
		gbc_btnLogin.insets = new Insets(0, 0, 5, 5);
		gbc_btnLogin.gridx = 1;
		gbc_btnLogin.gridy = 11;
		frame.getContentPane().add(btnLogin, gbc_btnLogin);
		
		lblNoSeInscreveu = new JLabel("Não se inscreveu ainda?");
		lblNoSeInscreveu.setVerticalAlignment(SwingConstants.TOP);
		lblNoSeInscreveu.setHorizontalAlignment(SwingConstants.CENTER);
		lblNoSeInscreveu.setForeground(new Color(255, 215, 0));
		lblNoSeInscreveu.setFont(new Font("Segoe UI", Font.BOLD, 13));
		GridBagConstraints gbc_lblNoSeInscreveu = new GridBagConstraints();
		gbc_lblNoSeInscreveu.fill = GridBagConstraints.VERTICAL;
		gbc_lblNoSeInscreveu.insets = new Insets(0, 0, 5, 0);
		gbc_lblNoSeInscreveu.gridx = 2;
		gbc_lblNoSeInscreveu.gridy = 12;
		frame.getContentPane().add(lblNoSeInscreveu, gbc_lblNoSeInscreveu);
		
		lblCadastreseJ = new JLabel("Cadastre-se já!");
		lblCadastreseJ.setVerticalAlignment(SwingConstants.TOP);
		lblCadastreseJ.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastreseJ.setForeground(new Color(255, 215, 0));
		lblCadastreseJ.setFont(new Font("Segoe UI", Font.BOLD, 13));
		GridBagConstraints gbc_lblCadastreseJ = new GridBagConstraints();
		gbc_lblCadastreseJ.insets = new Insets(0, 0, 5, 0);
		gbc_lblCadastreseJ.gridx = 2;
		gbc_lblCadastreseJ.gridy = 13;
		frame.getContentPane().add(lblCadastreseJ, gbc_lblCadastreseJ);
		
		btnFrameRegistration = new JButton("FAZER CADASTRO");
		btnFrameRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnFrameRegistration = new GridBagConstraints();
		gbc_btnFrameRegistration.insets = new Insets(0, 0, 5, 0);
		gbc_btnFrameRegistration.gridx = 2;
		gbc_btnFrameRegistration.gridy = 14;
		frame.getContentPane().add(btnFrameRegistration, gbc_btnFrameRegistration);
		ImageIcon img2 = new ImageIcon(Login.class.getResource("/img/msn.png"));
		
		imgButterfly = new JLabel("");
		imgButterfly.setHorizontalAlignment(SwingConstants.LEFT);
		imgButterfly.setIcon(new ImageIcon(img2.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
		GridBagConstraints gbc_imgButterfly = new GridBagConstraints();
		gbc_imgButterfly.anchor = GridBagConstraints.SOUTHWEST;
		gbc_imgButterfly.insets = new Insets(0, 0, 0, 5);
		gbc_imgButterfly.gridx = 1;
		gbc_imgButterfly.gridy = 19;
		frame.getContentPane().add(imgButterfly, gbc_imgButterfly);
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public ImageIcon redimensionar(JLabel jLabel, int xLargura, int yAltura){
	       
        ImageIcon img = new ImageIcon (jLabel.getIcon().toString());  
        img.setImage(img.getImage().getScaledInstance(xLargura, yAltura, 100));
       
        return img;
    }

}
