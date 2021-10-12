package OrientacaoaObjetos.construtor;

import javax.swing.JOptionPane;

public class Pessoa {
  
  //COnstrutor
  public Pessoa(){
    JOptionPane.showMessageDialog(null, "Hello Word");
  }
  
  public Pessoa(String nome){
    JOptionPane.showMessageDialog(null, "Olá "+ nome);
  }

public Pessoa(String nome, int idade){
  JOptionPane.showMessageDialog(null, "Olá " +nome+" você tem "+idade+" anos");
}
}

