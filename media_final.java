import static java.lang.IO.*;
void main() {
    int alunos = 1;
    while (alunos <= 4) {
        print("Digite o nome do " + alunos + "º aluno: ");
        String nome = readln();

        float soma_notas = 0;

        int notas = 1;
        while (notas <= 4) {
            println("Digite a " + notas + "º notas: ");
            float nota_bimestral = Float.parseFloat(readln());
            soma_notas = soma_notas + nota_bimestral;
            notas = notas + 1;
        }
        float media = soma_notas / 4;
        alunos = alunos + 1;

        if (media >= 7){
            println("Média = " + media + " Situação = Aprovado");
        } else if (media < 5){
            println("Média = " + media + " Situação = Reprovado");
        } else {
            println("Média = " + media + " Situação = Recuperação");
        }
    }
}