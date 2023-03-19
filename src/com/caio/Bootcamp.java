package com.caio;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

	private String nome;
	private String descricao;
	private final LocalDate dataInicio = LocalDate.now();
	private final LocalDate dataTermino = dataInicio.plusDays(45);
	private Set<Dev> devs = new LinkedHashSet<>();
	private Set<Conteudo> conteudos = new LinkedHashSet<>();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Set<Dev> getDevs() {
		return devs;
	}
	
	public void setDevs(Dev dev) {
		
		if (this.devs.contains(dev)) {
			this.devs.add(dev);
		}
		
	}
	
	public Set<Conteudo> getConteudos() {
		return this.conteudos;
	}
	
	public void setConteudo(Conteudo conteudo) {
		this.conteudos.add(conteudo);
	}
	
	public void removeConteudo(Conteudo conteudo) {
		this.conteudos.remove(conteudo);
	}
	
	public LocalDate getDataInicio() {
		return dataInicio;
	}
	
	public LocalDate getDataTermino() {
		return dataTermino;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(conteudos, dataInicio, dataTermino, descricao, devs, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(conteudos, other.conteudos) && Objects.equals(dataInicio, other.dataInicio)
				&& Objects.equals(dataTermino, other.dataTermino) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(devs, other.devs) && Objects.equals(nome, other.nome);
	}

}
