package br.senai.sp.jandira.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.senai.sp.jandira.model.Developer;
import br.senai.sp.jandira.repository.DeveloperRepository;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class FrameDeveloper extends JFrame {
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtReleaseYear;
	
	private DeveloperRepository devs;

	/**
	 * Create the frame.
	 */
	public FrameDeveloper(DeveloperRepository devs) {
		this.devs = devs;
		
		setTitle("Novo Desenvolvedor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewDeveloper = new JLabel("Novo Desenvolvedor");
		lblNewDeveloper.setFont(new Font("Verdana", Font.PLAIN, 24));
		lblNewDeveloper.setBounds(108, 11, 248, 65);
		contentPane.add(lblNewDeveloper);
		
		JLabel lblName = new JLabel("Nome:");
		lblName.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblName.setBounds(100, 99, 54, 37);
		contentPane.add(lblName);
		
		JLabel lblReleaseYear = new JLabel("Ano de funda\u00E7\u00E3o:");
		lblReleaseYear.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblReleaseYear.setBounds(10, 147, 144, 37);
		contentPane.add(lblReleaseYear);
		
		txtName = new JTextField();
		txtName.setBounds(164, 100, 311, 40);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtReleaseYear = new JTextField();
		txtReleaseYear.setColumns(10);
		txtReleaseYear.setBounds(164, 147, 311, 40);
		contentPane.add(txtReleaseYear);
		
		JButton btnAdd = new JButton("Adicionar");
		btnAdd.setBounds(133, 225, 200, 40);
		contentPane.add(btnAdd);
		
		btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Developer dev = new Developer(txtName.getText(), Integer.parseInt(txtReleaseYear.getText()));
				
				devs.addDeveloper(dev);
			}
		});
	}
}
