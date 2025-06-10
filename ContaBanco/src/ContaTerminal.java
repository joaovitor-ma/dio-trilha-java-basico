
// importando o Scanner
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a classe Scanner
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // Instanciando a classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Solicitando os dados da conta e atribuindo às suas variáveis
        System.out.println("Por favor, insira o número da agência");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, insira o nome da agência");
        agencia = scanner.nextLine();

        System.out.println("Por favor, insira o seu nome");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, insira o seu saldo");
        saldo = scanner.nextDouble();

        // Exibir a mensagem de conta criada
        String mensagem = String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque!",
                nomeCliente, agencia, numero, saldo);
        System.out.println(mensagem);
        scanner.close();
    }
}
