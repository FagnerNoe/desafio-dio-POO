import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
            Curso curso1 = new Curso();
            curso1.setTitulo("Java");
            curso1.setDescricao("Curso Top de Java");
            curso1.setCargaHoraria(10);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Matematica");



        System.out.println(curso1);
    }
}