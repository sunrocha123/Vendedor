package Atividade_6.Ex4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        Vendedor v1 = new Vendedor(1000, 1800, "Fábio", 2);
        v1.calcularSalario();

        System.out.print("Digite o nome do vendedor: ");
        String nome = input.nextLine();
        System.out.print("Digite o seu salário: R$ ");
        float salario = input.nextFloat();
        System.out.print("Digite o total de vendas no mês: R$ ");
        float vendas = input.nextFloat();
        System.out.print("Digite o total de faltas no mês: ");
        int falta = input.nextInt();

        Vendedor v2 = new Vendedor(vendas, salario, nome, falta);
        v2.calcularSalario();

        System.out.print("\nInformações dos vendedores:\n");
        v1.imprimirDados();
        v2.imprimirDados();
    }
}
