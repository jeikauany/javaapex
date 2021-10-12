package AtividadesOO.ex01;

import javax.swing.JOptionPane;

public class Produto {
  
  //Atributos
  private String nome;
  private int formaPagamento;
  private double valor;

  //Construtor
  public Produto(){
    obterDados();
    JOptionPane.showMessageDialog(null, mensagem());
  }

  //obterDados
  private void obterDados(){
    nome = JOptionPane.showInputDialog(null, "Informe o produto");

    formaPagamento = Integer.parseInt(JOptionPane.showInputDialog(null, "1)À vista 2)À prazo"));
    valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor da compra"));
  }
  //Cálculo
  private double calculo(){

    double total; 
    if (valor >= 500 && formaPagamento == 1){
      total = valor * 0.9;

    }else{

      total = valor;
    }
    return total;
  }
  //Mensagem 
  private String mensagem(){

    String texto = "O produto "+nome+" irá custar R$" +calculo();
    return texto;
  }
}
