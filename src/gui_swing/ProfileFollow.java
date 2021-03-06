package gui_swing;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JList;
import javax.swing.JSeparator;
import javax.swing.ListModel;
import account.exceptions.NotFoundException;
import account.facade.FacadeAccount;
import post.Post;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.TextArea;
import javax.swing.JTextPane;
import java.awt.FlowLayout;

public class ProfileFollow {

	private JFrame frame;
	private Settings frameReg;
	private Login2 login;
	private  static String email;
	private  static String name;
	private  static String course;
	private  static String semester;
	private  static String password;
	private  static String followers;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JLabel post1;
	private ShowPosts2 showPost;
	private Exam exams;
	private ExamList examsList;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProfileFollow window = new ProfileFollow(email, name, course, semester, password, followers);
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

	public ProfileFollow(String email, String name, String course, String semester, String password,
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
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 50, 49, 50, 50, 50, 61, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
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
		
		JLabel lblSemester = new JLabel(semester);
		lblSemester.setForeground(new Color(255, 215, 0));
		lblSemester.setFont(new Font("Segoe UI", Font.BOLD, 18));
		GridBagConstraints gbc_lblSemester = new GridBagConstraints();
		gbc_lblSemester.insets = new Insets(0, 0, 5, 5);
		gbc_lblSemester.gridx = 1;
		gbc_lblSemester.gridy = 4;
		panel.add(lblSemester, gbc_lblSemester);
		
		JLabel lblPosts = new JLabel("Publica????es");
		lblPosts.setForeground(new Color(255, 215, 0));
		lblPosts.setFont(new Font("Segoe UI", Font.BOLD, 12));
		GridBagConstraints gbc_lblPosts = new GridBagConstraints();
		gbc_lblPosts.anchor = GridBagConstraints.WEST;
		gbc_lblPosts.insets = new Insets(0, 0, 5, 5);
		gbc_lblPosts.gridx = 1;
		gbc_lblPosts.gridy = 5;
		panel.add(lblPosts, gbc_lblPosts);
		DefaultListModel model = new DefaultListModel();
		model.addElement("Teste");
		
		panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 6;
		panel.add(panel_1, gbc_panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnExams = new JButton("Ver Atividades");
		btnExams.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showPosts();
				listarActionPerformed(e);
			}
		});
		btnExams.setForeground(new Color(255, 215, 0));
		btnExams.setBackground(new Color(29, 29, 29));
		GridBagConstraints gbc_btnExams = new GridBagConstraints();
		gbc_btnExams.insets = new Insets(0, 0, 5, 0);
		gbc_btnExams.gridx = 2;
		gbc_btnExams.gridy = 6;
		panel.add(btnExams, gbc_btnExams);
		
		panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 7;
		panel.add(panel_2, gbc_panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.insets = new Insets(0, 0, 5, 5);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 1;
		gbc_panel_3.gridy = 8;
		panel.add(panel_3, gbc_panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		panel_4 = new JPanel();
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.insets = new Insets(0, 0, 5, 5);
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 1;
		gbc_panel_4.gridy = 9;
		panel.add(panel_4, gbc_panel_4);
		panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		panel_5 = new JPanel();
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.insets = new Insets(0, 0, 5, 5);
		gbc_panel_5.fill = GridBagConstraints.BOTH;
		gbc_panel_5.gridx = 1;
		gbc_panel_5.gridy = 10;
		panel.add(panel_5, gbc_panel_5);
		panel_5.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnShowPost = new JButton("Ver mais publica????es");
		btnShowPost.setForeground(new Color(255, 215, 0));
		btnShowPost.setBackground(new Color(29, 29, 29));
		btnShowPost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		GridBagConstraints gbc_btnShowPost = new GridBagConstraints();
		gbc_btnShowPost.insets = new Insets(0, 0, 5, 0);
		gbc_btnShowPost.gridx = 2;
		gbc_btnShowPost.gridy = 10;
		panel.add(btnShowPost, gbc_btnShowPost);
		
		frame.setVisible(true);
	}
	
	
	protected void showPosts() {
		ArrayList <Post> posts;
		
		try {
			posts = FacadeAccount.getInstance().findAccount(email).getPosts().getPostCollection();
			int sizeAux = posts.size();
			// JLabel post1 = new JLabel(posts.get(0).getSubtitle());			
			// panel_1.add(post1);
			panel_1.removeAll();
			panel_2.removeAll();
			panel_3.removeAll();
			panel_4.removeAll();
			panel_5.removeAll();
				if(sizeAux > 0) {
				 sizeAux--;
				 if(sizeAux >= 0 ) {
					 
				 JLabel post1 = new JLabel(posts.get(sizeAux).getSubtitle());
				 panel_1.removeAll();
				 panel_1.add(post1);
				 }
				 
				 sizeAux--;
				 if(sizeAux >= 0) {
				 JLabel post2 = new JLabel(posts.get(sizeAux).getSubtitle());
				 panel_2.removeAll();
				 panel_2.add(post2);
				 }	 
				 sizeAux--;
				 if(sizeAux >= 0) {
				 JLabel post3 = new JLabel(posts.get(sizeAux).getSubtitle());
				 panel_3.removeAll();
				 panel_3.add(post3);
				 }
				 sizeAux--;
				 if(sizeAux >= 0) {
				 JLabel post4 = new JLabel(posts.get(sizeAux).getSubtitle());
				 panel_4.removeAll();
				 panel_4.add(post4);
				 }
				 sizeAux--;
				 if(sizeAux >= 0) {
				 JLabel post5 = new JLabel(posts.get(sizeAux).getSubtitle());
				 panel_5.removeAll();
				 panel_5.add(post5);
				 }
				}
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void listarActionPerformed(ActionEvent evt)  {

		examsList = new ExamList(email);
		examsList.setSize(600, 600);
		examsList.setVisible(true);

	}

}
