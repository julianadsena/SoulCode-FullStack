import java.util.Scanner;
public class leitura_valores {
    public static void main(String[] args){
        try (Scanner ler = new Scanner(System.in)) {
            int numero;
            System.out.println("Digite um numero:");
            numero = ler.nextInt();
            System.out.println(numero);
        }
    }
    
}
