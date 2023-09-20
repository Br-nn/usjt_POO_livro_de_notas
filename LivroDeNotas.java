public class LivroDeNotas {
  private String nomeDoCurso;
  //construtor com parâmetro
  public LivroDeNotas (String nomeDoCurso){
    this.nomeDoCurso = nomeDoCurso;
  }
  //construtor padrão
  public LivroDeNotas (){
    
  }
  //métodos de acesso --> Getters (não void executa e retorna no mesma classe)
  public String getNomeDoCurso () {
    return nomeDoCurso;
  }
  //métodos modificadores --> Setters (void executa e morre[sem retorno])
  public void setNomeDoCurso (String nomeDoCurso){  
    this.nomeDoCurso = nomeDoCurso;
  }

  public void exibemsg () {
    System.out.println("Bem-vindo ao livro de notas do curso " + nomeDoCurso);
  }
}
