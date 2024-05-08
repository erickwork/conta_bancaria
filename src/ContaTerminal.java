import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        Double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da sua conta: ");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite a sua agência: ");
        agencia = scanner.nextLine();

        System.out.print("Digite seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Digite seu saldo: ");
        saldo = scanner.nextDouble();

        scanner.close();

        System.out.printf("Olá " + nomeCliente + 
        ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
        ", conta " + numero + 
        " e seu saldo " + saldo + 
        " já esta disponivel para saque.");
        
    }
}

