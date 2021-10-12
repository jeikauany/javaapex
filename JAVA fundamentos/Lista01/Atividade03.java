package Lista01;

import javax.swing.JOptionPane;

public class Atividade03 {
 public static void main(String[] args) {
   int nota1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a primeira nota"));
   
   int nota2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a segunda nota"));

   int nota3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a terceira nota"));

   double media = (nota1+nota2+nota3)/3;

   if (media >= 7){
    JOptionPane.showMessageDialog(null, "Aprovado");

  }else {
    
    JOptionPane.showMessageDialog(null, "Reprovado");
  }

 }
}
