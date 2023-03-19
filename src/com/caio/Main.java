package com.caio;

public class Main {

	public static void main(String[] args) {
		
		Curso cursoJava = new Curso();
		Curso cursoPython = new Curso("Curso de Python", "Descrição do Cruso de Python", 8);
		
		Mentoria mentoriaJava = new Mentoria("Mentoria Java", "Descricao Mentoria Java");
		Mentoria mentoriaPython = new Mentoria("Mentoria Python", "Descricao Mentoria Python");
		
		cursoJava.setTitulo("Curso de Java");
		cursoJava.setDescricao("Descrição do Curso de Java");
		cursoJava.setCargaHoraria(8);
		
		Bootcamp bootcampJava = new Bootcamp();
		bootcampJava.setConteudo(mentoriaJava);
		bootcampJava.setConteudo(cursoJava);
		
		Bootcamp bootcampPython = new Bootcamp();
		bootcampPython.setConteudo(cursoPython);
		bootcampPython.setConteudo(mentoriaPython);
		
		
		Dev caio = new Dev("Caio");
		Dev camilla = new Dev();
		camilla.setNome("Camilla");
		
		camilla.inscreverBootcamp(bootcampJava);
		caio.inscreverBootcamp(bootcampJava);
		caio.inscreverBootcamp(bootcampPython);
		
		caio.progredir();
		caio.progredir();
		caio.progredir();
		camilla.progredir();
		
		System.out.println("Caio");
		
		System.out.println(caio.getConteudosInscrito());
		System.out.println(caio.getConteudosFinalizado());
		System.out.println(caio.calculaXpTotal());
		
		System.out.println("================");
		
		System.out.println("\nCamilla");
		System.out.println(camilla.getConteudosInscrito());
		System.out.println(camilla.getConteudosFinalizado());
		System.out.println(camilla.calculaXpTotal());
		
	}	
	
}
