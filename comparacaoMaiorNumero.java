import java.util.Scanner;

public class comparacaoMaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        Integer number1 = sc.nextInt();
        System.out.println("Informe o segundo número: ");
        Integer number2 = sc.nextInt();

        if (number1 > number2){
            System.out.println("O primeiro número: "+number1+" é maior que o segundo número: "+number2);
        } else if (number1 == number2){
            System.out.println("O dois números são iguais! "+ number1);
        } else {
            System.out.println("O segundo número: "+number2+" é maior que o primeiro número: "+number1);
        }
    }
}
