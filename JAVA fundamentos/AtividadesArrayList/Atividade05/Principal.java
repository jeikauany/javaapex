package AtividadesArrayList.Atividade05;

import javax.swing.JOptionPane;

public class Principal{
  public static void main(String[] args) {
    
     // Menu
     String menu = "O que deseja fazer?\n";
     menu+= "1) Cadastrar\n";
     menu+= "2) Selecionar\n";
     menu+= "3) Alterar\n";
     menu+= "4) Remover";
     menu+= "5) Sair";

      // Variável para sair do laço
      boolean continuar = true;

      
      //Laço
      do {
        // Obter a opção
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

        switch(opcao){
          case 5:
          continuar = false;
          break;
          
        }
      }while(continuar == true);

     

  }

  
}
