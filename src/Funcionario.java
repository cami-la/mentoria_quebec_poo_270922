
/*
Considerando o diagrama abaixo, feito para uma empresa de vendas.
Nesse contexto, utilize o conceito de Herança para remodelá-lo e implemente um programa que explore
o domínio em questão:
Regras:
a) Crie uma classe mãe chamada Funcionario com os atributos nome, cpf (passados pelo construtor),
uma constante para armazenar o valor do salário mínimo e um método abstrato “calcularSalario”;
b) Vendedores ganham 1 salário mínimo, mais uma comissão por vendas;
c) Consultores ganham somente pelas horas que trabalharam.
 */

public abstract class Funcionario {
  //atributos
  private String nome;
  private String cpf;
  protected final Double SALARIO_MINIMO = 1000.0;

  public Funcionario(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
  }

  public Funcionario() {
  }

  public abstract double calcularSalario();

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public Double getSALARIO_MINIMO() {
    return SALARIO_MINIMO;
  }
}
