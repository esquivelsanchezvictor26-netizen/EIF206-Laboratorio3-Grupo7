package com.vehiculos.mvc.views.vehiculos;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Dimension;

public class TarjetaVehiculo extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel lblVehiculo;
	private JLabel lblPropietario;
	private JLabel lblPlaca;
	private JButton btnEliminar;
	private JButton btnEditar;

	/**
	 * Create the panel.
	 */
	public TarjetaVehiculo() {
		setPreferredSize(new Dimension(196, 154));
		setLayout(new BorderLayout(0, 3));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Vehiculo #");
		lblNewLabel.setBounds(20, 25, 65, 14);
		panel.add(lblNewLabel);
		
		lblVehiculo = new JLabel("New label");
		lblVehiculo.setBounds(95, 25, 46, 14);
		panel.add(lblVehiculo);
		
		lblPlaca = new JLabel("Placa");
		lblPlaca.setBounds(95, 50, 65, 14);
		panel.add(lblPlaca);
		
		JLabel lblNewLabel_1 = new JLabel("Placa");
		lblNewLabel_1.setBounds(20, 50, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Propietario");
		lblNewLabel_2.setBounds(20, 77, 65, 14);
		panel.add(lblNewLabel_2);
		
		lblPropietario = new JLabel("New label");
		lblPropietario.setBounds(95, 77, 46, 14);
		panel.add(lblPropietario);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(20, 105, 78, 23);
		panel.add(btnEliminar);
		
		btnEditar = new JButton("Editar");
		btnEditar.setBounds(105, 105, 78, 23);
		panel.add(btnEditar);

	}
}
