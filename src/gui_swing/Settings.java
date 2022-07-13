/**
 * Classe Settings.
 *
 * @author Yohanne e Carlos Matheus
 * @version 2.0
 * <br>
 * Copyright (C) 2022 Universidade Federal do
Ceará.
 */
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.Button;

public class Settings {

 private JFrame frame;

 /**
  * Launch the application.
  */
 public static void main(String[] args) {
  EventQueue.invokeLater(new Runnable() {
   public void run() {
    try {
     Settings window = new Settings();
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
 public Settings() {
  initialize();
 }

 /**
  * Initialize the contents of the frame.
  */
 private void initialize() {
  frame = new JFrame();
  frame.getContentPane().setBackground(Color.DARK_GRAY);
  GridBagLayout gridBagLayout = new GridBagLayout();
  gridBagLayout.columnWidths = new int[]{4, 0, 378, 0};
  gridBagLayout.rowHeights = new int[]{213, 0, 45, 0};
  gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
  gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
  frame.getContentPane().setLayout(gridBagLayout);
  
  JPanel panel = new JPanel();
  panel.setBackground(Color.DARK_GRAY);
  GridBagConstraints gbc_panel = new GridBagConstraints();
  gbc_panel.fill = GridBagConstraints.BOTH;
  gbc_panel.insets = new Insets(0, 0, 5, 5);
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
  gbc_tSettings.insets = new Insets(0, 0, 5, 5);
  gbc_tSettings.gridx = 0;
  gbc_tSettings.gridy = 0;
  panel.add(tSettings, gbc_tSettings);
  
  JButton editProfile = new JButton("Editar Perfil");
  editProfile.setBackground(new Color(0,0,0,0));
  editProfile.setForeground(Color.YELLOW);
  GridBagConstraints gbc_editProfile = new GridBagConstraints();
  gbc_editProfile.ipadx = 15;
  gbc_editProfile.insets = new Insets(0, 0, 5, 5);
  gbc_editProfile.anchor = GridBagConstraints.WEST;
  gbc_editProfile.gridx = 0;
  gbc_editProfile.gridy = 2;
  panel.add(editProfile, gbc_editProfile);
  
  JButton status = new JButton("Ver status");
  status.setBackground(new Color(0,0,0,0));
  status.setForeground(Color.YELLOW);
  GridBagConstraints gbc_status = new GridBagConstraints();
  gbc_status.ipadx = 22;
  gbc_status.insets = new Insets(0, 0, 5, 5);
  gbc_status.anchor = GridBagConstraints.WEST;
  gbc_status.gridx = 0;
  gbc_status.gridy = 3;
  panel.add(status, gbc_status);
  
  JButton removeAccount = new JButton("Excluir conta");
  removeAccount.setBackground(new Color(0,0,0,0));
  removeAccount.setForeground(Color.YELLOW);
  GridBagConstraints gbc_removeAccount = new GridBagConstraints();
  gbc_removeAccount.ipadx = 10;
  gbc_removeAccount.insets = new Insets(0, 0, 5, 5);
  gbc_removeAccount.anchor = GridBagConstraints.WEST;
  gbc_removeAccount.gridx = 0;
  gbc_removeAccount.gridy = 4;
  panel.add(removeAccount, gbc_removeAccount);
  
  JButton back = new JButton("Voltar");
  removeAccount.setBackground(new Color(0,0,0,0));
  back.setForeground(Color.YELLOW);
  GridBagConstraints gbc_back = new GridBagConstraints();
  gbc_back.ipadx = 40;
  gbc_back.insets = new Insets(0, 0, 5, 5);
  gbc_back.an