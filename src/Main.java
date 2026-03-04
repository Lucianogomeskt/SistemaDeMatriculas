import model.Aluno;
import model.Curso;
import service.MatriculaService;

public class Main {
    public static void main(String[] args) {

        MatriculaService matriculaService = new MatriculaService();

        Aluno aluno1 = new Aluno("Ricardo", "12345678901"); // CPF Válido
        Aluno aluno2 = new Aluno("Ana", "123");              // CPF Inválido
        Curso cursoJava = new Curso("Informática", 40);

        System.out.println("--- Iniciando Testes de Matrícula ---");


        matriculaService.realizarMatricula(aluno2, cursoJava);
        matriculaService.salvarMatricula(aluno1, cursoJava);
        matriculaService.salvarMatricula(aluno1, cursoJava);

        System.out.println("--- Testes Finalizados ---");
    }
}