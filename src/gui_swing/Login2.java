package gui_swing;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Login2 {

	private JFrame frame;
	private JTextField txtEmail;
	private JLabel lblEmail;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login2 window = new Login2();
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
	public Login2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(29, 29,29));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{66, 238, 330, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 75, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("Papillon");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 72));
		lblNewLabel.setForeground(new Color(255, 215, 0));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.gridheight = 3;
		gbc_lblNewLabel.insets = new Insets(5, 0, 50, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblEmail_1 = new JLabel("E-mail");
		lblEmail_1.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblEmail_1.setForeground(new Color(255, 215, 0));
		GridBagConstraints gbc_lblEmail_1= new GridBagConstraints();
		gbc_lblEmail_1.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblEmail_1.insets = new Insets(10, 0, 5, 5);
		gbc_lblEmail_1.gridx = 1;
		gbc_lblEmail_1.gridy = 5;
		panel.add(lblEmail_1, gbc_lblEmail_1);
		
		txtEmail = new JTextField();
		txtEmail.setForeground(new Color(255, 215, 0));
		GridBagConstraints gbc_txtEmail = new GridBagConstraints();
		gbc_txtEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEmail.insets = new Insets(0, 0, 5, 5);
		gbc_txtEmail.gridx = 1;
		gbc_txtEmail.gridy = 6;
		panel.add(txtEmail, gbc_txtEmail);
		txtEmail.setColumns(25);
		
		JLabel lblPassword = new JLabel("Senha");
		lblPassword.setForeground(new Color(255, 215, 0));
		lblPassword.setFont(new Font("Segoe UI", Font.BOLD, 13));
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.anchor = GridBagConstraints.WEST;
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 1;
		gbc_lblPassword.gridy = 7;
		panel.add(lblPassword, gbc_lblPassword);
		
		JLabel lblNewLabel_1 = new JLabel("");
		ImageIcon img = new ImageIcon(Login2.class.getResource("/img/group-chat.png"));
		lblNewLabel_1.setIcon(new ImageIcon(img.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT)));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridheight = 8;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 3;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 1;
		gbc_passwordField.gridy = 8;
		panel.add(passwordField, gbc_passwordField);
		
		JButton btnNewButton = new JButton("New button");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 10;
		panel.add(btnNewButton, gbc_btnNewButton);
		
		JLabel lblTXT1 = new JLabel("Ainda não se inscreveu?");
		lblTXT1.setForeground(new Color(255, 215, 0));
		lblTXT1.setFont(new Font("Segoe UI", Font.BOLD, 13));
		GridBagConstraints gbc_lblTXT1 = new GridBagConstraints();
		gbc_lblTXT1.insets = new Insets(0, 0, 5, 5);
		gbc_lblTXT1.gridx = 2;
		gbc_lblTXT1.gridy = 11;
		panel.add(lblTXT1, gbc_lblTXT1);
		
		JLabel lblTXT2 = new JLabel("Cadastre-se já!");
		lblTXT2.setForeground(new Color(255, 215, 0));
		lblTXT2.setFont(new Font("Segoe UI", Font.BOLD, 13));
		GridBagConstraints gbc_lblTXT2 = new GridBagConstraints();
		gbc_lblTXT2.gridheight = 2;
		gbc_lblTXT2.insets = new Insets(0, 0, 5, 5);
		gbc_lblTXT2.gridx = 2;
		gbc_lblTXT2.gridy = 12;
		panel.add(lblTXT2, gbc_lblTXT2);
		
		JButton btnNewButton_1 = new JButton("FAZER CADASTRO");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 2;
		gbc_btnNewButton_1.gridy = 14;
		panel.add(btnNewButton_1, gbc_btnNewButton_1);
	}

}
