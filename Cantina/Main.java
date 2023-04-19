import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Cantina {
    public static void main(String[] args) {
        String nomeCliente = JOptionPane.showInputDialog("Informe o nome do cliente:");

        String nomeMassa = JOptionPane.showInputDialog("Informe o nome da massa:");
        double valorMassa = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da massa:"));

        String[] opcoesIngredientes = {"Bacon", "Mussarela", "Tomate", "Queijo"};
        ArrayList<String> ingredientesEscolhidos = new ArrayList<String>();
        double valorIngredientes = 0;

        while (true) {
            int escolha = JOptionPane.showOptionDialog(null, "Escolha os ingredientes:", "Cantina",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoesIngredientes, opcoesIngredientes[0]);

            if (escolha == opcoesIngredientes.length) {
                break;
            }

            ingredientesEscolhidos.add(opcoesIngredientes[escolha]);
            valorIngredientes += 2.0;
        }

        double valorTotal = valorMassa + valorIngredientes;

        String mensagem = "Pedido feito para " + nomeCliente + "\n" + nomeMassa + " com ";
        for (String ingrediente : ingredientesEscolhidos) {
            mensagem += ingrediente + " e ";
        }
        mensagem = mensagem.substring(0, mensagem.length() - 3); // Remover o último " e "
        mensagem += "\nValor: " + String.format("%.2f", valorTotal);
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
