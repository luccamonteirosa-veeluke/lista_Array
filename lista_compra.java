import java.util.ArrayList;
void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> lista = new ArrayList<>();

    int opcao = 0;

    while (opcao != 6) {

        System.out.println("\n1-Adicionar  2-Pesquisar  3-Remover  4-Alterar  5-Listar  6-Sair");
        System.out.print("Opção: ");
        opcao = Integer.parseInt(sc.nextLine());

        if (opcao == 1) {

            while (true) {
                IO.println("insira o produto que deseja colocar em sua lista, se desejar sair digite ('sair') :  ");
                String item = sc.nextLine();
                if (item.equalsIgnoreCase("sair")) break;
                lista.add(item);
            }

        } else if (opcao == 2) {
            IO.println("digite o produto que desejar procurar em sua lista  :  ");
            String item = sc.nextLine();
            System.out.println(lista.contains(item) ? "Produto encontrado" : "Produto não encontrado");

        } else if (opcao == 3) {
            IO.println("digite o produto que deseja retirar de sua lista :  ");
            String item = sc.nextLine();
            System.out.println(lista.remove(item) ? "Produto encontrado" : "Produto removido ");

        } else if (opcao == 4) {
            IO.println("digite o produto que deseja trocar de sua lista :  ");
            String antigo = sc.nextLine();
            if (lista.contains(antigo)) {
                IO.println("digite o novo pruduto : ");
                String novo = sc.nextLine();
                lista.set(lista.indexOf(antigo), novo);
                System.out.println("Produto alterado com sucesso");
            } else {
                System.out.println("Produto não encontrado");
            }

        } else if (opcao == 5) {

            if (lista.isEmpty()) {
                System.out.println("Lista vazia");
            } else {
                for (String p : lista) {
                    System.out.println(p);
                }
            }

        } else if (opcao == 6) {

            System.out.println("Programa encerrado com sucesso!");
        }
    }

    sc.close();
}
