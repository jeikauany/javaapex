package Lista01;

import javax.swing.JOptionPane;

public class Atividades02 {
  public static void main(String[] args) {

    int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número"));

    String  mensagem = numero < 0 ? "negativo" : "positivo";

    mensagem += "\n";

    mensagem += numero % 2 == 0 ? "par" : "Ímpar";
    JOptionPane.showMessageDialog(null, mensagem);

  }
}
