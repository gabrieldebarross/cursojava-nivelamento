import java.util.Scanner;

public class exemplosDeIf {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);

        System.out.println("Informe um valor: ");
        Integer numeroInteiro = prompt.nextInt();

        if(numeroInteiro%2 == 0){
        System.out.println("O número "+numeroInteiro+" é um número Par");
        } else {
            System.out.println("O número "+numeroInteiro+" é um número Impar");
        }
    }
}
