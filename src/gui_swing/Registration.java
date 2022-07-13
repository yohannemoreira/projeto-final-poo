/**
 * Classe Registration.
 *
 * @author Yohanne
 * @version 1.0
 * <br>
 * Copyright (C) 2022 Universidade Federal do
Ceará.
 */
package gui_swing;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

import account.Account;
import account.AccountCollection;
import account.exceptions.NotFoundException;
import account.exceptions.RegisteredAccountException;
import account.facade.FacadeAccount;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.ComboBoxEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Registration {

	private JFrame frame;
	private JTextField txtEmail;
	private JTextField txtName;
	private JTextField txtUser;
	private JPasswordField txtPassword;
	private JTextField txtCourse;
	private JComboBox<String> cbSemester;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration window = new Registration();
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
	public Registration() {
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
		panel.setBackground(new Color(29, 29, 29));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(50, 50, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 1;
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 35, 230, 0, 230, 35, 0 };
		gbl_panel.rowHeights = new int[] { 52, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		frame.getContentPane().add(panel);

		JLabel lblTitle = new JLabel("Cadastro");
		lblTitle.setForeground(new Color(255, 215, 0));
		lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 72));
		GridBagConstraints gbc_lblTitle = new GridBagConstraints();
		gbc_lblTitle.anchor = GridBagConstraints.WEST;
		gbc_lblTitle.gridheight = 2;
		gbc_lblTitle.gridwidth = 3;
		gbc_lblTitle.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitle.gridx = 1;
		gbc_lblTitle.gridy = 1;
		panel.add(lblTitle, gbc_lblTitle);

		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblEmail.setForeground(new Color(255, 215, 0));
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.WEST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 1;
		gbc_lblEmail.gridy = 3;
		panel.add(lblEmail, gbc_lblEmail);

		JLabel lblName = new JLabel("Nome");
		lblName.setForeground(new Color(255, 215, 0));
		lblName.setFont(new Font("Segoe UI", Font.BOLD, 13));
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.anchor = GridBagConstraints.WEST;
		gbc_lblName.insets = new Insets(0, 0, 5, 5);
		gbc_lblName.gridx = 3;
		gbc_lblName.gridy = 3;
		panel.add(lblName, gbc_lblName);

		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Segoe UI", Font.BOLD, 11));
		txtEmail.setToolTipText("");
		txtEmail.setBackground(new Color(204, 204, 204));
		GridBagConstraints gbc_txtEmail = new GridBagConstraints();
		gbc_txtEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEmail.insets = new Insets(0, 0, 5, 5);
		gbc_txtEmail.gridx = 1;
		gbc_txtEmail.gridy = 4;
		panel.add(txtEmail, gbc_txtEmail);
		txtEmail.setColumns(25);

		txtName = new JTextField();
		txtName.setToolTipText("");
		txtName.setFont(new Font("Segoe UI", Font.BOLD, 11));
		txtName.setColumns(25);
		txtName.setBackground(new Color(204, 204, 204));
		GridBagConstraints gbc_txtName = new GridBagConstraints();
		gbc_txtName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtName.insets = new Insets(0, 0, 5, 5);
		gbc_txtName.gridx = 3;
		gbc_txtName.gridy = 4;
		panel.add(txtName, gbc_txtName);

		JLabel lblPassword = new JLabel("Senha");
		lblPassword.setForeground(new Color(255, 215, 0));
		lblPassword.setFont(new Font("Segoe UI", Font.BOLD, 13));
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.anchor = GridBagConstraints.WEST;
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 1;
		gbc_lblPassword.gridy = 5;
		panel.add(lblPassword, gbc_lblPassword);

		JLabel lblUser = new JLabel("Usuário");
		lblUser.setForeground(new Color(255, 215, 0));
		lblUser.setFont(new Font("Segoe UI", Font.BOLD, 13));
		GridBagConstraints gbc_lblUser = new GridBagConstraints();
		gbc_lblUser.anchor = GridBagConstraints.WEST;
		gbc_lblUser.insets = new Insets(0, 0, 5, 5);
		gbc_lblUser.gridx = 3;
		gbc_lblUser.gridy = 5;
		panel.add(lblUser, gbc_lblUser);

		txtPassword = new JPasswordField();
		txtPassword.setBackground(new Color(204, 204, 204));
		GridBagConstraints gbc_txtPassword = new GridBagConstraints();
		gbc_txtPassword.insets = new Insets(0, 0, 5, 5);
		gbc_txtPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPassword.gridx = 1;
		gbc_txtPassword.gridy = 6;
		panel.add(txtPassword, gbc_txtPassword);

		txtUser = new JTextField();
		txtUser.setToolTipText("");
		txtUser.setFont(new Font("Segoe UI", Font.BOLD, 11));
		txtUser.setColumns(25);
		txtUser.setBackground(new Color(204, 204, 204));
		GridBagConstraints gbc_txtUser = new GridBagConstraints();
		gbc_txtUser.insets = new Insets(0, 0, 5, 5);
		gbc_txtUser.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUser.gridx = 3;
		gbc_txtUser.gridy = 6;
		panel.add(txtUser, gbc_txtUser);

		JLabel lblCourse = new JLabel("Curso");
		lblCourse.setForeground(new Color(255, 215, 0));
		lblCourse.setFont(new Font("Segoe UI", Font.BOLD, 13));
		GridBagConstraints gbc_lblCourse = new GridBagConstraints();
		gbc_lblCourse.anchor = GridBagConstraints.WEST;
		gbc_lblCourse.insets = new Insets(0, 0, 5, 5);
		gbc_lblCourse.gridx = 1;
		gbc_lblCourse.gridy = 7;
		panel.add(lblCourse, gbc_lblCourse);

		JLabel lblSemester = new JLabel("Semestre");
		lblSemester.setForeground(new Color(255, 215, 0));
		lblSemester.setFont(new Font("Segoe UI", Font.BOLD, 13));
		GridBagConstraints gbc_lblSemester = new GridBagConstraints();
		gbc_lblSemester.anchor = GridBagConstraints.WEST;
		gbc_lblSemester.insets = new Insets(0, 0, 5, 5);
		gbc_lblSemester.gridx = 3;
		gbc_lblSemester.gridy = 7;
		panel.add(lblSemester, gbc_lblSemester);

		txtCourse = new JTextField();
		txtCourse.setToolTipText("");
		txtCourse.setFont(new Font("Segoe UI", Font.BOLD, 11));
		txtCourse.setColumns(25);
		txtCourse.setBackground(new Color(204, 204, 204));
		GridBagConstraints gbc_txtCourse = new GridBagConstraints();
		gbc_txtCourse.insets = new Insets(0, 0, 5, 5);
		gbc_txtCourse.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCourse.gridx = 1;
		gbc_txtCourse.gridy = 8;
		panel.add(txtCourse, gbc_txtCourse);

		cbSemester = new JComboBox<String>();
		cbSemester.setModel(new DefaultComboBoxModel(new String[] { "Selecione um semestre" }));
		cbSemester.setBackground(new Color(204, 204, 204));
		for (int i = 0; i < 12; i++) {
			cbSemester.addItem((i + 1) + "° semestre");
		}
		cbSemester.addItem("Outro");
		GridBagConstraints gbc_cbSemester = new GridBagConstraints();
		gbc_cbSemester.insets = new Insets(0, 0, 5, 5);
		gbc_cbSemester.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbSemester.gridx = 3;
		gbc_cbSemester.gridy = 8;
		panel.add(cbSemester, gbc_cbSemester);

		JButton btnRegistration = new JButton("CADASTRAR");
		btnRegistration.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				addActionPerformed(e);
			}
		});
		GridBagConstraints gbc_btnRegistration = new GridBagConstraints();
		gbc_btnRegistration.insets = new Insets(0, 0, 5, 5);
		gbc_btnRegistration.fill = GridBagConstraints.VERTICAL;
		gbc_btnRegistration.gridwidth = 3;
		gbc_btnRegistration.gridx = 1;
		gbc_btnRegistration.gridy = 10;
		panel.add(btnRegistration, gbc_btnRegistration);

		JLabel lblImg3 = new JLabel();
		ImageIcon img = new ImageIcon(Registration.class.getResource("/img/group.png"));
		lblImg3.setIcon(new ImageIcon(img.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT)));
		GridBagConstraints gbc_lblImg3 = new GridBagConstraints();
		gbc_lblImg3.gridheight = 6;
		gbc_lblImg3.gridwidth = 3;
		gbc_lblImg3.insets = new Insets(0, 0, 0, 5);
		gbc_lblImg3.gridx = 1;
		gbc_lblImg3.gridy = 12;
		panel.add(lblImg3, gbc_lblImg3);

	}

	protected void addActionPerformed(ActionEvent evt) {
		String name = txtName.getText();
		String user = txtUser.getText();
		String email = txtEmail.getText();
		String course = txtCourse.getText();
		String password = txtPassword.getText();
		String semester = cbSemester.getSelectedItem().toString();

		if (txtEmail.getText().isEmpty() || txtUser.getText().isEmpty() || txtName.getText().isEmpty()
				|| txtCourse.getText().isEmpty() || txtPassword.getText().isEmpty()
				|| (cbSemester.getSelectedItem().toString() == "Selecione um semestre")) {
			JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Erro ao criar conta",
					JOptionPane.WARNING_MESSAGE);
		}
		
// resolver erro do user -> passar pro wildnei
		else {
			try {
				FacadeAccount.getInstance().addAccount(new Account(name, user, password, email, course, semester));

			} catch (RegisteredAccountException e) {
				JOptionPane.showMessageDialog(null, "E-mail já cadastrado! \n Tente utilizar outro!",
						"Erro ao criar conta", JOptionPane.WARNING_MESSAGE);
			}
		}
	}

}
