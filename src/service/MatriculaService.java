// Classe para minhas Regras de Negócio

package service;
import model.Aluno;
import model.Curso;
import model.Matricula;

import java.util.ArrayList;
import java.util.List;

public class MatriculaService {

    //BancoDeDadosSimulado
  private List<Matricula> matriculas = new ArrayList<>();

// Regra de Negócio
  public void realizarMatricula(Aluno aluno, Curso curso){

   String cpfDoAluno = aluno.getCpf();


      if(aluno.getCpf().length() != 11){
     System.err.println("CPF Inválido!");
          return;
      }
     System.out.println("CPF Aprovado.");
  }

 // Regra de Negócio2
  public void salvarMatricula(Aluno aluno, Curso curso){

for (Matricula m : matriculas){
    if(m.getAluno().getId().equals(aluno.getId()) && m.getCurso().getId().equals(curso.getId())){
        System.out.println("Erro: Aluno já matriculado!");
        return;
    }

}
      Matricula m = new Matricula(aluno, curso);
      matriculas.add(m);
      System.out.println("Matricula Realizada.");

  }



}
