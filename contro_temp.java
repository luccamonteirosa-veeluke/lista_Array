import java.util.ArrayList;
import java.util.Scanner;
void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    ArrayList<Double> celsius = new ArrayList<>();
    ArrayList<Double> fahrenheit = new ArrayList<>();

    while (true) {
        System.out.print("insira a temperatura em Celsius (ou 'sair'): ");
        String entrada = sc.nextLine();

        if (entrada.equalsIgnoreCase("sair")) {
            break;
        }

        try {
            double tempC = Double.parseDouble(entrada);
            celsius.add(tempC);

            double tempF = (tempC * 9 / 5) + 32;
            fahrenheit.add(tempF);

        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Digite um número ou 'sair'.");
        }
    }

    if (celsius.isEmpty()) {
        System.out.println("Nenhuma temperatura informada.");
        return;
    }

    double somaC = 0;
    double somaF = 0;

    for (double t : celsius) somaC += t;
    for (double t : fahrenheit) somaF += t;

    double mediaC = somaC / celsius.size();
    double mediaF = somaF / fahrenheit.size();

    System.out.println("\nTemperaturas em Celsius: " + celsius);
    System.out.println("Temperaturas em Fahrenheit: " + fahrenheit);
    System.out.printf("Média em Celsius: %.2f%n", mediaC);
    System.out.printf("Média em Fahrenheit: %.2f%n", mediaF);

    sc.close();
}
