package com.mvc.bean;

public class DoctoBean {
	private String elID;
	private String titulo;
	private String fechaInstalacion;
	private String creador;
	private Integer duracion;
	
	
	public Integer getDuracion() {
		return duracion;
	}
	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}
	public String getElID() {
		return elID;
	}
	public void setElID(String elID) {
		this.elID = elID;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getFechaInstalacion() {
		return fechaInstalacion;
	}
	public void setFechaInstalacion(String fechaInstalacion) {
		this.fechaInstalacion = fechaInstalacion;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	

}
