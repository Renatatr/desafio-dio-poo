import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria do java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRenata = new Dev();
        devRenata.setNome("Renata");
        devRenata.inscreverBootcamp(bootcamp);
        System.out.println("----------------- Dev Renata -----------------");
        System.out.println("Conteúdos Inscritos" + devRenata.getConteudosInscritos());
        System.out.println("XP: " + devRenata.calcularTotalXp());
        devRenata.progredir();
        System.out.println("Conteúdos Inscritos" + devRenata.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devRenata.getConteudosConcluidos());
        System.out.println("XP: " + devRenata.calcularTotalXp());

        Dev devFulano = new Dev();
        devFulano.setNome("Fulano");
        devFulano.inscreverBootcamp(bootcamp);
        System.out.println("----------------- Dev Fulano -----------------");
        System.out.println("Conteúdos Inscritos" + devFulano.getConteudosInscritos());
        System.out.println("XP: " + devFulano.calcularTotalXp());
        devFulano.progredir();
        devFulano.progredir();
        devFulano.progredir();
        System.out.println("Conteúdos Inscritos" + devFulano.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devFulano.getConteudosConcluidos());
        System.out.println("XP: " + devFulano.calcularTotalXp());

    }
}
