import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Vendedor joaoVendedor =
        new Vendedor("Joao Vendedor", "123456", 10.0, 5);
    double salarioJoao = joaoVendedor.calcularSalario();
    System.out.println("O Salario de João é: " + salarioJoao);

    Consultor mariaConsulor =
        new Consultor("Maria Consultor", "032164", 100.0, 10L);
    System.out.println("O Salário de Maria é: " + mariaConsulor.calcularSalario());
    //System.out.println("Hello world!");

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o seu nome aqui: ");
    String nomeDeFulano = scanner.next();

    System.out.println("Imprimindo o nome:" + nomeDeFulano);


  }
}