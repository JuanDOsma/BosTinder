package co.edu.unbosque.model;

import java.util.Date;

public class Persona {
	private int id;
	private String nombre;
	private String apellido;
	private char genero;
	private String alias;
	private String contrasena;
	private String correo;
	private Date fecha;
	private int edad;
	private float ingresos;
	private String divorcios;
	private int numLR; // número de like recibidos
	private int numLO; // número de likes ortorgados
	private int numM; // número de matches
	private String estado;
	
	public Persona(int id, String nombre, String apellido, char genero, String alias, String contrasena, String correo,
			Date fecha, float ingresos, String divorcios, int numLR, int numLO, int numM, String estado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.alias = alias;
		this.contrasena = contrasena;
		this.correo = correo;
		this.fecha = fecha;
		this.ingresos = ingresos;
		this.divorcios = divorcios;
		this.numLR = numLR;
		this.numLO = numLO;
		this.numM = numM;
		this.estado = estado;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public float getIngresos() {
		return ingresos;
	}
	public void setIngresos(float ingresos) {
		this.ingresos = ingresos;
	}
	public String getDivorcios() {
		return divorcios;
	}
	public void setDivorcios(String divorcios) {
		this.divorcios = divorcios;
	}
	public int getNumLR() {
		return numLR;
	}
	public void setNumLR(int numLR) {
		this.numLR = numLR;
	}
	public int getNumLO() {
		return numLO;
	}
	public void setNumLO(int numLO) {
		this.numLO = numLO;
	}
	public int getNumM() {
		return numM;
	}
	public void setNumM(int numM) {
		this.numM = numM;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
