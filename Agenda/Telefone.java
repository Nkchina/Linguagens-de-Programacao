package br.com.newton.main;
import br.com.newton.agenda.Contato;
import java.util.Scanner;

public class Telefone {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Contato contato1 = new Contato();

        System.out.print("Digite o nome do contato: ");
        String nome = ler.nextLine();

        System.out.print("Digite o ddd do contato: ");
        int ddd = ler.nextInt();

        System.out.print("Digite o número do contato: ");
        int telefone = ler.nextInt();

        if(telefone<9){
            System.out.print("Telefone inválido!");
        }
        else{
            System.out.println("Contato adicionado!");
            System.out.println("Nome: " + nome);
            System.out.println("Telefone: " + ddd + telefone);
        }

    }
}
