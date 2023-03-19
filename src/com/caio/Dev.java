package com.caio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {

	private String nome;
	private double xp;
	private Set<Conteudo> conteudosInscrito = new LinkedHashSet<>();
	private Set<Conteudo> conteudosFinalizado = new LinkedHashSet<>();
	
	
	Dev(){}
	
	Dev(String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudosInscrito() {
		return conteudosInscrito;
	}

	public void setConteudosInscrito(Set<Conteudo> conteudosInscrito) {
		this.conteudosInscrito = conteudosInscrito;
	}	

	public Set<Conteudo> getConteudosFinalizado() {
		return conteudosFinalizado;
	}

	public void setConteudosFinalizado(Set<Conteudo> conteudosFinalizado) {
		this.conteudosFinalizado = conteudosFinalizado;
	}

	public void inscreverBootcamp(Bootcamp bootcamp) {
		
		bootcamp.getDevs().add(this);
		this.conteudosInscrito.addAll(bootcamp.getConteudos());
		
	}
	
	public void progredir() {
		
		Optional<Conteudo> primeiroConteudo = this.conteudosInscrito.stream().findFirst();
		
		if (primeiroConteudo.isPresent()) {
			
			this.conteudosFinalizado.add(primeiroConteudo.get());
			this.conteudosInscrito.remove(primeiroConteudo.get());
		}else {
			System.err.println("Você não está matriculado em nenhum conteudo");
		}
		
	}
	
	public double calculaXpTotal() {
		
		double TotalXp = 0d;
		for (Conteudo conteudo : this.conteudosFinalizado) {
			
			TotalXp += conteudo.calculaXp();
			
		}
		
		this.xp = TotalXp;
		
		return this.xp;
	}
	
}
