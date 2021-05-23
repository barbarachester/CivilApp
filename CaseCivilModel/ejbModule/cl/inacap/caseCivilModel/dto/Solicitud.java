package cl.inacap.caseCivilModel.dto;

import java.util.List;

public class Solicitud {
	public String getTipoSolicitud() {
		return tipoSolicitud;
	}
	public void setTipoSolicitud(String tipoSolicitud) {
		this.tipoSolicitud = tipoSolicitud;
	}
	public int getNumeroAtencion() {
		return numeroAtencion;
	}
	public void setNumeroAtencion(int numeroAtencion) {
		this.numeroAtencion = numeroAtencion;
	}
	public List<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	private  String tipoSolicitud;
	private int numeroAtencion;
	private List <Cliente> clientes;

}
