package br.senai.sp.jandira.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class FrameGameManager extends JFrame {
	private JPanel contentPane;
	private JTextField txtTitle;
	private JTextField txtestimatedPrice;
	
	/**
	 * Create the frame.
	 */
	public FrameGameManager() {
		setTitle("Game Manager");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 460);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 248, 252));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel formPanel = new JPanel();
		formPanel.setBackground(new Color(248, 248, 252));
		formPanel.setBounds(10, 34, 341, 341);
		contentPane.add(formPanel);
		formPanel.setLayout(null);
		
		JLabel lblTitle = new JLabel("Titulo:");
		lblTitle.setBounds(77, 0, 54, 30);
		formPanel.add(lblTitle);
		lblTitle.setFont(new Font("Verdana", Font.PLAIN, 16));
		
		txtTitle = new JTextField();
		txtTitle.setBounds(141, 3, 200, 30);
		formPanel.add(txtTitle);
		txtTitle.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtTitle.setColumns(10);
		
		JLabel lblDeveloper = new JLabel("Developer:");
		lblDeveloper.setBounds(42, 44, 89, 30);
		formPanel.add(lblDeveloper);
		lblDeveloper.setFont(new Font("Verdana", Font.PLAIN, 16));
		
		JComboBox comboDeveloper = new JComboBox();
		comboDeveloper.setBounds(141, 44, 200, 30);
		formPanel.add(comboDeveloper);
		comboDeveloper.setFont(new Font("Verdana", Font.PLAIN, 16));
		
		JLabel lblConsole = new JLabel("Console:");
		lblConsole.setBounds(59, 85, 72, 30);
		formPanel.add(lblConsole);
		lblConsole.setFont(new Font("Verdana", Font.PLAIN, 16));
		
		JComboBox comboConsole = new JComboBox();
		comboConsole.setBounds(141, 85, 200, 30);
		formPanel.add(comboConsole);
		comboConsole.setFont(new Font("Verdana", Font.PLAIN, 16));
		
		JLabel lblestimatedPrice = new JLabel("Valor Estimado:");
		lblestimatedPrice.setBounds(0, 126, 131, 30);
		formPanel.add(lblestimatedPrice);
		lblestimatedPrice.setFont(new Font("Verdana", Font.PLAIN, 16));
		
		txtestimatedPrice = new JTextField();
		txtestimatedPrice.setBounds(141, 126, 112, 30);
		formPanel.add(txtestimatedPrice);
		txtestimatedPrice.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtestimatedPrice.setColumns(10);
		
		JCheckBox checkFinished = new JCheckBox("Zerado");
		checkFinished.setBounds(259, 126, 82, 30);
		formPanel.add(checkFinished);
		checkFinished.setBackground(new Color(248, 248, 252));
		checkFinished.setFont(new Font("Verdana", Font.PLAIN, 16));
		
		JLabel lblObservations = new JLabel("Observa\u00E7\u00F5es:");
		lblObservations.setBounds(19, 167, 112, 30);
		formPanel.add(lblObservations);
		lblObservations.setFont(new Font("Verdana", Font.PLAIN, 16));
		
		JButton btnSave = new JButton("Salvar");
		btnSave.setBounds(0, 301, 341, 40);
		formPanel.add(btnSave);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setFont(new Font("Verdana", Font.PLAIN, 16));
		textArea.setTabSize(4);
		textArea.setBounds(141, 167, 200, 120);
		formPanel.add(textArea);
		
		JPanel listPanel = new JPanel();
		listPanel.setBackground(new Color(248, 248, 252));
		listPanel.setBounds(384, 34, 300, 341);
		contentPane.add(listPanel);
		listPanel.setLayout(null);
		
		JLabel lblJogos = new JLabel("Meus Jogos:");
		lblJogos.setBounds(0, 0, 101, 21);
		listPanel.add(lblJogos);
		lblJogos.setFont(new Font("Verdana", Font.PLAIN, 16));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 21, 300, 268);
		listPanel.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JButton btnPrevious = new JButton("<");
		btnPrevious.setBounds(94, 301, 50, 40);
		listPanel.add(btnPrevious);
		
		JButton btnPrevious_1 = new JButton(">");
		btnPrevious_1.setBounds(154, 301, 50, 40);
		listPanel.add(btnPrevious_1);
	}
}
