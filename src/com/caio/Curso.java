package com.caio;

public class Curso extends Conteudo{

	private int cargaHoraria;
	
	Curso(){}
	
	Curso(int cargaHoraria){
		
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
	
	
}
