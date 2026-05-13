import static java.lang.IO.*;

void main() {

    float soma = 0f;

    while (true) {
        float valor = Float.parseFloat(readln("Digite o valor do produto (0 para finalizar): "));

        if (valor == 0) {
            break;
        }

        if (valor < 0) {
            println("Valor inválido! Digite novamente.");
            continue;
        }

        println("Valor adicionado: R$ " + valor);
        soma += valor;
    }

    println("=== Compra Finalizada ===");
    println("Total da compra: R$ " + soma);
}
