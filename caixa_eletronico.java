import static java.lang.IO.*;
void main() {

    String senha = "4321";
    String msg = "";
    for(int tentativas =1; tentativas <= 3; tentativas++){
        String senha_fornecida = readln("Digite a sua senha! ");

        if(senha_fornecida.equals(senha)){
            msg = "Acesso Liberado!!!";
            break;
        } else {
            msg = "Acesso Negado!!!";
        }
    }
    println("Acesso: " + msg);
    println("Fim do programa!");
}