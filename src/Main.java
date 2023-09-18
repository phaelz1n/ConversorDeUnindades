import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("Bem-vindo ao Conversor de Unidades!");
        Message message = new Message();
        message.sendMessages();

        while (continuar){


        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite a temperatura em Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
                break;
            case 2:
                System.out.print("Digite a temperatura em Fahrenheit: ");
                double fahrenheit2 = scanner.nextDouble();
                double celsius2 = (fahrenheit2 - 32) * 5 / 9;
                System.out.println("A temperatura em Celsius é: " + celsius2);
                break;
            case 3:
                System.out.print("Digite a temperatura em Celsius: ");
                double celsius3 = scanner.nextDouble();
                double kelvin = celsius3 + 273.15;
                System.out.println("A temperatura em Kelvin é: " + kelvin);
                break;
            case 4:
                System.out.print("Digite a temperatura em Kelvin: ");
                double kelvin2 = scanner.nextDouble();
                double celsius4 = kelvin2 - 273.15;
                System.out.println("A temperatura em Celsius é: " + celsius4);
                break;
            case 5:
                System.out.print("Digite o peso em quilogramas: ");
                double quilograma = scanner.nextDouble();
                double grama = quilograma * 1000;
                System.out.println("O peso em gramas é: " + grama);
                break;
            case 6:
                System.out.print("Digite o peso em gramas: ");
                double grama2 = scanner.nextDouble();
                double quilograma2 = grama2 / 1000;
                System.out.println("O peso em quilogramas é: " + quilograma2);
                break;
            case 7:
                System.out.print("Digite o peso em quilogramas: ");
                double quilograma3 = scanner.nextDouble();
                double tonelada = quilograma3 / 1000;
                System.out.println("O peso em toneladas é: " + tonelada);
                break;
            case 8:
                System.out.print("Digite o peso em toneladas: ");
                double tonelada2 = scanner.nextDouble();
                double quilograma4 = tonelada2 * 1000;
                System.out.println("O peso em quilogramas é: " + quilograma4);
                break;
            case 9:
                System.out.print("Digite a distância em metros: ");
                double metro = scanner.nextDouble();
                double quilometro = metro / 1000;
                System.out.println("A distância em quilômetros é: " + quilometro);
                break;
            case 10:
                System.out.print("Digite a distância em metros: ");
                double metro2 = scanner.nextDouble();
                double decimetro = metro2 * 10;
                System.out.println("A distância em decímetros é: " + decimetro);
                break;
            case 11:
                System.out.print("Digite a distância em metros: ");
                double metro3 = scanner.nextDouble();
                double centimetro = metro3 * 100;
                System.out.println("A distância em centímetros é: " + centimetro);
                break;
            case 12:
                System.out.print("Digite a distância em metros: ");
                double metro4 = scanner.nextDouble();
                double milimetro = metro4 * 1000;
                System.out.println("A distância em milímetros é: " + milimetro);
                break;
            case 13:
                System.out.print("Digite a distância em quilômetros: ");
                double quilometro2 = scanner.nextDouble();
                double metro5 = quilometro2 * 1000;
                System.out.println("A distância em metros é: " + metro5);
                break;
            case 14:
                System.out.print("Digite a distância em quilômetros: ");
                double quilometro3 = scanner.nextDouble();
                double centimetro2 = quilometro3 * 100000;
                System.out.println("A distância em centímetros é: " + centimetro2);
                break;
            case 15:
                System.out.print("Digite a distância em quilômetros: ");
                double quilometro4 = scanner.nextDouble();
                double decimetro3 = quilometro4 * 10000;
                System.out.println("A distância em decímetros é: " + decimetro3);
                break;
            case 16:
                System.out.print("Digite a distância em quilômetros: ");
                double quilometro5 = scanner.nextDouble();
                double milimetro4 = quilometro5 * 1000000;
                System.out.println("A distância em milímetros é: " + milimetro4);
                break;
            case 17:
                System.out.print("Digite a distância em centímetros: ");
                double centimetro3 = scanner.nextDouble();
                double quilometro6 = centimetro3 / 100000;
                System.out.println("A distância em quilômetros é: " + quilometro6);
                break;
            case 18:
                System.out.print("Digite a distância em centímetros: ");
                double centimetro4 = scanner.nextDouble();
                double metro6 = centimetro4 / 100;
                System.out.println("A distância em metros é: " + metro6);
                break;
            case 19:
                System.out.print("Digite a distância em centímetros: ");
                double centimetro5 = scanner.nextDouble();
                double decimetro2 = centimetro5 / 10;
                System.out.println("A distância em decímetros é: " + decimetro2);
                break;
            case 20:
                System.out.print("Digite a distância em centímetros: ");
                double centimetro6 = scanner.nextDouble();
                double milimetro2 = centimetro6 * 10;
                System.out.println("A distância em milímetros é: " + milimetro2);
                break;
            case 21:
                System.out.print("Digite a distância em decímetros: ");
                double decimetro4 = scanner.nextDouble();
                double metro7 = decimetro4 / 10;
                System.out.println("A distância em metros é: " + metro7);
                break;
            case 22:
                System.out.print("Digite a distância em decímetros: ");
                double decimetro5 = scanner.nextDouble();
                double centimetro7 = decimetro5 * 10;
                System.out.println("A distância em centímetros é: " + centimetro7);
                break;
            case 23:
                System.out.print("Digite a distância em decímetros: ");
                double decimetro6 = scanner.nextDouble();
                double milimetro7 = decimetro6 * 100;
                System.out.println("A distância em milímetros é: " + milimetro7);
                break;
            case 24:
                System.out.print("Digite a distância em decímetros: ");
                double decimetro7 = scanner.nextDouble();
                double quilometro7 = decimetro7 / 10000;
                System.out.println("A distância em quilômetros é: " + quilometro7);
                break;
            case 25:
                System.out.print("Digite a distância em milímetros: ");
                double milimetro5 = scanner.nextDouble();
                double decimetro8 = milimetro5 / 10;
                System.out.println("A distância em decímetros é: " + decimetro8);
                break;
            case 26:
                System.out.print("Digite a distância em milímetros: ");
                double milimetro6 = scanner.nextDouble();
                double metro8 = milimetro6 / 1000;
                System.out.println("A distância em metros é: " + metro8);
                break;
            case 27:
                System.out.print("Digite a distância em milímetros: ");
                double milimetro8 = scanner.nextDouble();
                double quilometro8 = milimetro8 / 1000000;
                System.out.println("A distância em quilômetros é: " + quilometro8);
                break;
            case 28:
                System.out.print("Digite a distância em milímetros: ");
                double milimetro9 = scanner.nextDouble();
                double centimetro8 = milimetro9 / 10;
                System.out.println("A distância em centímetros é: " + centimetro8);
                break;
            case 29:
                System.out.print("Digite a distância em anos-luz: ");
                double anosLuz = scanner.nextDouble();
                double metros = anosLuz * 9.461 * Math.pow(10, 12);
                System.out.println("A distância em metros é: " + metros);
                break;
            case 30:
                System.out.print("Digite a distância em anos-luz: ");
                double anosLuz2 = scanner.nextDouble();
                double quilometros = anosLuz2 * 9.461 * Math.pow(10, 9);
                System.out.println("A distância em quilômetros é: " + quilometros);
                break;
            case 31:
                System.out.print("Digite a distância em metros: ");
                double metros2 = scanner.nextDouble();
                double anosLuz3 = metros2 / (9.461 * Math.pow(10, 12));
                System.out.println("A distância em anos-luz é: " + anosLuz3);
                break;
            case 32:
                System.out.print("Digite a distância em quilômetros: ");
                double quilometros2 = scanner.nextDouble();
                double anosLuz4 = quilometros2 / (9.461 * Math.pow(10, 9));
                System.out.println("A distância em anos-luz é: " + anosLuz4);
                break;
            case 33:
                continuar = false;
                System.out.println("Programa finalizado. Obrigado por usar o Conversor de Unidades!");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
            }
                if (continuar) {
                    System.out.println("Deseja continuar? (S/N) ");
                    String ending = scanner.next();

                    if (ending.equalsIgnoreCase("N")) {
                        break;
                    }

            }
        }
    }
}