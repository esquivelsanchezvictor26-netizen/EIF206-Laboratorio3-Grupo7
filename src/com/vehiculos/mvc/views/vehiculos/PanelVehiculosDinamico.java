package com.vehiculos.mvc.views.vehiculos;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JScrollPane;

public class PanelVehiculosDinamico extends JPanel {

	private static final long serialVersionUID = 1L;
	public JPanel panelVehiculos;

	public PanelVehiculosDinamico() {
		setLayout(new BorderLayout(0, 0));

		panelVehiculos = new JPanel();
		panelVehiculos.setLayout(new GridLayout(0, 3, 10, 10));

		// Wrapper para que las tarjetas no se estiren cuando hay pocas
		JPanel wrapper = new JPanel(new BorderLayout());
		wrapper.add(panelVehiculos, BorderLayout.NORTH);

		JScrollPane scrollPane = new JScrollPane(wrapper);
		scrollPane.getVerticalScrollBar().setUnitIncrement(16);
		add(scrollPane, BorderLayout.CENTER);
	}
}