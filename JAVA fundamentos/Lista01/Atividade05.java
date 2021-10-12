package Lista01;

import javax.swing.JOptionPane;

public class Atividade05 {
  
  public static void main(String[] args) {
    
    //Obter Valor da Compra
    double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da compra"));

    //Obter se pagou à Vista ou não
    //int pagamento = JOptionPane.showConfirmDialog(null,"Foi pago à vista?")
    int pagamento = Integer.parseInt(JOptionPane.showInputDialog(null, "1) A Vista 2)Parcelado" ));

    //Condicional 
    
    if (valor> 500 && pagamento == 1){
      JOptionPane.showConfirmDialog(null, "Total a pagar R$"+(valor*0.9));
    }else{
      JOptionPane.showConfirmDialog(null, "Total a pagar R$"+(valor));

    }
  }
}
