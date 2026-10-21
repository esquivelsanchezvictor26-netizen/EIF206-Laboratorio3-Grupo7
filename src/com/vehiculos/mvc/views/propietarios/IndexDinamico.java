package com.vehiculos.mvc.views.propietarios;

import javax.swing.JPanel;
import java.awt.BorderLayout;

public class IndexDinamico extends JPanel {
	public JPanel panelPropietarios;

	/**
	 * Create the panel.
	 */
	public IndexDinamico() {
		setLayout(new BorderLayout(0, 0));
		
		panelPropietarios = new JPanel();
		add(panelPropietarios, BorderLayout.CENTER);

	}

}
