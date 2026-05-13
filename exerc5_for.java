import static java.lang.IO.*;
void main() {
    float soma = 0f;
    float media = 0f;
    float maior = Integer.MIN_VALUE;
    float menor = Integer.MAX_VALUE;
    float somaPares = 0;
    float somaImpares = 0;
    String pares = "";
    String impares = "";


    for(int i = 1; i <= 5; i++){
        int num = Integer.parseInt(readln("Digite um número: "));
        println("Número = " + num);

        soma = soma + num;

        if(num > maior) {
            maior = num;
        }

        if(num < menor ) {
            menor = num;
        }

        if(num % 2 == 0){
            somaPares = somaPares + num;
            pares = pares + num + "\n";
        } else {
            somaImpares = somaImpares + num;
            impares = impares + num + "\n";
        }
    }
    media = soma / 5;
    println("Soma = " + soma);
    println("_________");
    println("Média = " + media);
    println("_________");
    println("Maior número = " + maior);
    println("_________");
    println("Menor número = " + menor);
    println("_________");
    println("Pares = " + pares );
    println("Soma dos Pares = " + somaPares);
    println("_________");
    println("Ímpares = " + impares);
    println("Soma dos ímpares = " + somaImpares);
}