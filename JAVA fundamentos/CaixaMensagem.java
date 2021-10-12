import javax.swing.JOptionPane;

public class CaixaMensagem {
  public static void main(String[] args) {
    
    //Exibir Mensagem (tipo alert)
  //JOptionPane.showMessageDialog(null, "Hello Word");

  //Pedir um nome
  String nome = JOptionPane.showInputDialog(null, "Qual é o seu nome?");
  JOptionPane.showMessageDialog(null, "Bom dia "+nome);


  }
}
