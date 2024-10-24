import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        ContaTerminal contaTerminal = new ContaTerminal();
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência");
        contaTerminal.setAgencia(sc.nextLine());
        System.out.println("Por favor, digite o número da conta");
        contaTerminal.setNumero(sc.nextInt());
        System.out.println("Por favor, digite seu nome");
        contaTerminal.setNomeCliente(sc.nextLine());
        sc.nextLine();
        sc.close();
        System.out.println("");
        contaTerminal.setSaldo(237.48);
        System.out.println(contaTerminal.mensagemCriacaoConta());
    }
}