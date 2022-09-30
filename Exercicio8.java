import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        float horaReal, salario = 0;
        int horasTrabalhadasPMes;

        try {
            System.out.println("Digite quanto voce ganha por hora(R$):\n");
            Scanner scanner1 = new Scanner(System.in);
            horaReal = scanner1.nextFloat();

            System.out.println("Digite quantas horas voce trabalha por mes:\n");
            horasTrabalhadasPMes = scanner1.nextInt();

            scanner1.close();

            salario = horaReal * horasTrabalhadasPMes;
        } catch (Exception ex) {
            System.out.println("Erro ao pegar horaReal, horasTrabalhadasPMes e/ou salario no Exercicio8:\n" + ex);
        }
        System.out.println("O total do seu salario no mes eh:\n" + "R$" + salario);
    }
}