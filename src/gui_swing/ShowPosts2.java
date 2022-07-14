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

import java.awt.EventQueue;

import javax.swing.JFrame;

public class ShowPosts2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowPosts2 window = new ShowPosts2();
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
	public ShowPosts2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
