//EX3
import javax.swing.JOptionPane;

public class Main3 {
    public static void main(String[] args) {
        int dividendo, divisor;
        while (true){

            try{
                dividendo = Integer.parseInt(JOptionPane.showInputDialog("Digite o dividendo: "));
                divisor = Integer.parseInt(JOptionPane.showInputDialog("Digite o divisor: "));
                divide(dividendo, divisor);
                break;
            }
            catch (ArithmeticException e1){
                JOptionPane.showMessageDialog(null, "Não pode dividir por 0");
            }
            catch (NumberFormatException e2){
                JOptionPane.showMessageDialog(null, "Favor informar apenas números inteiros!");
            }
        }
    }
    public static void divide ( int dividendo, int divisor){
        System.out.println("Divisão = " + (dividendo / divisor));
    }
}
