import static java.lang.IO.*;

void main() {
    int votosJoao = 0;
    int votosMaria = 0;
    int votosNulos = 0;

    for (int i = 1; i <= 10; i++) {
        int num = Integer.parseInt(readln("Digite seu voto (1 = João, 2 = Maria): "));
        println("Voto registrado: " + num);

        if (num == 1) {
            votosJoao++;
        } else if (num == 2) {
            votosMaria++;
        } else {
            votosNulos++;
        }
    }

    println("RESULTADO DA ELEIÇÃO");
    println("João:  " + votosJoao  + " voto(s)");
    println("Maria: " + votosMaria + " voto(s)");
    println("Nulos: " + votosNulos + " voto(s)");

    if (votosJoao > votosMaria) {
        println("Vencedor: João!");
    } else if (votosMaria > votosJoao) {
        println("Vencedor: Maria!");
    } else {
        println("Empate entre João e Maria!");
    }
}