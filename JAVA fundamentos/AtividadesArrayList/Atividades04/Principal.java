package AtividadesArrayList.Atividades04;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal{
   public static void main(String[] args) {
    
    
  ArrayList<Aluno> dados = new ArrayList<Aluno>();

  String menu = "O que deseja fazer?\n";
  menu+= "1) Cadastrar\n";
  menu+= "2) Selecionar\n";
  menu+= "3) Sair";

  // Variável para sair do laço
  boolean continuar = true;

  // Laço
  do{

    // Obter a opção
    int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

    // Escolha
    switch(opcao){
        case 1:

            Aluno a = new Aluno();
            a.nome = JOptionPane.showInputDialog(null, "Informe o nome");
            a.nota1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe 1° nota"));
            a.nota2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe 2° nota"));

           a.media = (a.nota1 + a.nota2) /2;

           if (a.media>= 7){
             a.situacao = "Aprovado";
           } else if (a.media>= 5) {
             a.situacao = "Exame";
           } else {
             a.situacao = "Reprovado";
           }
          
           
            dados.add(a);

            JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
            
        break;

        case 2:

        // Lista de pessoas
        String lista = "Pessoas cadastradas\n";

         // Laço
         for(int i=0; i<dados.size(); i++){
          lista += "\nNome: " + dados.get(i).nome;
          lista += "\nCidade: " + dados.get(i).nota1;
          lista += "\nIdade: " + dados.get(i).nota2;
          lista += "\nIdade: " + dados.get(i).media;
          lista += "\nIdade: " + dados.get(i).situacao;
          lista += "\n-----------";
          }
          // Exbir lista
          JOptionPane.showMessageDialog(null, lista);
          break;

          case 3:
          continuar = false;
          break;
        }
    }while(continuar == true);
 

   }
}