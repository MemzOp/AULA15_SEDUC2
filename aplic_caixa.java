import static java.lang.IO.*;

void main() {
    double saldo = 500.00;
    int opcao;

    do {
        println("1-Saque  2-Depósito  3-Saldo  0-Sair");
        opcao = Integer.parseInt(readln("Opção: "));

        if (opcao == 1) {
            double valor = Double.parseDouble(readln("Valor do saque: "));
            if (valor <= 0 || valor > saldo)
                println("Operação inválida!");
            else {
                saldo -= valor;
                println("Saque realizado! Saldo: R$ " + saldo);
            }

        } else if (opcao == 2) {
            double valor = Double.parseDouble(readln("Valor do depósito: "));
            if (valor <= 0)
                println("Valor inválido!");
            else {
                saldo += valor;
                println("Depósito realizado! Saldo: R$ " + saldo);
            }

        } else if (opcao == 3) {
            println("Saldo: R$ " + saldo);

        } else if (opcao != 0) {
            println("Opção inválida!");
        }

    } while (opcao != 0);

    println("Fim do programa!");
}