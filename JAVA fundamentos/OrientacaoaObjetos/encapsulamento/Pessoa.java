package OrientacaoaObjetos.encapsulamento;


public class Pessoa {
  
  //Atributos
  private String nome;
  private int idade;

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return this.idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  /*
Visibilidade de Atributos e métodos:
Default: Atributos e métodos ficam visíuveis para projetos na mesma pasta
Public: Atributos e métodos ficam visíveis independente a classe que chame
Private: Atributos e métodos ficam visíveis apenas na classe onde são criados
Protected: Atribudos e métodos ficam visíveis em classes onde são criados ou herdados

Encapsulamento: Restringir o uso de atributos e métodos

Set: Envia a informação
Get: Retorna a informação

  */
}
