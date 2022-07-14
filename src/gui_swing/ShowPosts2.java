/**
 * Classe ShowPosts2.
 *
 * @author Carlos Matheus.
 * @version 2.0
 * <br>
 * Copyright (C) 2022 Universidade Federal do
Ceará.
 */
package gui_swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
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

import account.facade.FacadeAccount;

import java.awt.EventQueue;

import account.exceptions.NotFoundException;
import post.Post;
import post.PostCollection;

import java.util.ArrayList;


public class ShowPosts2 extends javax.swing.JFrame{
  /* 
   */
  private static String email;
  private static final long serialVersionUID = 1L;
  private JScrollPane jScrollPane1;
  private JTable jTable1;
  private JButton btnBack;
  /* Auto-generated main method to display this JFrame
   */ 
  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        ShowPosts2 inst = new ShowPosts2(email);
        inst.setLocationRelativeTo(null);
        inst.setVisible(true);
      }
    });
  }

  public ShowPosts2(String email) {
    super();
    ShowPosts2.email = email;
    initGUI();
    int larguraJanela = getWidth();
      int alturaJanela = getHeight();
      Toolkit tk = Toolkit.getDefaultToolkit();
      Dimension d = tk.getScreenSize();
      int larguraTela = d.width;
      int alturaTela = d.height;
      int posHorizontal = (larguraTela - larguraJanela) / 2;
      int posVertical = (alturaTela - alturaJanela) / 2;
      setLocation(posHorizontal, posVertical);
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
              new String[] { "id", "Post"});
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
    ArrayList<Post> postList = FacadeAccount.getInstance().getAccounts().getProfiles().get(email).getPosts().getPostCollection();

    for (int i = 0; i < postList.size(); i++) {

      model.addRow(new String[] { Integer.toString(postList.get(i).getId()), postList.get(i).getSubtitle()});
    }
  }
}
