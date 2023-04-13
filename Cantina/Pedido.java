import java.util.ArrayList;

public class Pedido {
    private final Massa massa;
    private final Cliente cliente;
    private final ArrayList<Ingrediente> ingredientes;

    public Pedido(Massa massa, Cliente cliente, ArrayList<Ingrediente> ingredientes) {
        this.massa = massa;
        this.cliente = cliente;
        this.ingredientes = ingredientes;
    }

    public double calcularValorPedido() {
        double valorPedido = massa.getValor();
        valorPedido += ingredientes.size() * 2.0;
        return valorPedido;
    }

    public String getDescricaoPedido() {
        String descricao = "Pedido feito para " + cliente.getNome() + "\n";
        descricao += massa.getTipo() + " com ";
        for (Ingrediente ingrediente : ingredientes) {
            descricao += ingrediente.getNome() + " e ";
        }
        descricao = descricao.substring(0, descricao.length() - 3);
        descricao += "\nValor: " + calcularValorPedido();
        return descricao;
    }
}
