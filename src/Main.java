import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double temperatura;

        System.out.println("Escolha o tipo de temperatura");
        System.out.print("1.Celsius \n2.Fahrenheit \n3.Kelvin\n");

        int escolha = scan.nextInt();

        if(escolha < 1 || escolha > 3) {
            System.out.println("Escolha incopatível, tente novamente.");
        }

        System.out.println("Coloque o nível de temperatura: ");
        temperatura = scan.nextDouble();

        switch (escolha){
            case 1:
                System.out.println("Coloque o 2° tipo de temperatura");
                System.out.print("1.Fahrenheit\n2.Kelvin\n");

                int escolha2 = scan.nextInt();

                if(escolha2 < 1 || escolha2 > 2) {
                    System.out.println("Escolha incopatível, tente novamente.");
                }
                switch (escolha2){
                    case 1:
                        double resultado = (temperatura * 9/5) + 32;
                        System.out.println(resultado);
                        break;

                    case 2:
                        double resultado2 = temperatura + 273.15;
                        System.out.println(resultado2);
                        break;
                }
            break;

            case 2:
                System.out.println("Coloque o 2° tipo de temperatura");
                System.out.print("1.Celsius\n2.Kelvin\n");

                escolha2 = scan.nextInt();

                if(escolha2 < 1 || escolha2 > 2) {
                    System.out.println("Escolha incopatível, tente novamente.");
                }
                switch (escolha2){
                    case 1:
                        double resultado = (temperatura -32) * 5/9;
                        System.out.println(resultado);
                        break;

                    case 2:
                        double resultado2 = (temperatura - 32) * 5/9 + 273.15;
                        System.out.println(resultado2);
                        break;
                }
            break;

            case 3:
                System.out.println("Coloque o 2° tipo de temperatura");
                System.out.print("1.Celsius\n2.Fahrenheit\n");

                escolha2 = scan.nextInt();

                if(escolha2 < 1 || escolha2 > 2) {
                    System.out.println("Escolha incopatível, tente novamente.");
                }
                switch (escolha2){
                    case 1:
                        double resultado = (temperatura - 273.15);
                        System.out.println(resultado);
                        break;

                    case 2:
                        double resultado2 = (temperatura - 273.15) * 9/5 + 32;
                        System.out.println(resultado2);
                        break;
                }
                break;
        }
        }
    }
