package com.vehiculos.mvc.controllers;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.vehiculos.mvc.models.dao.DAOPropietario;
import com.vehiculos.mvc.models.dao.DAOVehiculo;
import com.vehiculos.mvc.models.vo.Propietario;
import com.vehiculos.mvc.models.vo.Vehiculo;
import com.vehiculos.mvc.views.vehiculos.Index;
import com.vehiculos.mvc.views.vehiculos.TarjetaVehiculo;

public class ControllerVehiculos extends Functions implements Controller<Vehiculo> {

	private ControllerPrincipal cp;
	private DAOVehiculo dao;
	private DAOPropietario daoPropietario;
	private Index v;
	private int idSeleccionado = 0; // 0 = nuevo, mayor a 0 = editando

	public ControllerVehiculos(ControllerPrincipal cp) {
		this.cp = cp;
		dao = new DAOVehiculo();
		daoPropietario = new DAOPropietario();
	}

	@Override
	public void index() {

		v = new Index();
		idSeleccionado = 0;

		// Llenar el JComboBox con los propietarios
		for (Propietario p : daoPropietario.all()) {
			v.panelForm.comboBox.addItem(p);
		}

		v.panelForm.btnGuardar.addActionListener(e -> save());

		// PASO 1. BORRAR LO VIEJO
		v.panelLista.panelVehiculos.removeAll();

		// PASO 2. AGREGAR ELEMENTOS NUEVOS
		ArrayList<Vehiculo> list = dao.all();

		for (Vehiculo item : list) {
			TarjetaVehiculo tarjeta = new TarjetaVehiculo();
			tarjeta.lblVehiculo.setText(item.getId() + "");
			tarjeta.lblPlaca.setText(item.getPlaca());
			tarjeta.lblPropietario.setText(item.getNombrePropietario());

			tarjeta.btnEditar.addActionListener(e -> edit(item.getId()));
			tarjeta.btnEliminar.addActionListener(e -> destroy(item.getId()));

			v.panelLista.panelVehiculos.add(tarjeta);
		}

		// PASO 3. REFRESCAR LA VISTA
		v.panelLista.panelVehiculos.repaint();
		v.panelLista.panelVehiculos.revalidate();

		cp.vp.setContenido(v, "Lista de vehículos");
	}

	// Botón GUARDAR: inserta o actualiza según idSeleccionado
	private void save() {

		String placa = v.panelForm.textFieldPlaca.getText().trim();
		Propietario p = (Propietario) v.panelForm.comboBox.getSelectedItem();

		if (placa.isEmpty() || p == null) {
			JOptionPane.showMessageDialog(null, "Digite la placa y seleccione un propietario.");
			return;
		}

		Vehiculo item = new Vehiculo(p.getId(), placa);

		if (idSeleccionado == 0) {
			store(item);
		} else {
			update(item, idSeleccionado);
		}
	}

	// Botón + NUEVO: limpia el formulario y sale del modo edición
	@Override
	public void create() {
		idSeleccionado = 0;
		v.panelForm.textFieldPlaca.setText("");
		if (v.panelForm.comboBox.getItemCount() > 0) {
			v.panelForm.comboBox.setSelectedIndex(0);
		}
	}

	// Botón EDITAR de la tarjeta: carga los datos en el formulario
	@Override
	public void edit(int id) {

		Vehiculo item = dao.find(id);
		if (item == null) return;

		idSeleccionado = item.getId();
		v.panelForm.textFieldPlaca.setText(item.getPlaca());

		// Seleccionar en el combo el propietario del vehículo
		for (int i = 0; i < v.panelForm.comboBox.getItemCount(); i++) {
			Propietario p = v.panelForm.comboBox.getItemAt(i);
			if (p.getId() == item.getIdPropietario()) {
				v.panelForm.comboBox.setSelectedIndex(i);
				break;
			}
		}
	}

	@Override
	public void show(int id) {
	}

	@Override
	public Object[][] getData() {

		ArrayList<Vehiculo> list = dao.all();
		Object[][] data = new Object[list.size()][getColumns().length];

		int i = 0;
		for (Vehiculo item : list) {
			data[i][0] = item.getId();
			data[i][1] = item.getPlaca();
			data[i][2] = item.getNombrePropietario();
			i++;
		}

		return data;
	}

	@Override
	public String[] getColumns() {
		return new String[] { "ID", "PLACA", "PROPIETARIO" };
	}

	@Override
	public void store(Vehiculo item) {
		if (dao.store(item)) {
			System.out.println("Registro correcto");
		} else {
			System.err.println("Error!!!");
		}
		index();
	}

	@Override
	public void update(Vehiculo item, int id) {
		if (dao.update(item, id)) {
			System.out.println("Actualización correcta");
		} else {
			System.err.println("Error!!!");
		}
		index();
	}

	@Override
	public void destroy(int id) {
		if (dao.destroy(id)) {
			System.out.println("Eliminado correctamente");
		} else {
			System.err.println("Error!!!");
		}
		index();
	}
}