public class Vendedor extends Funcionario {
  //atributos
  private Double comissao;
  private int numeroVendas;

  public Vendedor(String nome, String cpf, Double comissao, int numeroVendas) {
    super(nome, cpf);
    this.comissao = comissao;
    this.numeroVendas = numeroVendas;
  }

  @Override
  public double calcularSalario() {
    return super.getSALARIO_MINIMO() + (this.comissao * this.numeroVendas);
  }

  public Double getComissao() {
    return comissao;
  }

  public void setComissao(Double comissao) {
    this.comissao = comissao;
  }

  public int getNumeroVendas() {
    return numeroVendas;
  }

  public void setNumeroVendas(int numeroVendas) {
    this.numeroVendas = numeroVendas;
  }
}
