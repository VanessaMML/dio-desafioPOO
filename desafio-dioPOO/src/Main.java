import java.time.LocalDate;

import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		
		//Objetos Cursos
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descri��o curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("Descri��o curso JS");
		curso2.setCargaHoraria(10);
		
		System.out.println(curso1);
		System.out.println(curso2);
		
		
		//Polimorfirmo
		Conteudo conteudo = new Curso();
		
		//Objetos Mentoria
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Descri��o mentoria Java");
		mentoria.setData(LocalDate.now());
		
		System.out.println(mentoria);
		
	}

}
