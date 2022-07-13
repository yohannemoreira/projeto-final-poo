package gui_swing;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JList;
import javax.swing.JSeparator;
import javax.swing.ListModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Profile {

	private JFrame frame;
	private Settings frameReg;
	private Login2 login;
	private  static String email;
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
					Profile window = new Profile(email, name, course, semester, password, followers);
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

	public Profile(String email, String name, String course, String semester, String password,
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
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(29,29,29));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{40, 415, 55, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 295, 61, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton btnSearch = new JButton("PESQUISAR");
		btnSearch.setForeground(new Color(255, 215, 0));
		btnSearch.setBackground(new Color(29, 29, 29));
		GridBagConstraints gbc_btnSearch = new GridBagConstraints();
		gbc_btnSearch.insets = new Insets(0, 0, 5, 0);
		gbc_btnSearch.gridx = 2;
		gbc_btnSearch.gridy = 0;
		panel.add(btnSearch, gbc_btnSearch);
		
		JLabel lblUser = new JLabel(name);
		lblUser.setFont(new Font("Segoe UI", Font.BOLD, 40));
		lblUser.setForeground(new Color(255, 215, 0));
		GridBagConstraints gbc_lblUser = new GridBagConstraints();
		gbc_lblUser.insets = new Insets(0, 0, 5, 5);
		gbc_lblUser.gridx = 1;
		gbc_lblUser.gridy = 1;
		panel.add(lblUser, gbc_lblUser);
		
		JLabel lblFollowers = new JLabel(followers + " seguidores");
		lblFollowers.setForeground(new Color(255,215,0));
		lblFollowers.setFont(new Font("Segoe UI", Font.BOLD, 12));
		GridBagConstraints gbc_lblFollowers = new GridBagConstraints();
		gbc_lblFollowers.insets = new Insets(0, 0, 5, 0);
		gbc_lblFollowers.gridx = 2;
		gbc_lblFollowers.gridy = 1;
		panel.add(lblFollowers, gbc_lblFollowers);
		
		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridx = 1;
		gbc_separator.gridy = 2;
		panel.add(separator, gbc_separator);
		
		JLabel lblCourse = new JLabel(course);
		lblCourse.setForeground(new Color(255, 215, 0));
		lblCourse.setFont(new Font("Segoe UI", Font.BOLD, 18));
		GridBagConstraints gbc_lblCourse = new GridBagConstraints();
		gbc_lblCourse.insets = new Insets(0, 0, 5, 5);
		gbc_lblCourse.gridx = 1;
		gbc_lblCourse.gridy = 3;
		panel.add(lblCourse, gbc_lblCourse);
		
		JButton btnSettings = new JButton("CONFIGURAÇÕES");
		
		btnSettings.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				frameReg = new Settings(email, name, course, semester, password, followers);
			}
		});
		btnSettings.setForeground(new Color(255, 215, 0));
		btnSettings.setBackground(Color.DARK_GRAY);
		GridBagConstraints gbc_btnSettings = new GridBagConstraints();
		gbc_btnSettings.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSettings.insets = new Insets(0, 0, 5, 0);
		gbc_btnSettings.gridx = 2;
		gbc_btnSettings.gridy = 3;
		panel.add(btnSettings, gbc_btnSettings);
		
		JLabel lblSemester = new JLabel(semester);
		lblSemester.setForeground(new Color(255, 215, 0));
		lblSemester.setFont(new Font("Segoe UI", Font.BOLD, 18));
		GridBagConstraints gbc_lblSemester = new GridBagConstraints();
		gbc_lblSemester.insets = new Insets(0, 0, 5, 5);
		gbc_lblSemester.gridx = 1;
		gbc_lblSemester.gridy = 4;
		panel.add(lblSemester, gbc_lblSemester);
		
		JButton btnOut = new JButton("SAIR");
		btnOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				login = new Login2();
			}
		});
		btnOut.setBackground(Color.DARK_GRAY);
		btnOut.setForeground(new Color(255,215,0));
		GridBagConstraints gbc_btnOut = new GridBagConstraints();
		gbc_btnOut.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnOut.insets = new Insets(0, 0, 5, 0);
		gbc_btnOut.gridx = 2;
		gbc_btnOut.gridy = 4;
		panel.add(btnOut, gbc_btnOut);
		
		JLabel lblPosts = new JLabel("Publicações");
		lblPosts.setForeground(new Color(255, 215, 0));
		lblPosts.setFont(new Font("Segoe UI", Font.BOLD, 12));
		GridBagConstraints gbc_lblPosts = new GridBagConstraints();
		gbc_lblPosts.anchor = GridBagConstraints.WEST;
		gbc_lblPosts.insets = new Insets(0, 0, 5, 5);
		gbc_lblPosts.gridx = 1;
		gbc_lblPosts.gridy = 5;
		panel.add(lblPosts, gbc_lblPosts);
	
		JList list = new JList();
		list.setBackground(Color.LIGHT_GRAY);
		DefaultListModel model = new DefaultListModel();
		model.addElement("Teste");
		
		JButton btnExam = new JButton("CADASTRAR ATIVIDADES");
		btnExam.setForeground(new Color(255, 215, 0));
		btnExam.setBackground(Color.DARK_GRAY);
		GridBagConstraints gbc_btnExam = new GridBagConstraints();
		gbc_btnExam.anchor = GridBagConstraints.NORTH;
		gbc_btnExam.insets = new Insets(0, 0, 5, 0);
		gbc_btnExam.gridx = 2;
		gbc_btnExam.gridy = 5;
		panel.add(btnExam, gbc_btnExam);
		list.setModel(model);
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.insets = new Insets(0, 0, 5, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 1;
		gbc_list.gridy = 6;
		panel.add(list, gbc_list);
		
		JTextArea textArea = new JTextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.insets = new Insets(0, 0, 0, 5);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 1;
		gbc_textArea.gridy = 7;
		panel.add(textArea, gbc_textArea);
		
		JButton btnFollow_2_1 = new JButton("SEGUIR");
		btnFollow_2_1.setForeground(new Color(255, 215, 0));
		btnFollow_2_1.setBackground(Color.DARK_GRAY);
		GridBagConstraints gbc_btnFollow_2_1 = new GridBagConstraints();
		gbc_btnFollow_2_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnFollow_2_1.gridx = 2;
		gbc_btnFollow_2_1.gridy = 7;
		panel.add(btnFollow_2_1, gbc_btnFollow_2_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(29,29,29));
		frame.setJMenuBar(menuBar);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		menuBar.add(mntmNewMenuItem);
		
		frame.setVisible(true);
	}

}
