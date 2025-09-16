import java.util.Scanner;

public class appConvert {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Que moeda voce deseja converter? \n 1- Euro \n 2- Dolar \n 3- Reais \n 4- Peso Argentino ");
        int tipoMoeda = scan.nextInt();

 
        System.out.println("Qual o valor que voce deseja converter?");
        double valor = scan.nextDouble();

        while (true) {
            if (tipoMoeda == 1) {
                var euro = valor * 5.25; 
                System.out.println("Valor em Euro: " + euro);
                break;
            } else if (tipoMoeda == 2) {
                var dolar = valor * 5.75;
                System.out.println("Valor em Dolar: " + dolar);
                break;
            } else if (tipoMoeda == 3) {
                
                break;
            } else if (tipoMoeda == 4) {
                 var pesoArgentino = valor * 0.034;
                 System.out.println("Valor em Peso Argentino: " + pesoArgentino);
                break;
            } else {
                System.out.println("Valor invalido, digite novamente");
                tipoMoeda = scan.nextInt();
            }
            scan.close();
        }




    }


}
