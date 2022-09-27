public class Consultor extends Funcionario {
  //atributos
  private Double valorHora;
  private Long horasTrabalhadas;

  public Consultor(String nome, String cpf, Double valorHora, Long horasTrabalhadas) {
    super(nome, cpf);
    this.valorHora = valorHora;
    this.horasTrabalhadas = horasTrabalhadas;
  }

  @Override
  public double calcularSalario() {
    return this.valorHora * this.horasTrabalhadas;
  }

  public Double getValorHora() {
    return valorHora;
  }

  public void setValorHora(Double valorHora) {
    this.valorHora = valorHora;
  }

  public Long getHorasTrabalhadas() {
    return horasTrabalhadas;
  }

  public void setHorasTrabalhadas(Long horasTrabalhadas) {
    this.horasTrabalhadas = horasTrabalhadas;
  }
}
