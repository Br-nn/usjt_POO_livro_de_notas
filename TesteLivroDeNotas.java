import javax.swing.JOptionPane;
public class TesteLivroDeNotas {
  public static void main(String[] args) {

    String nome1 = JOptionPane.showInputDialog("Digite o curso 1");
    LivroDeNotas livroDeNotas1 = new LivroDeNotas(nome1);
    
    LivroDeNotas livroDeNotas2 = new LivroDeNotas(); 
    String nome2 = JOptionPane.showInputDialog("Digite o curso 2");
    livroDeNotas2.setNomeDoCurso(nome2);

    livroDeNotas1.exibemsg();
    livroDeNotas2.exibemsg();

  }
}
