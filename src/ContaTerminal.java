
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        double saldo = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Agora digite o número da sua agência: ");
        String agencia = scanner.next();
        
        System.out.println("Digite seu nome completo: ");
        scanner.nextLine();
        String nomeCliente = scanner.nextLine();

        System.out.println("Deseja realizar um depósito? Digite um valor:  ");
        double realizarDeposito = scanner.nextDouble();

       double saldoAtual = saldo + realizarDeposito;

if (saldoAtual > 0) {
        System.out.println("Olá " + nomeCliente + "," + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de  " + saldoAtual + " reais já está disponível para saque ou transferência.");
} else {
    System.out.println("Olá " + nomeCliente + "," + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + ". caso deseje o sistema já está disponível para realizar depósitos.");
}
    }
}