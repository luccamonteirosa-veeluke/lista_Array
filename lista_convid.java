import static java.lang.IO.*;
void main() {
String [] lista = new String[5];
for (int i = 0 ; i <lista.length; i++){
    lista[i] = readln("insira seu nome");
}
int quanti = lista.length;
println("convidados:  "  + Arrays.toString(lista));
println("numero de pessoas:  " +  quanti);
}
