package gui_swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.GridBagLayout;
import java.awt.CardLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

import account.facade.FacadeAccount;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exam implements ActionListener{

	private JFrame frmAvaliao;
	private JTextField textField;
	private JTextField txtDescription;
	private JTextField txtDate;
	private JTextField txtActivity;
	private JButton registrationButton;
	private  static String email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exam window = new Exam("cmatheuslf@gmail.com");
					window.frmAvaliao.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Exam(String email) {
		this.email = email;
		initialize();
	}
	public JFrame getFrame() {
		return frmAvaliao;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAvaliao = new JFrame();
		frmAvaliao.setAutoRequestFocus(false);
		frmAvaliao.getContentPane().setBackground(Color.DARK_GRAY);
		frmAvaliao.setBackground(Color.DARK_GRAY);
		frmAvaliao.setTitle("Avaliação");
		frmAvaliao.setBounds(100, 100, 600, 400);
		frmAvaliao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frmAvaliao.getContentPane().setLayout(gridBagLayout);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(5, 5, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 2;
		GridBagConstraints gbc_lblNewLabel1 = new GridBagConstraints();
		gbc_lblNewLabel1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel1.gridx = 2;
		gbc_lblNewLabel1.gridy = 3;
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.DARK_GRAY);
		panel_1.setBackground(Color.DARK_GRAY);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(150, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 5;
		gbc_panel_1.gridy = 1;
		frmAvaliao.getContentPane().add(panel_1, gbc_panel_1);
		
		JLabel imgLabel = new JLabel("");
		GridBagConstraints gbc_imgLabel = new GridBagConstraints();
		gbc_imgLabel.insets = new Insets(50, 50, 5, 5);
		gbc_imgLabel.gridx = 5;
		gbc_imgLabel.gridy = 1;
		panel_1.add(imgLabel, gbc_imgLabel);
		ImageIcon image = new ImageIcon(Exam.class.getResource("/img/notebook.png"));
		imgLabel.setIcon(new ImageIcon(image.getImage().getScaledInstance(130, 120, Image.SCALE_DEFAULT)));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(50, 50, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 2;
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{177, 74, 96, 0};
		gbl_panel.rowHeights = new int[]{52, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		
		JLabel TitleGeneral = new JLabel("Avaliação");
		TitleGeneral.setForeground(Color.YELLOW);
		TitleGeneral.setFont(new Font("Tahoma", Font.PLAIN, 43));
		GridBagConstraints gbc_TitleGeneral = new GridBagConstraints();
		gbc_TitleGeneral.anchor = GridBagConstraints.NORTHWEST;
		gbc_TitleGeneral.insets = new Insets(0, 0, 5, 5);
		gbc_TitleGeneral.gridx = 0;
		gbc_TitleGeneral.gridy = 0;
		panel.add(TitleGeneral, gbc_TitleGeneral);
		
		frmAvaliao.getContentPane().add(panel, gbc_panel);
		
		JLabel tActivity = new JLabel("Atividade");
		tActivity.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tActivity.setForeground(Color.YELLOW);
		GridBagConstraints gbc_tActivity = new GridBagConstraints();
		gbc_tActivity.anchor = GridBagConstraints.WEST;
		gbc_tActivity.insets = new Insets(0, 0, 5, 5);
		gbc_tActivity.gridx = 0;
		gbc_tActivity.gridy = 1;
		panel.add(tActivity, gbc_tActivity);
		tActivity.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tActivity.setForeground(Color.YELLOW);
		
		txtActivity = new JTextField();
		GridBagConstraints gbc_txtActivity = new GridBagConstraints();
		gbc_txtActivity.insets = new Insets(0, 0, 5, 5);
		gbc_txtActivity.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtActivity.gridx = 0;
		gbc_txtActivity.gridy = 2;
		panel.add(txtActivity, gbc_txtActivity);
		txtActivity.setColumns(10);
		
				
		JLabel tDate = new JLabel("Data");
		GridBagConstraints gbc_tDate = new GridBagConstraints();
		gbc_tDate.anchor = GridBagConstraints.WEST;
		gbc_tDate.insets = new Insets(0, 0, 5, 5);
		gbc_tDate.gridx = 0;
		gbc_tDate.gridy = 3;
		panel.add(tDate, gbc_tDate);
		tDate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tDate.setForeground(Color.YELLOW);
		
		txtDate = new JTextField();
		GridBagConstraints gbc_txtDate = new GridBagConstraints();
		gbc_txtDate.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDate.ipadx = 50;
		gbc_txtDate.anchor = GridBagConstraints.WEST;
		gbc_txtDate.insets = new Insets(0, 0, 5, 5);
		gbc_txtDate.gridx = 0;
		gbc_txtDate.gridy = 5;
		panel.add(txtDate, gbc_txtDate);
		txtDate.setColumns(10);
		
		JLabel tDescription = new JLabel("Descrição	");
		GridBagConstraints gbc_tDescription = new GridBagConstraints();
		gbc_tDescription.anchor = GridBagConstraints.WEST;
		gbc_tDescription.insets = new Insets(0, 0, 5, 5);
		gbc_tDescription.gridx = 0;
		gbc_tDescription.gridy = 6;
		panel.add(tDescription, gbc_tDescription);
		tDescription.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tDescription.setForeground(Color.YELLOW);
		
		txtDescription = new JTextField();
		GridBagConstraints gbc_txtDescription = new GridBagConstraints();
		gbc_txtDescription.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDescription.ipady = 50;
		gbc_txtDescription.ipadx = 50;
		gbc_txtDescription.insets = new Insets(0, 0, 0, 5);
		gbc_txtDescription.anchor = GridBagConstraints.WEST;
		gbc_txtDescription.gridx = 0;
		gbc_txtDescription.gridy = 7;
		panel.add(txtDescription, gbc_txtDescription);
		txtDescription.setColumns(10);
		
		registrationButton = new JButton("Cadastrar");
		registrationButton.setForeground(Color.YELLOW);
		registrationButton.setBackground(Color.DARK_GRAY);
		GridBagConstraints gbc_registrationButton = new GridBagConstraints();
		gbc_registrationButton.gridx = 2;
		gbc_registrationButton.gridy = 7;
		panel.add(registrationButton, gbc_registrationButton);
		registrationButton.addActionListener((ActionListener) this);
		
		frmAvaliao.setVisible(true);
	}
	//evento de cadastro de avaliação
	public void actionPerformed(ActionEvent evento) {
		String activity = txtActivity.getText();
		String date = txtDate.getText();
		String  description = txtDescription.getText();
		int id = 0;
		try {
			id = FacadeAccount.getInstance().getAccounts().findAccount(email).getExamNumber();
			FacadeAccount.getInstance().getAccounts().getProfiles().get(email).addExamEvents( activity, date, description, id);
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		int retorno = JOptionPane.showConfirmDialog(frmAvaliao, "Avaliação adicionada", "Mensagem", JOptionPane.YES_NO_OPTION);
		if (retorno == JOptionPane.YES_OPTION) {
			frmAvaliao.dispose();			
		}
	}
}
