package gui_swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JPanel;

import account.facade.FacadeAccount;

import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.Button;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;

public class Settings{

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
					Settings window = new Settings(email, name, course, semester, password, followers);
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
	public Settings(String email, String name, String course, String semester, String password,
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
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setAlwaysOnTop(true);
		frame.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		GridBagLayout gridBagLayout = new GridBagLayout();

		frame.setBounds(100, 100, 600, 400);
		gridBagLayout.columnWidths = new int[]{4, 0, 0, 0, 0, 378, 0};
		gridBagLayout.rowHeights = new int[]{213, 0, 45, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 170, 0, 0);
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		frame.getContentPane().add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {0, 30, 30, 30, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel tSettings = new JLabel("Configurações");
		tSettings.setFont(new Font("Tahoma", Font.PLAIN, 25));
		tSettings.setForeground(Color.YELLOW);
		tSettings.setBackground(new Color(255, 255, 0));
		GridBagConstraints gbc_tSettings = new GridBagConstraints();
		gbc_tSettings.gridwidth = 2;
		gbc_tSettings.insets = new Insets(0, 0, 5, 5);
		gbc_tSettings.gridx = 0;
		gbc_tSettings.gridy = 0;
		panel.add(tSettings, gbc_tSettings);
		
		JButton editAccount = new JButton("Editar conta");
		editAccount.setBackground(Color.DARK_GRAY);
		editAccount.setForeground(Color.YELLOW);
		GridBagConstraints gbc_editAccount = new GridBagConstraints();
		gbc_editAccount.fill = GridBagConstraints.HORIZONTAL;
		gbc_editAccount.anchor = GridBagConstraints.WEST;
		gbc_editAccount.insets = new Insets(0, 0, 5, 5);
		gbc_editAccount.gridx = 0;
		gbc_editAccount.gridy = 1;
		panel.add(editAccount, gbc_editAccount);
		
		
		JButton status = new JButton("Ver status");
		status.setForeground(Color.YELLOW);
		status.setBackground(Color.DARK_GRAY);
		GridBagConstraints gbc_status = new GridBagConstraints();
		gbc_status.fill = GridBagConstraints.HORIZONTAL;
		gbc_status.insets = new Insets(0, 0, 5, 5);
		gbc_status.gridx = 0;
		gbc_status.gridy = 2;
		panel.add(status, gbc_status);
		
		JButton removeAccount = new JButton("Excluir conta");
		removeAccount.setForeground(Color.YELLOW);
		removeAccount.setBackground(Color.DARK_GRAY);
		GridBagConstraints gbc_removeAccount = new GridBagConstraints();
		gbc_removeAccount.fill = GridBagConstraints.HORIZONTAL;
		gbc_removeAccount.insets = new Insets(0, 0, 5, 5);
		gbc_removeAccount.gridx = 0;
		gbc_removeAccount.gridy = 3;
		panel.add(removeAccount, gbc_removeAccount);
		
		JButton back = new JButton("Voltar");
		back.setForeground(Color.YELLOW);
		back.setBackground(Color.DARK_GRAY);
		GridBagConstraints gbc_back = new GridBagConstraints();
		gbc_back.fill = GridBagConstraints.HORIZONTAL;
		gbc_back.insets = new Insets(0, 0, 5, 5);
		gbc_back.gridx = 0;
		gbc_back.gridy = 4;
		panel.add(back, gbc_back);
		
		JButton exit = new JButton("Sair");
		exit.setForeground(Color.YELLOW);
		exit.setBackground(Color.DARK_GRAY);
		GridBagConstraints gbc_exit = new GridBagConstraints();
		gbc_exit.fill = GridBagConstraints.HORIZONTAL;
		gbc_exit.ipadx = 50;
		gbc_exit.insets = new Insets(0, 0, 5, 5);
		gbc_exit.gridx = 0;
		gbc_exit.gridy = 5;
		panel.add(exit, gbc_exit);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
		gbc_horizontalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut.gridx = 1;
		gbc_horizontalStrut.gridy = 0;
		frame.getContentPane().add(horizontalStrut, gbc_horizontalStrut);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		panel_1.setBackground(Color.DARK_GRAY);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_1.gridx = 2;
		gbc_panel_1.gridy = 0;
		frame.getContentPane().add(panel_1, gbc_panel_1);
		
		JLabel settings = new JLabel("");
		ImageIcon image = new ImageIcon(Exam.class.getResource("/img/group.png"));
		settings.setIcon(new ImageIcon(image.getImage().getScaledInstance(130, 120, Image.SCALE_DEFAULT)));
		panel_1.add(settings);
		
		//event registraastion
				editAccount.addActionListener( new ActionListener() {
					public void actionPerformed(ActionEvent event){
						if(event.getSource() == editAccount) {
							try {
								frame.dispose();
								Exam window = new Exam(email);
								window.getFrame().setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
							
						}
					}
				});
		//event status
				status.addActionListener( new ActionListener() {
					public void actionPerformed(ActionEvent event){
						if(event.getSource() == status) {
							status.setText("tchau");
						}
					}
				});
		
				//event remove account verificar função de exclusão de conta
				removeAccount.addActionListener( new ActionListener() {
					public void actionPerformed(ActionEvent event){
						if(event.getSource() == removeAccount) {
							FacadeAccount.getInstance().getAccounts().getProfiles().remove(email);
							frame.dispose();
						}
					}
				});
				
				//event back verificar para onde ira retornar
				back.addActionListener( new ActionListener() {
					public void actionPerformed(ActionEvent event){
						if(event.getSource() == back) {
							frame.dispose();
							Profile window = new Profile(email, name, course, semester, password, followers);
						}
					}
				});
				
				//event exit
				exit.addActionListener( new ActionListener() {
					public void actionPerformed(ActionEvent event){
						if(event.getSource() == exit) {
							frame.dispose();
						}
					}
				});
				
frame.setVisible(true);
				
	}

	//event
	

}
