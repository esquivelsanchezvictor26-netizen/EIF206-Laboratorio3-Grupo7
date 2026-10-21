package com.vehiculos.mvc.views.propietarios;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Dimension;

public class panelPropietario extends JPanel {
	public JLabel lblNombre;
	public JLabel lblTelefono;
	public JLabel lblEdad;
	public JButton btnEditar;
	public JButton btnEliminar;

	/**
	 * Create the panel.
	 */
	public panelPropietario() {
		setPreferredSize(new Dimension(277, 223));
		setLayout(null);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(106, 13, 56, 16);
		add(lblNombre);
		
		lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(106, 53, 56, 16);
		add(lblTelefono);
		
		lblEdad = new JLabel("Edad");
		lblEdad.setBounds(118, 100, 56, 16);
		add(lblEdad);
		
		JLabel label = new JLabel("Nombre");
		label.setBounds(12, 13, 56, 16);
		add(label);
		
		JLabel label_1 = new JLabel("Telefono");
		label_1.setBounds(12, 64, 56, 16);
		add(label_1);
		
		JLabel label_2 = new JLabel("Edad");
		label_2.setBounds(12, 110, 56, 16);
		add(label_2);
		
		btnEditar = new JButton("Editar");
		btnEditar.setBounds(12, 161, 97, 25);
		add(btnEditar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(132, 161, 97, 25);
		add(btnEliminar);

	}
}
