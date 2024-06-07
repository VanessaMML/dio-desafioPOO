import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		
		//Objetos Cursos
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("Descrição curso JS");
		curso2.setCargaHoraria(10);
		
//		System.out.println(curso1);
//		System.out.println(curso2);
		
		
		//Polimorfirmo
		Conteudo conteudo = new Curso();
		Conteudo conteudo1 = new Mentoria();
		
		//Objetos Mentoria
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Descrição mentoria Java");
		mentoria.setData(LocalDate.now());
		
//		System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.increverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos Camila:" + devCamila.getConteudoInscritos());
		devCamila.progredir();
		devCamila.progredir();
		System.out.println("Conteúdos atualizado inscritos Camila:" + devCamila.getConteudoInscritos());
		System.out.println("Conteúdos concluídos Camila:" + devCamila.getConteudosConcluidos());
		System.out.println("XP:" + devCamila.calcularTotalXp());

		System.out.println("--------------------------------------------------------------------------------");
		
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.increverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos João:" + devJoao.getConteudoInscritos());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("Conteúdos atualizado inscritos João:" + devJoao.getConteudoInscritos());
		System.out.println("Conteúdos concluídos João:" + devJoao.getConteudosConcluidos());
		System.out.println("XP:" + devJoao.calcularTotalXp());
		
		
	}

}
