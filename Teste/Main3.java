//Finally

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            int dividendo, divisor;
            System.out.print("Digite o valor do dividendo: ");
            dividendo = s.nextInt();
            System.out.print("Digite o valor do divisor: ");
            divisor = s.nextInt();

            if(divisor == 0) {
                throw new Exception("Não é permitido fazer uma divisão com 0");
            }
            System.out.println(dividendo + " / " + divisor + " = " + (dividendo/divisor));
        }
        catch (Exception ex){
            System.out.println("Erro!" + ex.getMessage());
        }
        finally {
            System.out.println("Bloco finally.");
        }
    }
}
