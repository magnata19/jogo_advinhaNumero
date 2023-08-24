import java.util.Scanner;

public class ContaDeBanco {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        //Dados do cliente
        String name = "Davidson";
        String kindAccount = "Corrente";
        double initialBalance = 2500.00;
        int option = 0;

        //Imprimindo no console dados iniciais


        System.out.println("**********************************" + "\nDados iniciais do cliente: " +
                "\nNome:               " + name +
                "\nTipo de conta:      " + kindAccount +
                "\nSaldo inicial:      R$ " + initialBalance +
                "\n**********************************"

        );

        String menu = """
                ** Digite a operação **
                1 - Consultar Saldo
                2 - Transferir Valor
                3 - Receber Valor
                4 - Sair
                """;

        while (option != 4) {
            System.out.println(menu);
            option = leitura.nextInt();
                    if ( option == 1 ) {
                        System.out.println("Seu saldo atual é: " + initialBalance);
                    } else if( option == 2 ) {
                        System.out.println("Quanto deseja Transferir?");
                        double transferBalance = leitura.nextInt();
                        if ( transferBalance > initialBalance) {
                            System.out.println("Não há saldo para transferir.");
                        } else {
                            initialBalance -= transferBalance;
                            System.out.println("Seu saldo atual é: " + initialBalance);
                        }
                    } else if( option == 3 ) {
                        System.out.println("Qual valor a receber?");
                        double earnBalance = leitura.nextInt();
                        initialBalance = initialBalance + earnBalance;
                        System.out.println("Seu saldo atual é: " + initialBalance);
                    } else if( option != 4 ) {
                        System.out.println("Opção inválida.");
                    } else if(option == 4) {
                        System.out.println("Até a próxima!");
                    }
        };
    }
}


