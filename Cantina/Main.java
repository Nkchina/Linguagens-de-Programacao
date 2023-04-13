import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ingrediente> ingredientesDisponiveis = new ArrayList<>();
        ingredientesDisponiveis.add(new Ingrediente("Bacon"));
        ingredientesDisponiveis.add(new Ingrediente("Mussarela"));
        ingredientesDisponiveis.add(new Ingrediente("Tomate"));
        ingredientesDisponiveis.add(new Ingrediente("Queijo"));

        String nomeCliente = JOptionPane.showInputDialog(null, "Informe o nome do cliente:");
        String nomeMassa = JOptionPane.showInputDialog(null, "Informe o nome da massa:");
        double valorMassa = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da massa:"));

        ArrayList<Ingrediente> ingredientesEscolhidos = new ArrayList<>();
        boolean continuarEscolhendoIngredientes = true;
        while (continuarEscolhendoIngredientes) {
               String opcaoEscolhida = JOptionPane.showInputDialog(null, "Informe os ingredientes escolhidos:" +
                    "\n1-Bacon" +
                    "\n2-Mussarela" +
                    "\n3-Tomate" +
                    "\n4-Queijo" +
                    "\n5-Sair");

            switch (opcaoEscolhida) {
                case "1":
                    ingredientesEscolhidos.add(ingredientesDisponiveis.get(0));
                    break;
                case "2":
                    ingredientesEscolhidos.add(ingredientesDisponiveis.get(1));
                    break;
                case "3":
                    ingredientesEscolhidos.add(ingredientesDisponiveis.get(2));
                    break;
                case "4":
                    ingredientesEscolhidos.add(ingredientesDisponiveis.get(3));
                    break;
                case "5":
                    continuarEscolhendoIngredientes = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;
            }
        }

        Massa massa = new Massa(nomeMassa, valorMassa);
        Cliente cliente = new Cliente(nomeCliente);
        Pedido pedido = new Pedido(massa, cliente, ingredientesEscolhidos);
        JOptionPane.showMessageDialog(null, pedido.getDescricaoPedido());
    }
}
