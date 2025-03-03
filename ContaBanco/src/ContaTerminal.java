import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeCliente = "Ramon";
        double saldo = 237.48;

        System.out.println("Por favor, digite o número da Agência !");
        int numeroAgencia = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, digite o número da Conta !");
        String numeroConta = scanner.nextLine();
        scanner.close();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, \n" +
                "sua agência é "+numeroAgencia+", conta "+numeroConta+" e seu \n" +
                "saldo "+saldo+" já está disponível para saque");


    }
}