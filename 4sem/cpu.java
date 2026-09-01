/*
Desafio 1: Criar um programa para listar e processar (Simular) as tarefas abaixo na CPU
Utilizar a linguagem Java.
Utilizar Lista Simples Encadeada para armazenar as tarefas.

1 - Gravar um arquivo txt no hd.
2 - Visualizar o conteúdo do arquivo txt.
3 - Apagar o arquivo txt.
4 - Visualizar imagem em png.
5 - Renomear um arquivo.

Desafio 2: Executar (Simular) a lista de tarefas na CPU.
*/

public class cpu {

    // Nodo da lista encadeada
    static class No {
        String tarefa;
        No proximo;

        No(String tarefa) {
            this.tarefa = tarefa;
            this.proximo = null;
        }
    }

    // Inicio e fim da lista
    static No inicio = null;
    static No fim = null;

    // Adiciona uma tarefa no final da lista
    public static void adicionarTarefa(String tarefa) {
        No novoNo = new No(tarefa);

        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo;
            fim = novoNo;
        }
    }

    // Mostra todas as tarefas da lista
    public static void listarTarefas() {
        if (inicio == null) {
            System.out.println("Lista vazia");
            return;
        }

        System.out.println("Lista:");
        No atual = inicio;
        int contador = 1;

        while (atual != null) {
            System.out.println(contador + " - " + atual.tarefa);
            atual = atual.proximo;
            contador++;
        }
    }

    // Processa a primeira tarefa da lista
    public static void processarTarefa() {
        if (inicio == null) {
            System.out.println("Sem tarefas");
            return;
        }

        System.out.println("Processando: " + inicio.tarefa);
        inicio = inicio.proximo;

        if (inicio == null) {
            fim = null;
        }

        System.out.println("Concluido");
    }

    // Executa todas as tarefas da CPU
    public static void executarCPU() {
        if (inicio == null) {
            System.out.println("Sem tarefas");
            return;
        }

        System.out.println("Executando:");

        while (inicio != null) {
            processarTarefa();
        }

        System.out.println("Fim");
    }

    public static void main(String[] args) {
        // Tarefas da CPU
        adicionarTarefa("Gravar um arquivo txt no hd.");
        adicionarTarefa("Visualizar o conteúdo do arquivo txt.");
        adicionarTarefa("Apagar o arquivo txt.");
        adicionarTarefa("Visualizar imagem em png.");
        adicionarTarefa("Renomear um arquivo.");

        listarTarefas();
        executarCPU();
    }
}















