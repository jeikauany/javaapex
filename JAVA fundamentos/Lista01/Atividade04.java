package Lista01;

import javax.swing.JOptionPane;

public class Atividade04 {
  public static void main(String[] args) {
    int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um ano"));
  
  
    JOptionPane.showMessageDialog(null, ano % 4== 0 ? "É ano Bissexto" : "Não é ano Bissexto");

  
  }
}