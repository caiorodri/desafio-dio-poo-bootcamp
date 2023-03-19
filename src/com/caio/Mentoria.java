package com.caio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

	private LocalDate data;

	public Mentoria() {}
	
	public Mentoria(String titulo, String descricao) {
		
		this.setTitulo(titulo);
		this.setDescricao(descricao);
		this.data = LocalDate.now();
	}
	
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public double calculaXp(){
		return XP_PADRAO * 6;
	}

	@Override
	public String toString() {
		return "Titulo: " + getTitulo() + ", Data: " + this.data;
	}
	
	
	
}
