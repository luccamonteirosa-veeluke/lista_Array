void main(String[] args) {

        String[] tarefas = new String[100];
        Scanner sc = new Scanner(System.in);

        int i = 0;

        while (i < tarefas.length) {
            System.out.print("Digite uma tarefa (ou 'fim'): ");
            String tarefa = sc.nextLine();

            if (tarefa.equalsIgnoreCase("fim")) {
                break;
            }

            tarefas[i] = tarefa;
            i++;
        }

        System.out.println("\n Suas tarefas:");

        for (int j = 0; j < i; j++) {
            System.out.println("- " + tarefas[j]);
        }

        sc.close();
    }
