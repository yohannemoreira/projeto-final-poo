package gui_swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

import Events.ExamEvents;

import account.facade.FacadeAccount;


public class ExamList extends javax.swing.JFrame{
	/**
	 * 
	 */
	private static String email;
	private static final long serialVersionUID = 1L;
	private JScrollPane jScrollPane1;
	private JTable jTable1;
	private JButton btnBack;
	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ExamList inst = new ExamList(email);
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public ExamList(String email) {
		super();
		ExamList.email = email;
		initGUI();
		setLocationRelativeTo(null);
	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jScrollPane1 = new JScrollPane();
				btnBack = new JButton("Voltar");
				btnBack.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
						//Deixar pra yoh
					}
				});
				setSize(600, 600);
				JPanel p = new JPanel();
				p.setLayout(new FlowLayout());
				p.add(btnBack);
				getContentPane().add(p, BorderLayout.SOUTH);
				getContentPane().add(jScrollPane1, BorderLayout.CENTER);
				{
					DefaultTableModel tableModel = new DefaultTableModel(null,
							new String[] { "Atividade", "Data", "Descrição"});
					jTable1 = new JTable();
					jScrollPane1.setViewportView(jTable1);
					jTable1.setModel(tableModel);
					changeTable();
				}
				
			}
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void changeTable()  {
		DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
		model.setNumRows(0);
		List<ExamEvents> examList = FacadeAccount.getInstance().getAccounts().getProfiles().get(email).getExams();

		for (int i = 0; i < examList.size(); i++) {

			model.addRow(new String[] { examList.get(i).getNameExam(), examList.get(i).getDateExam(), examList.get(i).getDescription()});
		}
	}
}
