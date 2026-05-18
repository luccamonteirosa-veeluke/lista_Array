import java.util.Arrays;
import static java.lang.IO.*;

void main() {

    double[] preco = new double[5];


    preco[0] = Double.parseDouble(readln("Insira o preço do produto: "));

    double maior = preco[0];
    double menor = preco[0];


    for (int i = 1; i < preco.length; i++) {

        preco[i] = Double.parseDouble(readln("Insira o preço do produto: "));

        if (preco[i] > maior) {
            maior = preco[i];
        }

        if (preco[i] < menor) {
            menor = preco[i];
        }
    }

    println("Maior preço: " + maior);
    println("Menor preço: " + menor);
    println("Lista de preços: " + Arrays.toString(preco));
}