package com.carlos.producto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
public class Producto {

	@Id
	@Min(1)
	@Max(100)
	private long numero;
	
	@Column
	private String tipo;
	
	@Column
	@Min(1)
	@Max(1000)
	private int importe;

	
	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getImporte() {
		return importe;
	}

	public void setImporte(int importe) {
		this.importe = importe;
	}

	@Override
	public String toString() {
		return "Albaranes [numero=" + numero + ", tipo=" + tipo + ", importe=" + importe + "]";
	}
	
	
}
