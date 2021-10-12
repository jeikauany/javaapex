package Lista01;

import javax.swing.JOptionPane;

public class Atv01{
  public static void main(String[] args) {
    String nome = JOptionPane.showInputDialog(null, "Qual o seu nome");
  
  
  String idade = JOptionPane.showInputDialog(null, "Qual sua idade?");
  

  String cidade = JOptionPane.showInputDialog(null, "Qual cidade você mora?");

  JOptionPane.showMessageDialog(null, "Bom dia "+nome);
  }


  

}