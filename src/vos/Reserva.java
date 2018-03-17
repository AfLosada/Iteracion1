package vos;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class Reserva 
{
	
	//
	// Atributos
	//
	
	@JsonProperty( value = "confiramada")
	private boolean confirmada;
	

	



	@JsonProperty( value = "duracion")
	private String duracion;
	
	@JsonProperty( value = "fecha")
	private String fecha;
	
	@JsonProperty( value = "id")
	private int id;
	
	@JsonProperty( value = "pagoAnticipado")
	private boolean pagoAnticipado;
	
	@JsonProperty ( value = "tiempoCancelacion")
	private String tiempoCancelacion;
	
	@JsonProperty ( value = "valor")
	private double valor;
	
	
	@JsonProperty ( value = "operador" )
	private Operador operador;
	
	@JsonProperty ( value = "cliente" )
	private Cliente cliente;
	
	@JsonProperty ( value = "habitaciones" )
	private List<Habitacion> habitaciones;
	
	

	//
	// Constructor
	//
	
	public Reserva(boolean confirmada, String duracion, String fecha, int id, boolean pagoAnticipado,
			String tiempoCancelacion, double valor, Operador operador, Cliente cliente, List<Habitacion> habitaciones) {
		super();
		this.confirmada = confirmada;
		this.duracion = duracion;
		this.fecha = fecha;
		this.id = id;
		this.pagoAnticipado = pagoAnticipado;
		this.tiempoCancelacion = tiempoCancelacion;
		this.valor = valor;
		this.operador = operador;
		this.cliente = cliente;
		this.habitaciones = habitaciones;
	}
	
	

	//
	// Getters y Setters
	//
	
	public boolean isConfirmada() {
		return confirmada;
	}



	public void setConfirmada(boolean confirmada) {
		this.confirmada = confirmada;
	}



	public String getDuracion() {
		return duracion;
	}



	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}



	public String getFecha() {
		return fecha;
	}



	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public boolean isPagoAnticipado() {
		return pagoAnticipado;
	}



	public void setPagoAnticipado(boolean pagoAnticipado) {
		this.pagoAnticipado = pagoAnticipado;
	}



	public String getTiempoCancelacion() {
		return tiempoCancelacion;
	}



	public void setTiempoCancelacion(String tiempoCancelacion) {
		this.tiempoCancelacion = tiempoCancelacion;
	}



	public double getValor() {
		return valor;
	}



	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public Operador getOperador() {
		return operador;
	}



	public void setOperador(Operador operador) {
		this.operador = operador;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public List<Habitacion> getHabitaciones() {
		return habitaciones;
	}



	public void setHabitaciones(List<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}



	
	
}
