//Solicite que o usuario digite o seu nome e o sobrenome, ambos devem ser salvos em variaveis diferentes e apos você deve mostrar o nome com sobrenome

import java.util.Scanner;

public class atividade5_variaveis {
    public static void main(String[] args){
        String nome;
        String sobrenome;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        nome = leitura.nextLine();
        System.out.println("Digite seu sobrenome:");
        sobrenome = leitura.nextLine();
        System.out.println("Seu nome é" + nome + "" + sobrenome);
    }
    
}
