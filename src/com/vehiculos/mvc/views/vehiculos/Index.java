package com.vehiculos.mvc.views.vehiculos;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class Index extends JPanel {

	private static final long serialVersionUID = 1L;
	public PanelForm panelForm;
	public PanelVehiculosDinamico panelLista;

	public Index() {
		setLayout(new BorderLayout(0, 10));

		panelForm = new PanelForm();
		add(panelForm, BorderLayout.NORTH);

		panelLista = new PanelVehiculosDinamico();
		add(panelLista, BorderLayout.CENTER);
	}
}