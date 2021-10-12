import javax.swing.JOptionPane;

public class ConverterParaNumero {
  /*Double parseDouble() : Converte um texto para um número real
  Interger.parseInt() : Converte um texto para um número inteiro
  */
 public static void main(String[] args) {
  
  try{
   double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a 1° nota"));
   double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a 2° nota"));
   double media = (nota1+nota2)/2;
   JOptionPane.showMessageDialog(null, "A média é "+media);
 }catch(Exception erro){
   JOptionPane.showMessageDialog(null, "Favor informar apenas números");
}
 }
}