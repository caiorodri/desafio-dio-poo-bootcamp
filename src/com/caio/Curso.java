package com.caio;

public class Curso extends Conteudo{

	private int cargaHoraria;

	Curso(){}
	
	Curso(String titulo, String descricao, int cargaHoraria){

		this.setTitulo(titulo);
		this.setDescricao(descricao);
		this.cargaHoraria = cargaHoraria;
		
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}



	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public double calculaXp() {
		return XP_PADRAO * cargaHoraria * 2;
	}
	

	
	@Override
	public String toString() {
		return "Titulo: " + this.getTitulo() + ", Carga Horaria: " + cargaHoraria + " Horas";
	}

}
