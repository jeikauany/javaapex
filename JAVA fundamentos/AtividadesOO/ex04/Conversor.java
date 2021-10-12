package AtividadesOO.ex04;

import javax.swing.JOptionPane;

public class Conversor {
  //Atributos
private int valor;
private int tipoConversao;

  //Construtor
  public Conversor(){
    obterDados();
    JOptionPane.showMessageDialog(null, calculo());
  }
  private void obterDados(){
    valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um valor"));
    tipoConversao = Integer.parseInt(JOptionPane.showInputDialog(null, "1) Dólar para Real\n 2) Real para dólar\n 3) Euro para real\n 4) Real para euro"));
  }
  private double calculo(){
    double total=0;
    if (tipoConversao ==1){
total = valor*5;
    }

if (tipoConversao ==2){
  total = valor/ 5;
    }

    if (tipoConversao ==3){
      total = valor* 6;
        }

        
    if (tipoConversao ==4){
      total = valor/ 6;
        }
    return total;



  }

}
