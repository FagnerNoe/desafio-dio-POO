import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
            Curso curso1 = new Curso();
            curso1.setTitulo("Java");
            curso1.setDescricao("Curso Top de Java");
            curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Phyton");
        curso2.setDescricao("Curso Top de Phyton");
        curso2.setCargaHoraria(10);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Matematica");
        mentoria1.setData(
                LocalDate.now()
        );

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Descriçao Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devFagner = new Dev();
        devFagner.setNome("Fagner");
        devFagner.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos Inscritos : " +devFagner.getConteudosInscritos());





    }
}