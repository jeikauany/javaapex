package AtividadesOO.ex03;

import javax.swing.JOptionPane;

public class Tabuada {
  //Atributos
  private int numero;
  
  //Construtor
  public Tabuada(){
    obterDados();
  }

  private void obterDados(){
    numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número"));
    JOptionPane.showMessageDialog(null, calculo());
  }

  private String calculo(){

    int indice = 0;
    String estrutura = "A tabuada de " + numero + "é: \n\n";

    while(indice < 11){
      estrutura += numero + " X " + indice + " = " + (numero*indice) + "\n";
      indice++;
    }

    return estrutura;

  }

}
