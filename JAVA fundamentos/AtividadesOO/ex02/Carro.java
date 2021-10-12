package AtividadesOO.ex02;

import javax.swing.JOptionPane;

public class Carro {
  
  //Atributos
  private String modelo;
  private double valor;

  //Construtor
  public Carro(){
    obterDados();
    JOptionPane.showMessageDialog(null, mensagem());
  }

  //obterDados
  private void obterDados(){
    modelo = JOptionPane.showInputDialog(null, "Informe o modelo");

    
valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor total"));
  }
  //Cálculo
  private double calculo(){

    double total; 
    if (valor<=10000){
      total = valor * 0.1;
    }else if (valor <= 20000){
        total = valor * 0.15;
    }else{
      total = valor * 0.20;
    }
    return total;
  }
  //Mensagem 
  private String mensagem(){

    String texto = "Você irá pagar de impostos no veículo "+modelo+"  R$" +calculo();
    return texto;
  }
}
