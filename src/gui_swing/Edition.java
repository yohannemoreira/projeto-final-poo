package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;

import account.exceptions.ExistingUserException;
import account.exceptions.NotFoundException;
import account.exceptions.RegisteredAccountException;
import account.facade.FacadeAccount;

public class Edition{

	private JFrame frame;
	private static String email;
	private  static String name;
	private  static String course;
	private  static String semester;
	private  static String password;
	private  static String followers;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Edition window = new Edition(email, name, course, semester, password, followers);
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
	public Edition(String email, String name, String course, String semester, String password,
			String followers) {
		super();
		this.email = email;
		this.name = name;
		this.course = course;
		this.semester = semester;
		this.password = password;
		this.followers = followers;
		initialize();
	}
	
	public JFrame getFrame() {
		return this.frame;
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 50, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 1;
		frame.getContentPane().add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel Edit = new JLabel("Editar");
		GridBagConstraints gbc_Edit = new GridBagConstraints();
		gbc_Edit.insets = new Insets(0, 0, 5, 5);
		gbc_Edit.gridx = 0;
		gbc_Edit.gridy = 0;
		panel.add(Edit, gbc_Edit);
		Edit.setFont(new Font("Tahoma", Font.PLAIN, 44));
		Edit.setForeground(Color.YELLOW);
		Edit.setBackground(Color.YELLOW);
		
		JLabel Edit_1 = new JLabel("Editar");
		GridBagConstraints gbc_Edit_1 = new GridBagConstraints();
		gbc_Edit_1.insets = new Insets(0, 0, 5, 0);
		gbc_Edit_1.gridx = 2;
		gbc_Edit_1.gridy = 0;
		panel.add(Edit_1, gbc_Edit_1);
		Edit_1.setForeground(Color.DARK_GRAY);
		Edit_1.setFont(new Font("Tahoma", Font.PLAIN, 44));
		Edit_1.setBackground(Color.DARK_GRAY);
		
		JButton nameEditButton = new JButton("Nome");
		GridBagConstraints gbc_nameEditButton = new GridBagConstraints();
		gbc_nameEditButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_nameEditButton.insets = new Insets(0, 0, 5, 5);
		gbc_nameEditButton.gridx = 0;
		gbc_nameEditButton.gridy = 1;
		panel.add(nameEditButton, gbc_nameEditButton);
		nameEditButton.setForeground(Color.YELLOW);
		nameEditButton.setBackground(Color.DARK_GRAY);
		
		JButton emailEditButton = new JButton("E-mail");
		GridBagConstraints gbc_emailEditButton = new GridBagConstraints();
		gbc_emailEditButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_emailEditButton.insets = new Insets(0, 0, 5, 0);
		gbc_emailEditButton.gridx = 2;
		gbc_emailEditButton.gridy = 1;
		panel.add(emailEditButton, gbc_emailEditButton);
		emailEditButton.setForeground(Color.YELLOW);
		emailEditButton.setBackground(Color.DARK_GRAY);
		
		JButton userEditButton = new JButton("User");
		GridBagConstraints gbc_userEditButton = new GridBagConstraints();
		gbc_userEditButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_userEditButton.insets = new Insets(0, 0, 5, 5);
		gbc_userEditButton.gridx = 0;
		gbc_userEditButton.gridy = 2;
		panel.add(userEditButton, gbc_userEditButton);
		userEditButton.setForeground(Color.YELLOW);
		userEditButton.setBackground(Color.DARK_GRAY);
		
		JButton courseEditButton = new JButton("Curso");
		GridBagConstraints gbc_courseEditButton = new GridBagConstraints();
		gbc_courseEditButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_courseEditButton.insets = new Insets(0, 0, 5, 0);
		gbc_courseEditButton.gridx = 2;
		gbc_courseEditButton.gridy = 2;
		panel.add(courseEditButton, gbc_courseEditButton);
		courseEditButton.setForeground(Color.YELLOW);
		courseEditButton.setBackground(Color.DARK_GRAY);
		
		JButton passwordEditButton = new JButton("Senha");
		GridBagConstraints gbc_passwordEditButton = new GridBagConstraints();
		gbc_passwordEditButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordEditButton.insets = new Insets(0, 0, 5, 5);
		gbc_passwordEditButton.gridx = 0;
		gbc_passwordEditButton.gridy = 4;
		panel.add(passwordEditButton, gbc_passwordEditButton);
		passwordEditButton.setForeground(Color.YELLOW);
		passwordEditButton.setBackground(Color.DARK_GRAY);
		
		JButton semesterEditButton = new JButton("Semestre");
		GridBagConstraints gbc_semesterEditButton = new GridBagConstraints();
		gbc_semesterEditButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_semesterEditButton.insets = new Insets(0, 0, 5, 0);
		gbc_semesterEditButton.gridx = 2;
		gbc_semesterEditButton.gridy = 4;
		panel.add(semesterEditButton, gbc_semesterEditButton);
		semesterEditButton.setForeground(Color.YELLOW);
		semesterEditButton.setBackground(Color.DARK_GRAY);
		
		JButton backEditButton_1_1 = new JButton("Voltar");
		GridBagConstraints gbc_backEditButton_1_1 = new GridBagConstraints();
		gbc_backEditButton_1_1.insets = new Insets(0, 0, 0, 5);
		gbc_backEditButton_1_1.gridx = 1;
		gbc_backEditButton_1_1.gridy = 5;
		panel.add(backEditButton_1_1, gbc_backEditButton_1_1);
		backEditButton_1_1.setForeground(Color.YELLOW);
		backEditButton_1_1.setBackground(Color.DARK_GRAY);
		
		nameEditButton.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent event){
				if(event.getSource() == nameEditButton) {
					try {
						String retorno = JOptionPane.showInputDialog("Digite o novo nome:");
						FacadeAccount.getInstance().getAccounts().findAccount(email).setName(retorno);
						JOptionPane.showMessageDialog(null, "Novo nome cadastrado!",
								"Sucesso!!!", JOptionPane.INFORMATION_MESSAGE);
					} catch (NotFoundException e) {
						JOptionPane.showMessageDialog(null, "Erro! \n Refaça o login!",
								"Erro ao editar nome", JOptionPane.WARNING_MESSAGE);
					}
					
				}
			}
		});
		
		userEditButton.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent event){
				if(event.getSource() == userEditButton) {
					try {
						String retorno = JOptionPane.showInputDialog("Digite o novo user:");
						FacadeAccount.getInstance().getAccounts().searchUser(retorno);
						JOptionPane.showMessageDialog(null, "Novo User cadastrado!",
								"Sucesso!!!", JOptionPane.INFORMATION_MESSAGE);
					} catch (ExistingUserException e) {
						JOptionPane.showMessageDialog(null, "User já cadastrado! \n Tente utilizar outro!",
								"Erro ao editar conta", JOptionPane.WARNING_MESSAGE);
					}
					
				}
			}
		});
		
		passwordEditButton.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent event){
				if(event.getSource() == passwordEditButton) {
					try {
						String retorno = JOptionPane.showInputDialog("Digite a nova senha:");
							FacadeAccount.getInstance().getAccounts().findAccount(email).setPassword(retorno);
							JOptionPane.showMessageDialog(null, "Nova senha cadastrada!",
									"Sucesso!!!", JOptionPane.INFORMATION_MESSAGE);
					} catch (NotFoundException e) {
						JOptionPane.showMessageDialog(null, "Erro! \n Refaça o login!",
								"Erro ao editar nome", JOptionPane.WARNING_MESSAGE);
					}
					
				}
			}
		});
		
		backEditButton_1_1.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent event){
				if(event.getSource() == backEditButton_1_1) {
					try {
						frame.dispose();
						Settings window = new Settings(email, name, course, semester, password, followers);
						window.getFrame().setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				}
			}
		});
		
		emailEditButton.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent event){
				if(event.getSource() == emailEditButton) {
					try {
						String retorno = JOptionPane.showInputDialog("Digite o novo e-mail:");
							FacadeAccount.getInstance().getAccounts().findAccount(email).setEmail(retorno);
							JOptionPane.showMessageDialog(null, "Novo e-mail cadastrado!",
									"Sucesso!!!", JOptionPane.INFORMATION_MESSAGE);
					} catch (NotFoundException e) {
						JOptionPane.showMessageDialog(null, "Erro! \n Refaça o login!",
								"Erro ao editar nome", JOptionPane.WARNING_MESSAGE);
					}
					
				}
			}
		});
		
		courseEditButton.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent event){
				if(event.getSource() == courseEditButton) {
					try {
						String retorno = JOptionPane.showInputDialog("Digite o novo curso:");
							FacadeAccount.getInstance().getAccounts().findAccount(email).setCourse(retorno);
							JOptionPane.showMessageDialog(null, "Novo curso cadastrado!",
									"Sucesso!!!", JOptionPane.INFORMATION_MESSAGE);
					} catch (NotFoundException e) {
						JOptionPane.showMessageDialog(null, "Erro! \n Refaça o login!",
								"Erro ao editar nome", JOptionPane.WARNING_MESSAGE);
					}
					
				}
			}
		});
		
		semesterEditButton.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent event){
				if(event.getSource() == semesterEditButton) {
					try {
						String retorno = JOptionPane.showInputDialog("Digite o novo semestre:");
							FacadeAccount.getInstance().getAccounts().findAccount(email).setSemester(retorno);
							JOptionPane.showMessageDialog(null, "Novo curso semestre!",
									"Sucesso!!!", JOptionPane.INFORMATION_MESSAGE);
					} catch (NotFoundException e) {
						JOptionPane.showMessageDialog(null, "Erro! \n Refaça o login!",
								"Erro ao editar nome", JOptionPane.WARNING_MESSAGE);
					}
					
				}
			}
		});
		
	}

}
