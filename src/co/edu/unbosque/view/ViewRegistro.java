package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ViewRegistro extends JPanel{
	
	private JLabel bosstinder;
	private JLabel lbOpcional;
	private JTextField txtAlias;
	private JTextField txtCorreo;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtFNacimiento;
	private JTextField txtEdad;
	private JTextField txtEstatura;
	private JTextField txtOpcinal;
	private JComboBox<?> cbxEstado;
	private JComboBox<?> cbxGenero;
	private JButton btnRegistrar;
	private JButton btnInicio;
	
	
	public ViewRegistro() {
		setLayout(null);
		
		bosstinder = new JLabel();
		bosstinder.setBounds(165,129,232,44);
		add(bosstinder);
		
		JLabel lbAlias = new JLabel("Alias");
		lbAlias.setBounds(102,137,28,21);
		add(lbAlias);
		txtAlias = new JTextField();
		txtAlias.setBounds(102, 162, 177, 27);
		add(txtAlias);
		
		JLabel lbCorreo = new JLabel("Correo Eletronico");
		lbCorreo.setBounds(322,137,111,21);
		add(lbCorreo);
		txtCorreo = new JTextField();
		txtCorreo.setBounds(322, 168, 177, 27);
		add(txtCorreo);
		
		JLabel lbNombre = new JLabel("Nombre");
		lbNombre.setBounds(102,212,48,21);
		add(lbNombre);
		txtNombre = new JTextField();
		txtNombre.setBounds(102, 237, 177, 27);
		add(txtNombre);
		
		JLabel lbApellido = new JLabel("Apellido");
		lbApellido.setBounds(322,212,47,21);
		add(lbApellido);
		txtApellido = new JTextField();
		txtApellido.setBounds(322, 237, 177, 27);
		add(txtApellido);

		JLabel lbFecha = new JLabel("Fecha De Nacimiento");
		lbFecha.setBounds(102,284,105,21);
		add(lbFecha);
		txtFNacimiento = new JTextField();
		txtFNacimiento.setBounds(102, 309, 177, 27);
		add(txtFNacimiento);
		
		JLabel lbEdad = new JLabel("Edad");
		lbEdad.setBounds(322,248,31,21);
		add(lbEdad);
		txtEdad = new JTextField();
		txtEdad.setBounds(322, 308, 177, 27);
		add(txtEdad);
		
		JLabel lbEstatura = new JLabel("Estatura");
		lbEstatura.setBounds(102,421,50, 21);
		add(lbEstatura);
		txtEstatura = new JTextField();
		txtEstatura.setBounds(102,455,177, 27);
		add(txtEstatura);
		
		lbOpcional = new JLabel("Numero de Divorsios");
		lbOpcional.setBounds(322,421,110,21);
		add(lbOpcional);
		txtOpcinal = new JTextField();
		txtOpcinal.setBounds(322, 446, 177, 27);
		add(txtOpcinal);
		
		JLabel lbEstado = new JLabel("Estado");
		lbEstado.setBounds(102, 357, 42, 21);
		add(lbEstado);
		cbxEstado = new JComboBox();
		cbxEstado.setModel(new DefaultComboBoxModel(new String[] {"Disponible", "No Disponible"}));
		cbxEstado.setBounds(102,378,177,27);
		add(cbxEstado);
		
		JLabel lbGenero = new JLabel("Comparar por:");
		lbGenero.setBounds(322, 357, 45, 21);
		add(lbGenero);
		cbxGenero = new JComboBox();
		cbxGenero.setModel(new DefaultComboBoxModel(new String[] {"Masculino","Femenino"}));
		cbxGenero.setBounds(322,378,177,27);
		add(cbxGenero);
		
		btnRegistrar = new JButton("Registro");
		btnRegistrar.setBackground(new Color(204,0,0));
		btnRegistrar.setBounds(411,513,87,27);
		add(btnRegistrar);
		
		btnInicio = new JButton("Inicio");
		btnInicio.setBackground(new Color(204,0,0));
		btnInicio.setBounds(101,513,87,27);
		add(btnInicio);
		
	}

}
