package com.vehiculos.mvc.views.vehiculos;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class PanelForm extends JPanel {

	private static final long serialVersionUID = 1L;
	private JComboBox comboBox;
	private JTextField textFieldPlaca;

	/**
	 * Create the panel.
	 */
	public PanelForm() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Form");
		lblNewLabel.setBounds(10, 11, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Propietario");
		lblNewLabel_1.setBounds(10, 36, 80, 14);
		panel.add(lblNewLabel_1);
		
		comboBox = new JComboBox();
		comboBox.setBounds(10, 62, 46, 22);
		panel.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Placa");
		lblNewLabel_2.setBounds(10, 95, 46, 14);
		panel.add(lblNewLabel_2);
		
		textFieldPlaca = new JTextField();
		textFieldPlaca.setBounds(10, 120, 86, 20);
		panel.add(textFieldPlaca);
		textFieldPlaca.setColumns(10);

	}
}
