package com.caio;

import java.util.Date;

public class Mentoria extends Conteudo{

	private Date data;

	public Mentoria() {}
	
	public Mentoria(Date data) {
		this.data = data;
	}
	
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	@Override
	public double calculaXp(){
		return XP_PADRAO * 6;
	}
	
}
