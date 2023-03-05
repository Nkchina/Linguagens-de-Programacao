package br.com.newton.main;
import br.com.newton.agenda.Contato;
import java.util.Scanner;
import static java.lang.System.*;

public class Telefone {
    public static void main(String[] args) {
        Scanner ler = new Scanner(in);

        out.print("Entre com o nome do contato: ");
        String nome = ler.nextLine();

        out.print("Digite o ddd :");
        String ddd=ler.nextLine();

        out.print("Digite o telefone: ");
        String numero = String.valueOf(ler.nextInt());

        if (numero.length() != 9){
            out.print("Telefone inválido, tente novamente!");
            return;
        }
        Contato contato = new Contato(nome, numero, ddd);

        out.println("Telefone salvo!");
        out.println("Nome: " + contato.getNome());
        out.println("DDD: " + contato.getDdd());
        out.println("Telefone: " + contato.getNumero());
    }
}
