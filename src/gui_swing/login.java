package gui_swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class login {

	private JFrame frame;
	private JTextField txtEmail;
	private JPasswordField password;
	private JButton btnLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
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
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 27, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
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
		
		btnLogin = new JButton("New button");
		btnLogin.setBackground(new Color(204,204,204));
		GridBagConstraints gbc_btnLogin = new GridBagConstraints();
		gbc_btnLogin.insets = new Insets(0, 0, 0, 5);
		gbc_btnLogin.gridx = 1;
		gbc_btnLogin.gridy = 11;
		frame.getContentPane().add(btnLogin, gbc_btnLogin);
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public ImageIcon redimensionar(JLabel jLabel, int xLargura, int yAltura){
	       
        ImageIcon img = new ImageIcon (jLabel.getIcon().toString());  
        img.setImage(img.getImage().getScaledInstance(xLargura, yAltura, 100));
       
        return img;
    }

}
