package com.vehiculos.mvc.views.vehiculos;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.vehiculos.mvc.models.vo.Propietario;

public class PanelForm extends JPanel {

	private static final long serialVersionUID = 1L;
	public JComboBox<Propietario> comboBox;
	public JTextField textFieldPlaca;
	public JButton btnGuardar;

	public PanelForm() {
		setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(300, 155));

		JLabel lblNewLabel = new JLabel("Form");
		lblNewLabel.setBounds(10, 11, 46, 14);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Propietario");
		lblNewLabel_1.setBounds(10, 36, 80, 14);
		panel.add(lblNewLabel_1);

		comboBox = new JComboBox<Propietario>();
		comboBox.setBounds(10, 62, 150, 22);
		panel.add(comboBox);

		JLabel lblNewLabel_2 = new JLabel("Placa");
		lblNewLabel_2.setBounds(10, 95, 46, 14);
		panel.add(lblNewLabel_2);

		textFieldPlaca = new JTextField();
		textFieldPlaca.setBounds(10, 120, 150, 20);
		panel.add(textFieldPlaca);
		textFieldPlaca.setColumns(10);

		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(180, 61, 100, 25);
		panel.add(btnGuardar);

	}
}